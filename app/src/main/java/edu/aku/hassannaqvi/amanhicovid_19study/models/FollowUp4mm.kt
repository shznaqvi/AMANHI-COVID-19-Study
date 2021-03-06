package edu.aku.hassannaqvi.amanhicovid_19study.models

import android.database.Cursor
import org.json.JSONException
import org.json.JSONObject
import java.io.Serializable

class FollowUp4mm : Serializable {

    var ID: Long = 0
    var DSSID: String = ""
    var STUDYID: String = ""
    var FUPDT: String = ""
    var FUPWEEK: String = ""
    var ISPREG: String = ""
    var LASTVISITDT: String = ""
    var VISITSTATUS: String = ""
    var WOMNAME: String = ""
    var HUSNAME: String = ""
    var COLFLAG: String = ""

    constructor() {
        // Default Constructor
    }

    constructor(dssid: String, studyid: String) {
        DSSID = dssid
        STUDYID = studyid
    }


    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): FollowUp4mm {
        DSSID = jsonObject.getString(FollowUpTable4mm.COLUMN_DSSID)
        STUDYID = jsonObject.getString(FollowUpTable4mm.COLUMN_STUDYID)
        FUPDT = jsonObject.getString(FollowUpTable4mm.COLUMN_FUPDT)
        FUPWEEK = jsonObject.getString(FollowUpTable4mm.COLUMN_FUPWEEK)
        ISPREG = jsonObject.getString(FollowUpTable4mm.COLUMN_ISPREG)
        LASTVISITDT = jsonObject.getString(FollowUpTable4mm.COLUMN_LASTVISITDT)
        VISITSTATUS = jsonObject.getString(FollowUpTable4mm.COLUMN_VISITSTATUS)
        WOMNAME = jsonObject.getString(FollowUpTable4mm.COLUMN_WOMNAME)
        HUSNAME = jsonObject.getString(FollowUpTable4mm.COLUMN_HUSNAME)
        COLFLAG = jsonObject.getString(FollowUpTable4mm.COLUMN_COLFLAG)

        return this
    }

    fun hydrate(cursor: Cursor): FollowUp4mm {
        ID = cursor.getLong(cursor.getColumnIndex(FollowUpTable4mm.COLUMN_ID))
        DSSID = cursor.getString(cursor.getColumnIndex(FollowUpTable4mm.COLUMN_DSSID))
        STUDYID = cursor.getString(cursor.getColumnIndex(FollowUpTable4mm.COLUMN_STUDYID))
        FUPDT = cursor.getString(cursor.getColumnIndex(FollowUpTable4mm.COLUMN_FUPDT))
        FUPWEEK = cursor.getString(cursor.getColumnIndex(FollowUpTable4mm.COLUMN_FUPWEEK))
        ISPREG = cursor.getString(cursor.getColumnIndex(FollowUpTable4mm.COLUMN_ISPREG))
        LASTVISITDT = cursor.getString(cursor.getColumnIndex(FollowUpTable4mm.COLUMN_LASTVISITDT))
        VISITSTATUS = cursor.getString(cursor.getColumnIndex(FollowUpTable4mm.COLUMN_VISITSTATUS))
        WOMNAME = cursor.getString(cursor.getColumnIndex(FollowUpTable4mm.COLUMN_WOMNAME))
        HUSNAME = cursor.getString(cursor.getColumnIndex(FollowUpTable4mm.COLUMN_HUSNAME))
        COLFLAG = cursor.getString(cursor.getColumnIndex(FollowUpTable4mm.COLUMN_COLFLAG))

        return this
    }

    object FollowUpTable4mm {
        //const val TABLE_NAME = "fupwk4mm"  // actual table
        const val TABLE_NAME = "vu_motherfup4mm"  // view
        const val COLUMN_NAME_NULLABLE = "nullColumnHack"
        const val COLUMN_ID = "_id"
        const val COLUMN_DSSID = "dssid"
        const val COLUMN_STUDYID = "studyid"
        const val COLUMN_FUPDT = "fupdt"
        const val COLUMN_FUPWEEK = "fupweek"
        const val COLUMN_ISPREG = "ispreg"
        const val COLUMN_LASTVISITDT = "lastvisitdt"
        const val COLUMN_VISITSTATUS = "vstatus"
        const val COLUMN_WOMNAME = "womname"
        const val COLUMN_HUSNAME = "husname"
        const val COLUMN_COLFLAG = "colflag"
    }

}