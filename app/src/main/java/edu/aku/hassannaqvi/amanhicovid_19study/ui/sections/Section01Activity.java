package edu.aku.hassannaqvi.amanhicovid_19study.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Forms21cmContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection01Binding;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingActivityForm21cm;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form21cm;

public class Section01Activity extends AppCompatActivity {
    ActivitySection01Binding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section01);
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


    public void BtnContinue(View view) {
        if (!formValidation()) return;
        SaveDraft();
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, EndingActivityForm21cm.class).putExtra("complete", true));
        }
    }


    private void SaveDraft() {

        /*form.setCrpreg( bi.crprega.isChecked() ? "1"
                : bi.crpregn.isChecked() ? "2"
                :  "-1");

        form.setCr5002a( bi.cr5002aa.isChecked() ? "1"
                : bi.cr5002a999.isChecked() ? "999"
                :  "-1");

        form.setCr5002aax(bi.cr5002aax.getText().toString());
        form.setCr5002b( bi.cr5002ba.isChecked() ? "1"
                : bi.cr5002b999.isChecked() ? "999"
                :  "-1");

        form.setCr5002bax(bi.cr5002bax.getText().toString());
        form.setCr5003a( bi.cr5003aa.isChecked() ? "1"
                : bi.cr5003a999.isChecked() ? "999"
                :  "-1");

        form.setCr5003aax(bi.cr5003aax.getText().toString());
        form.setCr5003b( bi.cr5003ba.isChecked() ? "1"
                : bi.cr5003b999.isChecked() ? "999"
                :  "-1");

        form.setCr5003bax(bi.cr5003bax.getText().toString());
        form.setCr3004a( bi.cr3004ay.isChecked() ? "1"
                : bi.cr3004an.isChecked() ? "2"
                : bi.cr3004a8.isChecked() ? "8"
                :  "-1");

        form.setCr3004b( bi.cr3004by.isChecked() ? "1"
                : bi.cr3004bn.isChecked() ? "2"
                : bi.cr3004b8.isChecked() ? "8"
                :  "-1");

        form.setCr3004bi( bi.cr3004biy.isChecked() ? "1"
                : bi.cr3004bin.isChecked() ? "2"
                : bi.cr3004bi8.isChecked() ? "8"
                :  "-1");

        form.setCr3004bii( bi.cr3004biiy.isChecked() ? "1"
                : bi.cr3004biin.isChecked() ? "2"
                : bi.cr3004bii8.isChecked() ? "8"
                :  "-1");

        form.setCr3004biii( bi.cr3004biiiy.isChecked() ? "1"
                : bi.cr3004biiin.isChecked() ? "2"
                : bi.cr3004biii8.isChecked() ? "8"
                :  "-1");

        form.setCr3004c( bi.cr3004cy.isChecked() ? "1"
                : bi.cr3004cn.isChecked() ? "2"
                : bi.cr3004c8.isChecked() ? "8"
                :  "-1");

        form.setCr3004d( bi.cr3004dy.isChecked() ? "1"
                : bi.cr3004dn.isChecked() ? "2"
                : bi.cr3004d8.isChecked() ? "8"
                :  "-1");

        form.setCr3004e( bi.cr3004ey.isChecked() ? "1"
                : bi.cr3004en.isChecked() ? "2"
                : bi.cr3004e8.isChecked() ? "8"
                :  "-1");

        form.setCr3004f( bi.cr3004fy.isChecked() ? "1"
                : bi.cr3004fn.isChecked() ? "2"
                : bi.cr3004f8.isChecked() ? "8"
                :  "-1");

        form.setCr3004g( bi.cr3004gy.isChecked() ? "1"
                : bi.cr3004gn.isChecked() ? "2"
                : bi.cr3004g8.isChecked() ? "8"
                :  "-1");

        form.setCr3004h( bi.cr3004hy.isChecked() ? "1"
                : bi.cr3004hn.isChecked() ? "2"
                : bi.cr3004h8.isChecked() ? "8"
                :  "-1");

        form.setCr3004i( bi.cr3004iy.isChecked() ? "1"
                : bi.cr3004in.isChecked() ? "2"
                : bi.cr3004i8.isChecked() ? "8"
                :  "-1");

        form.setCr3004j( bi.cr3004jy.isChecked() ? "1"
                : bi.cr3004jn.isChecked() ? "2"
                : bi.cr3004j8.isChecked() ? "8"
                :  "-1");

        form.setCr3004k( bi.cr3004ky.isChecked() ? "1"
                : bi.cr3004kn.isChecked() ? "2"
                : bi.cr3004k8.isChecked() ? "8"
                :  "-1");

        form.setCr3004l( bi.cr3004ly.isChecked() ? "1"
                : bi.cr3004ln.isChecked() ? "2"
                : bi.cr3004l8.isChecked() ? "8"
                :  "-1");

        form.setCr3004m( bi.cr3004my.isChecked() ? "1"
                : bi.cr3004mn.isChecked() ? "2"
                : bi.cr3004m8.isChecked() ? "8"
                :  "-1");

        form.setCr3004n( bi.cr3004ny.isChecked() ? "1"
                : bi.cr3004nn.isChecked() ? "2"
                : bi.cr3004n8.isChecked() ? "8"
                :  "-1");

        form.setCr3004o( bi.cr3004oy.isChecked() ? "1"
                : bi.cr3004on.isChecked() ? "2"
                : bi.cr3004o8.isChecked() ? "8"
                :  "-1");

        form.setCr3004p( bi.cr3004py.isChecked() ? "1"
                : bi.cr3004pn.isChecked() ? "2"
                : bi.cr3004p8.isChecked() ? "8"
                :  "-1");

        form.setCr3004q( bi.cr3004qy.isChecked() ? "1"
                : bi.cr3004qn.isChecked() ? "2"
                : bi.cr3004q8.isChecked() ? "8"
                :  "-1");

        form.setCr3004si( bi.cr3004siy.isChecked() ? "1"
                : bi.cr3004sin.isChecked() ? "2"
                :  "-1");

        form.setCr3004sia( bi.cr3004siay.isChecked() ? "1"
                : bi.cr3004sian.isChecked() ? "2"
                :  "-1");

        form.setCr3004qsii( bi.cr3004qsiiy.isChecked() ? "1"
                : bi.cr3004qsiin.isChecked() ? "2"
                :  "-1");

        form.setCr3004qsiii( bi.cr3004qsiiiy.isChecked() ? "1"
                : bi.cr3004qsiiin.isChecked() ? "2"
                :  "-1");

        form.setCr3004r( bi.cr3004ry.isChecked() ? "1"
                : bi.cr3004rn.isChecked() ? "2"
                :  "-1");

        form.setCr3004rsi( bi.cr3004rsiy.isChecked() ? "1"
                : bi.cr3004rsin.isChecked() ? "2"
                :  "-1");

        form.setCr3004qrsii( bi.cr3004qrsiiy.isChecked() ? "1"
                : bi.cr3004qrsiin.isChecked() ? "2"
                :  "-1");

        form.setCr3004qrsiii(bi.cr3004qrsiii.getText().toString());

        form.setCr3004s( bi.cr3004sy.isChecked() ? "1"
                : bi.cr3004sn.isChecked() ? "2"
                :  "-1");

        form.setCr3004ss(bi.cr3004ss.getText().toString());*/


    }


    public void BtnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivityForm21cm.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


}