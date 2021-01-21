package edu.aku.hassannaqvi.amanhicovid_19study.ui.sections;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection03mmBinding;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection04mmBinding;

public class Section04mmActivity extends AppCompatActivity {

    ActivitySection04mmBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_04mm);
        bi.setCallback(this);
    }


    public void BtnEnd() {

    }

    public void BtnContinue() {

    }

}