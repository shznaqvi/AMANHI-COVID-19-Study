package edu.aku.hassannaqvi.amanhicovid_19study.ui.sections;

import android.content.Intent;
import android.text.format.DateUtils;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import java.text.SimpleDateFormat;
import java.util.Date;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Forms21cmContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivityIdentificationSectionBinding;
import edu.aku.hassannaqvi.amanhicovid_19study.models.FollowUp21cm;
import edu.aku.hassannaqvi.amanhicovid_19study.models.Form21cm;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingActivityForm21cm;
import edu.aku.hassannaqvi.amanhicovid_19study.utils.DateUtilsKt;

import static edu.aku.hassannaqvi.amanhicovid_19study.CONSTANTS.FOLLOWUP_21CM_DATA;
import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form21cm;


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

        if (getIntent().getExtras() != null) {

            FollowUp21cm fup = (FollowUp21cm) getIntent().getSerializableExtra(FOLLOWUP_21CM_DATA);

            bi.cmsid.setText(fup.getSTUDYID());
            bi.cm0101.setText(fup.getDSSID());
            bi.cm0104.setText(fup.getFUPWEEK());

            bi.cmsid.setEnabled(false);
            bi.cm0101.setEnabled(false);
            bi.cm0104.setEnabled(false);
        }


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

        MainApp.form21cm = new Form21cm();

        if (bi.cmsid.getText().toString().indexOf('-') != -1) {
            String[] str = bi.cmsid.getText().toString().split("-");
            MainApp.form21cm.setStudyID(str[0] + str[1] + str[2]);
        } else {
            MainApp.form21cm.setStudyID(bi.cmsid.getText().toString());
        }

        MainApp.form21cm.setDssID(bi.cm0101.getText().toString());
        MainApp.form21cm.setWeek(bi.cm0104.getText().toString());
        MainApp.form21cm.setUid(MainApp.form21cm.getUid());
        MainApp.form21cm.setDeviceId(MainApp.appInfo.getDeviceID());
        MainApp.form21cm.setAppver(MainApp.appInfo.getAppVersion());
        MainApp.form21cm.setDeviceTag(MainApp.appInfo.getTagName());
        MainApp.form21cm.setSysDate(new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime()));
        MainApp.form21cm.setUserName(MainApp.userName);
        MainApp.form21cm.setGps("");


        form21cm.setCmsid(bi.cmsid.getText().toString());

        form21cm.setCm0101(bi.cm0101.getText().toString());

        //form.setCm0102(bi.cm0102.getText().toString());

        //form.setCm0102a(bi.cm0102a.getText().toString());

        form21cm.setCm0103(bi.cm0103.getText().toString());

        form21cm.setCm0104(bi.cm0104.getText().toString());

        //form21cm.setCm0105(bi.cm0105.getText().toString());

        form21cm.setCm0106(bi.cm0106.getText().toString());

        form21cm.setCm0107(bi.cm0107.getText().toString());

        form21cm.setCm0108(bi.cm0108.getText().toString());

        form21cm.setCm0109(bi.cm0109m.isChecked() ? ""
                : bi.cm010988.isChecked() ? "88"
                : bi.cm010999.isChecked() ? "99"
                : "-1");

        form21cm.setCm0109mx(bi.cm0109mx.getText().toString());
        form21cm.setCm0110(bi.cm01101.isChecked() ? "11"
                : bi.cm01102.isChecked() ? "12"
                : "-1");

        form21cm.setCm0111(bi.cm0111.getText().toString());

        form21cm.setCm0112(bi.cm0112.getText().toString());

    }

    public void BtnEnd() {
        finish();
        startActivity(new Intent(this, EndingActivityForm21cm.class).putExtra("complete", false));
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

        if (!bi.cmsid.getText().toString().isEmpty()) {
            if (bi.cmsid.getText().length() != 10 && bi.cmsid.getText().toString().indexOf("-") != -1) {
                Toast.makeText(this, "Study ID must be 10 digits ", Toast.LENGTH_SHORT).show();
                return false;
            }
        }


        if (!bi.cm0106.getText().toString().isEmpty()) {
            if (bi.cm0106.getText().length() != 10) {
                Toast.makeText(this, "Amanhi ID for child must be 10 digits ", Toast.LENGTH_SHORT).show();
                return false;
            } else {
                if (bi.cm0106.getText().toString().equals("17-99999-9")) {
                    Toast.makeText(this, "Amanhi ID for child cannot be 17-99999-9 ", Toast.LENGTH_SHORT).show();
                    return false;
                }
            }
        }


        if (!bi.cm0107.getText().toString().isEmpty()) {
            if (bi.cm0107.getText().length() != 10) {
                Toast.makeText(this, "Child ID must be 10 digits ", Toast.LENGTH_SHORT).show();
                return false;
            } else {
                if (bi.cm0107.getText().toString().equals("17-99999-9")) {
                    Toast.makeText(this, "Child ID cannot be 17-99999-9 ", Toast.LENGTH_SHORT).show();
                    return false;
                }
            }
        }


        if (!bi.cm0103.getText().toString().isEmpty() && !bi.cm0108.getText().toString().isEmpty()) {

            long mm = DateUtilsKt.dobDiff(DateUtilsKt.getDate(bi.cm0108.getText().toString()), DateUtilsKt.getDate(bi.cm0103.getText().toString()));

            if (mm < 0) {
                Toast.makeText(this, "Date of birth cannot be greater than visit date ", Toast.LENGTH_SHORT).show();
                return false;
            }
        }


        if (!bi.cm0109mx.getText().toString().isEmpty() && !bi.cm0103.getText().toString().isEmpty() && !bi.cm0108.getText().toString().isEmpty()) {

            if (bi.cm0109mx.getText().toString() != "88" && bi.cm0109mx.getText().toString() != "99") {

                long mm = DateUtilsKt.dobDiff(DateUtilsKt.getDate(bi.cm0108.getText().toString()), DateUtilsKt.getDate(bi.cm0103.getText().toString()));

                if (!bi.cm0109mx.getText().toString().equals(String.valueOf(mm))) {
                    Toast.makeText(this, "Incorrect number of months ", Toast.LENGTH_SHORT).show();
                    return false;
                }
            }
        }

        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    private boolean UpdateDB() {
        long updcount = db.addForm(form21cm);
        MainApp.form21cm.setId(String.valueOf(updcount));
        if (updcount > 0) {
            MainApp.form21cm.setUid(MainApp.form21cm.getDeviceId() + MainApp.form21cm.getId());
            db.updatesFormColumn(Forms21cmContract.Forms21cmTable.COLUMN_UID, MainApp.form21cm.getUid());
            db.updatesFormColumn(Forms21cmContract.Forms21cmTable.COLUMN_S02, form21cm.s02toString());
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

}