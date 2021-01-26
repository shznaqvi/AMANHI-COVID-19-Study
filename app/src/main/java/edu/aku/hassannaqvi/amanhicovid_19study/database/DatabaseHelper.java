package edu.aku.hassannaqvi.amanhicovid_19study.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;

import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Forms21cmContract;
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Forms4mmContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;
import edu.aku.hassannaqvi.amanhicovid_19study.models.FollowUp21cm;
import edu.aku.hassannaqvi.amanhicovid_19study.models.Form21cm;
import edu.aku.hassannaqvi.amanhicovid_19study.models.Form4mm;
import edu.aku.hassannaqvi.amanhicovid_19study.models.Users;
import edu.aku.hassannaqvi.amanhicovid_19study.models.VersionApp;
import edu.aku.hassannaqvi.amanhicovid_19study.utils.CreateTable;

import static edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp.PROJECT_NAME;

/**
 * @author hassan.naqvi on 11/30/2016.
 * @update ali azaz on 01/07/21
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    private final String TAG = "DatabaseHelper";
    public static String DB_NAME = PROJECT_NAME + "_copy.db";

    public DatabaseHelper(Context context) {
        super(context, CreateTable.DATABASE_NAME, null, CreateTable.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CreateTable.SQL_CREATE_USERS);
        db.execSQL(CreateTable.SQL_CREATE_FUP21CM);
        db.execSQL(CreateTable.SQL_CREATE_FUP4MM);
        //db.execSQL(CreateTable.SQL_CREATE_DISTRICTS);
        ///db.execSQL(CreateTable.SQL_CREATE_UCS);
        //db.execSQL(CreateTable.SQL_CREATE_CLUSTERS);
        db.execSQL(CreateTable.SQL_CREATE_FORMS);
        db.execSQL(CreateTable.SQL_CREATE_FORMS4M);
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
    public Long addForm(Form21cm form21cm) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(Forms21cmContract.Forms21cmTable.COLUMN_PROJECT_NAME, form21cm.getProjectName());
        values.put(Forms21cmContract.Forms21cmTable.COLUMN_UID, form21cm.getUid());
        values.put(Forms21cmContract.Forms21cmTable.COLUMN_USERNAME, form21cm.getUserName());
        values.put(Forms21cmContract.Forms21cmTable.COLUMN_SYSDATE, form21cm.getSysDate());
        values.put(Forms21cmContract.Forms21cmTable.COLUMN_STUDYID, form21cm.getStudyID());
        values.put(Forms21cmContract.Forms21cmTable.COLUMN_DSSID, form21cm.getDssID());
        values.put(Forms21cmContract.Forms21cmTable.COLUMN_WEEK, form21cm.getWeek());

        values.put(Forms21cmContract.Forms21cmTable.COLUMN_S02, form21cm.getS02());

        /*values.put(FormsContract.FormsTable.COLUMN_S01HH, form.getS01HH());
        values.put(FormsContract.FormsTable.COLUMN_S02CB, form.getS02CB());
        values.put(FormsContract.FormsTable.COLUMN_S03CS, form.getS03CS());
        values.put(FormsContract.FormsTable.COLUMN_S04IM, form.getS04IM());
        values.put(FormsContract.FormsTable.COLUMN_S05PD, form.getS05PD());
        values.put(FormsContract.FormsTable.COLUMN_S06BF, form.getS06BF());
        values.put(FormsContract.FormsTable.COLUMN_S07CV, form.getS07CV());
        values.put(FormsContract.FormsTable.COLUMN_S08SE, form.getS08SE());*/

        values.put(Forms21cmContract.Forms21cmTable.COLUMN_ISTATUS, form21cm.getIStatus());
        values.put(Forms21cmContract.Forms21cmTable.COLUMN_ISTATUS96x, form21cm.getIStatus96x());
        values.put(Forms21cmContract.Forms21cmTable.COLUMN_ENDINGDATETIME, form21cm.getEndTime());
        values.put(Forms21cmContract.Forms21cmTable.COLUMN_GPS, form21cm.getGps());

        values.put(Forms21cmContract.Forms21cmTable.COLUMN_DEVICETAGID, form21cm.getDeviceTag());
        values.put(Forms21cmContract.Forms21cmTable.COLUMN_DEVICEID, form21cm.getDeviceId());
        values.put(Forms21cmContract.Forms21cmTable.COLUMN_APPVERSION, form21cm.getAppver());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                Forms21cmContract.Forms21cmTable.TABLE_NAME,
                Forms21cmContract.Forms21cmTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }


    /*
     * Addition in DB
     * */
    public Long addForm4M(Form4mm form) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(Forms4mmContract.Forms4MMTable.COLUMN_PROJECT_NAME, form.getProjectName());
        values.put(Forms4mmContract.Forms4MMTable.COLUMN_UID, form.getUid());
        values.put(Forms4mmContract.Forms4MMTable.COLUMN_USERNAME, form.getUserName());
        values.put(Forms4mmContract.Forms4MMTable.COLUMN_SYSDATE, form.getSysDate());
        values.put(Forms4mmContract.Forms4MMTable.COLUMN_STUDYID, form.getStudyID());
        values.put(Forms4mmContract.Forms4MMTable.COLUMN_DSSID, form.getDssID());
        values.put(Forms4mmContract.Forms4MMTable.COLUMN_WEEK, form.getWeek());

        values.put(Forms4mmContract.Forms4MMTable.COLUMN_S02, form.getS02());

        /*values.put(FormsContract.FormsTable.COLUMN_S01HH, form.getS01HH());
        values.put(FormsContract.FormsTable.COLUMN_S02CB, form.getS02CB());
        values.put(FormsContract.FormsTable.COLUMN_S03CS, form.getS03CS());
        values.put(FormsContract.FormsTable.COLUMN_S04IM, form.getS04IM());
        values.put(FormsContract.FormsTable.COLUMN_S05PD, form.getS05PD());
        values.put(FormsContract.FormsTable.COLUMN_S06BF, form.getS06BF());
        values.put(FormsContract.FormsTable.COLUMN_S07CV, form.getS07CV());
        values.put(FormsContract.FormsTable.COLUMN_S08SE, form.getS08SE());*/

        values.put(Forms4mmContract.Forms4MMTable.COLUMN_ISTATUS, form.getIStatus());
        values.put(Forms4mmContract.Forms4MMTable.COLUMN_ISTATUS96x, form.getIStatus96x());
        values.put(Forms4mmContract.Forms4MMTable.COLUMN_ENDINGDATETIME, form.getEndTime());
        values.put(Forms4mmContract.Forms4MMTable.COLUMN_GPS, form.getGps());

        values.put(Forms4mmContract.Forms4MMTable.COLUMN_DEVICETAGID, form.getDeviceTag());
        values.put(Forms4mmContract.Forms4MMTable.COLUMN_DEVICEID, form.getDeviceId());
        values.put(Forms4mmContract.Forms4MMTable.COLUMN_APPVERSION, form.getAppver());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                Forms4mmContract.Forms4MMTable.TABLE_NAME,
                Forms4mmContract.Forms4MMTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }


    // ANDROID DATABASE MANAGER
    public ArrayList<Cursor> getData(String Query) {
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
            String maxQuery = Query;
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(maxQuery, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (SQLException sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        } catch (Exception ex) {

            Log.d("printing exception", ex.getMessage());

            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + ex.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
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

    public ArrayList<Form21cm> getFormsByDate(String sysdate) {

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                Forms21cmContract.Forms21cmTable._ID,
                Forms21cmContract.Forms21cmTable.COLUMN_UID,
                Forms21cmContract.Forms21cmTable.COLUMN_SYSDATE,
                Forms21cmContract.Forms21cmTable.COLUMN_USERNAME,
                Forms21cmContract.Forms21cmTable.COLUMN_ISTATUS,
                Forms21cmContract.Forms21cmTable.COLUMN_ISTATUS96x,
                Forms21cmContract.Forms21cmTable.COLUMN_ENDINGDATETIME,
                Forms21cmContract.Forms21cmTable.COLUMN_SYNCED,

        };
        String whereClause = Forms21cmContract.Forms21cmTable.COLUMN_SYSDATE + " Like ? ";
        String[] whereArgs = new String[]{"%" + sysdate + " %"};
        String groupBy = null;
        String having = null;
        String orderBy = Forms21cmContract.Forms21cmTable.COLUMN_ID + " ASC";
        ArrayList<Form21cm> allForm21cms = new ArrayList<>();
        try {
            c = db.query(
                    Forms21cmContract.Forms21cmTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Form21cm forms = new Form21cm();
                forms.setId(c.getString(c.getColumnIndex(Forms21cmContract.Forms21cmTable.COLUMN_ID)));
                forms.setUid(c.getString(c.getColumnIndex(Forms21cmContract.Forms21cmTable.COLUMN_UID)));
                forms.setSysDate(c.getString(c.getColumnIndex(Forms21cmContract.Forms21cmTable.COLUMN_SYSDATE)));
                forms.setUserName(c.getString(c.getColumnIndex(Forms21cmContract.Forms21cmTable.COLUMN_USERNAME)));
                allForm21cms.add(forms);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allForm21cms;
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

        String selection = Forms21cmContract.Forms21cmTable.COLUMN_ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.form21cm.getId())};

        return db.update(Forms21cmContract.Forms21cmTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    public int updatesForm4MColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = Forms4mmContract.Forms4MMTable.COLUMN_ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.form4m.getId())};

        return db.update(Forms4mmContract.Forms4MMTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    //Synced functions
    public JSONArray getUnsyncedForms21cm() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                Forms21cmContract.Forms21cmTable.COLUMN_ID,
                Forms21cmContract.Forms21cmTable.COLUMN_UID,
                Forms21cmContract.Forms21cmTable.COLUMN_USERNAME,
                Forms21cmContract.Forms21cmTable.COLUMN_SYSDATE,
                Forms21cmContract.Forms21cmTable.COLUMN_PROJECT_NAME,
                Forms21cmContract.Forms21cmTable.COLUMN_STUDYID,
                Forms21cmContract.Forms21cmTable.COLUMN_DSSID,
                Forms21cmContract.Forms21cmTable.COLUMN_WEEK,
                Forms21cmContract.Forms21cmTable.COLUMN_S02,
                Forms21cmContract.Forms21cmTable.COLUMN_SYNCED,
                Forms21cmContract.Forms21cmTable.COLUMN_SYNCED_DATE,

/*                 FormsContract.FormsTable.COLUMN_COUNTRY_CODE,
                FormsContract.FormsTable.COLUMN_COUNTRY,
                FormsContract.FormsTable.COLUMN_DISTRICT_CODE,
                FormsContract.FormsTable.COLUMN_DISTRICT,
                FormsContract.FormsTable.COLUMN_UC_CODE,
                FormsContract.FormsTable.COLUMN_UC,
                FormsContract.FormsTable.COLUMN_VILLAGE_CODE,
                FormsContract.FormsTable.COLUMN_VILLAGE,
                FormsContract.FormsTable.COLUMN_SA,
               FormsTable.COLUMN_CR01,
                FormsTable.COLUMN_CR02,
                FormsTable.COLUMN_CR03,
                FormsTable.COLUMN_CR04,
                FormsTable.COLUMN_CR05,
                FormsTable.COLUMN_CR06,
                FormsTable.COLUMN_CR06X,
                FormsTable.COLUMN_CR07,
                FormsTable.COLUMN_CR08D,
                FormsTable.COLUMN_CR08M,
                FormsTable.COLUMN_CR08Y,
                FormsTable.COLUMN_CR09,
                FormsTable.COLUMN_CR10,
                FormsTable.COLUMN_CR11,
                FormsTable.COLUMN_CR12,
                FormsTable.COLUMN_CR13,
                FormsTable.COLUMN_CR14D,
                FormsTable.COLUMN_CR14M,
                FormsTable.COLUMN_CR14Y,
                FormsTable.COLUMN_CR15M,
                FormsTable.COLUMN_CR15Y,
                FormsTable.COLUMN_CR16,
                FormsTable.COLUMN_CR17,
                FormsTable.COLUMN_CR18,
                FormsTable.COLUMN_CR19,
                FormsTable.COLUMN_CR20,
                FormsTable.COLUMN_CR21,
                FormsTable.COLUMN_CR22,
                FormsTable.COLUMN_CR23,
                FormsTable.COLUMN_CR24A,
                FormsTable.COLUMN_CR24B,
                FormsTable.COLUMN_CR24C,
                FormsTable.COLUMN_CR24D,
                FormsTable.COLUMN_CR24E,
                FormsTable.COLUMN_CR24F,
                FormsTable.COLUMN_CR25,
                FormsTable.COLUMN_CR26,
                FormsTable.COLUMN_CR27A,
                FormsTable.COLUMN_CR27B,
                FormsTable.COLUMN_CR27C,
                FormsTable.COLUMN_CR28A,
                FormsTable.COLUMN_CR28B,
                FormsTable.COLUMN_CR28C,
                FormsTable.COLUMN_CR28D,
                FormsTable.COLUMN_CR28E,
                FormsTable.COLUMN_CR28F,
                FormsTable.COLUMN_CR28FX,*/
                Forms21cmContract.Forms21cmTable.COLUMN_ISTATUS,
                Forms21cmContract.Forms21cmTable.COLUMN_ISTATUS96x,
                Forms21cmContract.Forms21cmTable.COLUMN_ENDINGDATETIME,
                Forms21cmContract.Forms21cmTable.COLUMN_GPS,
                Forms21cmContract.Forms21cmTable.COLUMN_DEVICETAGID,
                Forms21cmContract.Forms21cmTable.COLUMN_DEVICEID,
                Forms21cmContract.Forms21cmTable.COLUMN_APPVERSION
        };

        String whereClause;
        String[] whereArgs;

        whereClause = Forms21cmContract.Forms21cmTable.COLUMN_SYNCED + " is null OR " + Forms21cmContract.Forms21cmTable.COLUMN_SYNCED + " = ''";
        whereArgs = null;

        String groupBy = null;
        String having = null;
        String orderBy = Forms21cmContract.Forms21cmTable.COLUMN_ID + " ASC";

        JSONArray allForms = new JSONArray();
        try {
            c = db.query(
                    Forms21cmContract.Forms21cmTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Log.d(TAG, "getUnsyncedForms: " + c.getCount());
                Form21cm form21cm = new Form21cm();
                allForms.put(form21cm.Hydrate(c).toJSONObject());
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


    //Synced functions
    public JSONArray getUnsyncedForms4mm() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                Forms4mmContract.Forms4MMTable.COLUMN_ID,
                Forms4mmContract.Forms4MMTable.COLUMN_UID,
                Forms4mmContract.Forms4MMTable.COLUMN_USERNAME,
                Forms4mmContract.Forms4MMTable.COLUMN_SYSDATE,
                Forms4mmContract.Forms4MMTable.COLUMN_PROJECT_NAME,
                Forms4mmContract.Forms4MMTable.COLUMN_STUDYID,
                Forms4mmContract.Forms4MMTable.COLUMN_DSSID,
                Forms4mmContract.Forms4MMTable.COLUMN_WEEK,
                Forms4mmContract.Forms4MMTable.COLUMN_S02,
                Forms4mmContract.Forms4MMTable.COLUMN_SYNCED,
                Forms4mmContract.Forms4MMTable.COLUMN_SYNCED_DATE,

/*                 FormsContract.FormsTable.COLUMN_COUNTRY_CODE,
                FormsContract.FormsTable.COLUMN_COUNTRY,
                FormsContract.FormsTable.COLUMN_DISTRICT_CODE,
                FormsContract.FormsTable.COLUMN_DISTRICT,
                FormsContract.FormsTable.COLUMN_UC_CODE,
                FormsContract.FormsTable.COLUMN_UC,
                FormsContract.FormsTable.COLUMN_VILLAGE_CODE,
                FormsContract.FormsTable.COLUMN_VILLAGE,
                FormsContract.FormsTable.COLUMN_SA,
               FormsTable.COLUMN_CR01,
                FormsTable.COLUMN_CR02,
                FormsTable.COLUMN_CR03,
                FormsTable.COLUMN_CR04,
                FormsTable.COLUMN_CR05,
                FormsTable.COLUMN_CR06,
                FormsTable.COLUMN_CR06X,
                FormsTable.COLUMN_CR07,
                FormsTable.COLUMN_CR08D,
                FormsTable.COLUMN_CR08M,
                FormsTable.COLUMN_CR08Y,
                FormsTable.COLUMN_CR09,
                FormsTable.COLUMN_CR10,
                FormsTable.COLUMN_CR11,
                FormsTable.COLUMN_CR12,
                FormsTable.COLUMN_CR13,
                FormsTable.COLUMN_CR14D,
                FormsTable.COLUMN_CR14M,
                FormsTable.COLUMN_CR14Y,
                FormsTable.COLUMN_CR15M,
                FormsTable.COLUMN_CR15Y,
                FormsTable.COLUMN_CR16,
                FormsTable.COLUMN_CR17,
                FormsTable.COLUMN_CR18,
                FormsTable.COLUMN_CR19,
                FormsTable.COLUMN_CR20,
                FormsTable.COLUMN_CR21,
                FormsTable.COLUMN_CR22,
                FormsTable.COLUMN_CR23,
                FormsTable.COLUMN_CR24A,
                FormsTable.COLUMN_CR24B,
                FormsTable.COLUMN_CR24C,
                FormsTable.COLUMN_CR24D,
                FormsTable.COLUMN_CR24E,
                FormsTable.COLUMN_CR24F,
                FormsTable.COLUMN_CR25,
                FormsTable.COLUMN_CR26,
                FormsTable.COLUMN_CR27A,
                FormsTable.COLUMN_CR27B,
                FormsTable.COLUMN_CR27C,
                FormsTable.COLUMN_CR28A,
                FormsTable.COLUMN_CR28B,
                FormsTable.COLUMN_CR28C,
                FormsTable.COLUMN_CR28D,
                FormsTable.COLUMN_CR28E,
                FormsTable.COLUMN_CR28F,
                FormsTable.COLUMN_CR28FX,*/
                Forms4mmContract.Forms4MMTable.COLUMN_ISTATUS,
                Forms4mmContract.Forms4MMTable.COLUMN_ISTATUS96x,
                Forms4mmContract.Forms4MMTable.COLUMN_ENDINGDATETIME,
                Forms4mmContract.Forms4MMTable.COLUMN_GPS,
                Forms4mmContract.Forms4MMTable.COLUMN_DEVICETAGID,
                Forms4mmContract.Forms4MMTable.COLUMN_DEVICEID,
                Forms4mmContract.Forms4MMTable.COLUMN_APPVERSION
        };

        String whereClause;
        String[] whereArgs;

        whereClause = Forms4mmContract.Forms4MMTable.COLUMN_SYNCED + " is null OR " + Forms4mmContract.Forms4MMTable.COLUMN_SYNCED + " = ''";
        whereArgs = null;

        String groupBy = null;
        String having = null;
        String orderBy = Forms4mmContract.Forms4MMTable.COLUMN_ID + " ASC";

        JSONArray allForms = new JSONArray();
        try {
            c = db.query(
                    Forms4mmContract.Forms4MMTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Log.d(TAG, "getUnsyncedForms: " + c.getCount());
                Form4mm form4mm = new Form4mm();
                allForms.put(form4mm.Hydrate(c).toJSONObject());
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


    public void updateSyncedForms(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(Forms21cmContract.Forms21cmTable.COLUMN_SYNCED, true);
        values.put(Forms21cmContract.Forms21cmTable.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = Forms21cmContract.Forms21cmTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                Forms21cmContract.Forms21cmTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public int updateEnding() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(Forms21cmContract.Forms21cmTable.COLUMN_ISTATUS, MainApp.form21cm.getIStatus());
        values.put(Forms21cmContract.Forms21cmTable.COLUMN_ISTATUS96x, MainApp.form21cm.getIStatus96x());
        values.put(Forms21cmContract.Forms21cmTable.COLUMN_ENDINGDATETIME, MainApp.form21cm.getEndTime());

        // Which row to update, based on the ID
        String selection = Forms21cmContract.Forms21cmTable.COLUMN_ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.form21cm.getId())};

        return db.update(Forms21cmContract.Forms21cmTable.TABLE_NAME,
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


    public int syncFollowUp21cm(JSONArray fupList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(FollowUp21cm.FollowUpTable21cm.TABLE_NAME, null, null);
        int insertCount = 0;
        try {
            for (int i = 0; i < fupList.length(); i++) {

                JSONObject jsonObjectUser = fupList.getJSONObject(i);

                FollowUp21cm fup21cm = new FollowUp21cm();
                fup21cm.sync(jsonObjectUser);
                ContentValues values = new ContentValues();

                values.put(FollowUp21cm.FollowUpTable21cm.COLUMN_DSSID, fup21cm.getDSSID());
                values.put(FollowUp21cm.FollowUpTable21cm.COLUMN_ID, fup21cm.getCOLID());
                values.put(FollowUp21cm.FollowUpTable21cm.COLUMN_STUDYID, fup21cm.getSTUDYID());
                values.put(FollowUp21cm.FollowUpTable21cm.COLUMN_FUPDT, fup21cm.getFUPDT());
                values.put(FollowUp21cm.FollowUpTable21cm.COLUMN_FUPWEEK, fup21cm.getFUPWEEK());
                long rowID = db.insert(FollowUp21cm.FollowUpTable21cm.TABLE_NAME, null, values);
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