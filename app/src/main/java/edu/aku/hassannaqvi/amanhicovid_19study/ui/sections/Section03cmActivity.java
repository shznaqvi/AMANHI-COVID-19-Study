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
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection03cmBinding;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingActivityForm21cm;
import edu.aku.hassannaqvi.amanhicovid_19study.utils.ValidateEditTextKt;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form21cm;

public class Section03cmActivity extends AppCompatActivity {

    ActivitySection03cmBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_03cm);
        bi.setCallback(this);
        setupSkips();

        ValidateEditTextKt.txtWatch(bi.cm0303);
        ValidateEditTextKt.txtWatch(bi.cm0305);
        ValidateEditTextKt.txtWatch(bi.cm0307);
        ValidateEditTextKt.txtWatch(bi.cm0309);
        ValidateEditTextKt.txtWatch(bi.cm03011);
        ValidateEditTextKt.txtWatch(bi.cm03013);
        ValidateEditTextKt.txtWatch(bi.cm03015);
        ValidateEditTextKt.txtWatch(bi.cm03017);
        ValidateEditTextKt.txtWatch(bi.cm03019);
        ValidateEditTextKt.txtWatch(bi.cm03021);
        ValidateEditTextKt.txtWatch(bi.cm03023);
        ValidateEditTextKt.txtWatch(bi.cm03025);
        ValidateEditTextKt.txtWatch(bi.cm03027);
        ValidateEditTextKt.txtWatch(bi.cm03029);
        ValidateEditTextKt.txtWatch(bi.cm03031);
        ValidateEditTextKt.txtWatch(bi.cm03033);
        ValidateEditTextKt.txtWatch(bi.cm03035);
        ValidateEditTextKt.txtWatch(bi.cm03037);
        ValidateEditTextKt.txtWatch(bi.cm03039);
        ValidateEditTextKt.txtWatch(bi.cm03041);
        ValidateEditTextKt.txtWatch(bi.cm03043);
        ValidateEditTextKt.txtWatch(bi.cm03045);
        ValidateEditTextKt.txtWatch(bi.cm03048);
        ValidateEditTextKt.txtWatch(bi.cm03051);

    }


    private void setupSkips() {
        //bi.cm0301.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.cvcm030101));

        rgListener(bi.cm0302, bi.cm030201, bi.cvcm0303);
        rgListener(bi.cm0304, bi.cm30401, bi.cvcm0305);
        rgListener(bi.cm0306, bi.cm030601, bi.cvcm0307);
        rgListener(bi.cm0308, bi.cm030801, bi.cvcm0309);
        rgListener(bi.cm03010, bi.cm0301001, bi.cvcm03011);
        rgListener(bi.cm03012, bi.cm0301201, bi.cvcm03013);
        rgListener(bi.cm03014, bi.cm0301401, bi.cvcm03015);
        rgListener(bi.cm03016, bi.cm0301601, bi.cvcm03017);
        rgListener(bi.cm03018, bi.cm0301801, bi.cvcm03019);
        rgListener(bi.cm03020, bi.cm0302001, bi.cvcm03021);
        rgListener(bi.cm03022, bi.cm0302201, bi.cvcm03023);
        rgListener(bi.cm03024, bi.cm0302401, bi.cvcm03025);
        rgListener(bi.cm03026, bi.cm0302601, bi.cvcm03027);
        rgListener(bi.cm03028, bi.cm0302801, bi.cvcm03029);
        rgListener(bi.cm03030, bi.cm0303001, bi.cvcm03031);
        rgListener(bi.cm03032, bi.cm0303201, bi.cvcm03033);
        rgListener(bi.cm03034, bi.cm0303401, bi.cvcm03035);
        rgListener(bi.cm03036, bi.cm0303601, bi.cvcm03037);
        rgListener(bi.cm03038, bi.cm0303801, bi.cvcm03039);
        rgListener(bi.cm03040, bi.cm0304001, bi.cvcm03041);
        rgListener(bi.cm03042, bi.cm0304201, bi.cvcm03043);
        rgListener(bi.cm03044, bi.cm0304401, bi.cvcm03045);
        rgListener(bi.cm03046, bi.cm0304601, bi.llcm03046);
        rgListener(bi.cm03049, bi.cm0304901, bi.llcm03049);
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
            startActivity(new Intent(this, Section04cmActivity.class));
        }
    }


    private void SaveDraft() {

        form21cm.setCm0301(bi.cm030101.isChecked() ? "1"
                : bi.cm030102.isChecked() ? "2"
                : bi.cm030108.isChecked() ? "8"
                : bi.cm030109.isChecked() ? "9"
                : "-1");

        form21cm.setCm0302(bi.cm030201.isChecked() ? "1"
                : bi.cm030202.isChecked() ? "2"
                : bi.cm030208.isChecked() ? "8"
                : bi.cm030209.isChecked() ? "9"
                : "-1");

        form21cm.setCm0303(bi.cm0303.getText().toString());

        form21cm.setCm0304(bi.cm30401.isChecked() ? "1"
                : bi.cm30402.isChecked() ? "2"
                : bi.cm30408.isChecked() ? "8"
                : bi.cm30409.isChecked() ? "9"
                : "-1");

        form21cm.setCm0305(bi.cm0305.getText().toString());

        form21cm.setCm0306(bi.cm030601.isChecked() ? "1"
                : bi.cm030602.isChecked() ? "2"
                : bi.cm030608.isChecked() ? "8"
                : bi.cm030609.isChecked() ? "9"
                : "-1");

        form21cm.setCm0307(bi.cm0307.getText().toString());

        form21cm.setCm0308(bi.cm030801.isChecked() ? "1"
                : bi.cm030802.isChecked() ? "2"
                : bi.cm030808.isChecked() ? "8"
                : bi.cm030809.isChecked() ? "9"
                : "-1");

        form21cm.setCm0309(bi.cm0309.getText().toString());

        form21cm.setCm03010(bi.cm0301001.isChecked() ? "1"
                : bi.cm0301002.isChecked() ? "2"
                : bi.cm0301008.isChecked() ? "8"
                : bi.cm0301009.isChecked() ? "9"
                : "-1");

        form21cm.setCm03011(bi.cm03011.getText().toString());

        form21cm.setCm03012(bi.cm0301201.isChecked() ? "1"
                : bi.cm0301202.isChecked() ? "2"
                : bi.cm0301208.isChecked() ? "8"
                : bi.cm0301209.isChecked() ? "9"
                : "-1");

        form21cm.setCm03013(bi.cm03013.getText().toString());

        form21cm.setCm03014(bi.cm0301401.isChecked() ? "1"
                : bi.cm0301402.isChecked() ? "2"
                : bi.cm0301408.isChecked() ? "8"
                : bi.cm0301408.isChecked() ? "9"
                : "-1");

        form21cm.setCm03015(bi.cm03015.getText().toString());

        form21cm.setCm03016(bi.cm0301601.isChecked() ? "1"
                : bi.cm0301602.isChecked() ? "2"
                : bi.cm0301608.isChecked() ? "8"
                : bi.cm0301609.isChecked() ? "9"
                : "-1");

        form21cm.setCm03017(bi.cm03017.getText().toString());

        form21cm.setCm03018(bi.cm0301801.isChecked() ? "1"
                : bi.cm0301802.isChecked() ? "2"
                : bi.cm0301808.isChecked() ? "8"
                : bi.cm0301809.isChecked() ? "9"
                : "-1");

        form21cm.setCm03019(bi.cm03019.getText().toString());

        form21cm.setCm03020(bi.cm0302001.isChecked() ? "1"
                : bi.cm0302002.isChecked() ? "2"
                : bi.cm0302008.isChecked() ? "8"
                : bi.cm0302009.isChecked() ? "9"
                : "-1");

        form21cm.setCm03021(bi.cm03021.getText().toString());

        form21cm.setCm03022(bi.cm0302201.isChecked() ? "1"
                : bi.cm0302202.isChecked() ? "2"
                : bi.cm0302208.isChecked() ? "8"
                : bi.cm0302209.isChecked() ? "9"
                : "-1");

        form21cm.setCm03023(bi.cm03023.getText().toString());

        form21cm.setCm03024(bi.cm0302401.isChecked() ? "1"
                : bi.cm0302402.isChecked() ? "2"
                : bi.cm0302408.isChecked() ? "8"
                : bi.cm0302409.isChecked() ? "9"
                : "-1");

        form21cm.setCm03025(bi.cm03025.getText().toString());

        form21cm.setCm03026(bi.cm0302601.isChecked() ? "1"
                : bi.cm0302602.isChecked() ? "2"
                : bi.cm0302608.isChecked() ? "8"
                : bi.cm0302609.isChecked() ? "9"
                : "-1");

        form21cm.setCm03027(bi.cm03027.getText().toString());

        form21cm.setCm03028(bi.cm0302801.isChecked() ? "1"
                : bi.cm0302802.isChecked() ? "2"
                : bi.cm0302808.isChecked() ? "8"
                : bi.cm0302809.isChecked() ? "9"
                : "-1");

        form21cm.setCm03029(bi.cm03029.getText().toString());

        form21cm.setCm03030(bi.cm0303001.isChecked() ? "1"
                : bi.cm0303001.isChecked() ? "2"
                : bi.cm0303008.isChecked() ? "8"
                : bi.cm0303009.isChecked() ? "9"
                : "-1");

        form21cm.setCm03031(bi.cm03031.getText().toString());

        form21cm.setCm03032(bi.cm0303201.isChecked() ? "1"
                : bi.cm0303202.isChecked() ? "2"
                : bi.cm0303208.isChecked() ? "8"
                : bi.cm0303209.isChecked() ? "9"
                : "-1");

        form21cm.setCm03033(bi.cm03033.getText().toString());

        form21cm.setCm03034(bi.cm0303401.isChecked() ? "1"
                : bi.cm0303402.isChecked() ? "2"
                : bi.cm0303408.isChecked() ? "8"
                : bi.cm0303409.isChecked() ? "9"
                : "-1");

        form21cm.setCm03035(bi.cm03035.getText().toString());

        form21cm.setCm03036(bi.cm0303601.isChecked() ? "1"
                : bi.cm0303602.isChecked() ? "2"
                : bi.cm0303608.isChecked() ? "8"
                : bi.cm0303609.isChecked() ? "9"
                : "-1");

        form21cm.setCm03037(bi.cm03037.getText().toString());

        form21cm.setCm03038(bi.cm0303801.isChecked() ? "1"
                : bi.cm0303802.isChecked() ? "2"
                : bi.cm0303808.isChecked() ? "8"
                : bi.cm0303809.isChecked() ? "9"
                : "-1");

        form21cm.setCm03039(bi.cm03039.getText().toString());

        form21cm.setCm03040(bi.cm0304001.isChecked() ? "1"
                : bi.cm0304002.isChecked() ? "2"
                : bi.cm0304008.isChecked() ? "8"
                : bi.cm0304009.isChecked() ? "9"
                : "-1");

        form21cm.setCm03041(bi.cm03041.getText().toString());

        form21cm.setCm03042(bi.cm0304201.isChecked() ? "1"
                : bi.cm0304202.isChecked() ? "2"
                : bi.cm0304208.isChecked() ? "8"
                : bi.cm0304209.isChecked() ? "9"
                : "-1");

        form21cm.setCm03043(bi.cm03043.getText().toString());

        form21cm.setCm03044(bi.cm0304401.isChecked() ? "1"
                : bi.cm0304402.isChecked() ? "2"
                : bi.cm0304408.isChecked() ? "8"
                : bi.cm0304409.isChecked() ? "9"
                : "-1");

        form21cm.setCm03045(bi.cm03045.getText().toString());

        form21cm.setCm03046(bi.cm0304601.isChecked() ? "1"
                : bi.cm0304602.isChecked() ? "2"
                : bi.cm0304608.isChecked() ? "8"
                : bi.cm0304609.isChecked() ? "9"
                : "-1");

        form21cm.setCm03047(bi.cm03047.getText().toString());

        form21cm.setCm03048(bi.cm03048.getText().toString());

        form21cm.setCm03049(bi.cm0304901.isChecked() ? "1"
                : bi.cm0304902.isChecked() ? "2"
                : bi.cm0304908.isChecked() ? "8"
                : bi.cm0304909.isChecked() ? "9"
                : "-1");

        form21cm.setCm03050(bi.cm03050.getText().toString());

        form21cm.setCm03051(bi.cm03051.getText().toString());


    }


    public void BtnEnd() {
        finish();
        startActivity(new Intent(this, EndingActivityForm21cm.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }

}