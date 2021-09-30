package com.example.baitapapp.danhsachbaihoc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.baitapapp.R
import com.example.baitapapp.danhsachbaitap.BaiTapActivity
import com.example.baitapapp.trochoi.LevelTroChoi
import kotlinx.android.synthetic.main.activity_cac_dang_ba_tapactivity.*

class CacDangBaTap : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cac_dang_ba_tapactivity)
        var buttonve = findViewById<ImageView>(R.id.imageluivecacdangbaitap)

        var btnbaihoc = findViewById<ImageView>(R.id.baihoccacdangbaitap)
        var btntrochoi = findViewById<ImageView>(R.id.trochoi)
        btnbaihoc.setOnClickListener {
            var intent = Intent (this , DanhSachBaiHocActivity::class.java)
            startActivity(intent)

        }
        btntrochoi.setOnClickListener {
            var intent = Intent (this , LevelTroChoi :: class.java)
            startActivity(intent)
        }
        baitap.setOnClickListener {
            var intent = Intent (this, BaiTapActivity::class.java)
            startActivity(intent)
        }
        buttonve.setOnClickListener {
            finish()
        }
        
    }
}
