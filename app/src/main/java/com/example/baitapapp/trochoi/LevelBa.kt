package com.example.baitapapp.trochoi

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.*
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.activity_level_ba.*

class LevelBa  : AppCompatActivity() {
    var list = ArrayList<levelbar>()
    var adapter : Adapterlevelba ?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level_ba)
        list.add(0, levelbar(R.drawable.backgroulevel1,"<"))
        list.add(1, levelbar(R.drawable.backgroulevel1,">"))
        list.add(2, levelbar(R.drawable.backgroulevel1,"="))
        list.add(3, levelbar(R.drawable.backgroulevel1,""))
        recyclerviewlevelba?.layoutManager = GridLayoutManager(this,2,RecyclerView.VERTICAL,false)
        adapter = Adapterlevelba(list,object : Adapterlevelba.Clicklevelba{
            override fun onclicklevelba(position: Int) {
               textviewxacnhandungsai.text = list.get(position).ten

                traloilevel3.setOnClickListener {
                    if ( textviewxacnhandungsai.text == list.get(2).ten )
                    {
                        Toast.makeText(this@LevelBa, " Bạn đã trả lời đúng ",Toast.LENGTH_SHORT).show()

                        var intent = Intent (this@LevelBa,LevelBon::class.java)
                        startActivity(intent)

                    } else {
                        Toast.makeText(this@LevelBa, " Bạn đã trả lời sai mời bạn chọn lại ",Toast.LENGTH_SHORT).show()
                    }
                }
            }

        },this)
        recyclerviewlevelba?.adapter = adapter


    }
}
