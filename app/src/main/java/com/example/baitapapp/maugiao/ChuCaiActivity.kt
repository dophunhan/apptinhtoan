package com.example.baitapapp.maugiao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R

class ChuCaiActivity : AppCompatActivity() {
    var list = ArrayList<chucai>()
    var adapter : chucaiAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chucai)
        var recycchucai = findViewById<RecyclerView>(R.id.recyclerviewchucai)
        var textviewchucai = findViewById<TextView>(R.id.textviewchucai)
        list.add(0,chucai(R.drawable.vectorchucai,"A"))
        list.add(1,chucai(R.drawable.vectorchucai,"Ă"))
        list.add(2,chucai(R.drawable.vectorchucai,"Â"))
        list.add(3,chucai(R.drawable.vectorchucai,"B"))
        list.add(4,chucai(R.drawable.vectorchucai,"C"))
        list.add(5,chucai(R.drawable.vectorchucai,"D"))
        list.add(6,chucai(R.drawable.vectorchucai,"Đ"))
        list.add(7,chucai(R.drawable.vectorchucai,"E"))
        list.add(8,chucai(R.drawable.vectorchucai,"Ê"))
        list.add(9,chucai(R.drawable.vectorchucai,"G"))
        list.add(10,chucai(R.drawable.vectorchucai,"H"))
        list.add(11,chucai(R.drawable.vectorchucai,"I"))
        list.add(12,chucai(R.drawable.vectorchucai,"K"))
        list.add(13,chucai(R.drawable.vectorchucai,"L"))
        list.add(14,chucai(R.drawable.vectorchucai,"M"))
        list.add(15,chucai(R.drawable.vectorchucai,"N"))
        list.add(16,chucai(R.drawable.vectorchucai,"O"))
        list.add(17,chucai(R.drawable.vectorchucai,"Ô"))
        list.add(18,chucai(R.drawable.vectorchucai,"Ơ"))
        list.add(19,chucai(R.drawable.vectorchucai,"P"))
        list.add(20,chucai(R.drawable.vectorchucai,"Q"))
        list.add(21,chucai(R.drawable.vectorchucai,"R"))
        list.add(22,chucai(R.drawable.vectorchucai,"S"))
        list.add(23,chucai(R.drawable.vectorchucai,"T"))
        list.add(24,chucai(R.drawable.vectorchucai,"U"))
        list.add(25,chucai(R.drawable.vectorchucai,"Ư"))
        list.add(26,chucai(R.drawable.vectorchucai,"V"))
        list.add(27,chucai(R.drawable.vectorchucai,"X"))
        list.add(28,chucai(R.drawable.vectorchucai,"V"))

        recycchucai?.layoutManager = GridLayoutManager(this,5,RecyclerView.VERTICAL,false)
        adapter = chucaiAdapter(list,object : chucaiAdapter.kichchucai{
            override fun clickchucain(position: Int) {
                textviewchucai.text = list.get(position).chucai
            }

        })
        recycchucai?.adapter = adapter
    }
}
