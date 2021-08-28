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
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection04Binding;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingPregsurvActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.utils.ValidateEditTextKt;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.formpregsurv;


public class Section04Activity extends AppCompatActivity {
    ActivitySection04Binding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section04);
        bi.setCallback(this);
        setupSkips();

        ValidateEditTextKt.txtWatch(bi.cr5016x);
        ValidateEditTextKt.txtWatch(bi.cr5017x);
        ValidateEditTextKt.txtWatch(bi.cr5018x);
        ValidateEditTextKt.txtWatch(bi.cr5019x);
        ValidateEditTextKt.txtWatch(bi.cr5020x);
        ValidateEditTextKt.txtWatch(bi.cr5021x);
        ValidateEditTextKt.txtWatch(bi.cr5022x);
        ValidateEditTextKt.txtWatch(bi.cr5023x);
        ValidateEditTextKt.txtWatch(bi.cr5024x);
        ValidateEditTextKt.txtWatch(bi.cr5025x);
        ValidateEditTextKt.txtWatch(bi.cr5026x);
        ValidateEditTextKt.txtWatch(bi.cr5027x);
        ValidateEditTextKt.txtWatch(bi.cr5028x);
        ValidateEditTextKt.txtWatch(bi.cr5029x);
        ValidateEditTextKt.txtWatch(bi.cr5030x);
        ValidateEditTextKt.txtWatch(bi.cr5031x);
        ValidateEditTextKt.txtWatch(bi.cr5032x);
        ValidateEditTextKt.txtWatch(bi.cr5033x);
        ValidateEditTextKt.txtWatch(bi.cr5034x);
        ValidateEditTextKt.txtWatch(bi.cr5035x);
        ValidateEditTextKt.txtWatch(bi.cr5036x);
        ValidateEditTextKt.txtWatch(bi.cr5037x);
        ValidateEditTextKt.txtWatch(bi.cr5038x);
        ValidateEditTextKt.txtWatch(bi.cr5039x);

    }


    private void setupSkips() {

        bi.crlablw.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (bi.crlablwa.isChecked()) {
                    bi.fldGrpCVcrlabab.setVisibility(View.VISIBLE);
                } else {
                    Clear.clearAllFields(bi.fldGrpCVcrlabab);
                    bi.fldGrpCVcrlabab.setVisibility(View.GONE);
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
            startActivity(new Intent(this, Section05Activity.class).putExtra("complete", true));
        }
    }


    private void SaveDraft() {

        formpregsurv.setCrlablw(bi.crlablwa.isChecked() ? "1"
                : bi.crlablwb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCrlabab(bi.crlababa.isChecked() ? "1"
                : bi.crlababb.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5016u(bi.cr5016ua.isChecked() ? "1"
                : bi.cr5016ub.isChecked() ? "2"
                : bi.cr5016u9.isChecked() ? "9"
                : "-1");

        formpregsurv.setCr5016t(bi.cr5016.isChecked() ? ""
                : bi.cr5016888.isChecked() ? "888"
                : bi.cr5016999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5016x(bi.cr5016x.getText().toString());
        formpregsurv.setCr5017u(bi.cr5017ua.isChecked() ? "1"
                : bi.cr5017ub.isChecked() ? "2"
                : bi.cr5017u9.isChecked() ? "9"
                : "-1");

        formpregsurv.setCr5017t(bi.cr5017.isChecked() ? ""
                : bi.cr5017888.isChecked() ? "888"
                : bi.cr5017999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5017x(bi.cr5017x.getText().toString());
        formpregsurv.setCr5018u(bi.cr5018ua.isChecked() ? "1"
                : bi.cr5018ub.isChecked() ? "2"
                : bi.cr5018u9.isChecked() ? "9"
                : "-1");

        formpregsurv.setCr5018t(bi.cr5018.isChecked() ? ""
                : bi.cr5018888.isChecked() ? "888"
                : bi.cr5018999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5018x(bi.cr5018x.getText().toString());
        formpregsurv.setCr5019t(bi.cr5019.isChecked() ? ""
                : bi.cr5019888.isChecked() ? "888"
                : bi.cr5019999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5019x(bi.cr5019x.getText().toString());
        formpregsurv.setCr5020t(bi.cr5020.isChecked() ? ""
                : bi.cr5020888.isChecked() ? "888"
                : bi.cr5020999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5020x(bi.cr5020x.getText().toString());
        formpregsurv.setCr5021t(bi.cr5021.isChecked() ? ""
                : bi.cr5021888.isChecked() ? "888"
                : bi.cr5021999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5021x(bi.cr5021x.getText().toString());
        formpregsurv.setCr5022u(bi.cr5022ua.isChecked() ? "1"
                : bi.cr5022ub.isChecked() ? "2"
                : bi.cr5022u9.isChecked() ? "9"
                : "-1");

        formpregsurv.setCr5022t(bi.cr5022.isChecked() ? ""
                : bi.cr5022888.isChecked() ? "888"
                : bi.cr5022999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5022x(bi.cr5022x.getText().toString());
        formpregsurv.setCr5023u(bi.cr5023ua.isChecked() ? "1"
                : bi.cr5023ub.isChecked() ? "2"
                : bi.cr5023u9.isChecked() ? "9"
                : "-1");

        formpregsurv.setCr5023t(bi.cr5023.isChecked() ? ""
                : bi.cr5023888.isChecked() ? "888"
                : bi.cr5023999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5023x(bi.cr5023x.getText().toString());
        formpregsurv.setCr5024t(bi.cr5024.isChecked() ? ""
                : bi.cr5024888.isChecked() ? "888"
                : bi.cr5024999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5024x(bi.cr5024x.getText().toString());
        formpregsurv.setCr5025t(bi.cr5025.isChecked() ? ""
                : bi.cr5025888.isChecked() ? "888"
                : bi.cr5025999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5025x(bi.cr5025x.getText().toString());
        formpregsurv.setCr5026t(bi.cr5026.isChecked() ? ""
                : bi.cr5026888.isChecked() ? "888"
                : bi.cr5026999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5026x(bi.cr5026x.getText().toString());
        formpregsurv.setCr5027t(bi.cr5027.isChecked() ? ""
                : bi.cr5027888.isChecked() ? "888"
                : bi.cr5027999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5027x(bi.cr5027x.getText().toString());
        formpregsurv.setCr5028t(bi.cr5028.isChecked() ? ""
                : bi.cr5028888.isChecked() ? "888"
                : bi.cr5028999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5028x(bi.cr5028x.getText().toString());
        formpregsurv.setCr5029u(bi.cr5029ua.isChecked() ? "1"
                : bi.cr5029ub.isChecked() ? "2"
                : bi.cr5029u9.isChecked() ? "9"
                : "-1");

        formpregsurv.setCr5029t(bi.cr5029.isChecked() ? ""
                : bi.cr5029888.isChecked() ? "888"
                : bi.cr5029999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5029x(bi.cr5029x.getText().toString());
        formpregsurv.setCr5030t(bi.cr5030.isChecked() ? ""
                : bi.cr5030888.isChecked() ? "888"
                : bi.cr5030999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5030x(bi.cr5030x.getText().toString());
        formpregsurv.setCr5031u(bi.cr5031ua.isChecked() ? "1"
                : bi.cr5031ub.isChecked() ? "2"
                : bi.cr5031u9.isChecked() ? "9"
                : "-1");

        formpregsurv.setCr5031t(bi.cr5031.isChecked() ? ""
                : bi.cr5031888.isChecked() ? "888"
                : bi.cr5031999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5031x(bi.cr5031x.getText().toString());
        formpregsurv.setCr5032t(bi.cr5032.isChecked() ? ""
                : bi.cr5032888.isChecked() ? "888"
                : bi.cr5032999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5032x(bi.cr5032x.getText().toString());
        formpregsurv.setCr5033t(bi.cr5033.isChecked() ? ""
                : bi.cr5033888.isChecked() ? "888"
                : bi.cr5033999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5033x(bi.cr5033x.getText().toString());
        formpregsurv.setCr5034u(bi.cr5034ua.isChecked() ? "1"
                : bi.cr5034ub.isChecked() ? "2"
                : bi.cr5034u9.isChecked() ? "9"
                : "-1");

        formpregsurv.setCr5034t(bi.cr5034.isChecked() ? ""
                : bi.cr5034888.isChecked() ? "888"
                : bi.cr5034999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5034x(bi.cr5034x.getText().toString());
        formpregsurv.setCr5035u(bi.cr5035ua.isChecked() ? "1"
                : bi.cr5035ub.isChecked() ? "2"
                : bi.cr5035u9.isChecked() ? "9"
                : "-1");

        formpregsurv.setCr5035t(bi.cr5035.isChecked() ? ""
                : bi.cr5035888.isChecked() ? "888"
                : bi.cr5035999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5035x(bi.cr5035x.getText().toString());
        formpregsurv.setCr5036u(bi.cr5036ua.isChecked() ? "1"
                : bi.cr5036ub.isChecked() ? "2"
                : bi.cr5036uc.isChecked() ? "3"
                : "-1");

        formpregsurv.setCr5036t(bi.cr5036.isChecked() ? ""
                : bi.cr5036888.isChecked() ? "888"
                : bi.cr5036999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5036x(bi.cr5036x.getText().toString());
        formpregsurv.setCr5037u(bi.cr5037ua.isChecked() ? "1"
                : bi.cr5037ub.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5037t(bi.cr5037.isChecked() ? ""
                : bi.cr5037888.isChecked() ? "888"
                : bi.cr5037999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5037x(bi.cr5037x.getText().toString());
        formpregsurv.setCr5038u(bi.cr5038ua.isChecked() ? "1"
                : bi.cr5038ub.isChecked() ? "2"
                : "-1");

        formpregsurv.setCr5038t(bi.cr5038.isChecked() ? ""
                : bi.cr5038888.isChecked() ? "888"
                : bi.cr5038999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5038x(bi.cr5038x.getText().toString());
        formpregsurv.setCr5039t(bi.cr5039.isChecked() ? ""
                : bi.cr5039888.isChecked() ? "888"
                : bi.cr5039999.isChecked() ? "999"
                : "-1");

        formpregsurv.setCr5039x(bi.cr5039x.getText().toString());

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