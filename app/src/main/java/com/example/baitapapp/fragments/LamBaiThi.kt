package com.example.baitapapp.fragments

import  android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.SystemClock
import android.view.LayoutInflater
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.activity_lam_bai_thi.*
import kotlinx.android.synthetic.main.itemlambaithi.*
import java.util.*
import kotlin.collections.ArrayList

class LamBaiThi : AppCompatActivity() {
    var list = ArrayList<classlambaithi>()
    var adapter: Adapterlambaithi? = null

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lam_bai_thi)
        view_timer.isCountDown = true
        view_timer.base = SystemClock.elapsedRealtime() + 300000
        view_timer.start()
        list.add(
            0, classlambaithi(
                R.drawable.backroulambaithi,
                "1 . Câu hỏi thứ nhất điền vào chỗ trống...", R.drawable.backgroudapanbaithi,
                R.drawable.backgroudapanbaithi,
                R.drawable.backgroudapanbaithi,
                R.drawable.backgroudapanbaithi,
                "a . Đáp án thứ nhất",
                "b . Đáp án thứ hai",
                "c . Đáp án thứ ba",
                "d . Đáp án thứ tư"
            )

        )
        list.add(
            1, classlambaithi(
                R.drawable.backroulambaithi,
                "2 . Câu hỏi thứ nhất điền vào chỗ trống...", R.drawable.backgroudapanbaithi, R.drawable.backgroudapanbaithi, R.drawable.backgroudapanbaithi, R.drawable.backgroudapanbaithi,
                "a . Đáp án thứ nhất",
                "b . Đáp án thứ hai",
                "c . Đáp án thứ ba",
                "d . Đáp án thứ tư"
            )

        )
        recyclerviewlambaithi?.layoutManager = LinearLayoutManager(this)
        adapter = Adapterlambaithi(list,object : Adapterlambaithi.xylynopbaithi{
            override fun xylydapanlambaithi(p1: Int) {
               nopbaithi.setOnClickListener {

               }

            }

        })
        recyclerviewlambaithi?.adapter = adapter



    }

}