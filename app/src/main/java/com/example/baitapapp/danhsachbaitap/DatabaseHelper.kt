package com.example.baitapapp.danhsachbaitap

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import android.widget.Toast

val DATABASENAMEBAITAP = "BAI TAP"
val TABLENAMEBAITAP = "BaiTap"
val COL_NAMEBAITAP = "name"
val COL_DIEM = "diem"
val COL_IDBAITAP = "id"

class DatabaseHelper(var context: Context) : SQLiteOpenHelper(context, DATABASENAMEBAITAP,null,1) {
    override fun onCreate(db: SQLiteDatabase?) {
        val createTable = "CREATE TABLE " + TABLENAMEBAITAP + " (" + COL_IDBAITAP + " INTEGER PRIMARY KEY AUTOINCREMENT," + COL_NAMEBAITAP + " VARCHAR(256)," + COL_DIEM + " INTERGER )"
        db?.execSQL(createTable)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
    }
    fun insertData(baitap: Databaitap) {
        val database = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(COL_NAMEBAITAP, baitap.name)
        contentValues.put(COL_DIEM, baitap.diem)
        val result = database.insert(TABLENAMEBAITAP, null, contentValues)
        if (result == (0).toLong()) {
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show()
        }
        else {
            Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
        }
    }
    fun getData(): MutableList<Databaitap> {
        val list: MutableList<Databaitap> = ArrayList()
        val db = this.readableDatabase
        val query = "Select * from $TABLENAMEBAITAP"
        val result = db.rawQuery(query, null)
        if (result.moveToFirst()) {
            do {
                val databaitap = Databaitap()
                databaitap.name = result.getString(result.getColumnIndex(COL_NAMEBAITAP))
                databaitap.diem = result.getString(result.getColumnIndex(COL_DIEM)).toInt()
                list.add(databaitap)
            }
            while (result.moveToNext())
        }
        return list
    }
    fun deleteAll() {
        val db = this.readableDatabase
        db?.execSQL("delete from "+ TABLENAMEBAITAP)
        db?.close()


    }



}