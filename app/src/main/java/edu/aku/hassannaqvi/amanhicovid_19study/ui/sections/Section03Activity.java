package edu.aku.hassannaqvi.amanhicovid_19study.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.FormsPregSurvContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection03Binding;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingPregsurvActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.utils.ValidateEditTextKt;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.formpregsurv;

import java.util.concurrent.BlockingDeque;


public class Section03Activity extends AppCompatActivity {
    private String TAG = "";

    ActivitySection03Binding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section03);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {
    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumnPregSurv(FormsPregSurvContract.FormsPregSurvTable.COLUMN_S02, formpregsurv.s02toString());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void BtnContinue(View view) {
        if (!formValidation()) return;

        SaveDraft();
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, Section04Activity.class).putExtra("complete", true));
        }
    }


    private void SaveDraft() {

        formpregsurv.setCr5006t(bi.cr5006.isChecked() ? ""
                : bi.cr5006888.isChecked() ? "888"
                : bi.cr5006999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5006x(bi.cr5006x.getText().toString());
        formpregsurv.setCr5007t(bi.cr5007.isChecked() ? ""
                : bi.cr5007888.isChecked() ? "888"
                : bi.cr5007999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5007x(bi.cr5007x.getText().toString());
        formpregsurv.setCr5008(bi.cr5008f.isChecked() ? "1"
                : bi.cr5008c.isChecked() ? "2"
                : bi.cr50089.isChecked() ? "99"
                : "-1");

        formpregsurv.setCr5008ut(bi.cr5008u.isChecked() ? ""
                : bi.cr5008u888.isChecked() ? "888"
                : bi.cr5008u999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5008ux(bi.cr5008ux.getText().toString());
        formpregsurv.setCr5009t(bi.cr5009.isChecked() ? ""
                : bi.cr5009888.isChecked() ? "888"
                : bi.cr5009999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5009x(bi.cr5009x.getText().toString());
        formpregsurv.setCr5010t(bi.cr5010.isChecked() ? ""
                : bi.cr5010888.isChecked() ? "888"
                : bi.cr5010999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5010x(bi.cr5010x.getText().toString());
        formpregsurv.setCr5011(bi.cr5011a.isChecked() ? "1"
                : bi.cr5011b.isChecked() ? "2"
                : bi.cr5011c.isChecked() ? "3"
                : bi.cr5011d.isChecked() ? "4"
                : bi.cr5011e.isChecked() ? "5"
                : bi.cr50119.isChecked() ? "9"
                : "-1");

        formpregsurv.setCr5012(bi.cr5012a.isChecked() ? "1"
                : bi.cr5012b.isChecked() ? "2"
                : bi.cr5012c.isChecked() ? "3"
                : bi.cr5012d.isChecked() ? "4"
                : bi.cr5012e.isChecked() ? "5"
                : bi.cr50129.isChecked() ? "9"
                : "-1");

        formpregsurv.setCr5013at(bi.cr5013a.isChecked() ? ""
                : bi.cr5013a888.isChecked() ? "888"
                : bi.cr5013a999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5013ax(bi.cr5013ax.getText().toString());
        formpregsurv.setCr5013bt(bi.cr5013b.isChecked() ? ""
                : bi.cr5013b888.isChecked() ? "888"
                : bi.cr501b3999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5013bx(bi.cr5013bx.getText().toString());
        formpregsurv.setCr5014t(bi.cr5014.isChecked() ? ""
                : bi.cr5014888.isChecked() ? "888"
                : bi.cr5014999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5014x(bi.cr5014x.getText().toString());
        formpregsurv.setCr5015t(bi.cr5015.isChecked() ? ""
                : bi.cr5015888.isChecked() ? "888"
                : bi.cr5015999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5015x(bi.cr5015x.getText().toString());

    }


    public void BtnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingPregsurvActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {

        if (!bi.cr5006x.equals("")) {


            if (bi.cr5006x.getText().toString().indexOf(".") == -1) {
                Toast.makeText(this, "Invalid weight. Correct format ###.#", Toast.LENGTH_SHORT).show();
                return false;
            }

        }

        if (!bi.cr5007x.equals("")) {

            if (bi.cr5007x.getText().toString().indexOf(".") == -1) {
                Toast.makeText(this, "Invalid height. Correct format ##.#", Toast.LENGTH_SHORT).show();
                return false;
            }
        }


        if (!bi.cr5008ux.equals("")) {

            if (bi.cr5008ux.getText().toString().indexOf(".") == -1) {
                Toast.makeText(this, "Invalid temperature. Correct format ###.#", Toast.LENGTH_SHORT).show();
                return false;
            }
        }


        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }

}