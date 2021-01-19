package edu.aku.hassannaqvi.amanhicovid_19study.ui.sections;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection04cmBinding;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form;

public class Section04cmActivity extends AppCompatActivity {

    ActivitySection04cmBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_04cm);
        bi.setCallback(this);
    }


    private void SaveDraft() {

        form.setCm0401(bi.cm040101.isChecked() ? "1"
                : bi.cm040102.isChecked() ? "2"
                : bi.cm040108.isChecked() ? "8"
                : bi.cm040109.isChecked() ? "9"
                : "-1");

        form.setCm0402(bi.cm040201.isChecked() ? "1"
                : bi.cm040202.isChecked() ? "2"
                : bi.cm040208.isChecked() ? "8"
                : bi.cm040209.isChecked() ? "9"
                : "-1");

        form.setCm0403(bi.cm0403.getText().toString());

        form.setCm0404(bi.cm040401.isChecked() ? "1"
                : bi.cm040402.isChecked() ? "2"
                : bi.cm040408.isChecked() ? "8"
                : bi.cm040409.isChecked() ? "9"
                : "-1");

        form.setCm0405(bi.cm040501.isChecked() ? "1"
                : bi.cm040502.isChecked() ? "2"
                : bi.cm040508.isChecked() ? "8"
                : bi.cm040509.isChecked() ? "9"
                : "-1");

        form.setCm0406(bi.cm040601.isChecked() ? "1"
                : bi.cm040602.isChecked() ? "2"
                : bi.cm040609.isChecked() ? "9"
                : "-1");

        form.setCm0407(bi.cm040701.isChecked() ? "1"
                : bi.cm040702.isChecked() ? "2"
                : bi.cm040708.isChecked() ? "8"
                : bi.cm040709.isChecked() ? "9"
                : "-1");

        form.setCm0408(bi.cm0408011.isChecked() ? "11"
                : bi.cm0408012.isChecked() ? "12"
                : bi.cm0408013.isChecked() ? "13"
                : bi.cm0408099.isChecked() ? "99"
                : bi.cm0408015.isChecked() ? "15"
                : "-1");

        form.setCm0408015x(bi.cm0408015x.getText().toString());
        form.setCm04010(bi.cm0401001.isChecked() ? "1"
                : bi.cm0401002.isChecked() ? "2"
                : bi.cm0401008.isChecked() ? "8"
                : bi.cm0401009.isChecked() ? "9"
                : "-1");

        form.setCm04011(bi.cm0401101.isChecked() ? "1"
                : bi.cm0401102.isChecked() ? "2"
                : bi.cm0401108.isChecked() ? "8"
                : bi.cm0401109.isChecked() ? "9"
                : "-1");

        form.setCm04012(bi.cm04012.getText().toString());

        form.setCm04013(bi.cm0401301.isChecked() ? "1"
                : bi.cm0401302.isChecked() ? "2"
                : bi.cm0401308.isChecked() ? "8"
                : bi.cm0401309.isChecked() ? "9"
                : "-1");

    }

    public void BtnEnd() {

    }

    public void BtnContinue() {

    }
}