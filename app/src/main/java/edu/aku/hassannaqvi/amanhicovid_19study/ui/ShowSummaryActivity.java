package edu.aku.hassannaqvi.amanhicovid_19study.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivityShowSummaryBinding;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.Section03cmActivity;

public class ShowSummaryActivity extends AppCompatActivity {

    ActivityShowSummaryBinding bi;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_show_summary);
        bi.setCallback(this);

        db = MainApp.appInfo.getDbHelper();
        bi.valIHFUP.setText("Total No. of forms IH: " + db.getData("3", new SimpleDateFormat("dd-MM-yy").format(new Date().getTime())));
        bi.valAGFUP.setText("Total No. of forms AG: " + db.getData1(new SimpleDateFormat("dd-MM-yy").format(new Date().getTime())));
        bi.valIEFUP.setText("Total No. of forms IE: " + db.getData("4", new SimpleDateFormat("dd-MM-yy").format(new Date().getTime())));

        bi.valIHNotSynced.setText("Total No. of forms not synced IH: " + db.getDataNotSynced("4", new SimpleDateFormat("dd-MM-yy").format(new Date().getTime())));
        bi.valAGNotSynced.setText("Total No. of forms not synced AG: " + db.getData1NotSynced(new SimpleDateFormat("dd-MM-yy").format(new Date().getTime())));
        bi.valIENotSynced.setText("Total No. of forms not synced IE: " + db.getDataNotSynced("4", new SimpleDateFormat("dd-MM-yy").format(new Date().getTime())));


        bi.valIHFUPCH.setText("Total No. of forms IH: " + db.getDataChild("3", new SimpleDateFormat("dd-MM-yy").format(new Date().getTime())));
        bi.valAGFUPCH.setText("Total No. of forms AG: " + db.getData1Child(new SimpleDateFormat("dd-MM-yy").format(new Date().getTime())));
        bi.valIEFUPCH.setText("Total No. of forms IE: " + db.getDataChild("4", new SimpleDateFormat("dd-MM-yy").format(new Date().getTime())));

        bi.valIHNotSyncedCH.setText("Total No. of forms not synced IH: " + db.getDataNotSyncedChild("4", new SimpleDateFormat("dd-MM-yy").format(new Date().getTime())));
        bi.valAGNotSyncedCH.setText("Total No. of forms not synced AG: " + db.getData1NotSyncedChild(new SimpleDateFormat("dd-MM-yy").format(new Date().getTime())));
        bi.valIENotSyncedCH.setText("Total No. of forms not synced IE: " + db.getDataNotSyncedChild("4", new SimpleDateFormat("dd-MM-yy").format(new Date().getTime())));

    }

    public void gotoMain(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }
}