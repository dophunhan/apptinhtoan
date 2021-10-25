package com.example.baitapapp.fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.activity_dang_ky.*
import kotlin.random.Random

class DangKy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dang_ky)
        title = "KotlinApp"
        val db = DbHelper(this)
        Log.d("sss", "onCreate: " + db.getData())
        btndangkytk.setOnClickListener {
            if (Editname.text.toString().isNotEmpty() &&
                Editmk.text.toString().isNotEmpty() &&
                Editnhaplaimk.text.toString().isNotEmpty() &&
                Editemail.text.toString().isNotEmpty()
            ) {
                val user = User(
                    Editname.text.toString(),
                    Editmk.text.toString(),
                    Editnhaplaimk.text.toString(),
                    Editemail.text.toString()
                )
                db.insertData(user)
                clearField()
                var intent = Intent(this@DangKy, DangNhap::class.java)
                startActivity(intent)
                Toast.makeText(this, " Bạn đã đăng ký thành thông ", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please Fill All Data's", Toast.LENGTH_SHORT).show()
            }
        }
//        btnread.setOnClickListener {
//            val data = db.readData()
//            tvResult.text = ""
//            for (i in 0 until data.size) {
//                tvResult.append(
//                    data[i].id.toString() + " " + data[i].name + " " + data[i].age + "\n"
//                )
//            }
//        }
    }

    private fun clearField() {
        Editname.text.clear()
        Editmk.text.clear()
        Editnhaplaimk.text.clear()
        Editemail.text.clear()

    }


}
