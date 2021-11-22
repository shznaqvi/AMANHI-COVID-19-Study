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
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.FormsPregSurvContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySectionDemoInfoBinding;
import edu.aku.hassannaqvi.amanhicovid_19study.models.FollowUp4mm;
import edu.aku.hassannaqvi.amanhicovid_19study.models.FollowUpPregSur;
import edu.aku.hassannaqvi.amanhicovid_19study.models.FollowUpPregSurv;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingPregsurvActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.utils.ValidateValuesKt;

import static edu.aku.hassannaqvi.amanhicovid_19study.CONSTANTS.FOLLOWUP_4MM_DATA;
import static edu.aku.hassannaqvi.amanhicovid_19study.CONSTANTS.FOLLOWUP_PREG_DATA;
import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.formpregsurv;

public class SectionDemoInfoActivity extends AppCompatActivity {
    ActivitySectionDemoInfoBinding bi;
    private static final String TAG = "";
    private DatabaseHelper db;
    private String fupdt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_demo_info);
        bi.setCallback(this);

        db = MainApp.appInfo.getDbHelper();

        setupSkips();

        /*if (getIntent().getExtras() != null) {

            FollowUpPregSur fup4mm = (FollowUpPregSur) getIntent().getSerializableExtra(FOLLOWUP_PREG_DATA);

            bi.mmsid.setText(fup4mm.getSTUDYID());
            bi.mm0108a.setText(fup4mm.getWOMNAME());
            bi.mm0108b.setText(fup4mm.getHUSNAME());
            bi.mm0101.setText(fup4mm.getDSSID());
            bi.mm0104.setText(fup4mm.getFUPMONTH());
            fupdt = fup4mm.getFUPDT();

            bi.mmsid.setEnabled(false);
            bi.mm0101.setEnabled(false);
            bi.mm0104.setEnabled(false);
            bi.mm0108a.setEnabled(false);
            bi.mm0108b.setEnabled(false);

        }*/
    }


    private void setupSkips() {
        ValidateValuesKt.chkValues(bi.mm0104w, new Double[]{88.0, 99.0});
        ValidateValuesKt.chkValues(bi.mm0104d, new Double[]{888.0, 999.0});
    }


    private boolean UpdateDB() {
        long updcount = db.addFormPregSurv(formpregsurv);
        MainApp.formpregsurv.setId(String.valueOf(updcount));
        if (updcount > 0) {
            MainApp.formpregsurv.setUid(MainApp.formpregsurv.getDeviceId() + MainApp.formpregsurv.getId());
            db.updatesFormColumnPregSurv(FormsPregSurvContract.FormsPregSurvTable.COLUMN_UID, MainApp.formpregsurv.getUid());
            db.updatesFormColumnPregSurv(FormsPregSurvContract.FormsPregSurvTable.COLUMN_S02, formpregsurv.s02toString());
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void BtnContinue() {
        if (!formValidation()) return;

        SaveDraft();
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, Section01Activity.class).putExtra("complete", true));
        }
    }


    private void SaveDraft() {

        MainApp.formpregsurv = new FollowUpPregSurv();

        if (bi.mmsid.getText().toString().indexOf('-') != -1) {
            String[] str = bi.mmsid.getText().toString().split("-");
            MainApp.formpregsurv.setStudyid(str[0] + str[1] + str[2]);
        } else {
            MainApp.formpregsurv.setStudyid(bi.mmsid.getText().toString());
        }


        MainApp.formpregsurv.setDssid(bi.mm0101.getText().toString());
        MainApp.formpregsurv.setMonth(bi.mm0104.getText().toString());
        MainApp.formpregsurv.setUid(MainApp.formpregsurv.getUid());
        MainApp.formpregsurv.setDeviceId(MainApp.appInfo.getDeviceID());
        MainApp.formpregsurv.setAppver(MainApp.appInfo.getAppVersion());
        MainApp.formpregsurv.setDeviceTag(MainApp.appInfo.getTagName());
        MainApp.formpregsurv.setSysDate(new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime()));
        MainApp.formpregsurv.setUserName(MainApp.userName);
        MainApp.formpregsurv.setGps("");


        formpregsurv.setMm0101(bi.mmsid.getText().toString());
        formpregsurv.setMm0101(bi.mm0101.getText().toString());
        formpregsurv.setMm0103(bi.mm0103.getText().toString());
        formpregsurv.setMm0104(bi.mm0104.getText().toString());


        formpregsurv.setMm0104w(bi.mm0104w.getText().toString());
        formpregsurv.setMm0104d(bi.mm0104d.getText().toString());


        //form4m.setMm0105(bi.mm0105.getText().toString());
        formpregsurv.setMm0106(bi.mm0106.getText().toString());
        formpregsurv.setMm0107(bi.mm0107.getText().toString());
        formpregsurv.setMm0108(bi.mm0108.getText().toString());
        formpregsurv.setMm0108a(bi.mm0108a.getText().toString());
        formpregsurv.setMm0108b(bi.mm0108b.getText().toString());

    }


    public void BtnEnd() {
        SaveDraft();
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, EndingPregsurvActivity.class).putExtra("complete", false));
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


}