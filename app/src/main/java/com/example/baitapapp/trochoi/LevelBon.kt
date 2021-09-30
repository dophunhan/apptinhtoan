package com.example.baitapapp.trochoi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.activity_level_bon.*

class LevelBon : AppCompatActivity() {
    var list = ArrayList<levelbonc>()
    var adapter : Adapterlevelbon ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level_bon)
        list.add(0, levelbonc(R.drawable.vectobackgroulevel4,"a .", " quả chuối"))
        list.add(0, levelbonc(R.drawable.vectobackgroulevel4,"b .", " quả khế"))
        list.add(0, levelbonc(R.drawable.vectobackgroulevel4,"c .", " quả chanh"))
        recyclerviewlevelbon.layoutManager = LinearLayoutManager(this)
        adapter = Adapterlevelbon(list)
        recyclerviewlevelbon.adapter = adapter



    }
}
