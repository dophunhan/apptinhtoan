package com.example.baitapapp.trochoi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.activity_level_hai.*

class LevelHai : AppCompatActivity() {
    var list = ArrayList<leveltraicay>()
    var adapter: Adapterlevelhai? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level_hai)

        list.add(0, leveltraicay(R.drawable.backgrouquataodo, R.drawable.quatao))
        list.add(1, leveltraicay(R.drawable.backgrouquataodo, R.drawable.qualecovien))
        list.add(2, leveltraicay(R.drawable.backgrouquataodo, R.drawable.quaduahau))
        list.add(3, leveltraicay(R.drawable.backgrouquataodo, R.drawable.quacam))
        recyclerviewloaiqua?.layoutManager =
            GridLayoutManager(this, 2, RecyclerView.VERTICAL, false)
        adapter = Adapterlevelhai(list, object : Adapterlevelhai.clicktraicay {
            override fun xulyinterface(position: Int) {
                traloilevel2.setOnClickListener {
                    if (position == 3) {

                        Toast.makeText(this@LevelHai, "Bạn đã chọn đúng", Toast.LENGTH_SHORT).show()
                        var intent = Intent(this@LevelHai, LevelBa::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this@LevelHai, "Sai rồi", Toast.LENGTH_SHORT).show()

                    }

                }
            }


        }, this)
        recyclerviewloaiqua?.adapter = adapter


    }
}
