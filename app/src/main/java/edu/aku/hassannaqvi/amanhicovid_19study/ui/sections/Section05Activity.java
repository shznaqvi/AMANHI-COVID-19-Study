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

        /*bi.symp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (bi.sympa.isChecked()) {
                    bi.fldGrpCVsympt.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040b.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040c.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040d.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040e.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040f.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040g.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040h.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040i.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040j.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040k.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040l.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040m.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040n.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040o.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040p.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040q.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040r.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040s.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040t.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040u.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040v.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040w.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040x.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040y.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040a.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040aa.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040ab.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040ac.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040ad.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040ae.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040es.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040aesi.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040aesii.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040af.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040afs.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040ag.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5040ags.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5041a.setVisibility(View.VISIBLE);
                    bi.fldGrpCVcr5041b.setVisibility(View.VISIBLE);

                } else {

                    Clear.clearAllFields(bi.fldGrpCVsympt);
                    Clear.clearAllFields(bi.fldGrpCVcr5040b);
                    Clear.clearAllFields(bi.fldGrpCVcr5040c);
                    Clear.clearAllFields(bi.fldGrpCVcr5040d);
                    Clear.clearAllFields(bi.fldGrpCVcr5040e);
                    Clear.clearAllFields(bi.fldGrpCVcr5040f);
                    Clear.clearAllFields(bi.fldGrpCVcr5040g);
                    Clear.clearAllFields(bi.fldGrpCVcr5040h);
                    Clear.clearAllFields(bi.fldGrpCVcr5040i);
                    Clear.clearAllFields(bi.fldGrpCVcr5040j);
                    Clear.clearAllFields(bi.fldGrpCVcr5040k);
                    Clear.clearAllFields(bi.fldGrpCVcr5040l);
                    Clear.clearAllFields(bi.fldGrpCVcr5040m);
                    Clear.clearAllFields(bi.fldGrpCVcr5040n);
                    Clear.clearAllFields(bi.fldGrpCVcr5040o);
                    Clear.clearAllFields(bi.fldGrpCVcr5040p);
                    Clear.clearAllFields(bi.fldGrpCVcr5040q);
                    Clear.clearAllFields(bi.fldGrpCVcr5040r);
                    Clear.clearAllFields(bi.fldGrpCVcr5040s);
                    Clear.clearAllFields(bi.fldGrpCVcr5040t);
                    Clear.clearAllFields(bi.fldGrpCVcr5040u);
                    Clear.clearAllFields(bi.fldGrpCVcr5040v);
                    Clear.clearAllFields(bi.fldGrpCVcr5040w);
                    Clear.clearAllFields(bi.fldGrpCVcr5040x);
                    Clear.clearAllFields(bi.fldGrpCVcr5040y);
                    Clear.clearAllFields(bi.fldGrpCVcr5040a);
                    Clear.clearAllFields(bi.fldGrpCVcr5040aa);
                    Clear.clearAllFields(bi.fldGrpCVcr5040ab);
                    Clear.clearAllFields(bi.fldGrpCVcr5040ac);
                    Clear.clearAllFields(bi.fldGrpCVcr5040ad);
                    Clear.clearAllFields(bi.fldGrpCVcr5040ae);
                    Clear.clearAllFields(bi.fldGrpCVcr5040es);
                    Clear.clearAllFields(bi.fldGrpCVcr5040aesi);
                    Clear.clearAllFields(bi.fldGrpCVcr5040aesii);
                    Clear.clearAllFields(bi.fldGrpCVcr5040af);
                    Clear.clearAllFields(bi.fldGrpCVcr5040afs);
                    Clear.clearAllFields(bi.fldGrpCVcr5040ag);
                    Clear.clearAllFields(bi.fldGrpCVcr5040ags);
                    Clear.clearAllFields(bi.fldGrpCVcr5041a);
                    Clear.clearAllFields(bi.fldGrpCVcr5041b);


                    bi.fldGrpCVsympt.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040b.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040c.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040d.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040e.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040f.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040g.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040h.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040i.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040j.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040k.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040l.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040m.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040n.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040o.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040p.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040q.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040r.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040s.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040t.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040u.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040v.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040w.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040x.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040y.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040a.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040aa.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040ab.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040ac.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040ad.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040ae.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040es.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040aesi.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040aesii.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040af.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040afs.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040ag.setVisibility(View.GONE);
                    bi.fldGrpCVcr5040ags.setVisibility(View.GONE);
                    bi.fldGrpCVcr5041a.setVisibility(View.GONE);
                    bi.fldGrpCVcr5041b.setVisibility(View.GONE);

                }
            }
        });*/

        bi.cr5040af.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (bi.cr5040afa.isChecked()) {
                    bi.fldGrpCVcr5040afs.setVisibility(View.VISIBLE);
                } else {
                    Clear.clearAllFields(bi.fldGrpCVcr5040afs);
                    bi.fldGrpCVcr5040afs.setVisibility(View.GONE);
                }
            }
        });


        bi.cr5040ag.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (bi.cr5040aga.isChecked()) {
                    bi.fldGrpCVcr5040ags.setVisibility(View.VISIBLE);
                } else {
                    Clear.clearAllFields(bi.fldGrpCVcr5040ags);
                    bi.fldGrpCVcr5040ags.setVisibility(View.GONE);
                }
            }
        });


        bi.cr5041a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (bi.cr5041aa.isChecked()) {
                    bi.fldGrpCVcr5041b.setVisibility(View.VISIBLE);
                } else {
                    Clear.clearAllFields(bi.fldGrpCVcr5041b);
                    bi.fldGrpCVcr5041b.setVisibility(View.GONE);
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

        if (bi.sympa.isChecked() && (!bi.cr5040ba.isChecked()
                && !bi.cr5040ca.isChecked()
                && !bi.cr5040da.isChecked()
                && !bi.cr5040ea.isChecked()
                && !bi.cr5040fa.isChecked()
                && !bi.cr5040ga.isChecked()
                && !bi.cr5040ha.isChecked()
                && !bi.cr5040ia.isChecked()
                && !bi.cr5040ja.isChecked()
                && !bi.cr5040ka.isChecked()
                && !bi.cr5040la.isChecked()
                && !bi.cr5040ma.isChecked()
                && !bi.cr5040na.isChecked()
                && !bi.cr5040oa.isChecked()
                && !bi.cr5040pa.isChecked()
                && !bi.cr5040qa.isChecked()
                && !bi.cr5040ra.isChecked()
                && !bi.cr5040sa.isChecked()
                && !bi.cr5040ta.isChecked()
                && !bi.cr5040ua.isChecked()
                && !bi.cr5040va.isChecked()
                && !bi.cr5040wa.isChecked()
                && !bi.cr5040xa.isChecked()
                && !bi.cr5040ya.isChecked()
                && !bi.cr5040ay.isChecked()
                && !bi.cr5040aay.isChecked()
                && !bi.cr5040aby.isChecked()
                && !bi.cr5040aca.isChecked()
                && !bi.cr5040ada.isChecked()
                && !bi.cr5040aea.isChecked()
                && !bi.cr5040esa.isChecked()
                && !bi.cr5040aesia.isChecked()
                && !bi.cr5040aesiia.isChecked()
                && !bi.cr5040afa.isChecked()
                && !bi.cr5040aga.isChecked()
                && !bi.cr5041aa.isChecked())) {
            Toast.makeText(this, "if SYMP is 1 - Yes then any of the response must be 1 - Yes ", Toast.LENGTH_SHORT).show();
            return false;
        } else if (!bi.sympa.isChecked() && (bi.cr5040ba.isChecked()
                || bi.cr5040ca.isChecked()
                || bi.cr5040da.isChecked()
                || bi.cr5040ea.isChecked()
                || bi.cr5040fa.isChecked()
                || bi.cr5040ga.isChecked()
                || bi.cr5040ha.isChecked()
                || bi.cr5040ia.isChecked()
                || bi.cr5040ja.isChecked()
                || bi.cr5040ka.isChecked()
                || bi.cr5040la.isChecked()
                || bi.cr5040ma.isChecked()
                || bi.cr5040na.isChecked()
                || bi.cr5040oa.isChecked()
                || bi.cr5040pa.isChecked()
                || bi.cr5040qa.isChecked()
                || bi.cr5040ra.isChecked()
                || bi.cr5040sa.isChecked()
                || bi.cr5040ta.isChecked()
                || bi.cr5040ua.isChecked()
                || bi.cr5040va.isChecked()
                || bi.cr5040wa.isChecked()
                || bi.cr5040xa.isChecked()
                || bi.cr5040ya.isChecked()
                || bi.cr5040ay.isChecked()
                || bi.cr5040aay.isChecked()
                || bi.cr5040aby.isChecked()
                || bi.cr5040aca.isChecked()
                || bi.cr5040ada.isChecked()
                || bi.cr5040aea.isChecked()
                || bi.cr5040esa.isChecked()
                || bi.cr5040aesia.isChecked()
                || bi.cr5040aesiia.isChecked()
                || bi.cr5040afa.isChecked()
                || bi.cr5040aga.isChecked()
                || bi.cr5041aa.isChecked())) {
            Toast.makeText(this, "if SYMP is 2 - No then any of the response must be 2 - No ", Toast.LENGTH_SHORT).show();
            return false;
        }

        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }

}