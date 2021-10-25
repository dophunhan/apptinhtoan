package com.example.baitapapp.fragments


import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import android.widget.Toast
import kotlin.math.log

val DATABASENAME = "MY DATABASE"
val TABLENAME = "Users"
val COL_NAME = "name"
val COL_MATKHAU = "matkhau"
val COL_NHAPLAIMATKHAU = "nhaplaimatkhau"
val COL_EMAIL = "email"
val COL_ID = "id"

class DbHelper(var context: Context)  : SQLiteOpenHelper(context, DATABASENAME, null,
1) {
    override fun onCreate(db: SQLiteDatabase?) {
        val createTable = "CREATE TABLE " + TABLENAME + " (" + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + COL_NAME + " VARCHAR(256)," + COL_MATKHAU + " VARCHAR(256)," + COL_NHAPLAIMATKHAU + " VARCHAR(256)," + COL_EMAIL + " TEXT )"
        db?.execSQL(createTable)
    }
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        //onCreate(db);
    }

    // chèn dữ liệu
    fun insertData(user: User) {
        val database = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(COL_NAME, user.name)
        contentValues.put(COL_MATKHAU,user.matKhau)
        contentValues.put(COL_NHAPLAIMATKHAU,user.nhapLaiMatKhau)
        contentValues.put(COL_EMAIL,user.emaiL)
        val result = database.insert(TABLENAME, null, contentValues)
        if (result == (0).toLong()) {
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show()
        }
        else {
            Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
        }
    }
    // đọc dữ liệu
    fun getData(): MutableList<User> {
        val list: MutableList<User> = ArrayList()
        val db = this.readableDatabase
        val query = "Select * from $TABLENAME"
        val result = db.rawQuery(query, null)
        if (result.moveToFirst()) {
            do {
                val user = User()
               // user.id = result.getString(result.getColumnIndex(COL_ID)).toInt()
                user.name = result.getString(result.getColumnIndex(COL_NAME))
                user.matKhau = result.getString(result.getColumnIndex(COL_MATKHAU))
                user.nhapLaiMatKhau = result.getString(result.getColumnIndex(COL_NHAPLAIMATKHAU))
                user.emaiL = result.getString(result.getColumnIndex(COL_EMAIL))
                list.add(user)
            }
            while (result.moveToNext())
        }
        return list
    }
}

