package com.example.baitapapp.danhsachbaitap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.baitapapp.R
import com.example.baitapapp.danhsachbaihoc.BaiTapAdapter
import kotlinx.android.synthetic.main.activity_bai_tap.*
import kotlinx.android.synthetic.main.activity_dang_ky.*
import kotlinx.android.synthetic.main.itembaitap.*

class BaiTapActivity : AppCompatActivity() {
    val list: MutableList<Databaitap> = ArrayList()
    var adapter: BaiTapAdapter? = null
    var data = DatabaseHelper(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai_tap)
        data.deleteAll()
        data.insertData(Databaitap(R.drawable.backgroubaitap,R.drawable.playbaitap,R.drawable.backgroudiembaitap,"bài tập 1",9))
        data.insertData(Databaitap(R.drawable.backgroubaitap,R.drawable.playbaitap,R.drawable.backgroudiembaitap,"bài tập 2",5))
        data.insertData(Databaitap(R.drawable.backgroubaitap,R.drawable.playbaitap,R.drawable.backgroudiembaitap,"bài tập 3",6))
        data.insertData(Databaitap(R.drawable.backgroubaitap,R.drawable.playbaitap,R.drawable.backgroudiembaitap,"bài tập 4",7))
        title = "KotlinApp"
        list.addAll(data.getData())

        recyclerviewbaitap.layoutManager = LinearLayoutManager(this)
        adapter = BaiTapAdapter(list, this, object : BaiTapAdapter.xulionclick {
            override fun xuliOnclick(position: Int){
                var intent = Intent(this@BaiTapActivity, Danhsachbaitapsomot::class.java)
                intent.putExtra("baitap1" , list.get(position).name)
                startActivity(intent)


            }
        })
        recyclerviewbaitap.adapter = adapter

    }

}

