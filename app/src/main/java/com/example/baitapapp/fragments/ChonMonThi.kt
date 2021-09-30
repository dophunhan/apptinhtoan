package com.example.baitapapp.fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.activity_chonmonthi.*
import kotlinx.android.synthetic.main.activity_chonmonthi.view.*

class ChonMonThi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chonmonthi)
    lambaitinhtoan.setOnClickListener {
        var intent = Intent (this,ChonMucDo::class.java)
        startActivity(intent)
    }
        lambaitienganh.setOnClickListener {
            var intent = Intent (this,ChonMucDo::class.java)
            startActivity(intent)
        }
        lambaitiengviet.setOnClickListener {
            var intent = Intent (this,ChonMucDo::class.java)
            startActivity(intent)
        }

    }
}