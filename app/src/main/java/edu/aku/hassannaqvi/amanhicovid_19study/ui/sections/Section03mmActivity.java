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
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.FormsContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection02mmBinding;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection03mmBinding;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingActivity;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form4m;

public class Section03mmActivity extends AppCompatActivity {

    ActivitySection03mmBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_03mm);
        bi.setCallback(this);
        setupSkips();
    }

    private void SaveDraft() {


        form4m.setMm0301( bi.mm030101.isChecked() ? "1"
                : bi.mm030102.isChecked() ? "2"
                : bi.mm030103.isChecked() ? "3"
                :  "-1");

        form4m.setMm0302( bi.mm030201.isChecked() ? "1"
                : bi.mm030202.isChecked() ? "2"
                : bi.mm030208.isChecked() ? "8"
                : bi.mm030209.isChecked() ? "9"
                :  "-1");

        form4m.setMm0303(bi.mm0303.getText().toString());

        form4m.setMm0304( bi.mm030401.isChecked() ? "1"
                : bi.mm030402.isChecked() ? "2"
                : bi.mm030408.isChecked() ? "8"
                : bi.mm030409.isChecked() ? "9"
                :  "-1");

        form4m.setMm0305(bi.mm0305.getText().toString());

        form4m.setMm0306( bi.mm030601.isChecked() ? "1"
                : bi.mm030602.isChecked() ? "2"
                : bi.mm030608.isChecked() ? "8"
                : bi.mm030609.isChecked() ? "9"
                :  "-1");

        form4m.setMm0307(bi.mm0307.getText().toString());

        form4m.setMm0308( bi.mm030801.isChecked() ? "1"
                : bi.mm030802.isChecked() ? "2"
                : bi.mm030808.isChecked() ? "8"
                : bi.mm030809.isChecked() ? "9"
                :  "-1");

        form4m.setMm0309(bi.mm0309.getText().toString());

        form4m.setMm03010( bi.mm0301001.isChecked() ? "1"
                : bi.mm0301002.isChecked() ? "2"
                : bi.mm0301008.isChecked() ? "8"
                : bi.mm0301009.isChecked() ? "9"
                :  "-1");

        form4m.setMm03011(bi.mm03011.getText().toString());

        form4m.setMm03012( bi.mm0301201.isChecked() ? "1"
                : bi.mm0301202.isChecked() ? "2"
                : bi.mm0301208.isChecked() ? "8"
                : bi.mm0301209.isChecked() ? "9"
                :  "-1");

        form4m.setMm03013(bi.mm03013.getText().toString());

        form4m.setMm03014( bi.mm0301401.isChecked() ? "1"
                : bi.mm0301402.isChecked() ? "2"
                : bi.mm0301408.isChecked() ? "8"
                : bi.mm0301409.isChecked() ? "9"
                :  "-1");

        form4m.setMm03015(bi.mm03015.getText().toString());

        form4m.setMm03016( bi.mm0301601.isChecked() ? "1"
                : bi.mm0301602.isChecked() ? "2"
                : bi.mm0301608.isChecked() ? "8"
                : bi.mm0301609.isChecked() ? "9"
                :  "-1");

        form4m.setMm03017(bi.mm03017.getText().toString());

        form4m.setMm03018( bi.mm0301801.isChecked() ? "1"
                : bi.mm0301802.isChecked() ? "2"
                : bi.mm0301808.isChecked() ? "8"
                : bi.mm0301809.isChecked() ? "9"
                :  "-1");

        form4m.setMm03019(bi.mm03019.getText().toString());

        form4m.setMm03020( bi.mm0302001.isChecked() ? "1"
                : bi.mm0302002.isChecked() ? "2"
                : bi.mm0302008.isChecked() ? "8"
                : bi.mm0302009.isChecked() ? "9"
                :  "-1");

        form4m.setMm03021(bi.mm03021.getText().toString());

        form4m.setMm03022( bi.mm0302201.isChecked() ? "1"
                : bi.mm0302202.isChecked() ? "2"
                : bi.mm0302208.isChecked() ? "8"
                : bi.mm0302209.isChecked() ? "9"
                :  "-1");

        form4m.setMm03023(bi.mm03023.getText().toString());

        form4m.setMm03024( bi.mm0302401.isChecked() ? "1"
                : bi.mm0302402.isChecked() ? "2"
                : bi.mm0302408.isChecked() ? "8"
                : bi.mm0302409.isChecked() ? "9"
                :  "-1");

        form4m.setMm03025(bi.mm03025.getText().toString());

        form4m.setMm03026( bi.mm0302601.isChecked() ? "1"
                : bi.mm0302602.isChecked() ? "2"
                : bi.mm0302608.isChecked() ? "8"
                : bi.mm0302609.isChecked() ? "9"
                :  "-1");

        form4m.setMm03027(bi.mm03027.getText().toString());

        form4m.setMm03028( bi.mm0302801.isChecked() ? "1"
                : bi.mm0302802.isChecked() ? "2"
                : bi.mm0302808.isChecked() ? "8"
                : bi.mm0302809.isChecked() ? "9"
                :  "-1");

        form4m.setMm03029(bi.mm03029.getText().toString());

        form4m.setMm03030( bi.mm0303001.isChecked() ? "1"
                : bi.mm0303002.isChecked() ? "2"
                : bi.mm0303008.isChecked() ? "8"
                : bi.mm0303009.isChecked() ? "9"
                :  "-1");

        form4m.setMm03031(bi.mm03031.getText().toString());

        form4m.setMm03032( bi.mm0303201.isChecked() ? "1"
                : bi.mm0303202.isChecked() ? "2"
                : bi.mm0303208.isChecked() ? "8"
                : bi.mm0303209.isChecked() ? "9"
                :  "-1");

        form4m.setMm03033(bi.mm03033.getText().toString());

        form4m.setMm03034( bi.mm0303401.isChecked() ? "1"
                : bi.mm0303402.isChecked() ? "2"
                : bi.mm0303408.isChecked() ? "8"
                : bi.mm0303409.isChecked() ? "9"
                :  "-1");

        form4m.setMm03035(bi.mm03035.getText().toString());

        form4m.setMm03036( bi.mm0303601.isChecked() ? "1"
                : bi.mm0303602.isChecked() ? "2"
                : bi.mm0303608.isChecked() ? "8"
                : bi.mm0303609.isChecked() ? "9"
                :  "-1");

        form4m.setMm03037(bi.mm03037.getText().toString());

        form4m.setMm03038( bi.mm0303801.isChecked() ? "1"
                : bi.mm0303802.isChecked() ? "2"
                : bi.mm0303808.isChecked() ? "8"
                : bi.mm0303809.isChecked() ? "9"
                :  "-1");

        form4m.setMm03039(bi.mm03039.getText().toString());

        form4m.setMm03040( bi.mm0304001.isChecked() ? "1"
                : bi.mm0304002.isChecked() ? "2"
                : bi.mm0304008.isChecked() ? "8"
                : bi.mm0304009.isChecked() ? "9"
                :  "-1");

        form4m.setMm03041(bi.mm03041.getText().toString());

        form4m.setMm03042( bi.mm0304201.isChecked() ? "1"
                : bi.mm0304202.isChecked() ? "2"
                : bi.mm0304208.isChecked() ? "8"
                : bi.mm0304209.isChecked() ? "9"
                :  "-1");

        form4m.setMm03043(bi.mm03043.getText().toString());

        form4m.setMm03044( bi.mm0304401.isChecked() ? "1"
                : bi.mm0304402.isChecked() ? "2"
                : bi.mm0304408.isChecked() ? "8"
                : bi.mm0304409.isChecked() ? "9"
                :  "-1");

        form4m.setMm03045(bi.mm03045.getText().toString());

        form4m.setMm03046(bi.mm03046.getText().toString());

        form4m.setMm03047( bi.mm0304701.isChecked() ? "1"
                : bi.mm0304702.isChecked() ? "2"
                : bi.mm0304708.isChecked() ? "8"
                : bi.mm0304709.isChecked() ? "9"
                :  "-1");

        form4m.setMm03048(bi.mm03048.getText().toString());

        form4m.setMm03049(bi.mm03049.getText().toString());

    }

    private void setupSkips() {
        rgListener(bi.mm0302, bi.mm030201, bi.fldGrpCVmm0303);
        rgListener(bi.mm0304, bi.mm030401, bi.fldGrpCVmm0305);
        rgListener(bi.mm0304, bi.mm030401, bi.fldGrpCVmm0305);
    }


    private void rgListener(@NotNull RadioGroup rg, RadioButton rb, ViewGroup vg) {
        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(vg);
            vg.setVisibility(View.GONE);
            if (i == rb.getId()) {
                vg.setVisibility(View.VISIBLE);
            }
        });
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_S02, form4m.s02toString());
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
            startActivity(new Intent(this, Section04mmActivity.class));
        }
    }

}