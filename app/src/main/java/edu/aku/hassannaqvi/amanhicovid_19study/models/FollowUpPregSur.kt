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
    var FUPWEEK: String = ""
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
        FUPWEEK = jsonObject.getString(FollowUpTablePregSur.COLUMN_FUPWEEK)
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
        FUPWEEK = cursor.getString(cursor.getColumnIndex(FollowUpTablePregSur.COLUMN_FUPWEEK))
        WOMNAME =
            cursor.getString(cursor.getColumnIndex(FollowUpTablePregSur.COLUMN_WOMNAME))
        HUSNAME =
            cursor.getString(cursor.getColumnIndex(FollowUpTablePregSur.COLUMN_HUSNAME))
        COLFLAG = cursor.getString(cursor.getColumnIndex(FollowUpTablePregSur.COLUMN_COLFLAG))

        return this
    }

    object FollowUpTablePregSur {
        //const val TABLE_NAME = "fupwk21cm"  // actual table
        const val TABLE_NAME = "vu_preg_surv" // view
        const val COLUMN_NAME_NULLABLE = "nullColumnHack"
        const val COLUMN_ID = "_id"
        const val COLUMN_STUDYID = "recordid"
        const val COLUMN_DSSID = "site1_enrol"
        const val COLUMN_FUPDT = "bdateint_enrol"
        const val COLUMN_FUPWEEK = "fupmonth"
        const val COLUMN_WOMNAMANHIID = "q1_6_enrol"
        const val COLUMN_WOMNAME = "mother_name_enrol"
        const val COLUMN_HUSNAME = "mother_name_enrol"
        const val COLUMN_COLFLAG = "colflag"
    }
}