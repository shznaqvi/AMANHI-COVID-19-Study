package edu.aku.hassannaqvi.amanhicovid_19study.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import java.util.List;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivitySearchMoth4mmBinding;
import edu.aku.hassannaqvi.amanhicovid_19study.models.FollowUp21cm;
import edu.aku.hassannaqvi.amanhicovid_19study.models.FollowUp4mm;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.IdentificationSecMActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.IdentificationSectionActivity;

public class SearchMoth4mmActivity extends AppCompatActivity {

    ActivitySearchMoth4mmBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_search_moth_4mm);
        bi.setCallback(this);

        //bi.cvstudyid.setVisibility(View.GONE);
        bi.cvdssid.setVisibility(View.GONE);
        bi.cvfupdt.setVisibility(View.GONE);
        bi.cvfupwk.setVisibility(View.GONE);
        bi.cvnextbutton.setVisibility(View.GONE);

        SkipPattern();
    }

    private void SkipPattern() {
        bi.txtStudyid.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //bi.cvstudyid.setVisibility(View.GONE);
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

            if (bi.txtStudyid.getText().length() != 10) {
                Toast.makeText(this, "Study ID must be 10 digits ", Toast.LENGTH_SHORT).show();
                bi.txtStudyid.requestFocus();
            } else {

                String[] arr = bi.txtStudyid.getText().toString().split("-");
                String studyid = arr[0] + arr[1] + arr[2];

                List<FollowUp4mm> followUp4mms = (List<FollowUp4mm>) db.getMotherByStudyId(studyid);

                if (followUp4mms.size() == 0) {

                    //bi.cvstudyid.setVisibility(View.GONE);
                    bi.cvdssid.setVisibility(View.GONE);
                    bi.cvfupdt.setVisibility(View.GONE);
                    bi.cvfupwk.setVisibility(View.GONE);
                    bi.cvnextbutton.setVisibility(View.GONE);

                    Toast.makeText(this, "Mother does not exist", Toast.LENGTH_LONG).show();
                    bi.txtStudyid.requestFocus();

                } else {

                    bi.lblstudyid.setText(followUp4mms.get(0).getSTUDYID());
                    bi.lbldssid.setText(followUp4mms.get(0).getDSSID());
                    bi.lblfupdt.setText(followUp4mms.get(0).getFUPDT());
                    bi.lblfupwk.setText(followUp4mms.get(0).getFUPWEEK());

                    //bi.cvstudyid.setVisibility(View.VISIBLE);
                    bi.cvdssid.setVisibility(View.VISIBLE);
                    bi.cvfupdt.setVisibility(View.VISIBLE);
                    bi.cvfupwk.setVisibility(View.VISIBLE);
                    bi.cvnextbutton.setVisibility(View.VISIBLE);
                }
            }

        } else {
            Toast.makeText(this, "Please enter study id", Toast.LENGTH_LONG).show();
            bi.txtStudyid.requestFocus();
        }
    }


    public void BtnCancel() {
        bi.txtStudyid.setText("");
        //bi.cvstudyid.setVisibility(View.GONE);
        bi.cvdssid.setVisibility(View.GONE);
        bi.cvfupdt.setVisibility(View.GONE);
        bi.cvfupwk.setVisibility(View.GONE);
        bi.cvnextbutton.setVisibility(View.GONE);

        bi.txtStudyid.requestFocus();
    }

    public void BtnNext() {
        Intent intent = new Intent(this, IdentificationSecMActivity.class);

        intent.putExtra("studyid", bi.lblstudyid.getText().toString());
        intent.putExtra("dssid", bi.lbldssid.getText().toString());
        intent.putExtra("week", bi.lblfupwk.getText().toString());

        startActivity(intent);
    }

}