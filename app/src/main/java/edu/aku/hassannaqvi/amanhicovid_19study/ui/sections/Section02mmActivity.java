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
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Forms4mmContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection02mmBinding;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingActivityForm4mm;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form4m;

public class Section02mmActivity extends AppCompatActivity {

    ActivitySection02mmBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_02mm);
        bi.setCallback(this);

        setupSkips();
    }

    private void setupSkips() {
        rgListener(bi.mm0201, bi.mm0201011, bi.fldGrpCVmm202);
    }


    private void rgListener(@NotNull RadioGroup rg, RadioButton rb, ViewGroup vg) {
        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(vg);
            vg.setVisibility(View.VISIBLE);
            if (i == rb.getId()) {
                vg.setVisibility(View.GONE);
            }
        });
    }

    private void SaveDraft() {
        form4m.setMm0201(bi.mm0201011.isChecked() ? "11"
                : bi.mm0201012.isChecked() ? "12"
                : "-1");

        form4m.setMm202(bi.mm202011.isChecked() ? "11"
                : bi.mm202012.isChecked() ? "12"
                : bi.mm202013.isChecked() ? "13"
                : bi.mm202014.isChecked() ? "14"
                : bi.mm202015.isChecked() ? "15"
                : bi.mm202077.isChecked() ? "77"
                : "-1");

        form4m.setMm202077x(bi.mm202077x.getText().toString());
    }

    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesForm4MColumn(Forms4mmContract.Forms4MMTable.COLUMN_S02, form4m.s02toString());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    public void BtnEnd() {
        finish();
        startActivity(new Intent(this, EndingActivityForm4mm.class).putExtra("complete", false));
    }

    public void BtnContinue() {
        if (!formValidation()) return;
        SaveDraft();
        if (UpdateDB()) {
            finish();
            if (bi.mm0201012.isChecked()) {
                startActivity(new Intent(this, EndingActivityForm4mm.class).putExtra("complete", true));
            } else startActivity(new Intent(this, Section03mmActivity.class));
        }
    }
}