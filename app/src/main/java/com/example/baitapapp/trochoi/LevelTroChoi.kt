package com.example.baitapapp.trochoi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.baitapapp.R

class LevelTroChoi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level_tro_choi)
        var levelmot = findViewById<ImageView>(R.id.levelmot)
        var levelhai = findViewById<ImageView>(R.id.levelhai)
        var levelba = findViewById<ImageView>(R.id.levelba)
        var levelbon = findViewById<ImageView>(R.id.levelbon)
        levelmot.setOnClickListener {
            var intent = Intent (this,LevelMot ::class.java)
            startActivity(intent)
        }
        levelhai.setOnClickListener {
            var intent = Intent(this , LevelHai ::class.java)
            startActivity(intent)
        }
        levelba.setOnClickListener {
            var intent = Intent(this , LevelBa ::class.java)
            startActivity(intent)
        }
        levelbon.setOnClickListener {
            var intent = Intent (this , LevelBon ::class.java)
            startActivity(intent)
        }
    }
}
