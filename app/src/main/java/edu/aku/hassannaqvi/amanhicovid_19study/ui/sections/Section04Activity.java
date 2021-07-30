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
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySection04Binding;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingActivityForm21cm;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingPregsurvActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.utils.ValidateEditTextKt;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form21cm;


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

        startActivity(new Intent(this, Section05Activity.class));

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