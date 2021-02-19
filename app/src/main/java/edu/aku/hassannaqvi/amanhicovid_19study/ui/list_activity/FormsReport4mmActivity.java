package edu.aku.hassannaqvi.amanhicovid_19study.ui.list_activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.adapters.FormsAdapter4mm;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.models.FollowUp4mm;

public class FormsReport4mmActivity extends AppCompatActivity {

    DatabaseHelper db;
    Collection<FollowUp4mm> fc;
    String sysdateToday = new SimpleDateFormat("dd-MM-yy").format(new Date());
    TextView dtFilter;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter formsAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forms_report_4mm);
        recyclerView = findViewById(R.id.fc_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        dtFilter = findViewById(R.id.dtFilter);
        db = new DatabaseHelper(this);

        SkipPattern();
        //fc = db.getTodayForms(sysdateToday);

        // specify an adapter (see also next example)
        //formsAdapter = new FormsAdapter((List<Form21cm>) fc, this);
        //recyclerView.setAdapter(formsAdapter);
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
        //Toast.makeText(this, "updated", Toast.LENGTH_SHORT).show();

        if (!dtFilter.getText().toString().equals("")) {

            if (dtFilter.getText().length() != 10) {
                Toast.makeText(this, "Study ID must be 10 digits ", Toast.LENGTH_SHORT).show();
                dtFilter.requestFocus();
            } else {

                String[] arr = dtFilter.getText().toString().split("-");
                String studyid = arr[0] + arr[1] + arr[2];

                List<FollowUp4mm> followUp4mm = (List<FollowUp4mm>) db.getMotherByStudyId(studyid);

                if (followUp4mm.size() == 0) {
                    Toast.makeText(this, "Mother does not exist", Toast.LENGTH_LONG).show();
                    dtFilter.requestFocus();
                } else {
                    formsAdapter = new FormsAdapter4mm(followUp4mm, this);
                    formsAdapter.notifyDataSetChanged();
                    recyclerView.setAdapter(formsAdapter);
                }
            }

        } else {
            Toast.makeText(this, "Please enter study id", Toast.LENGTH_LONG).show();
            dtFilter.requestFocus();
        }
    }

}