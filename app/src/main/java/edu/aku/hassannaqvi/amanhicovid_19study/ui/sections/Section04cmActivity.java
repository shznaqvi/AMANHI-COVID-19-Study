package edu.aku.hassannaqvi.amanhicovid_19study.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.jetbrains.annotations.NotNull;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Forms21cmContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection04cmBinding;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingActivityForm21cm;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form21cm;

public class Section04cmActivity extends AppCompatActivity {

    ActivitySection04cmBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_04cm);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {
        rgListener(bi.cm0402, bi.cm040201, bi.cvcm0403, bi.cvcm0404, bi.cvcm0405);
    }


    private void rgListener(@NotNull RadioGroup rg, RadioButton rb, ViewGroup vg, ViewGroup vg1, ViewGroup vg2) {
        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(vg);
            vg.setVisibility(View.VISIBLE);

            Clear.clearAllFields(vg1);
            vg1.setVisibility(View.VISIBLE);

            Clear.clearAllFields(vg2);
            vg2.setVisibility(View.VISIBLE);

            if (i != rb.getId()) {
                vg.setVisibility(View.GONE);
                vg1.setVisibility(View.GONE);
                vg2.setVisibility(View.GONE);
            }
        });
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


    public void BtnContinue() {
        if (!formValidation()) return;
        SaveDraft();
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, Section05cmActivity.class));
        }
    }


    private void SaveDraft() {

        form21cm.setCm0401(bi.cm040101.isChecked() ? "1"
                : bi.cm040102.isChecked() ? "2"
                : bi.cm040108.isChecked() ? "8"
                : bi.cm040109.isChecked() ? "9"
                : "-1");

        form21cm.setCm0402(bi.cm040201.isChecked() ? "1"
                : bi.cm040202.isChecked() ? "2"
                : bi.cm040208.isChecked() ? "8"
                : bi.cm040209.isChecked() ? "9"
                : "-1");

        form21cm.setCm0403(bi.cm0403.getText().toString());

        form21cm.setCm0404(bi.cm040401.isChecked() ? "1"
                : bi.cm040402.isChecked() ? "2"
                : bi.cm040408.isChecked() ? "8"
                : bi.cm040409.isChecked() ? "9"
                : "-1");

        form21cm.setCm0405(bi.cm040501.isChecked() ? "1"
                : bi.cm040502.isChecked() ? "2"
                : bi.cm040508.isChecked() ? "8"
                : bi.cm040509.isChecked() ? "9"
                : "-1");

        form21cm.setCm0406(bi.cm040601.isChecked() ? "1"
                : bi.cm040602.isChecked() ? "2"
                : bi.cm040609.isChecked() ? "9"
                : "-1");

        form21cm.setCm0407(bi.cm040701.isChecked() ? "1"
                : bi.cm040702.isChecked() ? "2"
                : bi.cm040708.isChecked() ? "8"
                : bi.cm040709.isChecked() ? "9"
                : "-1");

        form21cm.setCm0408(bi.cm0408011.isChecked() ? "11"
                : bi.cm0408012.isChecked() ? "12"
                : bi.cm0408013.isChecked() ? "13"
                : bi.cm0408099.isChecked() ? "99"
                : bi.cm0408015.isChecked() ? "15"
                : "-1");

        form21cm.setCm0408015x(bi.cm0408015x.getText().toString());
        form21cm.setCm04010(bi.cm0401001.isChecked() ? "1"
                : bi.cm0401002.isChecked() ? "2"
                : bi.cm0401008.isChecked() ? "8"
                : bi.cm0401009.isChecked() ? "9"
                : "-1");

        form21cm.setCm04011(bi.cm0401101.isChecked() ? "1"
                : bi.cm0401102.isChecked() ? "2"
                : bi.cm0401108.isChecked() ? "8"
                : bi.cm0401109.isChecked() ? "9"
                : "-1");

        form21cm.setCm04012(bi.cm04012.getText().toString());

        form21cm.setCm04013(bi.cm0401301.isChecked() ? "1"
                : bi.cm0401302.isChecked() ? "2"
                : bi.cm0401308.isChecked() ? "8"
                : bi.cm0401309.isChecked() ? "9"
                : "-1");

    }

    public void BtnEnd() {
        finish();
        startActivity(new Intent(this, EndingActivityForm21cm.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


}