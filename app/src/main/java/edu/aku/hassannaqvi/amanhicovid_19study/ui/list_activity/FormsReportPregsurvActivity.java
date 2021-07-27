package edu.aku.hassannaqvi.amanhicovid_19study.ui.list_activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.adapters.FormsAdapter4mm;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.models.FollowUp4mm;
import edu.aku.hassannaqvi.amanhicovid_19study.models.Sites;

public class FormsReportPregsurvActivity extends AppCompatActivity {

    DatabaseHelper db;
    Collection<FollowUp4mm> fc;
    String sysdateToday = new SimpleDateFormat("dd-MM-yy").format(new Date());
    TextView dtFilter;
    List<String> talukaName;
    List<String> talukaCode;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter formsAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private Spinner spSites;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forms_report_pregsurv);
        recyclerView = findViewById(R.id.fc_recycler_view);
        spSites = (Spinner) findViewById(R.id.spSites);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        dtFilter = findViewById(R.id.dtFilter);
        db = new DatabaseHelper(this);

        setUIContent(this);
        SkipPattern();
    }


    private void setUIContent(final Context context) {

        // Spinner Drop down elements
        talukaName = new ArrayList<>();
        talukaCode = new ArrayList<>();

        talukaName.add("....");
        talukaCode.add("....");

        Collection<Sites> dc = db.getSites();

        for (Sites d : dc) {
            talukaName.add(d.getSITE());
            talukaCode.add(String.valueOf(d.getID()));
        }

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, talukaName);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        // attaching data adapter to spinner
        spSites.setAdapter(dataAdapter);
    }


    private void SkipPattern() {
        dtFilter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                recyclerView.setAdapter(null);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    public void filterForms(View view) {

        if (spSites.getSelectedItem().toString().equals("....")) {
            Toast.makeText(this, "Please select site", Toast.LENGTH_LONG).show();
            spSites.requestFocus();
        } else {

            if (!dtFilter.getText().toString().equals("")) {

                if (dtFilter.getText().length() != 10) {
                    Toast.makeText(this, "Study ID must be 10 digits ", Toast.LENGTH_SHORT).show();
                    dtFilter.requestFocus();
                } else {

                    String[] arr = dtFilter.getText().toString().split("-");
                    String studyid = arr[0] + arr[1] + arr[2];

                    if (spSites.getSelectedItem().equals("IH") && arr[1].substring(0, 1).equals("3")
                            || spSites.getSelectedItem().equals("IH") && arr[1].substring(0, 1).equals("7")

                            || spSites.getSelectedItem().equals("AG") && arr[1].substring(0, 1).equals("4")
                            || spSites.getSelectedItem().equals("AG") && arr[1].substring(0, 1).equals("9")

                            || spSites.getSelectedItem().equals("IE") && arr[1].substring(0, 1).equals("6")
                    ) {

                        List<FollowUp4mm> followUp4mm = (List<FollowUp4mm>) db.getMotherByStudyId(studyid);

                        if (followUp4mm.size() == 0) {
                            Toast.makeText(this, "Mother does not exist", Toast.LENGTH_LONG).show();
                            dtFilter.requestFocus();
                        } else {
                            formsAdapter = new FormsAdapter4mm(followUp4mm, this);
                            formsAdapter.notifyDataSetChanged();
                            recyclerView.setAdapter(formsAdapter);
                        }
                    } else {
                        Toast.makeText(this, "You have selected wrong site", Toast.LENGTH_LONG).show();
                        dtFilter.requestFocus();
                    }
                }

            } else {
                Toast.makeText(this, "Please enter study id", Toast.LENGTH_LONG).show();
                dtFilter.requestFocus();
            }
        }
    }
}