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
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection05cmBinding;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingActivityForm21cm;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form21cm;

public class Section05cmActivity extends AppCompatActivity {

    ActivitySection05cmBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_05cm);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {
        //rgListener(bi.cm0201, bi.cm020111, bi.cvcm0202);
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
            startActivity(new Intent(this, Section06cmActivity.class));
        }
    }


    private void SaveDraft() {

        form21cm.setCm0501(bi.cm050101.isChecked() ? "1"
                : bi.cm050102.isChecked() ? "2"
                : bi.cm050108.isChecked() ? "8"
                : bi.cm050109.isChecked() ? "9"
                : "-1");

        form21cm.setCm0502(bi.cm050201.isChecked() ? "1"
                : bi.cm050202.isChecked() ? "2"
                : bi.cm050208.isChecked() ? "8"
                : bi.cm050209.isChecked() ? "9"
                : "-1");

        form21cm.setCm0503(bi.cm050301.isChecked() ? "1"
                : bi.cm050302.isChecked() ? "2"
                : bi.cm050308.isChecked() ? "8"
                : bi.cm050309.isChecked() ? "9"
                : "-1");

        form21cm.setCm0504(bi.cm050401.isChecked() ? "1"
                : bi.cm050402.isChecked() ? "2"
                : bi.cm050408.isChecked() ? "8"
                : bi.cm050409.isChecked() ? "9"
                : "-1");

        form21cm.setCm0505(bi.cm050501.isChecked() ? "1"
                : bi.cm050502.isChecked() ? "2"
                : bi.cm050508.isChecked() ? "8"
                : bi.cm050509.isChecked() ? "9"
                : "-1");

        //form21cm.setCm0506(bi.cm0506.getText().toString());

        form21cm.setCm0507(bi.cm050701.isChecked() ? "1"
                : bi.cm050702.isChecked() ? "2"
                : bi.cm050708.isChecked() ? "8"
                : bi.cm050709.isChecked() ? "9"
                : "-1");

        form21cm.setCm0508(bi.cm050801.isChecked() ? "1"
                : bi.cm050802.isChecked() ? "2"
                : bi.cm050808.isChecked() ? "8"
                : bi.cm050809.isChecked() ? "9"
                : "-1");

        form21cm.setCm0509(bi.cm050901.isChecked() ? "1"
                : bi.cm050902.isChecked() ? "2"
                : bi.cm050908.isChecked() ? "8"
                : bi.cm050909.isChecked() ? "9"
                : "-1");

        form21cm.setCm050901x(bi.cm050901x.getText().toString());
        form21cm.setCm05011(bi.cm0501101.isChecked() ? "1"
                : bi.cm0501102.isChecked() ? "2"
                : bi.cm0501108.isChecked() ? "8"
                : bi.cm0501109.isChecked() ? "9"
                : "-1");

        form21cm.setCm05012(bi.cm0501201.isChecked() ? "1"
                : bi.cm0501202.isChecked() ? "2"
                : bi.cm0501208.isChecked() ? "8"
                : bi.cm0501209.isChecked() ? "9"
                : "-1");

        form21cm.setCm05013(bi.cm0501301.isChecked() ? "1"
                : bi.cm0501302.isChecked() ? "2"
                : bi.cm0501308.isChecked() ? "8"
                : bi.cm0501309.isChecked() ? "9"
                : "-1");

        form21cm.setCm0501301x(bi.cm0501301x.getText().toString());
        form21cm.setCm05015(bi.cm0501501.isChecked() ? "1"
                : bi.cm0501502.isChecked() ? "2"
                : bi.cm0501508.isChecked() ? "8"
                : bi.cm0501509.isChecked() ? "9"
                : "-1");

        form21cm.setCm05016(bi.cm0501601.isChecked() ? "1"
                : bi.cm0501602.isChecked() ? "2"
                : bi.cm0501608.isChecked() ? "8"
                : bi.cm0501609.isChecked() ? "9"
                : "-1");

        form21cm.setCm0501601x(bi.cm0501601x.getText().toString());
        form21cm.setCm05018(bi.cm0501801.isChecked() ? "1"
                : bi.cm0501802.isChecked() ? "2"
                : bi.cm0501808.isChecked() ? "8"
                : bi.cm0501809.isChecked() ? "9"
                : "-1");

        form21cm.setCm0501801x(bi.cm0501801x.getText().toString());
        form21cm.setCm05020(bi.cm0502001.isChecked() ? "1"
                : bi.cm0502002.isChecked() ? "2"
                : bi.cm0502008.isChecked() ? "8"
                : bi.cm0502009.isChecked() ? "9"
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