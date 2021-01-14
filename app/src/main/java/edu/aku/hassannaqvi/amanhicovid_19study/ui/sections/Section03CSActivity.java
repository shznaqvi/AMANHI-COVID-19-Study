package edu.aku.hassannaqvi.amanhicovid_19study.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection03csBinding;
import edu.aku.hassannaqvi.amanhicovid_19study.models.Form;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.MainActivity;


public class Section03CSActivity extends AppCompatActivity {

    ActivitySection03csBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // only in First Section
        MainApp.form = new Form();

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_03cs);
        bi.setForm(MainApp.form);
        setupSkips();

    }

    private void setupSkips() {

        bi.cs03.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.llcs03);
            bi.llcs03.setVisibility(View.VISIBLE);
            if (i == bi.cs0302.getId()) {
                bi.llcs03.setVisibility(View.GONE);
            }
        });

        bi.cs06.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.fldGrpCVcs07);
            Clear.clearAllFields(bi.fldGrpCVcs08);
            Clear.clearAllFields(bi.fldGrpCVcs10);
            Clear.clearAllFields(bi.fldGrpCVcs11);
            bi.fldGrpCVcs07.setVisibility(View.VISIBLE);
            bi.fldGrpCVcs08.setVisibility(View.VISIBLE);
            bi.fldGrpCVcs10.setVisibility(View.VISIBLE);
            bi.fldGrpCVcs11.setVisibility(View.VISIBLE);
            if (i == bi.cs0602.getId()) {
                bi.fldGrpCVcs07.setVisibility(View.GONE);
                bi.fldGrpCVcs08.setVisibility(View.GONE);
            } else if (i == bi.cs0601.getId()) {
                bi.fldGrpCVcs10.setVisibility(View.GONE);
                bi.fldGrpCVcs11.setVisibility(View.GONE);
            }
        });


        radioGroup(bi.cs12);
        radioGroup(bi.cs13);
        radioGroup(bi.cs14);
    }


    public void radioGroup(RadioGroup grp) {
        grp.setOnCheckedChangeListener(((radioGroup, i) -> {
            Clear.clearAllFields(bi.fldGrpCVcs15);
            Clear.clearAllFields(bi.fldGrpCVcs16);
            Clear.clearAllFields(bi.fldGrpCVcs17);
            Clear.clearAllFields(bi.fldGrpCVcs18);
            Clear.clearAllFields(bi.fldGrpCVcs19);
            bi.fldGrpCVcs15.setVisibility(View.VISIBLE);
            bi.fldGrpCVcs16.setVisibility(View.VISIBLE);
            bi.fldGrpCVcs17.setVisibility(View.VISIBLE);
            bi.fldGrpCVcs18.setVisibility(View.VISIBLE);
            bi.fldGrpCVcs19.setVisibility(View.VISIBLE);
            if (bi.cs1202.isChecked()
                    && bi.cs1302.isChecked()
                    && bi.cs1402.isChecked()) {
                bi.fldGrpCVcs15.setVisibility(View.GONE);
                bi.fldGrpCVcs16.setVisibility(View.GONE);
                bi.fldGrpCVcs17.setVisibility(View.GONE);
                bi.fldGrpCVcs18.setVisibility(View.GONE);
                bi.fldGrpCVcs19.setVisibility(View.GONE);
            }
            if (i == bi.cs1402.getId()) {
                bi.fldGrpCVcs15.setVisibility(View.GONE);
            }
        }));

    }


    public void BtnContinue(View view) {
        if (!formValidation()) return;

        // SaveDraft(); //<== This function is no longer needed after DataBinding
        if (/*UpdateDB()*/ true) {
            finish();
            startActivity(new Intent(this, Section03CSActivity.class));
        }
    }

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);

    }


    public void BtnEnd(View view) {
        finish();
        startActivity(new Intent(this, MainActivity.class));
    }


}