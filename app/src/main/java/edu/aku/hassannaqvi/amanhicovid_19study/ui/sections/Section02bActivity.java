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
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Forms21cmContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection02Binding;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection02bBinding;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingPregsurvActivity;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form21cm;

public class Section02bActivity extends AppCompatActivity {

    ActivitySection02bBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section02b);
        bi.setCallback(this);
        setupSkips();
    }

    private void setupSkips() {

        rgListener(bi.cr3005y, bi.cr3005ya, bi.fldGrpCVcr5005ysi, bi.fldGrpCVcr5005ysi);
        rgListener(bi.cr3005z, bi.cr3005za, bi.fldGrpCVcr5005zsi, bi.fldGrpCVcr5005zsi);
        rgListener(bi.cr3005aa, bi.cr3005aaa, bi.fldGrpCVcr5005aasi, bi.fldGrpCVcr5005aasi);
        rgListener(bi.cr3005ab, bi.cr3005aba, bi.fldGrpCVcr3005abs, bi.fldGrpCVcr5005absi);

    }


    private void rgListener(@NotNull RadioGroup rg, RadioButton rb, ViewGroup vg, ViewGroup vg1) {
        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(vg);
            vg.setVisibility(View.GONE);

            Clear.clearAllFields(vg1);
            vg1.setVisibility(View.GONE);

            if (i == rb.getId()) {
                vg.setVisibility(View.VISIBLE);
                vg1.setVisibility(View.VISIBLE);
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

        startActivity(new Intent(this, Section03Activity.class));

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