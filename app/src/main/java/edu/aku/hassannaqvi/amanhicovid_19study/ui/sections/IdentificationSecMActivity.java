package edu.aku.hassannaqvi.amanhicovid_19study.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import java.text.SimpleDateFormat;
import java.util.Date;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Forms4mmContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivityIdentificationSecMBinding;
import edu.aku.hassannaqvi.amanhicovid_19study.models.FollowUp4mm;
import edu.aku.hassannaqvi.amanhicovid_19study.models.Form4mm;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingActivityForm4mm;
import edu.aku.hassannaqvi.amanhicovid_19study.utils.DateUtilsKt;

import static edu.aku.hassannaqvi.amanhicovid_19study.CONSTANTS.FOLLOWUP_4MM_DATA;
import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form4m;


public class IdentificationSecMActivity extends AppCompatActivity {

    private static final String TAG = "";
    ActivityIdentificationSecMBinding bi;
    private DatabaseHelper db;
    private long isovertime;
    private String fupdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_identification_sec_m);
        bi.setCallback(this);


        db = MainApp.appInfo.getDbHelper();

        bi.fldmsg.setVisibility(View.GONE);
        bi.lblmsg.setText("");

        if (getIntent().getExtras() != null) {

            bi.fldmsg.setVisibility(View.VISIBLE);
            bi.lblmsg.setText("This form will go to End Activity if follow up is older than 7 days");

            FollowUp4mm fup4mm = (FollowUp4mm) getIntent().getSerializableExtra(FOLLOWUP_4MM_DATA);

            bi.mmsid.setText(fup4mm.getSTUDYID());
            bi.mm0108a.setText(fup4mm.getWOMNAME());
            bi.mm0108b.setText(fup4mm.getHUSNAME());
            bi.mm0101.setText(fup4mm.getDSSID());
            bi.mm0104.setText(fup4mm.getFUPWEEK());
            fupdt = fup4mm.getFUPDT();
            MainApp.isprevpreg = fup4mm.getISPREG();

            //Toast.makeText(this, MainApp.isprevpreg, Toast.LENGTH_SHORT).show();
            Log.d(TAG, "BtnContinue: " + MainApp.isprevpreg);

            bi.mmsid.setEnabled(false);
            bi.mm0101.setEnabled(false);
            bi.mm0104.setEnabled(false);
            bi.mm0108a.setEnabled(false);
            bi.mm0108b.setEnabled(false);

        }
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

    private boolean formValidation() {

        if (!bi.mmsid.getText().toString().isEmpty()) {
            if (bi.mmsid.getText().length() != 10 && bi.mmsid.getText().toString().indexOf("-") != -1) {
                Toast.makeText(this, "Study ID must be 10 digits ", Toast.LENGTH_SHORT).show();
                return false;
            }
        }


        if (!bi.mm0106.getText().toString().isEmpty()) {
            if (bi.mm0106.getText().length() != 10) {
                Toast.makeText(this, "Woman Pregnancy ID 1 must be 10 digits ", Toast.LENGTH_SHORT).show();
                return false;
            } else {
                if (bi.mm0106.getText().toString().equals("17-99999-9")) {
                    Toast.makeText(this, "Invalid Woman Pregnancy ID 1 ", Toast.LENGTH_SHORT).show();
                    return false;
                }
            }
        }


        if (!bi.mm0107.getText().toString().isEmpty()) {
            if (bi.mm0107.getText().length() != 10) {
                Toast.makeText(this, "Woman Pregnancy ID 2 must be 10 digits ", Toast.LENGTH_SHORT).show();
                return false;
            }
        }


        if (!bi.mm0108.getText().toString().isEmpty()) {
            if (bi.mm0108.getText().length() != 10) {
                Toast.makeText(this, "Woman Pregnancy ID 3 must be 10 digits ", Toast.LENGTH_SHORT).show();
                return false;
            }
        }

        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    private void SaveDraft() {

        MainApp.form4m = new Form4mm();

        MainApp.form4m.setStudyID(bi.mmsid.getText().toString());
        MainApp.form4m.setDssID(bi.mm0101.getText().toString());
        MainApp.form4m.setWeek(bi.mm0104.getText().toString());
        MainApp.form4m.setUid(MainApp.form4m.getUid());
        MainApp.form4m.setDeviceId(MainApp.appInfo.getDeviceID());
        MainApp.form4m.setAppver(MainApp.appInfo.getAppVersion());
        MainApp.form4m.setDeviceTag(MainApp.appInfo.getTagName());
        MainApp.form4m.setSysDate(new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime()));
        MainApp.form4m.setUserName(MainApp.userName);
        MainApp.form4m.setGps("");


        form4m.setMm0101(bi.mmsid.getText().toString());
        form4m.setMm0101(bi.mm0101.getText().toString());
        form4m.setMm0103(bi.mm0103.getText().toString());
        form4m.setMm0104(bi.mm0104.getText().toString());
        //form4m.setMm0105(bi.mm0105.getText().toString());
        form4m.setMm0106(bi.mm0106.getText().toString());
        form4m.setMm0107(bi.mm0107.getText().toString());
        form4m.setMm0108(bi.mm0108.getText().toString());
        form4m.setMm0108a(bi.mm0108a.getText().toString());
        form4m.setMm0108b(bi.mm0108b.getText().toString());

    }

    private boolean UpdateDB() {
        long updcount = db.addForm4M(form4m);
        MainApp.form4m.setId(String.valueOf(updcount));
        if (updcount > 0) {
            MainApp.form4m.setUid(MainApp.form4m.getDeviceId() + MainApp.form4m.getId());
            db.updatesForm4MColumn(Forms4mmContract.Forms4MMTable.COLUMN_UID, MainApp.form4m.getUid());
            db.updatesForm4MColumn(Forms4mmContract.Forms4MMTable.COLUMN_S02, form4m.s02toString());
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public void BtnEnd() {
        SaveDraft();
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, EndingActivityForm4mm.class).putExtra("complete", false));
        }
    }

    public void BtnContinue() {
        if (!formValidation()) return;
        SaveDraft();
        if (UpdateDB()) {
            finish();

            isovertime = DateUtilsKt.dateDiffInDays(DateUtilsKt.getDate(bi.mm0103.getText().toString()), DateUtilsKt.getDate(fupdt));
            Log.d(TAG, "BtnContinue: " + String.valueOf(isovertime));

            //Toast.makeText(this, String.valueOf(isovertime), Toast.LENGTH_SHORT).show();

            if (isovertime > 7) {
                Intent intent = new Intent(this, EndingActivityForm4mm.class);
                startActivity(intent);
            } else {
                startActivity(new Intent(this, Section03mmActivity.class));
            }
        }
    }
}