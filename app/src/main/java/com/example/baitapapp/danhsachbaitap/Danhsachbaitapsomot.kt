package com.example.baitapapp.danhsachbaitap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import com.example.baitapapp.danhsachbaihoc.Adapterdanhsachbaihocsomot
import kotlinx.android.synthetic.main.activity_danhsachbaitapsomot.*
import kotlinx.android.synthetic.main.itemdiglog.*

class Danhsachbaitapsomot : AppCompatActivity() {
    var list = ArrayList<classdanhsachbaisomot>()
    var adapter: Adapterdanhsachbaihocsomot? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_danhsachbaitapsomot)
        list.add(0, classdanhsachbaisomot(R.drawable.backgrodtraloidanhsachbaitap, "30"))
        list.add(0, classdanhsachbaisomot(R.drawable.backgrodtraloidanhsachbaitap, "35"))
        list.add(0, classdanhsachbaisomot(R.drawable.backgrodtraloidanhsachbaitap, "45"))
        list.add(0, classdanhsachbaisomot(R.drawable.backgrodtraloidanhsachbaitap, "55"))
        recyclerviewdanhsachbaitapsomot.layoutManager =
            GridLayoutManager(this, 2, RecyclerView.VERTICAL, false)
        adapter = Adapterdanhsachbaihocsomot(list,
            object : Adapterdanhsachbaihocsomot.clickdanhsachbaitapmot {
                override fun xyludanhsachbaitapmot(p1: Int) {
                    traloicauhoidanhsachbaitapsomot.setOnClickListener {
                        if (p1 == 2) {
                            Toast.makeText(
                                this@Danhsachbaitapsomot,
                                "bạn đã trả lời đúng",
                                Toast.LENGTH_SHORT
                            ).show()
                            var dialog = Dialogdanhsachbaitapmottraloidung()
                            dialog.show(supportFragmentManager,"customdialog")


                        } else {
                            Toast.makeText(
                                this@Danhsachbaitapsomot,
                                "bạn đã trả lời Sai",
                                Toast.LENGTH_SHORT
                            ).show()
                            var dialogtraloisai = Dialogdanhsachbaitaptraloisai()
                            dialogtraloisai.show(supportFragmentManager,"customdialog")

                        }
                    }
                }

            })
        recyclerviewdanhsachbaitapsomot.adapter = adapter
//     traloicauhoidanhsachbaitapsomot.setOnClickListener {
//         var dialog = Dialogdanhsachbaitapmot()
//         dialog.show(supportFragmentManager,"customDialog")
//     }

    }
}