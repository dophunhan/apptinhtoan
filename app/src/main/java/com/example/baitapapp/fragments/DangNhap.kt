package com.example.baitapapp.fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.activity_dang_nhap.*

class DangNhap : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dang_nhap)
       txtquenmatkhau.setOnClickListener {
           var intent = Intent (this,QuenMatKhau::class.java)
           startActivity(intent)
       }
    }
}