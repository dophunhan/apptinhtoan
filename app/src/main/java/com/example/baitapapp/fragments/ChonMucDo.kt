package com.example.baitapapp.fragments

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.SystemClock
import androidx.annotation.RequiresApi
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.activity_chon_muc_do.*

class ChonMucDo : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chon_muc_do)
        dongho.isCountDown = true
        dongho.base = SystemClock.elapsedRealtime() + 20000
        dongho.start()

    }
}