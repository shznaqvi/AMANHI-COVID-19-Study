package edu.aku.hassannaqvi.amanhicovid_19study.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import com.google.gson.JsonArray;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Collection;
import java.util.List;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Forms21cmContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySearchRecordBindingImpl;
import edu.aku.hassannaqvi.amanhicovid_19study.models.FollowUp21cm;
import edu.aku.hassannaqvi.amanhicovid_19study.models.Form21cm;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.IdentificationSecMActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.IdentificationSectionActivity;

public class SearchRecord extends AppCompatActivity {

    ActivitySearchRecordBindingImpl bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_search_record);
        bi.setCallback(this);

        bi.cvstudyid.setVisibility(View.GONE);
        bi.cvdssid.setVisibility(View.GONE);
        bi.cvfupdt.setVisibility(View.GONE);
        bi.cvfupwk.setVisibility(View.GONE);
        bi.cvnextbutton.setVisibility(View.GONE);

        SkipPattern();
    }


    private void SkipPattern()
    {
        bi.txtStudyid.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                bi.cvstudyid.setVisibility(View.GONE);
                bi.cvdssid.setVisibility(View.GONE);
                bi.cvfupdt.setVisibility(View.GONE);
                bi.cvfupwk.setVisibility(View.GONE);
                bi.cvnextbutton.setVisibility(View.GONE);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    public void BtnSearch() {
        DatabaseHelper db = new DatabaseHelper(this);

        if (!bi.txtStudyid.getText().toString().equals("")) {

            String[] arr = bi.txtStudyid.getText().toString().split("-");
            String studyid = arr[0] + arr[1] + arr[2];

            List<FollowUp21cm> followUp21cms = (List<FollowUp21cm>) db.getChildrenByStudyId(studyid);

            if (followUp21cms.size() == 0) {

                bi.cvstudyid.setVisibility(View.GONE);
                bi.cvdssid.setVisibility(View.GONE);
                bi.cvfupdt.setVisibility(View.GONE);
                bi.cvfupwk.setVisibility(View.GONE);
                bi.cvnextbutton.setVisibility(View.GONE);

                Toast.makeText(this, "Child does not exist", Toast.LENGTH_LONG).show();
                bi.txtStudyid.requestFocus();

            } else {

                bi.lblstudyid.setText(followUp21cms.get(0).getSTUDYID());
                bi.lbldssid.setText(followUp21cms.get(0).getDSSID());
                bi.lblfupdt.setText(followUp21cms.get(0).getFUPDT());
                bi.lblfupwk.setText(followUp21cms.get(0).getFUPWEEK());

                bi.cvstudyid.setVisibility(View.VISIBLE);
                bi.cvdssid.setVisibility(View.VISIBLE);
                bi.cvfupdt.setVisibility(View.VISIBLE);
                bi.cvfupwk.setVisibility(View.VISIBLE);
                bi.cvnextbutton.setVisibility(View.VISIBLE);
            }

        } else {
            Toast.makeText(this, "Please enter study id", Toast.LENGTH_LONG).show();
            bi.txtStudyid.requestFocus();
        }
    }


    public void BtnCancel() {
        bi.txtStudyid.setText("");
        bi.cvstudyid.setVisibility(View.GONE);
        bi.cvdssid.setVisibility(View.GONE);
        bi.cvfupdt.setVisibility(View.GONE);
        bi.cvfupwk.setVisibility(View.GONE);
        bi.cvnextbutton.setVisibility(View.GONE);

        bi.txtStudyid.requestFocus();
    }

    public void BtnNext() {
        Intent intent = new Intent(this, IdentificationSectionActivity.class);
        startActivity(intent);
    }

}