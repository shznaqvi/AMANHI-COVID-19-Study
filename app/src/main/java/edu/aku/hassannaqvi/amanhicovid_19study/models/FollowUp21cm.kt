package edu.aku.hassannaqvi.amanhicovid_19study.models

import android.database.Cursor
import org.json.JSONException
import org.json.JSONObject
import java.io.Serializable

class FollowUp21cm : Serializable {

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
    fun sync(jsonObject: JSONObject): FollowUp21cm {
        DSSID = jsonObject.getString(FollowUpTable21cm.COLUMN_DSSID)
        STUDYID = jsonObject.getString(FollowUpTable21cm.COLUMN_STUDYID)
        FUPDT = jsonObject.getString(FollowUpTable21cm.COLUMN_FUPDT)
        FUPWEEK = jsonObject.getString(FollowUpTable21cm.COLUMN_FUPWEEK)
        WOMNAME = jsonObject.getString(FollowUp4mm.FollowUpTable4mm.COLUMN_WOMNAME)
        HUSNAME = jsonObject.getString(FollowUp4mm.FollowUpTable4mm.COLUMN_HUSNAME)
        COLFLAG = jsonObject.getString(FollowUpTable21cm.COLUMN_COLFLAG)

        return this
    }

    fun hydrate(cursor: Cursor): FollowUp21cm {
        ID = cursor.getLong(cursor.getColumnIndex(FollowUpTable21cm.COLUMN_ID))
        DSSID = cursor.getString(cursor.getColumnIndex(FollowUpTable21cm.COLUMN_DSSID))
        STUDYID = cursor.getString(cursor.getColumnIndex(FollowUpTable21cm.COLUMN_STUDYID))
        FUPDT = cursor.getString(cursor.getColumnIndex(FollowUpTable21cm.COLUMN_FUPDT))
        FUPWEEK = cursor.getString(cursor.getColumnIndex(FollowUpTable21cm.COLUMN_FUPWEEK))
        WOMNAME = cursor.getString(cursor.getColumnIndex(FollowUp4mm.FollowUpTable4mm.COLUMN_WOMNAME))
        HUSNAME = cursor.getString(cursor.getColumnIndex(FollowUp4mm.FollowUpTable4mm.COLUMN_HUSNAME))
        COLFLAG = cursor.getString(cursor.getColumnIndex(FollowUpTable21cm.COLUMN_COLFLAG))

        return this
    }

    object FollowUpTable21cm {
        //const val TABLE_NAME = "fupwk21cm"  // actual table
        const val TABLE_NAME = "vu_childfup21cm" // view
        const val COLUMN_NAME_NULLABLE = "nullColumnHack"
        const val COLUMN_ID = "_id"
        const val COLUMN_STUDYID = "studyid"
        const val COLUMN_DSSID = "dssid"
        const val COLUMN_FUPDT = "fupdt"
        const val COLUMN_FUPWEEK = "fupweek"
        const val COLUMN_WOMNAME = "womname"
        const val COLUMN_HUSNAME = "husname"
        const val COLUMN_COLFLAG = "colflag"
    }
}