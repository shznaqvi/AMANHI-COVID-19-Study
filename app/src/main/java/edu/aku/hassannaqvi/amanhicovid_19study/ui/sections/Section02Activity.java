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
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection02Binding;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingActivityForm21cm;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingPregsurvActivity;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form21cm;


public class Section02Activity extends AppCompatActivity {
    ActivitySection02Binding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section02);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {

        rgListener(bi.cr3005a, bi.cr3005ay, bi.fldGrpCVcr3005as, bi.fldGrpCVcr5005asi);
        rgListener(bi.cr3005b, bi.cr3005ba, bi.fldGrpCVcr3005bs, bi.fldGrpCVcr5005bsi);
        rgListener(bi.cr3005c, bi.cr3005ca, bi.fldGrpCVcr3005cs, bi.fldGrpCVcr5005csi);
        rgListener(bi.cr3005d, bi.cr3005da, bi.fldGrpCVcr3005ds, bi.fldGrpCVcr5005dsi);
        rgListener(bi.cr3005e, bi.cr3005ea, bi.fldGrpCVcr3005es, bi.fldGrpCVcr5005esi);
        rgListener(bi.cr3005f, bi.cr3005fa, bi.fldGrpCVcr3005fs, bi.fldGrpCVcr5005fsi);
        rgListener(bi.cr3005g, bi.cr3005ga, bi.fldGrpCVcr3005gs, bi.fldGrpCVcr5005gsi);
        rgListener(bi.cr3005h, bi.cr3005ha, bi.fldGrpCVcr3005hs, bi.fldGrpCVcr5005hsi);
        rgListener(bi.cr3005i, bi.cr3005ia, bi.fldGrpCVcr3005is, bi.fldGrpCVcr5005isi);
        rgListener(bi.cr3005j, bi.cr3005ja, bi.fldGrpCVcr3005js, bi.fldGrpCVcr5005jsi);
        rgListener(bi.cr3005k, bi.cr3005ka, bi.fldGrpCVcr3005ks, bi.fldGrpCVcr5005ksi);
        rgListener(bi.cr3005l, bi.cr3005la, bi.fldGrpCVcr5005lsi, bi.fldGrpCVcr5005lsi);
        rgListener(bi.cr3005m, bi.cr3005ma, bi.fldGrpCVcr5005msi, bi.fldGrpCVcr5005msi);
        rgListener(bi.cr3005n, bi.cr3005na, bi.fldGrpCVcr5005nsi, bi.fldGrpCVcr5005nsi);
        rgListener(bi.cr3005o, bi.cr3005oa, bi.fldGrpCVcr5005osi, bi.fldGrpCVcr5005osi);
        rgListener(bi.cr3005p, bi.cr3005pa, bi.fldGrpCVcr5005psi, bi.fldGrpCVcr5005psi);
        rgListener(bi.cr3005q, bi.cr3005qa, bi.fldGrpCVcr5005qsi, bi.fldGrpCVcr5005qsi);
        rgListener(bi.cr3005r, bi.cr3005ra, bi.fldGrpCVcr5005rsi, bi.fldGrpCVcr5005rsi);
        rgListener(bi.cr3005s, bi.cr3005sa, bi.fldGrpCVcr5005ssi, bi.fldGrpCVcr5005ssi);
        rgListener(bi.cr3005t, bi.cr3005ta, bi.fldGrpCVcr5005tsi, bi.fldGrpCVcr5005tsi);
        rgListener(bi.cr3005u, bi.cr3005ua, bi.fldGrpCVcr5005usi, bi.fldGrpCVcr5005usi);
        rgListener(bi.cr3005v, bi.cr3005va, bi.fldGrpCVcr5005vsi, bi.fldGrpCVcr5005vsi);
        rgListener(bi.cr3005w, bi.cr3005wa, bi.fldGrpCVcr5005wsi, bi.fldGrpCVcr5005wsi);
        rgListener(bi.cr3005x, bi.cr3005xa, bi.fldGrpCVcr5005xsi, bi.fldGrpCVcr5005xsi);

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

        startActivity(new Intent(this, Section02bActivity.class));

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