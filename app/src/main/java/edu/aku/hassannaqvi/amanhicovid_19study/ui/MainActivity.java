package edu.aku.hassannaqvi.amanhicovid_19study.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompatSideChannelService;
import androidx.databinding.DataBindingUtil;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.core.AndroidDatabaseManager;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.databinding.ActivityMainBinding;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.list_activity.FormsReport4mmActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.list_activity.FormsReportClusterActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.list_activity.FormsReportPregsurvActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.IdentificationSecMActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.IdentificationSectionActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.Section01Activity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.Section02Activity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.Section03Activity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.Section04Activity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.Section05Activity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.Section06Activity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.Section02cmActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.Section02mmActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.Section03cmActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.Section03mmActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.Section04cmActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.Section04mmActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.Section05cmActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.Section05mmActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.Section06cmActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.Section06mmActivity;
import edu.aku.hassannaqvi.amanhicovid_19study.ui.sections.SectionDemoInfoActivity;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_main);
        bi.setCallback(this);
        setSupportActionBar(bi.toolbar);
        setTitle(getString(R.string.app_name) + " :: " + getString(R.string.main_menu));

        if (MainApp.userName.equals("test1234") || MainApp.userName.equals("dmu@aku")) {
            bi.showdb.setVisibility(View.VISIBLE);
            bi.admin.setVisibility(View.VISIBLE);
            bi.admin1.setVisibility(View.VISIBLE);
            bi.admin2.setVisibility(View.VISIBLE);
            bi.startInterview.setVisibility(View.VISIBLE);
            bi.btnChildMorb.setVisibility(View.VISIBLE);
        } else {
            bi.showdb.setVisibility(View.GONE);
            bi.admin.setVisibility(View.GONE);
            bi.admin1.setVisibility(View.GONE);
            bi.admin2.setVisibility(View.GONE);
            bi.startInterview.setVisibility(View.GONE);
            bi.btnChildMorb.setVisibility(View.GONE);
        }
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

                if (MainApp.userName.equals("test1234") || MainApp.userName.equals("dmu@aku")) {
                    startActivity(new Intent(this, AndroidDatabaseManager.class));
                } else {
                    Toast.makeText(this, "You are not authorize for this option", Toast.LENGTH_SHORT).show();
                }
                break;


            case R.id.action_data_sync:
                startActivity(new Intent(this, SyncActivity.class));
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

    public void showSummary() {
        startActivity(new Intent(this, ShowSummaryActivity.class));
    }


    public void openForm(View view) {
        Intent oF = null;
        switch (view.getId()) {

            case R.id.startInterview:
                oF = new Intent(this, IdentificationSectionActivity.class);
                break;

            case R.id.btnChildMorb:
                oF = new Intent(this, IdentificationSecMActivity.class);
                break;

            case R.id.showdb:
                oF = new Intent(this, AndroidDatabaseManager.class);
                break;

            case R.id.searchchild:
                oF = new Intent(this, FormsReportClusterActivity.class);
                break;

            case R.id.searchmother:
                //oF = new Intent(this, SearchMoth4mmActivity.class);
                oF = new Intent(this, FormsReport4mmActivity.class);
                break;

            case R.id.searchpregsurv:
                oF = new Intent(this, FormsReportPregsurvActivity.class);
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


            case R.id.btn07:
                oF = new Intent(this, IdentificationSecMActivity.class);
                break;

            case R.id.btn08:
                oF = new Intent(this, Section02mmActivity.class);
                break;

            case R.id.btn09:
                oF = new Intent(this, Section03mmActivity.class);
                break;

            case R.id.btn10:
                oF = new Intent(this, Section04mmActivity.class);
                break;

            case R.id.btn11:
                oF = new Intent(this, Section05mmActivity.class);
                break;

            case R.id.btn12:
                oF = new Intent(this, Section06mmActivity.class);
                break;

            case R.id.btn13:
                oF = new Intent(this, SectionDemoInfoActivity.class);
                break;

            case R.id.btn14:
                oF = new Intent(this, Section01Activity.class);
                break;

            case R.id.btn15:
                oF = new Intent(this, Section02Activity.class);
                break;

            case R.id.btn16:
                oF = new Intent(this, Section03Activity.class);
                break;

            case R.id.btn17:
                oF = new Intent(this, Section04Activity.class);
                break;

            case R.id.btn18:
                oF = new Intent(this, Section06Activity.class);
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