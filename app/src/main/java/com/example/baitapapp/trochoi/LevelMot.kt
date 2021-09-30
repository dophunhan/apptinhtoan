package com.example.baitapapp.trochoi

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.core.graphics.toColorInt
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.activity_level_mot.*

class LevelMot : AppCompatActivity() {
    var list = ArrayList<levelconvat>()
    var adapter : Adapterlevelmot? = null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level_mot)
        list.add(0,levelconvat(R.drawable.backgroumautrang,"Con cá"))
        list.add(1,levelconvat(R.drawable.backgroumautrang,"Con cua"))
        list.add(2,levelconvat(R.drawable.backgroumautrang,"Con mực"))
        list.add(3,levelconvat(R.drawable.backgroumautrang,"Con chim"))


      recyclerviewlevelmot?.layoutManager = GridLayoutManager(this , 2 , RecyclerView.VERTICAL ,false)
        adapter = Adapterlevelmot(list,object : Adapterlevelmot.onclicklevelmot{
            override fun clicklevelmot(position: Int) {
              traloilevel1.setOnClickListener {
                  if(position==0)
                  {
                      Toast.makeText(this@LevelMot,"Bạn đã chọn đúng",Toast.LENGTH_SHORT).show()
                      var intent = Intent (this@LevelMot, LevelHai::class.java)
                      startActivity(intent)
                  }else{
                      Toast.makeText(this@LevelMot,"Bạn đã chọn ssss",Toast.LENGTH_SHORT).show()

                  }


              }
                
            }
        },this)
        recyclerviewlevelmot?.adapter = adapter

    }
}
