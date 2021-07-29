package edu.aku.hassannaqvi.amanhicovid_19study.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import java.text.SimpleDateFormat;
import java.util.Date;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Forms21cmContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySectionDemoInfoBinding;
import edu.aku.hassannaqvi.amanhicovid_19study.models.Form4mm;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.EndingActivityForm21cm;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form21cm;
import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.form4m;

public class SectionDemoInfoActivity extends AppCompatActivity {
    ActivitySectionDemoInfoBinding bi;
    private static final String TAG = "";
    private DatabaseHelper db;
    private String fupdt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_demo_info);
        bi.setCallback(this);

        db = MainApp.appInfo.getDbHelper();

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

        startActivity(new Intent(this, Section01Activity.class).putExtra("complete", true));

        /*SaveDraft();
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, EndingActivityForm21cm.class).putExtra("complete", true));
        }*/
    }


    private void SaveDraft() {


    }


    public void BtnEnd() {
        finish();
        startActivity(new Intent(this, EndingActivityForm21cm.class).putExtra("complete", false));
    }


    private boolean formValidation() {

        if (!bi.mmsid.getText().toString().isEmpty()) {
            if (bi.mmsid.getText().length() != 10 && bi.mmsid.getText().toString().indexOf("-") != -1) {
                Toast.makeText(this, "Study ID must be 10 digits ", Toast.LENGTH_SHORT).show();
                return false;
            }
        }


        if (!bi.mm0106.getText().toString().isEmpty()) {
            if (bi.mm0106.getText().length() != 10) {
                Toast.makeText(this, "Woman Pregnancy ID 1 must be 10 digits ", Toast.LENGTH_SHORT).show();
                return false;
            } else {
                if (bi.mm0106.getText().toString().equals("17-99999-9")) {
                    Toast.makeText(this, "Invalid Woman Pregnancy ID 1 ", Toast.LENGTH_SHORT).show();
                    return false;
                }
            }
        }


        if (!bi.mm0107.getText().toString().isEmpty()) {
            if (bi.mm0107.getText().length() != 10) {
                Toast.makeText(this, "Woman Pregnancy ID 2 must be 10 digits ", Toast.LENGTH_SHORT).show();
                return false;
            }
        }


        if (!bi.mm0108.getText().toString().isEmpty()) {
            if (bi.mm0108.getText().length() != 10) {
                Toast.makeText(this, "Woman Pregnancy ID 3 must be 10 digits ", Toast.LENGTH_SHORT).show();
                return false;
            }
        }

        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


}