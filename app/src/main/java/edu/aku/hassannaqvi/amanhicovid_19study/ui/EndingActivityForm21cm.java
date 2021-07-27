package edu.aku.hassannaqvi.amanhicovid_19study.ui;

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
import java.util.Locale;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Forms21cmContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivityEndingform21cmBinding;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form21cm;
import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form4m;


public class EndingActivityForm21cm extends AppCompatActivity {

    ActivityEndingform21cmBinding bi;
    boolean sectionMainCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_endingform21cm);
        bi.setCallback(this);

        //bi.setForm(MainApp.form);
/*
        setupSkips();*/


        boolean check = getIntent().getBooleanExtra("complete", false);

        if (check) {

            bi.cm020111.setEnabled(true);
            bi.cm020112.setEnabled(false);

            bi.cvstatus.setVisibility(View.GONE);

            bi.istatusa.setEnabled(true);
            bi.istatusb.setEnabled(false);
            bi.istatusc.setEnabled(false);
            bi.istatusd.setEnabled(false);
            bi.istatuse.setEnabled(false);
            bi.istatusf.setEnabled(false);
            bi.istatus96.setEnabled(false);
        } else {

            bi.cm020111.setEnabled(false);
            bi.cm020112.setEnabled(true);

            bi.cvstatus.setVisibility(View.VISIBLE);

            bi.istatusa.setEnabled(true);
            bi.istatusb.setEnabled(true);
            bi.istatusc.setEnabled(true);
            bi.istatusd.setEnabled(true);
            bi.istatuse.setEnabled(true);
            bi.istatusf.setEnabled(true);
            bi.istatus96.setEnabled(true);
        }

//
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

/*    private Class<?> routingSelectionForChildEnding() {
        if (MainActivity.countG == 4)
            return MainActivity.class;
        else
            return SectionI1Activity.class;
    }*/


    private void SaveDraft() {

        form21cm.setCm0201(bi.cm020111.isChecked() ? "11"
                : bi.cm020112.isChecked() ? "12"
                : "-1");


        form21cm.setCm0202(bi.istatusa.isChecked() ? "11"
                : bi.istatusb.isChecked() ? "12"
                : bi.istatusc.isChecked() ? "13"
                : bi.istatusd.isChecked() ? "14"
                : bi.istatuse.isChecked() ? "15"
                : bi.istatusf.isChecked() ? "16"
                : bi.istatus96.isChecked() ? "77"
                : "-1");

        form21cm.setCm020277x(bi.istatus96x.getText().toString());


        if (bi.cm020111.isChecked()) {
            MainApp.form21cm.setIStatus("1");
        } else {
            MainApp.form21cm.setIStatus(bi.istatusa.isChecked() ? "11"
                    : bi.istatusb.isChecked() ? "12"
                    : bi.istatusc.isChecked() ? "13"
                    : bi.istatusd.isChecked() ? "14"
                    : bi.istatuse.isChecked() ? "15"
                    : bi.istatusf.isChecked() ? "16"
                    : bi.istatus96.isChecked() ? "77"
                    : "0");
        }


        MainApp.form21cm.setIStatus96x(bi.istatus96x.getText().toString());
        MainApp.form21cm.setEndTime(new SimpleDateFormat("dd-MM-yy HH:mm", Locale.ENGLISH).format(new Date().getTime()));

    }


    public boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();

        int updcount1 = db.updatesFormColumn(Forms21cmContract.Forms21cmTable.COLUMN_S02, form21cm.s02toString());
        int updcount = db.updateEndingForm21cm();

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
