package edu.aku.hassannaqvi.amanhicovid_19study.ui.sections;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection04cmBinding;

public class Section04cmActivity extends AppCompatActivity {

    ActivitySection04cmBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_04cm);
        bi.setCallback(this);
    }

    public void BtnEnd() {

    }

    public void BtnContinue() {

    }
}