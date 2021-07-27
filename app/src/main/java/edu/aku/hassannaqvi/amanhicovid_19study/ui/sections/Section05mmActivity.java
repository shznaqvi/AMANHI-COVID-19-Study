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
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Forms4mmContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection05mmBinding;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingActivityForm4mm;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form4m;

public class Section05mmActivity extends AppCompatActivity {

    ActivitySection05mmBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_05mm);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {
        //rgListener(bi.cm0201, bi.cm020111, bi.cvcm0202);
        rgListener(bi.mm0507,bi.mm050702, bi.fldGrpCVmm0508);
    }


    private void rgListener(@NotNull RadioGroup rg, RadioButton rb, ViewGroup vg) {
        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(vg);
            vg.setVisibility(View.VISIBLE);
            if (i == rb.getId()) {
                vg.setVisibility(View.GONE);
            }
        });
    }


    private void SaveDraft() {

        form4m.setMm0501(bi.mm050101.isChecked() ? "1"
                : bi.mm050102.isChecked() ? "2"
                : bi.mm050108.isChecked() ? "8"
                : bi.mm050109.isChecked() ? "9"
                : "-1");

        form4m.setMm0502(bi.mm050201.isChecked() ? "1"
                : bi.mm050202.isChecked() ? "2"
                : bi.mm050208.isChecked() ? "8"
                : bi.mm050209.isChecked() ? "9"
                : "-1");

        form4m.setMm0503(bi.mm0503.getText().toString());

        form4m.setMm0504(bi.mm050401.isChecked() ? "1"
                : bi.mm050402.isChecked() ? "2"
                : bi.mm050408.isChecked() ? "8"
                : bi.mm050409.isChecked() ? "9"
                : "-1");

        form4m.setMm0505(bi.mm050501.isChecked() ? "1"
                : bi.mm050502.isChecked() ? "2"
                : bi.mm050508.isChecked() ? "8"
                : bi.mm050509.isChecked() ? "9"
                : "-1");

        form4m.setMm0506(bi.mm050601.isChecked() ? "1"
                : bi.mm050602.isChecked() ? "2"
                : bi.mm050609.isChecked() ? "9"
                : "-1");

        form4m.setMm0507(bi.mm050701.isChecked() ? "1"
                : bi.mm050702.isChecked() ? "2"
                : bi.mm050708.isChecked() ? "8"
                : bi.mm050709.isChecked() ? "9"
                : "-1");

        form4m.setMm0508(bi.mm0508011.isChecked() ? "11"
                : bi.mm0508012.isChecked() ? "12"
                : bi.mm0508013.isChecked() ? "13"
                : bi.mm0508099.isChecked() ? "99"
                : bi.mm0508015.isChecked() ? "15"
                : "-1");

        form4m.setMm0508015x(bi.mm0508015x.getText().toString());
        form4m.setMm05010(bi.mm0501001.isChecked() ? "1"
                : bi.mm0501002.isChecked() ? "2"
                : bi.mm0501008.isChecked() ? "8"
                : bi.mm0501009.isChecked() ? "9"
                : "-1");

        form4m.setMm05011(bi.mm0501101.isChecked() ? "1"
                : bi.mm0501102.isChecked() ? "2"
                : bi.mm0501108.isChecked() ? "8"
                : bi.mm0501109.isChecked() ? "9"
                : "-1");

        form4m.setMm05012(bi.mm05012.getText().toString());

        form4m.setMm05013(bi.mm0501301.isChecked() ? "1"
                : bi.mm0501302.isChecked() ? "2"
                : bi.mm0501308.isChecked() ? "8"
                : bi.mm0501309.isChecked() ? "9"
                : "-1");

    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesForm4MColumn(Forms4mmContract.Forms4MMTable.COLUMN_S02, form4m.s02toString());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void BtnEnd() {
        finish();
        startActivity(new Intent(this, EndingActivityForm4mm.class).putExtra("complete", false));
    }

    public void BtnContinue() {
        if (!formValidation()) return;
        SaveDraft();
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, Section06mmActivity.class));
        }
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

}