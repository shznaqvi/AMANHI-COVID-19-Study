package edu.aku.hassannaqvi.amanhicovid_19study.models

import android.database.Cursor
import org.json.JSONException
import org.json.JSONObject
import java.io.Serializable

class FollowUpPregSur : Serializable {

    var ID: Long = 0
    var DSSID: String = ""
    var STUDYID: String = ""
    var FUPDT: String = ""
    var FUPMONTH: String = ""
    var VISITSTATUS: String = ""
    var WOMNAME: String = ""
    var HUSNAME: String = ""
    var COLFLAG: String = ""


    constructor() {
        // Default Constructor
    }

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): FollowUpPregSur {
        DSSID = jsonObject.getString(FollowUpTablePregSur.COLUMN_DSSID)
        STUDYID = jsonObject.getString(FollowUpTablePregSur.COLUMN_STUDYID)
        FUPDT = jsonObject.getString(FollowUpTablePregSur.COLUMN_FUPDT)
        FUPMONTH = jsonObject.getString(FollowUpTablePregSur.COLUMN_FUPMONTH)
        VISITSTATUS = jsonObject.getString(FollowUpTablePregSur.COLUMN_VISITSTATUS)
        WOMNAME = jsonObject.getString(FollowUpTablePregSur.COLUMN_WOMNAME)
        HUSNAME = jsonObject.getString(FollowUpTablePregSur.COLUMN_HUSNAME)
        COLFLAG = jsonObject.getString(FollowUpTablePregSur.COLUMN_COLFLAG)

        return this
    }

    fun hydrate(cursor: Cursor): FollowUpPregSur {
        ID = cursor.getLong(cursor.getColumnIndex(FollowUpTablePregSur.COLUMN_ID))
        DSSID = cursor.getString(cursor.getColumnIndex(FollowUpTablePregSur.COLUMN_DSSID))
        STUDYID = cursor.getString(cursor.getColumnIndex(FollowUpTablePregSur.COLUMN_STUDYID))
        FUPDT = cursor.getString(cursor.getColumnIndex(FollowUpTablePregSur.COLUMN_FUPDT))
        FUPMONTH = cursor.getString(cursor.getColumnIndex(FollowUpTablePregSur.COLUMN_FUPMONTH))
        VISITSTATUS = cursor.getString(cursor.getColumnIndex(FollowUpTablePregSur.COLUMN_VISITSTATUS))
        WOMNAME = cursor.getString(cursor.getColumnIndex(FollowUpTablePregSur.COLUMN_WOMNAME))
        HUSNAME = cursor.getString(cursor.getColumnIndex(FollowUpTablePregSur.COLUMN_HUSNAME))
        COLFLAG = cursor.getString(cursor.getColumnIndex(FollowUpTablePregSur.COLUMN_COLFLAG))

        return this
    }

    object FollowUpTablePregSur {
        //const val TABLE_NAME = "fupwk21cm"  // actual table
        const val TABLE_NAME = "vu_preg_surv" // view
        const val COLUMN_NAME_NULLABLE = "nullColumnHack"
        const val COLUMN_ID = "_id"
        const val COLUMN_DSSID = "dssid"
        const val COLUMN_STUDYID = "studyid"
        const val COLUMN_FUPDT = "fupdt"
        const val COLUMN_FUPMONTH = "fupmonth"
        const val COLUMN_VISITSTATUS = "vstatus"
        const val COLUMN_WOMNAME = "womname"
        const val COLUMN_HUSNAME = "husname"
        const val COLUMN_COLFLAG = "colflag"
    }
}