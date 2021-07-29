package edu.aku.hassannaqvi.amanhicovid_19study.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Forms21cmContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection05Binding;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingActivityForm21cm;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingPregsurvActivity;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form21cm;


public class Section05Activity extends AppCompatActivity {
    ActivitySection05Binding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section05);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {
    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(Forms21cmContract.Forms21cmTable.COLUMN_S02, form21cm.s02toString());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void BtnContinue(View view) {
        if (!formValidation()) return;

        startActivity(new Intent(this, Section06Activity.class));

        /*SaveDraft();
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, EndingActivityForm21cm.class).putExtra("complete", true));
        }*/
    }


    private void SaveDraft() {

    }


    public void BtnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingPregsurvActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


}