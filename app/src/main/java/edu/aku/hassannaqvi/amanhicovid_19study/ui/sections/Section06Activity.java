package edu.aku.hassannaqvi.amanhicovid_19study.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Forms21cmContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection06Binding;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingActivityForm21cm;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingPregsurvActivity;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form21cm;


public class Section06Activity extends AppCompatActivity {
    ActivitySection06Binding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section06);
        bi.setCallback(this);
        setupSkips();

    }


    private void setupSkips() {

        bi.test.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (bi.testa.isChecked()) {
                    bi.fldGrpCVteatavail.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5042a.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5042b.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5042c.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5024d.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5042g.setVisibility(View.VISIBLE);

                } else {

                    Clear.clearAllFields(bi.fldGrpCVteatavail);
                    Clear.clearAllFields(bi.fldGrpCVcr5042a);
                    Clear.clearAllFields(bi.fldGrpCVcr5042b);
                    Clear.clearAllFields(bi.fldGrpCVcr5042c);
                    Clear.clearAllFields(bi.fldGrpCVcr5024d);
                    Clear.clearAllFields(bi.fldGrpCVcr5042g);


                    bi.fldGrpCVteatavail.setVisibility(View.GONE);
                    bi.fldGrpCVcr5042a.setVisibility(View.GONE);
                    bi.fldGrpCVcr5042b.setVisibility(View.GONE);
                    bi.fldGrpCVcr5042c.setVisibility(View.GONE);
                    bi.fldGrpCVcr5024d.setVisibility(View.GONE);
                    bi.fldGrpCVcr5042g.setVisibility(View.GONE);

                }
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


    public void BtnContinue(View view) {
        if (!formValidation()) return;

        startActivity(new Intent(this, EndingPregsurvActivity.class).putExtra("complete", true));

        /*SaveDraft();
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, EndingActivityForm21cm.class).putExtra("complete", true));
        }*/
    }


    private void SaveDraft() {

    }


    public void BtnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingPregsurvActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


}