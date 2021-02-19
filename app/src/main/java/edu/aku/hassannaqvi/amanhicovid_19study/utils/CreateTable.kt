package edu.aku.hassannaqvi.amanhicovid_19study.utils

import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Forms21cmContract
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Forms4mmContract
import edu.aku.hassannaqvi.amanhicovid_19study.models.FollowUp21cm
import edu.aku.hassannaqvi.amanhicovid_19study.models.FollowUp4mm
import edu.aku.hassannaqvi.amanhicovid_19study.models.Users
import edu.aku.hassannaqvi.amanhicovid_19study.models.VersionApp

object CreateTable {
    const val PROJECT_NAME = "AMANHICOV2020"
    const val DATABASE_NAME = "$PROJECT_NAME.db"
    const val DATABASE_COPY = "${PROJECT_NAME}_copy.db"
    const val DATABASE_VERSION = 1

    const val SQL_CREATE_FORMS = ("CREATE TABLE "
            + Forms21cmContract.Forms21cmTable.TABLE_NAME + "("
            + Forms21cmContract.Forms21cmTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Forms21cmContract.Forms21cmTable.COLUMN_PROJECT_NAME + " TEXT,"
            + Forms21cmContract.Forms21cmTable.COLUMN_UID + " TEXT,"
            + Forms21cmContract.Forms21cmTable.COLUMN_USERNAME + " TEXT,"
            + Forms21cmContract.Forms21cmTable.COLUMN_SYSDATE + " TEXT,"
            + Forms21cmContract.Forms21cmTable.COLUMN_ISTATUS + " TEXT,"
            + Forms21cmContract.Forms21cmTable.COLUMN_ISTATUS96x + " TEXT,"
            + Forms21cmContract.Forms21cmTable.COLUMN_ENDINGDATETIME + " TEXT,"
            + Forms21cmContract.Forms21cmTable.COLUMN_GPS + " TEXT,"
            + Forms21cmContract.Forms21cmTable.COLUMN_DEVICEID + " TEXT,"
            + Forms21cmContract.Forms21cmTable.COLUMN_DEVICETAGID + " TEXT,"
            + Forms21cmContract.Forms21cmTable.COLUMN_SYNCED + " TEXT,"
            + Forms21cmContract.Forms21cmTable.COLUMN_SYNCED_DATE + " TEXT,"
            + Forms21cmContract.Forms21cmTable.COLUMN_APPVERSION + " TEXT,"
            + Forms21cmContract.Forms21cmTable.COLUMN_STUDYID + " TEXT,"
            + Forms21cmContract.Forms21cmTable.COLUMN_DSSID + " TEXT,"
            + Forms21cmContract.Forms21cmTable.COLUMN_WEEK + " TEXT,"
            + Forms21cmContract.Forms21cmTable.COLUMN_S02 + " TEXT"
            + " );")


    const val SQL_CREATE_FORMS4M = ("CREATE TABLE "
            + Forms4mmContract.Forms4MMTable.TABLE_NAME + "("
            + Forms4mmContract.Forms4MMTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Forms4mmContract.Forms4MMTable.COLUMN_PROJECT_NAME + " TEXT,"
            + Forms4mmContract.Forms4MMTable.COLUMN_UID + " TEXT,"
            + Forms4mmContract.Forms4MMTable.COLUMN_USERNAME + " TEXT,"
            + Forms4mmContract.Forms4MMTable.COLUMN_SYSDATE + " TEXT,"
            + Forms4mmContract.Forms4MMTable.COLUMN_ISTATUS + " TEXT,"
            + Forms4mmContract.Forms4MMTable.COLUMN_ISTATUS96x + " TEXT,"
            + Forms4mmContract.Forms4MMTable.COLUMN_ENDINGDATETIME + " TEXT,"
            + Forms4mmContract.Forms4MMTable.COLUMN_GPS + " TEXT,"
            + Forms4mmContract.Forms4MMTable.COLUMN_DEVICEID + " TEXT,"
            + Forms4mmContract.Forms4MMTable.COLUMN_DEVICETAGID + " TEXT,"
            + Forms4mmContract.Forms4MMTable.COLUMN_SYNCED + " TEXT,"
            + Forms4mmContract.Forms4MMTable.COLUMN_SYNCED_DATE + " TEXT,"
            + Forms4mmContract.Forms4MMTable.COLUMN_APPVERSION + " TEXT,"
            + Forms4mmContract.Forms4MMTable.COLUMN_STUDYID + " TEXT,"
            + Forms4mmContract.Forms4MMTable.COLUMN_DSSID + " TEXT,"
            + Forms4mmContract.Forms4MMTable.COLUMN_WEEK + " TEXT,"
            + Forms4mmContract.Forms4MMTable.COLUMN_S02 + " TEXT"
            + " );")


    const val SQL_CREATE_USERS = ("CREATE TABLE " + Users.UsersTable.TABLE_NAME + "("
            + Users.UsersTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Users.UsersTable.COLUMN_USERNAME + " TEXT,"
            + Users.UsersTable.COLUMN_PASSWORD + " TEXT,"
            + Users.UsersTable.COLUMN_FULLNAME + " TEXT"
            + " );")


    const val SQL_CREATE_FUP21CM = ("CREATE TABLE " + FollowUp21cm.FollowUpTable21cm.TABLE_NAME + "("
            + FollowUp21cm.FollowUpTable21cm.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FollowUp21cm.FollowUpTable21cm.COLUMN_DSSID + " TEXT,"
            + FollowUp21cm.FollowUpTable21cm.COLUMN_STUDYID + " TEXT,"
            + FollowUp21cm.FollowUpTable21cm.COLUMN_FUPDT + " TEXT,"
            + FollowUp21cm.FollowUpTable21cm.COLUMN_FUPWEEK + " TEXT"
            + " );")

    const val SQL_CREATE_FUP4MM = ("CREATE TABLE " + FollowUp4mm.FollowUpTable4mm.TABLE_NAME + "("
            + FollowUp4mm.FollowUpTable4mm.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FollowUp4mm.FollowUpTable4mm.COLUMN_DSSID + " TEXT,"
            + FollowUp4mm.FollowUpTable4mm.COLUMN_STUDYID + " TEXT,"
            + FollowUp4mm.FollowUpTable4mm.COLUMN_FUPDT + " TEXT,"
            + FollowUp4mm.FollowUpTable4mm.COLUMN_FUPWEEK + " TEXT,"
            + FollowUp4mm.FollowUpTable4mm.COLUMN_ISPREG + " TEXT,"
            + FollowUp4mm.FollowUpTable4mm.COLUMN_LASTVISITDT + " TEXT,"
            + FollowUp4mm.FollowUpTable4mm.COLUMN_VISITSTATUS + " TEXT"
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