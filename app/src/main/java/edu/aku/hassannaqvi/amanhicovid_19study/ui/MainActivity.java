package edu.aku.hassannaqvi.amanhicovid_19study.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.core.AndroidDatabaseManager;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivityMainBinding;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.IdentificationSectionActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.Section02cmActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.Section03cmActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.Section04cmActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.Section05cmActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.Section06cmActivity;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_main);
        bi.setCallback(this);
        setSupportActionBar(bi.toolbar);
        setTitle(getString(R.string.app_name) + " :: " + getString(R.string.main_menu));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


        switch (item.getItemId()) {

            case R.id.action_database:
                startActivity(new Intent(this, AndroidDatabaseManager.class));
                break;
            case R.id.action_data_sync:
                //startActivity(new Intent(this, SyncActivity.class));
                break;

        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            MainApp.hideSystemUI(getWindow().getDecorView());
        }
    }

    public void openForm(View view) {
        Intent oF = null;
        switch (view.getId()) {

            case R.id.startInterview:
                oF = new Intent(this, IdentificationSectionActivity.class);
                break;


            case R.id.btn01:
                oF = new Intent(this, IdentificationSectionActivity.class);
                break;

            case R.id.btn02:
                oF = new Intent(this, Section02cmActivity.class);
                break;

            case R.id.btn03:
                oF = new Intent(this, Section03cmActivity.class);
                break;

            case R.id.btn04:
                oF = new Intent(this, Section04cmActivity.class);
                break;

            case R.id.btn05:
                oF = new Intent(this, Section05cmActivity.class);
                break;

            case R.id.btn06:
                oF = new Intent(this, Section06cmActivity.class);
                break;

            /*case R.id.startInterview:
                oF = new Intent(this, Section01HHActivity.class);
                break;
            case R.id.btn01:
                oF = new Intent(this, IdentificationSectionActivity.class);
                break;
            case R.id.btn02:
                oF = new Intent(this, Section02cmActivity.class);
                break;
            case R.id.btn03:
                oF = new Intent(this, Section03cmActivity.class);
                break;
            case R.id.btn04:
                oF = new Intent(this, Section04cmActivity.class);
                break;
            case R.id.btn05:
                oF = new Intent(this, Section05cmActivity.class);
                break;
            case R.id.btn06:
                oF = new Intent(this, Section06cmActivity.class);
                break;
      /*      case R.id.btn07:
                oF = new Intent(this, Section07CVActivity.class);
                break;
            case R.id.btn08:
                oF = new Intent(this, Section081SEActivity.class);
                break;*/


         /*   case R.id.formI:
                oF = new Intent(this, SectionI1Activity.class);
                break;
            case R.id.formJ:
                oF = new Intent(this, SectionJ1Activity.class);
                break;*/
        }

        startActivity(oF);
    }
}