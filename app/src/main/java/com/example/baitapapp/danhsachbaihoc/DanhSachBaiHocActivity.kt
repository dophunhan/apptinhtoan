package com.example.baitapapp.danhsachbaihoc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.activity_danh_sach_bai_hoc.*

class DanhSachBaiHocActivity : AppCompatActivity() {
    var list = ArrayList<danhsachbaihoc>()
    var adapter : cacdangbaitapadapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_danh_sach_bai_hoc)
        list.add(danhsachbaihoc(R.drawable.chammauxanhcacdangbaitap,R.drawable.vectocacdangbaitap,R.drawable.hinhtronsomot,"1", "Bài số 1", "đã đọc"))
        list.add(danhsachbaihoc(R.drawable.chammauxanhcacdangbaitap,R.drawable.vectocacdangbaitap,R.drawable.hinhtronsohai,"2", "Bài số 2", "đã đọc"))
        list.add(danhsachbaihoc(R.drawable.chammauxanhcacdangbaitap,R.drawable.vectocacdangbaitap,R.drawable.hinhtronsoba,"3", "Bài số 3", "đã đọc"))
        list.add(danhsachbaihoc(R.drawable.chammauxanhcacdangbaitap,R.drawable.vectocacdangbaitap,R.drawable.hinhtronsobon,"4", "Bài số 4", "đã đọc"))
        list.add(danhsachbaihoc(R.drawable.chammauxanhcacdangbaitap,R.drawable.vectocacdangbaitap,R.drawable.hinhtronsonam,"5", "Bài số 5", "đã đọc"))
        list.add(danhsachbaihoc(R.drawable.chammauxanhcacdangbaitap,R.drawable.vectocacdangbaitap,R.drawable.hinhtronsosau,"6", "Bài số 6", "đã đọc"))
        list.add(danhsachbaihoc(R.drawable.chammauxanhcacdangbaitap,R.drawable.vectocacdangbaitap,R.drawable.hinhtronsobay,"7", "Bài số 7", "đã đọc"))
        list.add(danhsachbaihoc(R.drawable.chammauxanhcacdangbaitap,R.drawable.vectocacdangbaitap,R.drawable.hinhtronsotam,"8", "Bài số 8", "đã đọc"))

        recyclerviewdanhsachbaihoc?.layoutManager = LinearLayoutManager(this)
        adapter = cacdangbaitapadapter(list)
        recyclerviewdanhsachbaihoc?.adapter = adapter

    }
}
