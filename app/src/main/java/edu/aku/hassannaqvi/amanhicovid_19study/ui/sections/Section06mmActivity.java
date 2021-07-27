package edu.aku.hassannaqvi.amanhicovid_19study.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
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
            //bi.fldGrpCVmm0703.setVisibility(View.GONE);
            //bi.fldGrpCVmm0704.setVisibility(View.GONE);
        } else {
            bi.fldGrpCVmm0701.setVisibility(View.VISIBLE);
            bi.fldGrpCVmm0702.setVisibility(View.VISIBLE);
            //bi.fldGrpCVmm0703.setVisibility(View.VISIBLE);
            //bi.fldGrpCVmm0704.setVisibility(View.VISIBLE);
        }


        bi.mm060402.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true) {
                    bi.fldGrpCVmm0605.setVisibility(View.VISIBLE);
                } else {
                    Clear.clearAllFields(bi.fldGrpCVmm0605);
                    bi.fldGrpCVmm0605.setVisibility(View.GONE);
                    Clear.clearAllFields(bi.fldGrpCVmm0606);

                    bi.fldGrpCVmm0606.setVisibility(View.GONE);
                }
            }
        });


        bi.mm060501.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true) {
                    bi.fldGrpCVmm0606.setVisibility(View.VISIBLE);
                } else {
                    Clear.clearAllFields(bi.fldGrpCVmm0606);
                    bi.fldGrpCVmm0606.setVisibility(View.GONE);
                }
            }
        });


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


        bi.mm0703.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                /*if (bi.mm070301.isChecked()) {
                    bi.mm070401.setEnabled(true);

                    bi.mm070402.setChecked(false);
                    bi.mm070403.setChecked(false);
                    bi.mm070404.setChecked(false);
                    bi.mm070405.setChecked(false);
                    bi.mm070477.setChecked(false);

                    bi.mm070402.setEnabled(false);
                    bi.mm070403.setEnabled(false);
                    bi.mm070404.setEnabled(false);
                    bi.mm070405.setEnabled(false);
                    bi.mm070477.setEnabled(false);
                    bi.mm070477x.setVisibility(View.GONE);
                } else {
                    bi.mm070401.setEnabled(false);
                    bi.mm070401.setChecked(false);

                    bi.mm070402.setEnabled(true);
                    bi.mm070403.setEnabled(true);
                    bi.mm070404.setEnabled(true);
                    bi.mm070405.setEnabled(true);
                    bi.mm070477.setEnabled(true);
                }*/
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


        bi.mm0801.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (bi.mm080101.isChecked()) {
                    bi.fldGrpCVmm0802.setVisibility(View.VISIBLE);
                    bi.fldGrpCVmm0803a.setVisibility(View.VISIBLE);
                    bi.fldGrpCVmm0803b.setVisibility(View.VISIBLE);
                } else {
                    Clear.clearAllFields(bi.fldGrpCVmm0802);
                    Clear.clearAllFields(bi.fldGrpCVmm0803a);
                    Clear.clearAllFields(bi.fldGrpCVmm0803b);

                    bi.fldGrpCVmm0802.setVisibility(View.GONE);
                    bi.fldGrpCVmm0803a.setVisibility(View.GONE);
                    bi.fldGrpCVmm0803b.setVisibility(View.GONE);
                }
            }
        });

        bi.chkdt3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true) {
                    bi.mm0803b.setText("");
                    bi.mm0803b.setVisibility(View.GONE);

                    bi.chkdt2.setChecked(false);
                    bi.chkdt2.setVisibility(View.GONE);

                } else {
                    bi.mm0803b.setVisibility(View.VISIBLE);
                    bi.chkdt2.setVisibility(View.VISIBLE);
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


        form4m.setMm0605(bi.mm060501.isChecked() ? "1"
                : bi.mm060502.isChecked() ? "2"
                : "-1");


        form4m.setMm0606(bi.mm060601.isChecked() ? "11"
                : bi.mm060602.isChecked() ? "12"
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


        form4m.setMm0704(bi.mm070401.isChecked() ? "1"
                : bi.mm070402.isChecked() ? "2"
                : bi.mm070403.isChecked() ? "3"
                : bi.mm070404.isChecked() ? "4"
                : bi.mm070405.isChecked() ? "5"
                : bi.mm070477.isChecked() ? "77"
                : "-1");


        form4m.setMm070477x(bi.mm070477x.getText().toString());


        form4m.setMm0801(bi.mm080101.isChecked() ? "1"
                : bi.mm080102.isChecked() ? "2"
                : "-1");


        if (bi.fldGrpCVmm0802.getVisibility() == View.VISIBLE) {

            form4m.setMm0802(bi.mm080201.isChecked() ? "1"
                    : bi.mm080202.isChecked() ? "2"
                    : bi.mm080203.isChecked() ? "3"
                    : bi.mm080204.isChecked() ? "4"
                    : bi.mm080205.isChecked() ? "5"
                    : bi.mm080288.isChecked() ? "88"
                    : bi.mm080277.isChecked() ? "77"
                    : "-1");

            form4m.setMm080277x(bi.mm080277x.getText().toString());
            form4m.setMm0803a(bi.mm0803a.getText().toString());

            form4m.setChkvaccdta(bi.chkdt1.isChecked() ? "1" : "-1");

            form4m.setMm0803b(bi.mm0803b.getText().toString());

            form4m.setChkvaccdtb(bi.chkdt2.isChecked() ? "1" : "-1");
            form4m.setChkvaccdtc(bi.chkdt3.isChecked() ? "1" : "-1");

        }

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
            Toast.makeText(this, "MM0601 is required", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (!bi.mm060201.isChecked()
                && !bi.mm060202.isChecked()
                && !bi.mm060208.isChecked()
                && !bi.mm060209.isChecked()) {
            Toast.makeText(this, "MM0602 is required", Toast.LENGTH_SHORT).show();
            return false;
        }


        if (!bi.mm060301.isChecked()
                && !bi.mm060302.isChecked()
                && !bi.mm060308.isChecked()
                && !bi.mm060309.isChecked()) {
            Toast.makeText(this, "MM0603 is required", Toast.LENGTH_SHORT).show();
            return false;
        }


        if (!bi.mm060401.isChecked()
                && !bi.mm060402.isChecked()
                && !bi.mm060408.isChecked()
                && !bi.mm060409.isChecked()) {
            Toast.makeText(this, "MM0604 is required", Toast.LENGTH_SHORT).show();
            return false;
        }


        if (bi.mm060402.isChecked()) {
            if (!bi.mm060501.isChecked()
                    && !bi.mm060502.isChecked()) {
                Toast.makeText(this, "MM0605 is required", Toast.LENGTH_SHORT).show();
                return false;
            }
        }


        if (bi.mm060501.isChecked()) {
            if (!bi.mm060601.isChecked()
                    && !bi.mm060602.isChecked()) {
                Toast.makeText(this, "MM0606 is required", Toast.LENGTH_SHORT).show();
                return false;
            }
        }


        if (bi.fldGrpCVmm0701.getVisibility() == View.VISIBLE) {

            if (!bi.mm070101.isChecked()
                    && !bi.mm070102.isChecked()
                    && !bi.mm070108.isChecked()
                    && !bi.mm070109.isChecked()) {
                Toast.makeText(this, "MM0701 is required", Toast.LENGTH_SHORT).show();
                return false;
            }

        }


        if (bi.fldGrpCVmm0701.getVisibility() == View.VISIBLE) {

            if (bi.mm070101.isChecked()) {
                if (!bi.chklmp.isChecked()) {
                    if (bi.mm0702.getText().toString().trim().equals("")) {
                        Toast.makeText(this, "MM0702 is required", Toast.LENGTH_SHORT).show();
                        return false;
                    }
                }
            }
        }


        if (bi.fldGrpCVmm0703.getVisibility() == View.VISIBLE) {

            if (!bi.mm070301.isChecked()
                    && !bi.mm070302.isChecked()
                    && !bi.mm070308.isChecked()
                    && !bi.mm070309.isChecked()) {
                Toast.makeText(this, "MM0703 is required", Toast.LENGTH_SHORT).show();
                return false;
            }


            if (!bi.mm070401.isChecked()
                    && !bi.mm070402.isChecked()
                    && !bi.mm070403.isChecked()
                    && !bi.mm070404.isChecked()
                    && !bi.mm070405.isChecked()
                    && !bi.mm070477.isChecked()) {
                Toast.makeText(this, "MM0704 is required", Toast.LENGTH_SHORT).show();
                return false;
            }


            if (bi.mm070477.isChecked()) {
                if (bi.mm070477x.getText().toString().trim().equals("")) {
                    Toast.makeText(this, "MM0704 others is required", Toast.LENGTH_SHORT).show();
                    return false;
                }
            }

        }


        if (!bi.mm080101.isChecked()
                && !bi.mm080102.isChecked()) {
            Toast.makeText(this, "MM0801 is required", Toast.LENGTH_SHORT).show();
            return false;
        }


        if (bi.fldGrpCVmm0802.getVisibility() == View.VISIBLE) {

            if (!bi.mm080201.isChecked()
                    && !bi.mm080202.isChecked()
                    && !bi.mm080203.isChecked()
                    && !bi.mm080204.isChecked()
                    && !bi.mm080205.isChecked()
                    && !bi.mm080288.isChecked()
                    && !bi.mm080277.isChecked()) {
                Toast.makeText(this, "MM0802 is required", Toast.LENGTH_SHORT).show();
                return false;
            }


            if (bi.mm080277.isChecked()) {
                if (bi.mm080277x.getText().toString().trim().equals("")) {
                    Toast.makeText(this, "MM0802 others is required", Toast.LENGTH_SHORT).show();
                    return false;
                }
            }


            if (!bi.chkdt1.isChecked()) {
                if (bi.mm0803a.getText().toString().trim().equals("")) {
                    Toast.makeText(this, "MM0803a is required", Toast.LENGTH_SHORT).show();
                    return false;
                }
            }


            if (!bi.chkdt2.isChecked() && !bi.chkdt3.isChecked()) {
                if (bi.mm0803b.getText().toString().trim().equals("")) {
                    Toast.makeText(this, "MM0803b is required", Toast.LENGTH_SHORT).show();
                    return false;
                }
            }
        }

        return true;

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }

}