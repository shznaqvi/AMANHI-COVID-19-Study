package edu.aku.hassannaqvi.amanhicovid_19study.ui.sections;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection02mmBinding;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection03mmBinding;

public class Section03mmActivity extends AppCompatActivity {

    ActivitySection03mmBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_03mm);
        bi.setCallback(this);
    }

    public void BtnEnd() {

    }

    public void BtnContinue() {

    }

}