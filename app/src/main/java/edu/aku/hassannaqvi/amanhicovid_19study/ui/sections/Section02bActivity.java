package edu.aku.hassannaqvi.amanhicovid_19study.ui.sections;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.jetbrains.annotations.NotNull;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Forms21cmContract;
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.FormsPregSurvContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection02bBinding;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingPregsurvActivity;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.formpregsurv;

public class Section02bActivity extends AppCompatActivity {

    ActivitySection02bBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section02b);
        bi.setCallback(this);
        setupSkips();
    }

    private void setupSkips() {

        rgListener(bi.cr3005y, bi.cr3005ya, bi.fldGrpCVcr5005ysi, bi.fldGrpCVcr5005ysi);
        rgListener(bi.cr3005z, bi.cr3005za, bi.fldGrpCVcr5005zsi, bi.fldGrpCVcr5005zsi);
        rgListener(bi.cr3005aa, bi.cr3005aaa, bi.fldGrpCVcr5005aasi, bi.fldGrpCVcr5005aasi);
        rgListener(bi.cr3005ab, bi.cr3005aba, bi.fldGrpCVcr3005abs, bi.fldGrpCVcr5005absi);

    }


    private void rgListener(@NotNull RadioGroup rg, RadioButton rb, ViewGroup vg, ViewGroup vg1) {
        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(vg);
            vg.setVisibility(View.GONE);

            Clear.clearAllFields(vg1);
            vg1.setVisibility(View.GONE);

            if (i == rb.getId()) {
                vg.setVisibility(View.VISIBLE);
                vg1.setVisibility(View.VISIBLE);
            }
        });
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
            startActivity(new Intent(this, Section03Activity.class).putExtra("complete", true));
        }
    }


    private void SaveDraft() {

        formpregsurv.setCr3005y(bi.cr3005ya.isChecked() ? "1"
                : bi.cr3005yb.isChecked() ? "2"
                : bi.cr3005y8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr5005ysid(bi.cr5005ysi.getText().toString());

        formpregsurv.setCr3005z(bi.cr3005za.isChecked() ? "1"
                : bi.cr3005zb.isChecked() ? "2"
                : bi.cr3005z8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr5005zsid(bi.cr5005zsi.getText().toString());

        formpregsurv.setCr3005aa(bi.cr3005aaa.isChecked() ? "1"
                : bi.cr3005aab.isChecked() ? "2"
                : bi.cr3005aa8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr5005aasid(bi.cr5005aasi.getText().toString());

        formpregsurv.setCr3005ab(bi.cr3005aba.isChecked() ? "1"
                : bi.cr3005abb.isChecked() ? "2"
                : bi.cr3005ab8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3005abs(bi.cr3005abs.getText().toString());

        formpregsurv.setCr5005absid(bi.cr5005absi.getText().toString());

    }


    public void BtnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingPregsurvActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {

        String var_cr30051 = MainApp.cr30051;

        if (var_cr30051.equals("1") && (!bi.cr3005ya.isChecked()
                || !bi.cr3005za.isChecked()
                || !bi.cr3005aaa.isChecked()
                || !bi.cr3005aba.isChecked()
                || !bi.cr3005aba.isChecked())) {
            Toast.makeText(this, "if CR3005 is Yes then question from CR3005A till CR3005X at least 1 option should be 1 - Yes ", Toast.LENGTH_LONG).show();
            return false;
        } else if (!var_cr30051.equals("1") && (bi.cr3005ya.isChecked()
                || bi.cr3005za.isChecked()
                || bi.cr3005aaa.isChecked()
                || bi.cr3005aba.isChecked()
                || bi.cr3005aba.isChecked())) {
            Toast.makeText(this, "if CR3005 is No then question from CR3005A till CR3005X All cannot be 1 - Yes ", Toast.LENGTH_LONG).show();
            return false;
        }

        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }

}