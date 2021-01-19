package edu.aku.hassannaqvi.amanhicovid_19study.ui.sections;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.FormsContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivityIdentificationSectionBinding;
import edu.aku.hassannaqvi.amanhicovid_19study.models.Form;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.MainActivity;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form;


/*** IDENTIFICATION SECTION  --No DataBinding in this section.
 *
 *  only identification fields will be displayed on this sections
 *  Such as; Province, District, UC, Cluster & Household Number.
 *
 *  On btnContinue database will be queried for matching result in database. (Logically, only one result should be found, complete or not)
 *
 *   NO saveDraft() and updateDB() functions will be executed in identification section.
 *   IMPORTANT!: Only formValidation() will be executed
 *
 */

public class IdentificationSectionActivity extends AppCompatActivity {

    static boolean iscomplete = false;
    ActivityIdentificationSectionBinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_identification_section);
        bi.setCallback(this);

        db = MainApp.appInfo.getDbHelper();

        /** Line below is the first change you see due to DataBinding **/
        //bi.setForm(MainApp.form);  // Identification section it will be used only for view binding

        //setSupportActionBar(bi.toolbar);


        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            MainApp.hideSystemUI(getWindow().getDecorView());
        }
    }

    private void SaveDraft() {

        MainApp.form = new Form();

        MainApp.form.setStudyID(bi.cmsid.getText().toString());
        MainApp.form.setUid(MainApp.form.getUid());
        MainApp.form.setDeviceId(MainApp.appInfo.getDeviceID());
        MainApp.form.setAppver(MainApp.appInfo.getAppVersion());
        MainApp.form.setDeviceTag(MainApp.appInfo.getTagName());
        MainApp.form.setSysDate(new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime()));
        MainApp.form.setUserName(MainApp.userName);
        MainApp.form.setGps("");


        form.setCmsid(bi.cmsid.getText().toString());

        form.setCm0101(bi.cm0101.getText().toString());

        //form.setCm0102(bi.cm0102.getText().toString());

        //form.setCm0102a(bi.cm0102a.getText().toString());

        form.setCm0103(bi.cm0103.getText().toString());

        form.setCm0104(bi.cm0104.getText().toString());

        form.setCm0105(bi.cm0105.getText().toString());

        form.setCm0106(bi.cm0106.getText().toString());

        form.setCm0107(bi.cm0107.getText().toString());

        form.setCm0108(bi.cm0108.getText().toString());

        form.setCm0109(bi.cm0109m.isChecked() ? ""
                : bi.cm010988.isChecked() ? "88"
                : bi.cm010999.isChecked() ? "99"
                : "-1");

        form.setCm0109mx(bi.cm0109mx.getText().toString());
        form.setCm0110(bi.cm01101.isChecked() ? "11"
                : bi.cm01102.isChecked() ? "12"
                : "-1");

        form.setCm0111(bi.cm0111.getText().toString());

        form.setCm0112(bi.cm0112.getText().toString());

    }

    public void BtnEnd() {
        finish();

        Intent intent = new Intent(this, EndingActivity.class);
        intent.putExtra("complete", iscomplete);
        iscomplete = false;

        startActivity(intent);
    }

    public void BtnContinue() {
        if (!formValidation()) return;
        SaveDraft();
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, Section02cmActivity.class));
        }
    }

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    private boolean UpdateDB() {
        long updcount = db.addForm(form);
        MainApp.form.setId(String.valueOf(updcount));
        if (updcount > 0) {
            MainApp.form.setUid(MainApp.form.getDeviceId() + MainApp.form.getId());
            db.updatesFormColumn(FormsContract.FormsTable.COLUMN_UID, MainApp.form.getUid());
            db.updatesFormColumn(FormsContract.FormsTable.COLUMN_S02, form.s02toString());
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    /*private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_S02, form.s02toString());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }*/

}