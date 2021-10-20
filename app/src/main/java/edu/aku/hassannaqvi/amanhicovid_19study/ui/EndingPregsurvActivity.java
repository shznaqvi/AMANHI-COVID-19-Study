package edu.aku.hassannaqvi.amanhicovid_19study.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.validatorcrawler.aliazaz.Validator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Forms4mmContract;
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.FormsPregSurvContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivityEndingPregsurvBinding;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form4m;
import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.formpregsurv;

public class EndingPregsurvActivity extends AppCompatActivity {

    ActivityEndingPregsurvBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_ending_pregsurv);
        bi.setCallback(this);


        boolean check = getIntent().getBooleanExtra("complete", false);

        if (check) {
            bi.mm0201011.setEnabled(true);
            bi.mm0201012.setEnabled(false);

            bi.cvstatus.setVisibility(View.GONE);

            bi.istatusa.setEnabled(false);
            bi.istatusb.setEnabled(false);
            bi.istatusc.setEnabled(false);
            bi.istatusd.setEnabled(false);
            bi.istatuse.setEnabled(false);
            bi.istatus96.setEnabled(false);
        } else {

            bi.mm0201011.setEnabled(false);
            bi.mm0201012.setEnabled(true);

            bi.cvstatus.setVisibility(View.VISIBLE);

            bi.istatusa.setEnabled(true);
            bi.istatusb.setEnabled(true);
            bi.istatusc.setEnabled(true);
            bi.istatusd.setEnabled(true);
            bi.istatuse.setEnabled(true);
            bi.istatus96.setEnabled(true);
        }
    }


    public void BtnEnd() {
        if (!formValidation()) return;
        SaveDraft();

        finish();
        startActivity(new Intent(this, MainActivity.class));

        //TODO: needs to work on updateDB
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, MainActivity.class));
        } else {
            Toast.makeText(this, "Error in updating db!!", Toast.LENGTH_SHORT).show();
        }
    }


    private void SaveDraft() {

        formpregsurv.setMm0201(bi.mm0201011.isChecked() ? "11"
                : bi.mm0201012.isChecked() ? "12"
                : "-1");


        formpregsurv.setMm0202(bi.istatusa.isChecked() ? "11"
                : bi.istatusb.isChecked() ? "12"
                : bi.istatusc.isChecked() ? "13"
                : bi.istatusd.isChecked() ? "14"
                : bi.istatuse.isChecked() ? "15"
                : bi.istatus96.isChecked() ? "77"
                : "-1");

        formpregsurv.setMm020277x(bi.istatus96x.getText().toString());

        formpregsurv.setiStatus(bi.mm0201011.isChecked() ? "11"
                : bi.mm0201012.isChecked() ? "12"
                : "-1");

        formpregsurv.setiStatus96x(bi.istatus96x.getText().toString());

        MainApp.formpregsurv.setEndTime(new SimpleDateFormat("dd-MM-yy HH:mm", Locale.ENGLISH).format(new Date().getTime()));
    }


    public boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();

        int updcount1 = db.updatesFormColumnPregSurv(FormsPregSurvContract.FormsPregSurvTable.COLUMN_S02, formpregsurv.s02toString());
        int updcount = db.updateEndingFormPregSurv();

        if (updcount == 1 && updcount1 == 1) {
            return true;
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.fldGrpEnd);
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "Back Press Not Allowed", Toast.LENGTH_LONG).show();
    }

}