package edu.aku.hassannaqvi.amanhicovid_19study.ui.sections;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;

import org.jetbrains.annotations.NotNull;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection02cmBinding;

public class Section02cmActivity extends AppCompatActivity {

    ActivitySection02cmBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_02cm);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {
        rgListener(bi.cm0201, bi.cm020111, bi.cvcm0202);
    }


    public void rgListener(@NotNull RadioGroup rg, RadioButton rb, ViewGroup vg) {
        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(vg);
            vg.setVisibility(View.VISIBLE);
            if (i == rb.getId()) {
                vg.setVisibility(View.GONE);
            }
        });
    }


    public void BtnEnd() {

    }

    public void BtnContinue() {

    }


}