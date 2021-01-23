package edu.aku.hassannaqvi.amanhicovid_19study.ui.sections;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Form4MContract;
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.FormsContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection06mmBinding;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingActivity;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form4m;

public class Section06mmActivity extends AppCompatActivity {

    ActivitySection06mmBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_06mm);
        bi.setCallback(this);
    }


    private void SaveDraft() {
        form4m.setMm0601(bi.mm060101.isChecked() ? "1"
                : bi.mm060102.isChecked() ? "2"
                : "-1");

        form4m.setMm0602(bi.mm060201.isChecked() ? "1"
                : bi.mm060202.isChecked() ? "2"
                : bi.mm060208.isChecked() ? "8"
                : bi.mm060209.isChecked() ? "9"
                : "-1");
    }

    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesForm4MColumn(Form4MContract.Forms4MTable.COLUMN_S02, form4m.s02toString());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public void BtnEnd() {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }

    public void BtnContinue() {
        if (!formValidation()) return;
        SaveDraft();
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, EndingActivity.class).putExtra("complete", true));
        }
    }

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

}