package edu.aku.hassannaqvi.amanhicovid_19study.models

import android.database.Cursor
import org.json.JSONException
import org.json.JSONObject

class FollowUp21cm {

    var COLID: Long = 0
    var DSSID: String = ""
    var STUDYID: String = ""
    var FUPDT: String = ""
    var FUPWEEK: String = ""

    constructor() {
        // Default Constructor
    }

    constructor(dssid: String, studyid: String) {
        DSSID = dssid
        STUDYID = studyid
    }


    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): FollowUp21cm {
        COLID = jsonObject.getLong(FollowUpTable21cm.COLUMN_ID)
        DSSID = jsonObject.getString(FollowUpTable21cm.COLUMN_DSSID)
        STUDYID = jsonObject.getString(FollowUpTable21cm.COLUMN_STUDYID)
        FUPDT = jsonObject.getString(FollowUpTable21cm.COLUMN_FUPDT)
        FUPWEEK = jsonObject.getString(FollowUpTable21cm.COLUMN_FUPWEEK)
        return this
    }

    fun hydrate(cursor: Cursor): FollowUp21cm {
        COLID = cursor.getLong(cursor.getColumnIndex(FollowUpTable21cm.COLUMN_ID))
        DSSID = cursor.getString(cursor.getColumnIndex(FollowUpTable21cm.COLUMN_DSSID))
        STUDYID = cursor.getString(cursor.getColumnIndex(FollowUpTable21cm.COLUMN_STUDYID))
        FUPDT = cursor.getString(cursor.getColumnIndex(FollowUpTable21cm.COLUMN_FUPDT))
        FUPWEEK = cursor.getString(cursor.getColumnIndex(FollowUpTable21cm.COLUMN_FUPWEEK))
        return this
    }

    object FollowUpTable21cm {
        const val TABLE_NAME = "fupwk21cm"
        const val COLUMN_ID = "_id"
        const val COLUMN_DSSID = "dssid"
        const val COLUMN_STUDYID = "studyid"
        const val COLUMN_FUPDT = "fupdt"
        const val COLUMN_FUPWEEK = "fupweek"
    }
}