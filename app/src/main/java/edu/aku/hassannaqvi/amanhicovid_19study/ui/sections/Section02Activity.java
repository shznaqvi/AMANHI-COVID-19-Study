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
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.FormsPregSurvContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection02Binding;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingPregsurvActivity;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.formpregsurv;


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
        int updcount = db.updatesFormColumnPregSurv(FormsPregSurvContract.FormsPregSurvTable.COLUMN_S02, formpregsurv.s02toString());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void BtnContinue(View view) {
        if (!formValidation()) return;

        SaveDraft();
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, Section02bActivity.class).putExtra("complete", true));
        }
    }


    private void SaveDraft() {

        formpregsurv.setCr3005(bi.cr30051y.isChecked() ? "1"
                : bi.cr30051n.isChecked() ? "2"
                : bi.cr30058.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3005a(bi.cr3005ay.isChecked() ? "1"
                : bi.cr3005an.isChecked() ? "2"
                : bi.cr3005a8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3005as(bi.cr3005as.getText().toString());

        formpregsurv.setCr5005asid(bi.cr5005asi.getText().toString());

        formpregsurv.setCr3005b(bi.cr3005ba.isChecked() ? "1"
                : bi.cr3005bb.isChecked() ? "2"
                : bi.cr3005b8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3005bs(bi.cr3005bs.getText().toString());

        formpregsurv.setCr5005bsid(bi.cr5005bsi.getText().toString());

        formpregsurv.setCr3005c(bi.cr3005ca.isChecked() ? "1"
                : bi.cr3005cb.isChecked() ? "2"
                : bi.cr3005c8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3005cs(bi.cr3005cs.getText().toString());

        formpregsurv.setCr5005csid(bi.cr5005csi.getText().toString());

        formpregsurv.setCr3005d(bi.cr3005da.isChecked() ? "1"
                : bi.cr3005db.isChecked() ? "2"
                : bi.cr3005d8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3005ds(bi.cr3005ds.getText().toString());

        formpregsurv.setCr5005dsid(bi.cr5005dsi.getText().toString());

        formpregsurv.setCr3005e(bi.cr3005ea.isChecked() ? "1"
                : bi.cr3005eb.isChecked() ? "2"
                : bi.cr3005e8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3005es(bi.cr3005es.getText().toString());

        formpregsurv.setCr5005esid(bi.cr5005esi.getText().toString());

        formpregsurv.setCr3005f(bi.cr3005fa.isChecked() ? "1"
                : bi.cr3005fb.isChecked() ? "2"
                : bi.cr3005f8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3005fs(bi.cr3005fs.getText().toString());

        formpregsurv.setCr5005fsid(bi.cr5005fsi.getText().toString());

        formpregsurv.setCr3005g(bi.cr3005ga.isChecked() ? "1"
                : bi.cr3005gb.isChecked() ? "2"
                : bi.cr3005g8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3005gs(bi.cr3005gs.getText().toString());

        formpregsurv.setCr5005gsid(bi.cr5005gsi.getText().toString());

        formpregsurv.setCr3005h(bi.cr3005ha.isChecked() ? "1"
                : bi.cr3005hb.isChecked() ? "2"
                : bi.cr3005h8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3005hs(bi.cr3005hs.getText().toString());

        formpregsurv.setCr5005hsid(bi.cr5005hsi.getText().toString());

        formpregsurv.setCr3005i(bi.cr3005ia.isChecked() ? "1"
                : bi.cr3005ib.isChecked() ? "2"
                : bi.cr3005i8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3005is(bi.cr3005is.getText().toString());

        formpregsurv.setCr5005isid(bi.cr5005isi.getText().toString());

        formpregsurv.setCr3005j(bi.cr3005ja.isChecked() ? "1"
                : bi.cr3005jb.isChecked() ? "2"
                : bi.cr3005j8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3005js(bi.cr3005js.getText().toString());

        formpregsurv.setCr5005jsid(bi.cr5005jsi.getText().toString());

        formpregsurv.setCr3005k(bi.cr3005ka.isChecked() ? "1"
                : bi.cr3005kb.isChecked() ? "2"
                : bi.cr3005k8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3005ks(bi.cr3005ks.getText().toString());

        formpregsurv.setCr5005ksid(bi.cr5005ksi.getText().toString());

        formpregsurv.setCr3005l(bi.cr3005la.isChecked() ? "1"
                : bi.cr3005lb.isChecked() ? "2"
                : bi.cr3005l8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr5005lsid(bi.cr5005lsi.getText().toString());

        formpregsurv.setCr3005m(bi.cr3005ma.isChecked() ? "1"
                : bi.cr3005mb.isChecked() ? "2"
                : bi.cr3005m8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr5005msid(bi.cr5005msi.getText().toString());

        formpregsurv.setCr3005n(bi.cr3005na.isChecked() ? "1"
                : bi.cr3005nb.isChecked() ? "2"
                : bi.cr3005n8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr5005nsid(bi.cr5005nsi.getText().toString());

        formpregsurv.setCr3005o(bi.cr3005oa.isChecked() ? "1"
                : bi.cr3005ob.isChecked() ? "2"
                : bi.cr3005o8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr5005osid(bi.cr5005osi.getText().toString());

        formpregsurv.setCr3005p(bi.cr3005pa.isChecked() ? "1"
                : bi.cr3005pb.isChecked() ? "2"
                : bi.cr3005p8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr5005psid(bi.cr5005psi.getText().toString());

        formpregsurv.setCr3005q(bi.cr3005qa.isChecked() ? "1"
                : bi.cr3005qb.isChecked() ? "2"
                : bi.cr3005q8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr5005qsid(bi.cr5005qsi.getText().toString());

        formpregsurv.setCr3005r(bi.cr3005ra.isChecked() ? "1"
                : bi.cr3005rb.isChecked() ? "2"
                : bi.cr3005r8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr5005rsid(bi.cr5005rsi.getText().toString());

        formpregsurv.setCr3005s(bi.cr3005sa.isChecked() ? "1"
                : bi.cr3005sb.isChecked() ? "2"
                : bi.cr3005s8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr5005ssid(bi.cr5005ssi.getText().toString());

        formpregsurv.setCr3005t(bi.cr3005ta.isChecked() ? "1"
                : bi.cr3005tb.isChecked() ? "2"
                : bi.cr3005t8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr5005tsid(bi.cr5005tsi.getText().toString());

        formpregsurv.setCr3005u(bi.cr3005ua.isChecked() ? "1"
                : bi.cr3005ub.isChecked() ? "2"
                : bi.cr3005u8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr5005usid(bi.cr5005usi.getText().toString());

        formpregsurv.setCr3005v(bi.cr3005va.isChecked() ? "1"
                : bi.cr3005vb.isChecked() ? "2"
                : bi.cr3005v8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr5005vsid(bi.cr5005vsi.getText().toString());

        formpregsurv.setCr3005w(bi.cr3005wa.isChecked() ? "1"
                : bi.cr3005wb.isChecked() ? "2"
                : bi.cr3005w8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr5005wsid(bi.cr5005wsi.getText().toString());

        formpregsurv.setCr3005x(bi.cr3005xa.isChecked() ? "1"
                : bi.cr3005xb.isChecked() ? "2"
                : bi.cr3005x8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr5005xsid(bi.cr5005xsi.getText().toString());



    }


    public void BtnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingPregsurvActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }

}