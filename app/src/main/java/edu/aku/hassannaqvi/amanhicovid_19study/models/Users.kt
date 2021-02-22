package edu.aku.hassannaqvi.amanhicovid_19study.models

import android.database.Cursor
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by hassan.naqvi on 11/30/2016.
 */
class Users {
    var userID: Long = 0
    var userName: String = ""
    var password: String = ""
    var fullname: String = ""
    var desig: String = ""
    var code: String = ""
    var empno: String = ""
    var colflag: String = ""


    constructor() {
        // Default Constructor
    }

    constructor(username: String, fullname: String) {
        userName = username
        this.fullname = fullname
    }

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): Users {
        userName = jsonObject.getString(UsersTable.COLUMN_USERNAME)
        password = jsonObject.getString(UsersTable.COLUMN_PASSWORD)
        fullname = jsonObject.getString(UsersTable.COLUMN_FULLNAME)
        desig = jsonObject.getString(UsersTable.COLUMN_DESIGNATION)
        empno = jsonObject.getString(UsersTable.COLUMN_EMPNO)
        code = jsonObject.getString(UsersTable.COLUMN_CODE)
        colflag = jsonObject.getString(UsersTable.COLUMN_COLFLAG)

        return this
    }

    fun hydrate(cursor: Cursor): Users {
        userID = cursor.getLong(cursor.getColumnIndex(UsersTable.COLUMN_ID))
        userName = cursor.getString(cursor.getColumnIndex(UsersTable.COLUMN_USERNAME))
        password = cursor.getString(cursor.getColumnIndex(UsersTable.COLUMN_PASSWORD))
        fullname = cursor.getString(cursor.getColumnIndex(UsersTable.COLUMN_FULLNAME))
        desig = cursor.getString(cursor.getColumnIndex(UsersTable.COLUMN_DESIGNATION))
        empno = cursor.getString(cursor.getColumnIndex(UsersTable.COLUMN_EMPNO))
        code = cursor.getString(cursor.getColumnIndex(UsersTable.COLUMN_CODE))
        colflag = cursor.getString(cursor.getColumnIndex(UsersTable.COLUMN_COLFLAG))

        return this
    }

    object UsersTable {
        const val TABLE_NAME = "users"
        const val COLUMN_NAME_NULLABLE = "nullColumnHack"
        const val COLUMN_ID = "_id"
        const val COLUMN_USERNAME = "username"
        const val COLUMN_PASSWORD = "password"
        const val COLUMN_FULLNAME = "full_name"
        const val COLUMN_DESIGNATION = "designation"
        const val COLUMN_CODE = "code"
        const val COLUMN_EMPNO = "empno"
        const val COLUMN_COLFLAG = "colflag"
    }
}