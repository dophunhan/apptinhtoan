package com.example.baitapapp.danhsachbaitap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.baitapapp.R
import com.example.baitapapp.danhsachbaihoc.BaiTapAdapter
import kotlinx.android.synthetic.main.activity_bai_tap.*
import kotlinx.android.synthetic.main.itembaitap.*

class BaiTapActivity : AppCompatActivity() {
    var list = ArrayList<BaiTap>()
    var adapter : BaiTapAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai_tap)
        list.add(BaiTap(R.drawable.backgroubaitap,R.drawable.playbaitap,R.drawable.backgroudiembaitap,"Bai tập 1 ","9 điểm"))
        list.add(BaiTap(R.drawable.backgroubaitap,R.drawable.playbaitap,R.drawable.backgroudiembaitap,"Bai tập 2 ","10 điểm"))
        list.add(BaiTap(R.drawable.backgroubaitap,R.drawable.playbaitap,R.drawable.backgroudiembaitap,"Bai tập 3 ","9 điểm"))
        list.add(BaiTap(R.drawable.backgroubaitap,R.drawable.playbaitap,R.drawable.backgroudiembaitap,"Bai tập 4 ","9 điểm"))
        recyclerviewbaitap.layoutManager = LinearLayoutManager(this)
        adapter = BaiTapAdapter(list,this)

        recyclerviewbaitap.adapter = adapter

    }
}
