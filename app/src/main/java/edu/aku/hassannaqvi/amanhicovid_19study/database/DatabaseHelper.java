package edu.aku.hassannaqvi.amanhicovid_19study.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;

import edu.aku.hassannaqvi.amanhicovid_19study.contracts.FormsContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.models.Form;
import edu.aku.hassannaqvi.amanhicovid_19study.models.Users;
import edu.aku.hassannaqvi.amanhicovid_19study.models.VersionApp;
import edu.aku.hassannaqvi.amanhicovid_19study.utils.CreateTable;

/**
 * @author hassan.naqvi on 11/30/2016.
 * @update ali azaz on 01/07/21
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    private final String TAG = "DatabaseHelper";

    public DatabaseHelper(Context context) {
        super(context, CreateTable.DATABASE_NAME, null, CreateTable.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CreateTable.SQL_CREATE_USERS);
        //db.execSQL(CreateTable.SQL_CREATE_DISTRICTS);
        ///db.execSQL(CreateTable.SQL_CREATE_UCS);
        //db.execSQL(CreateTable.SQL_CREATE_CLUSTERS);
        db.execSQL(CreateTable.SQL_CREATE_FORMS);
        //db.execSQL(CreateTable.SQL_CREATE_CHILD_INFO);
        //db.execSQL(CreateTable.SQL_CREATE_CHILD);
        //db.execSQL(CreateTable.SQL_CREATE_IMMUNIZATION);
        db.execSQL(CreateTable.SQL_CREATE_VERSIONAPP);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        switch (oldVersion) {
            case 1:
            case 2:
        }
    }


    /*
     * Addition in DB
     * */
    public Long addForm(Form form) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_PROJECT_NAME, form.getProjectName());
        values.put(FormsContract.FormsTable.COLUMN_UID, form.getUid());
        values.put(FormsContract.FormsTable.COLUMN_USERNAME, form.getUserName());
        values.put(FormsContract.FormsTable.COLUMN_SYSDATE, form.getSysDate());
        values.put(FormsContract.FormsTable.COLUMN_STUDYID, form.getStudyID());


        values.put(FormsContract.FormsTable.COLUMN_S02, form.getS02());

        /*values.put(FormsContract.FormsTable.COLUMN_S01HH, form.getS01HH());
        values.put(FormsContract.FormsTable.COLUMN_S02CB, form.getS02CB());
        values.put(FormsContract.FormsTable.COLUMN_S03CS, form.getS03CS());
        values.put(FormsContract.FormsTable.COLUMN_S04IM, form.getS04IM());
        values.put(FormsContract.FormsTable.COLUMN_S05PD, form.getS05PD());
        values.put(FormsContract.FormsTable.COLUMN_S06BF, form.getS06BF());
        values.put(FormsContract.FormsTable.COLUMN_S07CV, form.getS07CV());
        values.put(FormsContract.FormsTable.COLUMN_S08SE, form.getS08SE());*/

        values.put(FormsContract.FormsTable.COLUMN_ISTATUS, form.getIStatus());
        values.put(FormsContract.FormsTable.COLUMN_ISTATUS96x, form.getIStatus96x());
        values.put(FormsContract.FormsTable.COLUMN_ENDINGDATETIME, form.getEndTime());
        values.put(FormsContract.FormsTable.COLUMN_GPS, form.getGps());

        values.put(FormsContract.FormsTable.COLUMN_DEVICETAGID, form.getDeviceTag());
        values.put(FormsContract.FormsTable.COLUMN_DEVICEID, form.getDeviceId());
        values.put(FormsContract.FormsTable.COLUMN_APPVERSION, form.getAppver());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                FormsContract.FormsTable.TABLE_NAME,
                FormsContract.FormsTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }


    public Users getLoginUser(String username, String password) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                Users.UsersTable.COLUMN_ID,
                Users.UsersTable.COLUMN_USERNAME,
                Users.UsersTable.COLUMN_PASSWORD,
                Users.UsersTable.COLUMN_FULLNAME,
        };
        String whereClause = Users.UsersTable.COLUMN_USERNAME + "=? AND " + Users.UsersTable.COLUMN_PASSWORD + "=?";
        String[] whereArgs = {username, password};
        String groupBy = null;
        String having = null;
        String orderBy = Users.UsersTable.COLUMN_ID + " ASC";

        Users allForms = null;
        try {
            c = db.query(
                    Users.UsersTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                allForms = new Users().hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allForms;
    }

    public ArrayList<Form> getFormsByDate(String sysdate) {

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                FormsContract.FormsTable._ID,
                FormsContract.FormsTable.COLUMN_UID,
                FormsContract.FormsTable.COLUMN_SYSDATE,
                FormsContract.FormsTable.COLUMN_USERNAME,
                FormsContract.FormsTable.COLUMN_ISTATUS,
                FormsContract.FormsTable.COLUMN_ISTATUS96x,
                FormsContract.FormsTable.COLUMN_ENDINGDATETIME,
                FormsContract.FormsTable.COLUMN_SYNCED,

        };
        String whereClause = FormsContract.FormsTable.COLUMN_SYSDATE + " Like ? ";
        String[] whereArgs = new String[]{"%" + sysdate + " %"};
        String groupBy = null;
        String having = null;
        String orderBy = FormsContract.FormsTable.COLUMN_ID + " ASC";
        ArrayList<Form> allForms = new ArrayList<>();
        try {
            c = db.query(
                    FormsContract.FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Form forms = new Form();
                forms.setId(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_ID)));
                forms.setUid(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_UID)));
                forms.setSysDate(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_SYSDATE)));
                forms.setUserName(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_USERNAME)));
                allForms.add(forms);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allForms;
    }


    public ArrayList<Cursor> getDatabaseManagerData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase();
        String[] columns = new String[]{"message"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(Query, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (Exception sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }
/*

    public ArrayList<Districts> getAllDistricts() {

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;

        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy = TableDistricts._ID + " ASC";
        ArrayList<Districts> all = new ArrayList<>();
        try {
            c = db.query(
                    TableDistricts.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                all.add(new Districts().hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return all;
    }

    public ArrayList<UCs> getUCsByDistricts(String dCode) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;

        String whereClause = TableUCs.COLUMN_DISTRICT_CODE + "=?";
        String[] whereArgs = new String[]{dCode};
        String groupBy = null;
        String having = null;

        String orderBy = TableUCs.COLUMN_UC_CODE + " ASC";

        ArrayList<UCs> allDC = new ArrayList<>();
        try {
            c = db.query(
                    TableUCs.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                UCs dc = new UCs();
                allDC.add(dc.hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allDC;
    }
*/

    /*public BLRandom getHHFromBLRandom(String subAreaCode, String hh) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;

        String[] columns = {
                BLRandomContract.BLRandomTable.COLUMN_ID,
                BLRandomContract.BLRandomTable.COLUMN_LUID,
                BLRandomContract.BLRandomTable.COLUMN_STRUCTURE_NO,
                BLRandomContract.BLRandomTable.COLUMN_FAMILY_EXT_CODE,
                BLRandomContract.BLRandomTable.COLUMN_HH,
                BLRandomContract.BLRandomTable.COLUMN_P_CODE,
                BLRandomContract.BLRandomTable.COLUMN_EB_CODE,
                BLRandomContract.BLRandomTable.COLUMN_RANDOMDT,
                BLRandomContract.BLRandomTable.COLUMN_HH_SELECTED_STRUCT,
                BLRandomContract.BLRandomTable.COLUMN_CONTACT,
                BLRandomContract.BLRandomTable.COLUMN_HH_HEAD,
                BLRandomContract.BLRandomTable.COLUMN_SNO_HH
        };

        String whereClause = BLRandomContract.BLRandomTable.COLUMN_P_CODE + "=? AND " + BLRandomContract.BLRandomTable.COLUMN_HH + "=?";
        String[] whereArgs = new String[]{subAreaCode, hh};
        String groupBy = null;
        String having = null;

        String orderBy =
                BLRandomContract.BLRandomTable.COLUMN_ID + " ASC";

        BLRandom allBL = null;
        try {
            c = db.query(
                    BLRandomContract.BLRandomTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                allBL = new BLRandom().hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allBL;
    }*/


    /*
     * Update data in tables
     * */

    public int updatesFormColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = FormsContract.FormsTable.COLUMN_ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.form.getId())};

        return db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public void updateSyncedForms(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_SYNCED, true);
        values.put(FormsContract.FormsTable.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = FormsContract.FormsTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                FormsContract.FormsTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public int updateEnding() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_ISTATUS, MainApp.form.getIStatus());
        values.put(FormsContract.FormsTable.COLUMN_ISTATUS96x, MainApp.form.getIStatus96x());
        values.put(FormsContract.FormsTable.COLUMN_ENDINGDATETIME, MainApp.form.getEndTime());

        // Which row to update, based on the ID
        String selection = FormsContract.FormsTable.COLUMN_ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.form.getId())};

        return db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    /*

     * *//*
     * Download data functions
     * *//*
    public int syncDistricts(JSONArray Districtslist) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(Districts.TableDistricts.TABLE_NAME, null, null);
        int insertCount = 0;
        try {
            for (int i = 0; i < Districtslist.length(); i++) {
                JSONObject jsonObjectDistrict = Districtslist.getJSONObject(i);
                Districts District = new Districts();
                District.sync(jsonObjectDistrict);
                ContentValues values = new ContentValues();

                values.put(TableDistricts.COLUMN_DISTRICT_CODE, District.getDistrictCode());
                values.put(TableDistricts.COLUMN_DISTRICT_NAME, District.getDistrictName());
                long rowID = db.insert(TableDistricts.TABLE_NAME, null, values);
                if (rowID != -1) insertCount++;
            }

        } catch (Exception e) {
            Log.d(TAG, "syncDistrict(e): " + e);
            db.close();
        } finally {
            db.close();
        }
        return insertCount;
    }

    public int syncCluster(JSONArray clusterList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TableClusters.TABLE_NAME, null, null);
        int insertCount = 0;
        try {

            for (int i = 0; i < clusterList.length(); i++) {
                JSONObject jsonObjectCluster = clusterList.getJSONObject(i);
                Clusters cluster = new Clusters();
                cluster.sync(jsonObjectCluster);
                ContentValues values = new ContentValues();

                values.put(TableClusters.COLUMN_CLUSTER_CODE, cluster.getClusterCode());
                values.put(TableClusters.COLUMN_CLUSTER_NAME, cluster.getClustername());
                values.put(TableClusters.COLUMN_UC_CODE, cluster.getUcCode());

                long rowID = db.insert(TableClusters.TABLE_NAME, null, values);
                if (rowID != -1) insertCount++;
            }
            db.close();

        } catch (Exception e) {
            Log.d(TAG, "syncCluster(e): " + e);
            db.close();
        } finally {
            db.close();
        }
        return insertCount;
    }

    public int syncUCs(JSONArray ucList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TableUCs.TABLE_NAME, null, null);
        int insertCount = 0;
        try {

            for (int i = 0; i < ucList.length(); i++) {
                JSONObject jsonObjectUc = ucList.getJSONObject(i);
                UCs uc = new UCs();
                uc.sync(jsonObjectUc);
                ContentValues values = new ContentValues();

                values.put(TableUCs.COLUMN_UC_CODE, uc.getUcCode());
                values.put(TableUCs.COLUMN_UC_NAME, uc.getUcName());
                values.put(TableUCs.COLUMN_DISTRICT_CODE, uc.getDistrictCode());

                long rowID = db.insert(TableUCs.TABLE_NAME, null, values);
                if (rowID != -1) insertCount++;
            }
            db.close();

        } catch (Exception e) {
            Log.d(TAG, "syncUc(e): " + e);
            db.close();
        } finally {
            db.close();
        }
        return insertCount;
    }
*/

    public int syncVersionApp(JSONObject VersionList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(VersionApp.VersionAppTable.TABLE_NAME, null, null);
        long count = 0;
        try {
            JSONObject jsonObjectCC = ((JSONArray) VersionList.get(VersionApp.VersionAppTable.COLUMN_VERSION_PATH)).getJSONObject(0);
            VersionApp Vc = new VersionApp();
            Vc.sync(jsonObjectCC);

            ContentValues values = new ContentValues();

            values.put(VersionApp.VersionAppTable.COLUMN_PATH_NAME, Vc.getPathname());
            values.put(VersionApp.VersionAppTable.COLUMN_VERSION_CODE, Vc.getVersioncode());
            values.put(VersionApp.VersionAppTable.COLUMN_VERSION_NAME, Vc.getVersionname());

            count = db.insert(VersionApp.VersionAppTable.TABLE_NAME, null, values);
            if (count > 0) count = 1;

        } catch (Exception ignored) {
        } finally {
            db.close();
        }

        return (int) count;
    }

    public int syncUser(JSONArray userList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(Users.UsersTable.TABLE_NAME, null, null);
        int insertCount = 0;
        try {
            for (int i = 0; i < userList.length(); i++) {

                JSONObject jsonObjectUser = userList.getJSONObject(i);

                Users user = new Users();
                user.sync(jsonObjectUser);
                ContentValues values = new ContentValues();

                values.put(Users.UsersTable.COLUMN_USERNAME, user.getUserName());
                values.put(Users.UsersTable.COLUMN_PASSWORD, user.getPassword());
                values.put(Users.UsersTable.COLUMN_FULLNAME, user.getFullname());
                long rowID = db.insert(Users.UsersTable.TABLE_NAME, null, values);
                if (rowID != -1) insertCount++;
            }

        } catch (Exception e) {
            Log.d(TAG, "syncUser(e): " + e);
            db.close();
        } finally {
            db.close();
        }
        return insertCount;
    }

}