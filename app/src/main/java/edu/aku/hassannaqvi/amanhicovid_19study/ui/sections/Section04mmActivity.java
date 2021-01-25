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
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection04mmBinding;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingActivity;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form4m;

public class Section04mmActivity extends AppCompatActivity {

    ActivitySection04mmBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_04mm);
        bi.setCallback(this);
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


    private void SaveDraft() {

        form4m.setMm0401(bi.mm040101.isChecked() ? "1"
                : bi.mm040102.isChecked() ? "2"
                : bi.mm040108.isChecked() ? "8"
                : bi.mm040109.isChecked() ? "9"
                : "-1");

        form4m.setMm0402(bi.mm040201.isChecked() ? "1"
                : bi.mm040202.isChecked() ? "2"
                : bi.mm040208.isChecked() ? "8"
                : bi.mm040209.isChecked() ? "9"
                : "-1");

        form4m.setMm0403(bi.mm040301.isChecked() ? "1"
                : bi.mm040302.isChecked() ? "2"
                : bi.mm040308.isChecked() ? "8"
                : bi.mm040309.isChecked() ? "9"
                : "-1");

        form4m.setMm0404(bi.mm0404011.isChecked() ? "11"
                : bi.mm0404012.isChecked() ? "12"
                : bi.mm040408.isChecked() ? "8"
                : bi.mm040409.isChecked() ? "9"
                : "-1");

        form4m.setMm0405(bi.mm0405.getText().toString());

        form4m.setMm0406(bi.mm040601.isChecked() ? "1"
                : bi.mm040602.isChecked() ? "2"
                : bi.mm040608.isChecked() ? "8"
                : bi.mm040609.isChecked() ? "9"
                : "-1");

        form4m.setMm0407(bi.mm040701.isChecked() ? "1"
                : bi.mm040702.isChecked() ? "2"
                : bi.mm040708.isChecked() ? "8"
                : bi.mm040709.isChecked() ? "9"
                : "-1");

        form4m.setMm0408(bi.mm0408.getText().toString());

        form4m.setMm0409(bi.mm040901.isChecked() ? "1"
                : bi.mm040902.isChecked() ? "2"
                : bi.mm040908.isChecked() ? "8"
                : bi.mm040909.isChecked() ? "9"
                : "-1");

        form4m.setMm04010(bi.mm0401001.isChecked() ? "1"
                : bi.mm0401002.isChecked() ? "2"
                : bi.mm0401008.isChecked() ? "8"
                : bi.mm0401009.isChecked() ? "9"
                : "-1");

        form4m.setMm04011(bi.mm0401101.isChecked() ? "1"
                : bi.mm0401102.isChecked() ? "2"
                : bi.mm0401103.isChecked() ? "3"
                : bi.mm0401108.isChecked() ? "8"
                : bi.mm0401109.isChecked() ? "9"
                : "-1");

        form4m.setMm04012(bi.mm0401201.isChecked() ? "1"
                : bi.mm0401202.isChecked() ? "2"
                : bi.mm0401208.isChecked() ? "8"
                : bi.mm0401209.isChecked() ? "9"
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

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
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
            startActivity(new Intent(this, Section05mmActivity.class));
        }
    }

}