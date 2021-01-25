package edu.aku.hassannaqvi.amanhicovid_19study.utils

import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Form4mmContract
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Forms21cmContract
import edu.aku.hassannaqvi.amanhicovid_19study.models.Users
import edu.aku.hassannaqvi.amanhicovid_19study.models.VersionApp

object CreateTable {
    const val PROJECT_NAME = "AMANHICOV2020"
    const val DATABASE_NAME = "$PROJECT_NAME.db"
    const val DATABASE_COPY = "${PROJECT_NAME}_copy.db"
    const val DATABASE_VERSION = 1

    const val SQL_CREATE_FORMS = ("CREATE TABLE "
            + Forms21cmContract.FormsTable.TABLE_NAME + "("
            + Forms21cmContract.FormsTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Forms21cmContract.FormsTable.COLUMN_PROJECT_NAME + " TEXT,"
            + Forms21cmContract.FormsTable.COLUMN_UID + " TEXT,"
            + Forms21cmContract.FormsTable.COLUMN_USERNAME + " TEXT,"
            + Forms21cmContract.FormsTable.COLUMN_SYSDATE + " TEXT,"
            + Forms21cmContract.FormsTable.COLUMN_ISTATUS + " TEXT,"
            + Forms21cmContract.FormsTable.COLUMN_ISTATUS96x + " TEXT,"
            + Forms21cmContract.FormsTable.COLUMN_ENDINGDATETIME + " TEXT,"
            + Forms21cmContract.FormsTable.COLUMN_GPS + " TEXT,"
            + Forms21cmContract.FormsTable.COLUMN_DEVICEID + " TEXT,"
            + Forms21cmContract.FormsTable.COLUMN_DEVICETAGID + " TEXT,"
            + Forms21cmContract.FormsTable.COLUMN_SYNCED + " TEXT,"
            + Forms21cmContract.FormsTable.COLUMN_SYNCED_DATE + " TEXT,"
            + Forms21cmContract.FormsTable.COLUMN_APPVERSION + " TEXT,"
            + Forms21cmContract.FormsTable.COLUMN_STUDYID + " TEXT,"
            + Forms21cmContract.FormsTable.COLUMN_DSSID + " TEXT,"
            + Forms21cmContract.FormsTable.COLUMN_WEEK + " TEXT,"
            + Forms21cmContract.FormsTable.COLUMN_S02 + " TEXT"
            + " );")


    const val SQL_CREATE_FORMS4M = ("CREATE TABLE "
            + Form4mmContract.Forms4MTable.TABLE_NAME + "("
            + Form4mmContract.Forms4MTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Form4mmContract.Forms4MTable.COLUMN_PROJECT_NAME + " TEXT,"
            + Form4mmContract.Forms4MTable.COLUMN_UID + " TEXT,"
            + Form4mmContract.Forms4MTable.COLUMN_USERNAME + " TEXT,"
            + Form4mmContract.Forms4MTable.COLUMN_SYSDATE + " TEXT,"
            + Form4mmContract.Forms4MTable.COLUMN_ISTATUS + " TEXT,"
            + Form4mmContract.Forms4MTable.COLUMN_ISTATUS96x + " TEXT,"
            + Form4mmContract.Forms4MTable.COLUMN_ENDINGDATETIME + " TEXT,"
            + Form4mmContract.Forms4MTable.COLUMN_GPS + " TEXT,"
            + Form4mmContract.Forms4MTable.COLUMN_DEVICEID + " TEXT,"
            + Form4mmContract.Forms4MTable.COLUMN_DEVICETAGID + " TEXT,"
            + Form4mmContract.Forms4MTable.COLUMN_SYNCED + " TEXT,"
            + Form4mmContract.Forms4MTable.COLUMN_SYNCED_DATE + " TEXT,"
            + Form4mmContract.Forms4MTable.COLUMN_APPVERSION + " TEXT,"
            + Form4mmContract.Forms4MTable.COLUMN_STUDYID + " TEXT,"
            + Form4mmContract.Forms4MTable.COLUMN_DSSID + " TEXT,"
            + Form4mmContract.Forms4MTable.COLUMN_WEEK + " TEXT,"
            + Form4mmContract.Forms4MTable.COLUMN_S02 + " TEXT"
            + " );")


    const val SQL_CREATE_USERS = ("CREATE TABLE " + Users.UsersTable.TABLE_NAME + "("
            + Users.UsersTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Users.UsersTable.COLUMN_USERNAME + " TEXT,"
            + Users.UsersTable.COLUMN_PASSWORD + " TEXT,"
            + Users.UsersTable.COLUMN_FULLNAME + " TEXT"
            + " );")

    /*const val SQL_CREATE_DISTRICTS = ("CREATE TABLE " + Districts.TableDistricts.TABLE_NAME + "("
            + Districts.TableDistricts.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Districts.TableDistricts.COLUMN_DISTRICT_NAME + " TEXT,"
            + Districts.TableDistricts.COLUMN_DISTRICT_CODE + " TEXT"
            + " );")*/

    /*const val SQL_CREATE_UCS = ("CREATE TABLE " + UCs.TableUCs.TABLE_NAME + "("
            + UCs.TableUCs.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UCs.TableUCs.COLUMN_UC_NAME + " TEXT,"
            + UCs.TableUCs.COLUMN_UC_CODE + " TEXT,"
            + UCs.TableUCs.COLUMN_DISTRICT_CODE + " TEXT"
            + " );")

    const val SQL_CREATE_CLUSTERS = ("CREATE TABLE " + Clusters.TableClusters.TABLE_NAME + "("
            + Clusters.TableClusters.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Clusters.TableClusters.COLUMN_UC_CODE + " TEXT,"
            + Clusters.TableClusters.COLUMN_CLUSTER_NAME + " TEXT,"
            + Clusters.TableClusters.COLUMN_CLUSTER_CODE + " TEXT"
            + " );")*/

    const val SQL_CREATE_VERSIONAPP = "CREATE TABLE " + VersionApp.VersionAppTable.TABLE_NAME + " (" +
            VersionApp.VersionAppTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            VersionApp.VersionAppTable.COLUMN_VERSION_CODE + " TEXT, " +
            VersionApp.VersionAppTable.COLUMN_VERSION_NAME + " TEXT, " +
            VersionApp.VersionAppTable.COLUMN_PATH_NAME + " TEXT " +
            ");"
}