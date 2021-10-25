package com.example.baitapapp.fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.baitapapp.ChonLopHocActivity
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.activity_dang_nhap.*
import kotlinx.android.synthetic.main.fragment_ca_nhan2.*

class DangNhap : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dang_nhap)
        var getdata = DbHelper(this)
       txtquenmatkhau.setOnClickListener {
           var intent = Intent (this,QuenMatKhau::class.java)
           startActivity(intent)
       }

        btndangnhaptaikhoan.setOnClickListener {
            getdata.getData().forEach(){
                if (it.name.equals(edittendangnhap.text.toString())&& it.matKhau.equals(editmatkhaudangnhap.text.toString()))
                {
                    var intent = Intent (this,ChonLopHocActivity::class.java)
                    startActivity(intent)
                }else {
                    Toast.makeText(this,"Nhập Lại",Toast.LENGTH_SHORT).show()
                }
            }

        }


    }
}