package edu.aku.hassannaqvi.amanhicovid_19study.workers;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.PROJECT_NAME;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.work.Data;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;

import edu.aku.hassannaqvi.amanhicovid_19study.R;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.database.DatabaseHelper;


public class DataUpWorkerALLPeriodic extends Worker {

    private static final Object APP_NAME = PROJECT_NAME;
    private final String TAG = "DataUploadWorkerEN()";

    // to be initialised by workParams
    private final Context mContext;
    private final String uploadTable;
    private final JSONArray uploadData;
    private final URL serverURL = null;
    private final DatabaseHelper db;
    private final String nTitle = "AMANHICOVID: Data Upload";
    private final int position;
    private final String uploadWhere;
    HttpURLConnection urlConnection;
    private ProgressDialog pd;
    private int length;
    private Data data;

    public DataUpWorkerALLPeriodic(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
        mContext = context;
        uploadTable = workerParams.getInputData().getString("table");
        position = workerParams.getInputData().getInt("position", -2);
        uploadData = MainApp.uploadDataP.get(position);


        Log.d(TAG, "Upload Begins uploadData.length(): " + uploadData.length());
        Log.d(TAG, "Upload Begins uploadData: " + uploadData);

        Log.d(TAG, "DataDownWorkerALL: position " + position);
        //uploadColumns = workerParams.getInputData().getString("columns");
        uploadWhere = workerParams.getInputData().getString("where");

        db = MainApp.appInfo.dbHelper;
    }

    /*
     * This method is responsible for doing the work
     * so whatever work that is needed to be performed
     * we will put it here
     *
     * For example, here I am calling the method displayNotification()
     * It will display a notification
     * So that we will understand the work is executed
     * */

    @NonNull
    @Override
    public Result doWork() {

        if (uploadData.length() == 0) {
            Log.d(TAG, "doWork: RETRY");


            return Result.retry();
        }
        Log.d(TAG, "doWork: Starting");
        displayNotification(nTitle, "Starting upload");

        StringBuilder result = new StringBuilder();

        URL url = null;
        try {
            if (serverURL == null) {
                url = new URL(MainApp._HOST_URL + MainApp._SERVER_URL);
            } else {
                url = serverURL;
            }
            Log.d(TAG, "doWork: Connecting...");
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(100000 /* milliseconds */);
            urlConnection.setConnectTimeout(300000 /* milliseconds */);
            urlConnection.setRequestMethod("POST");
            urlConnection.setDoOutput(true);
            urlConnection.setDoInput(true);
            urlConnection.setRequestProperty("Content-Type", "application/json");
            urlConnection.setRequestProperty("charset", "utf-8");
            urlConnection.setUseCaches(false);
            urlConnection.connect();


            Log.d(TAG, "downloadURL: (" + uploadData.length() + ")" + url);

            JSONArray jsonSync = new JSONArray();

            DataOutputStream wr = new DataOutputStream(urlConnection.getOutputStream());

            JSONObject jsonTable = new JSONObject();
            JSONArray jsonParam = new JSONArray();

            jsonTable.put("table", uploadTable);
            Log.d(TAG, "doWork: " + uploadData);
            System.out.print("doWork: " + uploadData);
            //jsonSync.put(uploadData);
            jsonParam
                    .put(jsonTable)
                    .put(uploadData);

            Log.d(TAG, "Upload Begins Length: " + jsonParam.length());
            Log.d(TAG, "Upload Begins: " + jsonParam);


            //wr.writeBytes(URLEncoder.encode(jsonParam.toString(), "utf-8"));
            wr.writeBytes(jsonParam.toString());
            wr.flush();
            wr.close();

            Log.d(TAG, "doInBackground: " + urlConnection.getResponseCode());

            if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                Log.d(TAG, "Connection Response: " + urlConnection.getResponseCode());
                displayNotification(nTitle, "Connection Established");

                length = urlConnection.getContentLength();
                Log.d(TAG, "Content Length: " + length);

                InputStream in = new BufferedInputStream(urlConnection.getInputStream());

                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                String line;
                while ((line = reader.readLine()) != null) {
                    result.append(line);

                }
                displayNotification(nTitle, "Received Data");
                Log.d(TAG, "doWork(EN): " + result.toString());
            } else {

                Log.d(TAG, "Connection Response (Server Failure): " + urlConnection.getResponseCode());

                return Result.retry();
            }
        } catch (java.net.SocketTimeoutException e) {
            Log.d(TAG, "doWork (Timeout): " + e.getMessage());
            Log.d(TAG, "doWork: RETRY");

            return Result.retry();

        } catch (IOException | JSONException e) {
            Log.d(TAG, "doWork (IO Error): " + e.getMessage());

            Log.d(TAG, "doWork: RETRY");

            return Result.retry();

        } finally {
//            urlConnection.disconnect();
        }

