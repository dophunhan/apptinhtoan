package com.example.baitapapp.maugiao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import com.example.baitapapp.fragments.CaNhanFragment
import com.example.baitapapp.fragments.DoiQuaFragment
import com.example.baitapapp.fragments.HomeBlankFragment
import com.example.baitapapp.fragments.MoRongFragment
import kotlinx.android.synthetic.main.activity_chonlophoc.*

class MauGiaoActivity : AppCompatActivity() {
    var list = ArrayList<maugiao>()
    var adapter: maugiaoAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mau_giao)
        var recyc = findViewById<RecyclerView>(R.id.recyclerviewmaugiao)
        list.add(0, maugiao(R.drawable.giaotiep))
        list.add(1, maugiao(R.drawable.sodiem))
        list.add(2, maugiao(R.drawable.chucai))
        list.add(3, maugiao(R.drawable.mausac))
        list.add(4, maugiao(R.drawable.convat))
        list.add(5, maugiao(R.drawable.hinhdang))
        list.add(6, maugiao(R.drawable.hoala))
        list.add(7, maugiao(R.drawable.dovat))
        list.add(8, maugiao(R.drawable.cothe))
        list.add(9, maugiao(R.drawable.phuongtien))
        list.add(10, maugiao(R.drawable.traicay))


        recyc.layoutManager = LinearLayoutManager(this)
        adapter = maugiaoAdapter(list, this)
        recyc.adapter = adapter

    }
}
