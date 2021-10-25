package com.example.baitapapp.danhsachbaitap

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast
val DATABASENAMEBAITAPSOMOT = "BAI TAP"
val TABLENAMETRALOI = "BaiTap"
val COL_DAPAN = "dapan"
val COL_IDBAITAPSOMOT = "id"

class Databasehelperbaitapsomot(var context: Context): SQLiteOpenHelper(context, DATABASENAMEBAITAPSOMOT,null,1) {
    override fun onCreate(db: SQLiteDatabase?) {
        val createTable = "CREATE TABLE " + TABLENAMETRALOI + " (" + COL_IDBAITAPSOMOT + " INTEGER PRIMARY KEY AUTOINCREMENT," + COL_DAPAN + " INTERGER )"
        db?.execSQL(createTable)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
    }
    fun insertData(baitapmot: Databaisomot) {
        val database = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(COL_DAPAN, baitapmot.cautraloi)
        val result = database.insert(TABLENAMETRALOI, null, contentValues)
        if (result == (0).toLong()) {
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show()
        }
        else {
            Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
        }
    }
    fun getData(): MutableList<Databaisomot> {
        val list: MutableList<Databaisomot> = ArrayList()
        val db = this.readableDatabase
        val query = "Select * from $TABLENAMETRALOI"
        val result = db.rawQuery(query, null)
        if (result.moveToFirst()) {
            do {
                val databaitapsomot = Databaisomot()
                databaitapsomot.cautraloi = result.getInt(result.getColumnIndex(COL_DAPAN))
                list.add(databaitapsomot)
            }
            while (result.moveToNext())
        }
        return list
    }
    fun deleteAll() {
        val db = this.readableDatabase
        db?.execSQL("delete from "+ TABLENAMETRALOI)
        db?.close()


    }



}