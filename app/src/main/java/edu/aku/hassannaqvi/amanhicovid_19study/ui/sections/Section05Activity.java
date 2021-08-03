package edu.aku.hassannaqvi.amanhicovid_19study.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.FormsPregSurvContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection05Binding;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingPregsurvActivity;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.formpregsurv;


public class Section05Activity extends AppCompatActivity {
    ActivitySection05Binding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section05);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {
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
            startActivity(new Intent(this, Section06Activity.class).putExtra("complete", true));
        }
    }


    private void SaveDraft() {

        formpregsurv.setSymp(bi.sympa.isChecked() ? "1"
                : bi.sympb.isChecked() ? "2"
                : bi.sympc.isChecked() ? "8"
                : bi.sympd.isChecked() ? "9"
                : "-1");

        formpregsurv.setCr5040b(bi.cr5040ba.isChecked() ? "1"
                : bi.cr5040bb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040c(bi.cr5040ca.isChecked() ? "1"
                : bi.cr5040cb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040d(bi.cr5040da.isChecked() ? "1"
                : bi.cr5040db.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040e(bi.cr5040ea.isChecked() ? "1"
                : bi.cr5040eb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040f(bi.cr5040fa.isChecked() ? "1"
                : bi.cr5040fb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040g(bi.cr5040ga.isChecked() ? "1"
                : bi.cr5040gb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040h(bi.cr5040ha.isChecked() ? "1"
                : bi.cr5040hb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040i(bi.cr5040ia.isChecked() ? "1"
                : bi.cr5040ib.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040j(bi.cr5040ja.isChecked() ? "1"
                : bi.cr5040jb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040k(bi.cr5040ka.isChecked() ? "1"
                : bi.cr5040kb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040l(bi.cr5040la.isChecked() ? "1"
                : bi.cr5040lb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040m(bi.cr5040ma.isChecked() ? "1"
                : bi.cr5040mb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040n(bi.cr5040na.isChecked() ? "1"
                : bi.cr5040nb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040o(bi.cr5040oa.isChecked() ? "1"
                : bi.cr5040ob.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040p(bi.cr5040pa.isChecked() ? "1"
                : bi.cr5040pb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040q(bi.cr5040qa.isChecked() ? "1"
                : bi.cr5040qb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040r(bi.cr5040ra.isChecked() ? "1"
                : bi.cr5040rb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040s(bi.cr5040sa.isChecked() ? "1"
                : bi.cr5040sb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040t(bi.cr5040ta.isChecked() ? "1"
                : bi.cr5040tb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040u(bi.cr5040ua.isChecked() ? "1"
                : bi.cr5040ub.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040v(bi.cr5040va.isChecked() ? "1"
                : bi.cr5040vb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040w(bi.cr5040wa.isChecked() ? "1"
                : bi.cr5040wb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040x(bi.cr5040xa.isChecked() ? "1"
                : bi.cr5040xb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040y(bi.cr5040ya.isChecked() ? "1"
                : bi.cr5040yb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040a(bi.cr5040ay.isChecked() ? "1"
                : bi.cr5040an.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040aa(bi.cr5040aay.isChecked() ? "1"
                : bi.cr5040aan.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040ab(bi.cr5040aby.isChecked() ? "1"
                : bi.cr5040abn.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040ac(bi.cr5040aca.isChecked() ? "1"
                : bi.cr5040acb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040ad(bi.cr5040ada.isChecked() ? "1"
                : bi.cr5040adb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040ae(bi.cr5040aea.isChecked() ? "1"
                : bi.cr5040aeb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040es(bi.cr5040esa.isChecked() ? "1"
                : bi.cr5040esb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040aesi(bi.cr5040aesia.isChecked() ? "1"
                : bi.cr5040aesib.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040aesii(bi.cr5040aesiia.isChecked() ? "1"
                : bi.cr5040aesiib.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040af(bi.cr5040afa.isChecked() ? "1"
                : bi.cr5040afb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040afs(bi.cr5040afs.getText().toString());

        formpregsurv.setCr5040ag(bi.cr5040aga.isChecked() ? "1"
                : bi.cr5040agb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5040ags(bi.cr5040ags.getText().toString());

        formpregsurv.setCr5041a(bi.cr5041aa.isChecked() ? "1"
                : bi.cr5041ab.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5041b(bi.cr5041b.getText().toString());

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