package edu.aku.hassannaqvi.amanhicovid_19study.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Forms21cmContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySectionDemoInfoBinding;
import edu.aku.hassannaqvi.amanhicovid_19study.models.Forms;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingActivityForm21cm;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form;
import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form21cm;

public class SectionDemoInfoActivity extends AppCompatActivity {
    ActivitySectionDemoInfoBinding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_demo_info);
        bi.setCallback(this);
        setupSkips();
    }


    private void setupSkips() {
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


    public void BtnContinue() {
        if (!formValidation()) return;
        SaveDraft();
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, EndingActivityForm21cm.class).putExtra("complete", true));
        }
    }


    private void SaveDraft() {

        form = new Forms();

        /*form.setMm0101(bi.mm0101.getText().toString());

        form.setSite(bi.site.getText().toString());

        form.setMm0101a(bi.mm0101a.getText().toString());

        form.setMm0101b(bi.mm0101b.getText().toString());

        form.setMm0101c(bi.mm0101c.getText().toString());

        form.setMm0101d(bi.mm0101d.getText().toString());

        form.setMm0102(bi.mm0102.getText().toString());

        form.setMm0103d(bi.mm0103d.getText().toString());
        form.setMm0103m(bi.mm0103m.getText().toString());
        form.setMm0103y(bi.mm0103y.getText().toString());
        form.setMm0103ad(bi.mm0103ad.getText().toString());
        form.setMm0103am(bi.mm0103am.getText().toString());
        form.setMm0103ay(bi.mm0103ay.getText().toString());
        form.setMm0103bd(bi.mm0103bd.getText().toString());
        form.setMm0103bm(bi.mm0103bm.getText().toString());
        form.setMm0103by(bi.mm0103by.getText().toString());
        form.setMm0103cd(bi.mm0103cd.getText().toString());
        form.setMm0103cm(bi.mm0103cm.getText().toString());
        form.setMm0103cy(bi.mm0103cy.getText().toString());
        form.setMm0103dd(bi.mm0103dd.getText().toString());
        form.setMm0103dm(bi.mm0103dm.getText().toString());
        form.setMm0103dy(bi.mm0103dy.getText().toString());
        form.setMm0104(bi.mm0104.getText().toString());

        form.setWhowid(bi.whowid.getText().toString());

        form.setPregid1(bi.pregid1.getText().toString());

        form.setPregid2(bi.pregid2.getText().toString());

        form.setPregid3(bi.pregid3.getText().toString());

        form.setMm0106t( bi.mm0106w.isChecked() ? ""
                : bi.mm0106888.isChecked() ? "888"
                : bi.mm0106999.isChecked() ? "999"
                :  "-1");

        form.setMm0106wx(bi.mm0106wx.getText().toString());
        form.setMm0107t( bi.mm0107.isChecked() ? ""
                : bi.mm0107888.isChecked() ? "888"
                : bi.mm0107999.isChecked() ? "999"
                :  "-1");

        form.setMm0107x(bi.mm0107x.getText().toString());
        form.setMm0108a(bi.mm0108a.getText().toString());

        form.setMm0108b(bi.mm0108b.getText().toString());

        form.setMm0201( bi.mm0201a.isChecked() ? "1"
                : bi.mm0201b.isChecked() ? "2"
                :  "-1");

        form.setWhyvisitfail(  "-1");

        form.setVisitfail_oth(bi.visitfail_oth.getText().toString());*/


    }


    public void BtnEnd() {
        finish();
        startActivity(new Intent(this, EndingActivityForm21cm.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


}