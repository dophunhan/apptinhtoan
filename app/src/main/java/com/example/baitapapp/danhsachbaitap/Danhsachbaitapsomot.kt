package com.example.baitapapp.danhsachbaitap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import com.example.baitapapp.danhsachbaihoc.Adapterdanhsachbaihocsomot
import com.example.baitapapp.fragments.ChonMucDo
import kotlinx.android.synthetic.main.activity_danhsachbaitapsomot.*
import kotlinx.android.synthetic.main.itemdiglog.*

class Danhsachbaitapsomot : AppCompatActivity() {
    var list : MutableList<Databaisomot> = ArrayList()
    var adapter: Adapterdanhsachbaihocsomot? = null
    var datatraloi = Databasehelperbaitapsomot(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_danhsachbaitapsomot)
        var invalue = intent.getStringExtra("baitap1")
        Log.d("sss", "onCreate: "+invalue)
        datatraloi.insertData(Databaisomot(R.drawable.backgroudapanbaithi,25))
        datatraloi.insertData(Databaisomot(R.drawable.backgroudapanbaithi,35))
        datatraloi.insertData(Databaisomot(R.drawable.backgroudapanbaithi,45))
        datatraloi.insertData(Databaisomot(R.drawable.backgroudapanbaithi,30))
        list.addAll(datatraloi.getData())

        recyclerviewdanhsachbaitapsomot.layoutManager =
            GridLayoutManager(this, 2, RecyclerView.VERTICAL, false)
        adapter = Adapterdanhsachbaihocsomot(list,
            object : Adapterdanhsachbaihocsomot.clickdanhsachbaitapmot {
                override fun xyludanhsachbaitapmot(p1: Int) {


//                        if (p1 == 2) {
//                            Toast.makeText(
//                                this@Danhsachbaitapsomot,
//                                "bạn đã trả lời đúng",
//                                Toast.LENGTH_SHORT
//                            ).show()
//                            var dialog = Dialogdanhsachbaitapmottraloidung()
//                            dialog.show(supportFragmentManager,"customdialog")
//
//
//
//                        } else {
//                            Toast.makeText(
//                                this@Danhsachbaitapsomot,
//                                "bạn đã trả lời Sai",
//                                Toast.LENGTH_SHORT
//                            ).show()
//                            var dialogtraloisai = Dialogdanhsachbaitaptraloisai()
//                            dialogtraloisai.show(supportFragmentManager,"customdialog")
//
//                        }
                    }


            })
        recyclerviewdanhsachbaitapsomot.adapter = adapter
//     traloicauhoidanhsachbaitapsomot.setOnClickListener {
//         var dialog = Dialogdanhsachbaitapmot()
//         dialog.show(supportFragmentManager,"customDialog")
//     }

    }
}