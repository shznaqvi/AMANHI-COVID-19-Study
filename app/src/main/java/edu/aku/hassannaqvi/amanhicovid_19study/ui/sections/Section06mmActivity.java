package edu.aku.hassannaqvi.amanhicovid_19study.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Forms4mmContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection06mmBinding;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingActivityForm4mm;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form4m;

public class Section06mmActivity extends AppCompatActivity {

    ActivitySection06mmBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_06mm);
        bi.setCallback(this);
        SkipPattern();

        Toast.makeText(this, MainApp.isprevpreg, Toast.LENGTH_SHORT).show();

    }

    private void SkipPattern() {
        if (MainApp.isprevpreg.equals("1")) {
            bi.fldGrpCVmm0701.setVisibility(View.GONE);
            bi.fldGrpCVmm0702.setVisibility(View.GONE);
            bi.fldGrpCVmm0703.setVisibility(View.GONE);
        } else {
            bi.fldGrpCVmm0701.setVisibility(View.VISIBLE);
            bi.fldGrpCVmm0702.setVisibility(View.VISIBLE);
            bi.fldGrpCVmm0703.setVisibility(View.VISIBLE);
        }


        bi.mm070101.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true) {
                    bi.fldGrpCVmm0702.setVisibility(View.VISIBLE);
                } else {
                    Clear.clearAllFields(bi.fldGrpCVmm0702);
                    bi.fldGrpCVmm0702.setVisibility(View.GONE);
                }
            }
        });


        bi.chklmp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true) {
                    Clear.clearAllFields(bi.fldGrpCVmm0702);
                    bi.fldGrpCVmm0702.setVisibility(View.GONE);
                } else {
                    bi.fldGrpCVmm0702.setVisibility(View.VISIBLE);
                }
            }
        });

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


        form4m.setMm0603(bi.mm060301.isChecked() ? "1"
                : bi.mm060302.isChecked() ? "2"
                : bi.mm060308.isChecked() ? "8"
                : bi.mm060309.isChecked() ? "9"
                : "-1");


        form4m.setMm0604(bi.mm060401.isChecked() ? "1"
                : bi.mm060402.isChecked() ? "2"
                : bi.mm060408.isChecked() ? "8"
                : bi.mm060409.isChecked() ? "9"
                : "-1");


        form4m.setMm0701(bi.mm070101.isChecked() ? "1"
                : bi.mm070102.isChecked() ? "2"
                : bi.mm070108.isChecked() ? "8"
                : bi.mm070109.isChecked() ? "9"
                : "-1");


        form4m.setMm0702(bi.mm0702.getText().toString());

        form4m.setChklmp(bi.chklmp.isChecked() ? "1"
                : bi.chklmp.isChecked() ? "2"
                : "-1");


        form4m.setMm0703(bi.mm070301.isChecked() ? "11"
                : bi.mm070302.isChecked() ? "12"
                : bi.mm070308.isChecked() ? "88"
                : bi.mm070309.isChecked() ? "99"
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
            startActivity(new Intent(this, EndingActivityForm4mm.class).putExtra("complete", true));
        }
    }

    private boolean formValidation() {

        if (!bi.mm060101.isChecked() && !bi.mm060102.isChecked()) {
            Toast.makeText(this, "CM0601 is required", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (!bi.mm060201.isChecked()
                && !bi.mm060202.isChecked()
                && !bi.mm060208.isChecked()
                && !bi.mm060209.isChecked()) {
            Toast.makeText(this, "CM0602 is required", Toast.LENGTH_SHORT).show();
            return false;
        }


        if (!bi.mm060301.isChecked()
                && !bi.mm060302.isChecked()
                && !bi.mm060308.isChecked()
                && !bi.mm060309.isChecked()) {
            Toast.makeText(this, "CM0603 is required", Toast.LENGTH_SHORT).show();
            return false;
        }


        if (!bi.mm060401.isChecked()
                && !bi.mm060402.isChecked()
                && !bi.mm060408.isChecked()
                && !bi.mm060409.isChecked()) {
            Toast.makeText(this, "CM0604 is required", Toast.LENGTH_SHORT).show();
            return false;
        }


        if (!bi.mm070101.isChecked()
                && !bi.mm070102.isChecked()
                && !bi.mm070108.isChecked()
                && !bi.mm070109.isChecked()) {
            Toast.makeText(this, "CM0701 is required", Toast.LENGTH_SHORT).show();
            return false;
        }


        if (bi.mm070101.isChecked()) {
            if (!bi.chklmp.isChecked()) {
                if (bi.mm0702.getText().toString().trim().equals("")) {
                    Toast.makeText(this, "CM0702 is required", Toast.LENGTH_SHORT).show();
                    return false;
                }
            }
        }


        if (!bi.mm070301.isChecked()
                && !bi.mm070302.isChecked()
                && !bi.mm070308.isChecked()
                && !bi.mm070309.isChecked()) {
            Toast.makeText(this, "CM0703 is required", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;

    }

}