        //Do something with the JSON string
        if (result != null) {
            displayNotification(nTitle, "Starting Data Processing");

            //String json = result.toString();
            /*if (json.length() > 0) {*/
            displayNotification(nTitle, "Data Size: " + result.length());


            // JSONArray jsonArray = new JSONArray(json);


            //JSONObject jsonObjectCC = jsonArray.getJSONObject(0);
            ///BE CAREFULL DATA.BUILDER CAN HAVE ONLY 1024O BYTES. EACH CHAR HAS 8 BYTES
//            MainApp.downloadData[this.position] = String.valueOf(result);


            data = new Data.Builder()
                    //.putString("message", String.valueOf(result))
                    .putInt("position", this.position).build();


            displayNotification(nTitle, "Uploaded successfully");


            try {
                JSONArray json = new JSONArray(result);


                // DatabaseHelper db = new DatabaseHelper(SyncActivity.this); // Database Helper

                Method method = null;
                for (Method method1 : db.getClass().getDeclaredMethods()) {

                    Log.d(TAG, "onChanged Methods: " + method1.getName());
                    /**
                     * MAKE SURE TABLE_NAME = <table> IS SAME AS updateSynced<table> :
                     *
                     *      -   public static final String TABLE_NAME = "<table>";  // in Contract
                     *      -   public JSONArray updateSynced<table>() {              // in DatabaseHelper
                     *
                     *      e.g: Forms and updateSyncedForms
                     *
                     */
                    Log.d(TAG, "onChanged Names: updateSynced" + uploadTable);
                    Log.d(TAG, "onChanged Compare: " + method1.getName().equals("updateSynced" + uploadTable));
                    if (method1.getName().equals("updateSynced" + uploadTable)) {
                        method = method1;
                        //Toast.makeText(LoginActivity.this, "updateSynced not found: updateSynced" + uploadTable, Toast.LENGTH_SHORT).show();
                        break;
                    }

                    if (method != null) {
                        Log.d(TAG, "doWork(Success): " + json.length());
                        for (int i = 0; i < json.length(); i++) {
                            JSONObject jsonObject = new JSONObject(json.getString(i));
//                            Log.d(TAG, "onChanged: " + json.getString(i));
                            Log.d(TAG, "doWork(Success " + uploadTable + "): Status =" + jsonObject.getString("status"));

                            if (jsonObject.getString("status").equals("1") && jsonObject.getString("error").equals("0")) {
                                Log.d(TAG, "doWork(Success " + uploadTable + "): Status =" + jsonObject.getString("status"));

                                method.invoke(db, jsonObject.getString("_id"));
                            } else if (jsonObject.getString("status").equals("2") && jsonObject.getString("error").equals("0")) {
                                method.invoke(db, jsonObject.getString("_id"));
                            }
                        }


                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            Log.d(TAG, "doWork: SUCCESS");

            return Result.success();
        } else {

            Log.d(TAG, "doWork: RETRY");
            return Result.retry();
        }


    }

    /*
     * The method is doing nothing but only generating
     * a simple notification
     * If you are confused about it
     * you should check the Android Notification Tutorial
     * */
    private void displayNotification(String title, String task) {
        NotificationManager notificationManager = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(String.valueOf(position), PROJECT_NAME, NotificationManager.IMPORTANCE_DEFAULT);
            notificationManager.createNotificationChannel(channel);
        }

        NotificationCompat.Builder notification = new NotificationCompat.Builder(getApplicationContext(), String.valueOf(position))
                .setContentTitle(title)
                .setContentText(task)
                .setSmallIcon(R.mipmap.ic_launcher);

        final int maxProgress = 100;
        int curProgress = 0;
        notification.setProgress(length, curProgress, false);

        notificationManager.notify(1, notification.build());
    }
}