package edu.aku.hassannaqvi.amanhicovid_19study.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.List;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Forms21cmContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection06cmBinding;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingActivityForm21cm;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form21cm;

public class Section06cmActivity extends AppCompatActivity {

    ActivitySection06cmBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_06cm);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {
        //rgListener(bi.cm0601, bi.cm060102, bi.cm060201, bi.cm060209, bi.cvcm0603);

        bi.cm060702.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true) {
                    bi.cvcm0608.setVisibility(View.VISIBLE);
                } else {
                    Clear.clearAllFields(bi.cvcm0608);
                    bi.cvcm0608.setVisibility(View.GONE);

                    Clear.clearAllFields(bi.cvcm0609);
                    bi.cvcm0609.setVisibility(View.GONE);
                }
            }
        });


        bi.cm060801.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true) {
                    bi.cvcm0609.setVisibility(View.VISIBLE);
                } else {
                    Clear.clearAllFields(bi.cvcm0609);
                    bi.cvcm0609.setVisibility(View.GONE);
                }
            }
        });


        bi.cm0601.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvcm0605);
            bi.cvcm0605.setVisibility(View.VISIBLE);

            if (bi.cm060102.isChecked() && bi.cm060209.isChecked()
                    || bi.cm060102.isChecked() && bi.cm060202.isChecked()
                    || bi.cm060102.isChecked() && bi.cm060208.isChecked()
                    || bi.cm060101.isChecked() && bi.cm060201.isChecked()
                    || bi.cm060101.isChecked() && bi.cm060209.isChecked()) {

                bi.cvcm0605.setVisibility(View.GONE);

            } else if (bi.cm060101.isChecked() && bi.cm060202.isChecked()
                    || bi.cm060101.isChecked() && bi.cm060208.isChecked()
            ) {

                bi.cvcm0605.setVisibility(View.VISIBLE);

            }

        });


        bi.cm0602.setOnCheckedChangeListener((radioGroup, i) -> {

            if (bi.cm060102.isChecked() && bi.cm060209.isChecked()
                    || bi.cm060102.isChecked() && bi.cm060202.isChecked()
                    || bi.cm060102.isChecked() && bi.cm060208.isChecked()
                    || bi.cm060101.isChecked() && bi.cm060201.isChecked()
                    || bi.cm060101.isChecked() && bi.cm060209.isChecked()) {

                bi.cvcm0605.setVisibility(View.GONE);

            } else if (bi.cm060101.isChecked() && bi.cm060202.isChecked()
                    || bi.cm060101.isChecked() && bi.cm060208.isChecked()) {

                bi.cvcm0605.setVisibility(View.VISIBLE);

            }

        });

        rgListener(bi.cm0606, new RadioButton[]{bi.cm060602,bi.cm060608,bi.cm060609}, bi.cvcm0607);

    }

    private void rgListener(@NotNull RadioGroup rg, RadioButton[] rbs, ViewGroup vg) {
        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(vg);
            vg.setVisibility(View.VISIBLE);
            for(RadioButton rb : rbs ){
            if (i == rb.getId()) {
                vg.setVisibility(View.GONE);
                break;
            }
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
            startActivity(new Intent(this, EndingActivityForm21cm.class).putExtra("complete", true));
        }
    }


    private void SaveDraft() {

        form21cm.setCm0601(bi.cm060101.isChecked() ? "1"
                : bi.cm060102.isChecked() ? "2"
                : "-1");

        form21cm.setCm0602(bi.cm060201.isChecked() ? "1"
                : bi.cm060202.isChecked() ? "2"
                : bi.cm060208.isChecked() ? "8"
                : bi.cm060209.isChecked() ? "9"
                : "-1");

        form21cm.setCm0603(bi.cm060301.isChecked() ? "1"
                : bi.cm060302.isChecked() ? "2"
                : "-1");

        form21cm.setCm0604(bi.cm060401.isChecked() ? "1"
                : bi.cm060402.isChecked() ? "2"
                : "-1");


        form21cm.setCm0606(bi.cm060601.isChecked() ? "1"
                : bi.cm060602.isChecked() ? "2"
                : bi.cm060608.isChecked() ? "8"
                : bi.cm060609.isChecked() ? "9"
                : "-1");


        form21cm.setCm0607(bi.cm060701.isChecked() ? "1"
                : bi.cm060702.isChecked() ? "2"
                : bi.cm060708.isChecked() ? "8"
                : bi.cm060709.isChecked() ? "9"
                : "-1");


        form21cm.setCm0608(bi.cm060801.isChecked() ? "1"
                : bi.cm060802.isChecked() ? "2"
                : "-1");


        form21cm.setCm0609(bi.cm060901.isChecked() ? "11"
                : bi.cm060902.isChecked() ? "12"
                : "-1");


        form21cm.setCm0605(bi.cm0605.getText().toString());

    }


    public void BtnEnd() {
        finish();
        startActivity(new Intent(this, EndingActivityForm21cm.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


}