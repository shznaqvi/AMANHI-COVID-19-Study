package edu.aku.hassannaqvi.amanhicovid_19study.models

import android.database.Cursor
import org.json.JSONException
import org.json.JSONObject

class Sites {
    var ID: Long = 0
    var SITE: String = ""
    var COLFLAG: String = ""

    constructor() {
        // Default Constructor
    }

    constructor(ID: Long, SITE: String) {
        this.ID = ID
        this.SITE = SITE
    }

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): Sites {
        SITE = jsonObject.getString(SiteTable.COLUMN_SITE)
        COLFLAG = jsonObject.getString(SiteTable.COLUMN_COLFLAG)

        return this
    }

    fun hydrate(cursor: Cursor): Sites {
        ID = cursor.getLong(cursor.getColumnIndex(SiteTable.COLUMN_ID))
        SITE = cursor.getString(cursor.getColumnIndex(SiteTable.COLUMN_SITE))
        COLFLAG = cursor.getString(cursor.getColumnIndex(SiteTable.COLUMN_COLFLAG))

        return this
    }

    object SiteTable {
        const val TABLE_NAME = "sites"
        const val COLUMN_NAME_NULLABLE = "nullColumnHack"
        const val COLUMN_ID = "_id"
        const val COLUMN_SITE = "site"
        const val COLUMN_COLFLAG = "colflag"
    }
}