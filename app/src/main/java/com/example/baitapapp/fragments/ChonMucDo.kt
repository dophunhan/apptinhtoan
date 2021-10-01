package com.example.baitapapp.fragments

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.SystemClock
import android.util.Log
import androidx.annotation.RequiresApi
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.activity_chon_muc_do.*
import kotlinx.coroutines.*

class ChonMucDo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chon_muc_do)

        mucdode.setOnClickListener {
            var intent = Intent (this,LamBaiThi::class.java)
            startActivity(intent)
        }

    }




}




