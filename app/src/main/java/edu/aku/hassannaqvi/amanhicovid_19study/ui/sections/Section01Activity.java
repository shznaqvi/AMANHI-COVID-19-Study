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
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.FormsPregSurvContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection01Binding;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingPregsurvActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.utils.ValidateEditTextKt;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.formpregsurv;

public class Section01Activity extends AppCompatActivity {
    ActivitySection01Binding bi;
    private static final String TAG = "";
    private DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section01);
        bi.setCallback(this);

        db = MainApp.appInfo.getDbHelper();

        setupSkips();

        ValidateEditTextKt.txtWatch(bi.cr5002aax);
        ValidateEditTextKt.txtWatch(bi.cr5002bax);
    }


    private void setupSkips() {

        bi.crpreg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (bi.crprega.isChecked()) {
                    bi.fldGrpCVcr5002a.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5002b.setVisibility(View.VISIBLE);
                } else {
                    Clear.clearAllFields(bi.fldGrpCVcr5002a);
                    Clear.clearAllFields(bi.fldGrpCVcr5002b);

                    bi.fldGrpCVcr5002a.setVisibility(View.GONE);
                    bi.fldGrpCVcr5002b.setVisibility(View.GONE);
                }
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
            startActivity(new Intent(this, Section02Activity.class).putExtra("complete", true));
        }
    }


    private void SaveDraft() {

        formpregsurv.setCrpreg(bi.crprega.isChecked() ? "1"
                : bi.crpregb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5002a(bi.cr5002aa.isChecked() ? "1"
                : bi.cr5002a999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5002aax(bi.cr5002aax.getText().toString());
        formpregsurv.setCr5002b(bi.cr5002ba.isChecked() ? "1"
                : bi.cr5002b999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5002bax(bi.cr5002bax.getText().toString());
        formpregsurv.setCr5003a(bi.cr5003aa.isChecked() ? "1"
                : bi.cr5003a999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5003aax(bi.cr5003aax.getText().toString());
        formpregsurv.setCr5003b(bi.cr5003ba.isChecked() ? "1"
                : bi.cr5003b999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5003bax(bi.cr5003bax.getText().toString());

        formpregsurv.setCr3004a(bi.cr3004aa.isChecked() ? "1"
                : bi.cr3004ab.isChecked() ? "2"
                : bi.cr3004a8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3004b(bi.cr3004ba.isChecked() ? "1"
                : bi.cr3004bb.isChecked() ? "2"
                : bi.cr3004b8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3004bi(bi.cr3004bia.isChecked() ? "1"
                : bi.cr3004bib.isChecked() ? "2"
                : bi.cr3004bi8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3004bii(bi.cr3004biia.isChecked() ? "1"
                : bi.cr3004biib.isChecked() ? "2"
                : bi.cr3004bii8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3004biii(bi.cr3004biiia.isChecked() ? "1"
                : bi.cr3004biiib.isChecked() ? "2"
                : bi.cr3004biii8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3004c(bi.cr3004ca.isChecked() ? "1"
                : bi.cr3004cb.isChecked() ? "2"
                : bi.cr3004c8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3004d(bi.cr3004da.isChecked() ? "1"
                : bi.cr3004db.isChecked() ? "2"
                : bi.cr3004d8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3004e(bi.cr3004ea.isChecked() ? "1"
                : bi.cr3004eb.isChecked() ? "2"
                : bi.cr3004e8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3004f(bi.cr3004fa.isChecked() ? "1"
                : bi.cr3004fb.isChecked() ? "2"
                : bi.cr3004f8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3004g(bi.cr3004ga.isChecked() ? "1"
                : bi.cr3004gb.isChecked() ? "2"
                : bi.cr3004g8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3004h(bi.cr3004ha.isChecked() ? "1"
                : bi.cr3004hb.isChecked() ? "2"
                : bi.cr3004h8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3004i(bi.cr3004ia.isChecked() ? "1"
                : bi.cr3004ib.isChecked() ? "2"
                : bi.cr3004i8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3004j(bi.cr3004ja.isChecked() ? "1"
                : bi.cr3004jb.isChecked() ? "2"
                : bi.cr3004j8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3004k(bi.cr3004ka.isChecked() ? "1"
                : bi.cr3004kb.isChecked() ? "2"
                : bi.cr3004k8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3004l(bi.cr3004la.isChecked() ? "1"
                : bi.cr3004lb.isChecked() ? "2"
                : bi.cr3004l8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3004m(bi.cr3004ma.isChecked() ? "1"
                : bi.cr3004mb.isChecked() ? "2"
                : bi.cr3004m8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3004n(bi.cr3004na.isChecked() ? "1"
                : bi.cr3004nb.isChecked() ? "2"
                : bi.cr3004n8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3004o(bi.cr3004oa.isChecked() ? "1"
                : bi.cr3004ob.isChecked() ? "2"
                : bi.cr3004o8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3004p(bi.cr3004pa.isChecked() ? "1"
                : bi.cr3004pb.isChecked() ? "2"
                : bi.cr3004p8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3004q(bi.cr3004qa.isChecked() ? "1"
                : bi.cr3004qb.isChecked() ? "2"
                : bi.cr3004q8.isChecked() ? "8"
                : "-1");

        formpregsurv.setCr3004si(bi.cr3004siy.isChecked() ? "1"
                : bi.cr3004sin.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr3004sia(bi.cr3004siay.isChecked() ? "1"
                : bi.cr3004sian.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr3004qsii(bi.cr3004qsiia.isChecked() ? "1"
                : bi.cr3004qsiib.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr3004qsiii(bi.cr3004qsiiia.isChecked() ? "1"
                : bi.cr3004qsiiib.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr3004r(bi.cr3004ra.isChecked() ? "1"
                : bi.cr3004rb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr3004rsi(bi.cr3004rsia.isChecked() ? "1"
                : bi.cr3004rsib.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr3004qrsii(bi.cr3004qrsiia.isChecked() ? "1"
                : bi.cr3004qrsiib.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr3004qrsiii(bi.cr3004qrsiii.getText().toString());

        formpregsurv.setCr3004s(bi.cr3004sa.isChecked() ? "1"
                : bi.cr3004sb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr3004ss(bi.cr3004ss.getText().toString());

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