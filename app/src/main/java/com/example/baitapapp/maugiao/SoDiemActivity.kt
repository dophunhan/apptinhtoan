package com.example.baitapapp.maugiao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.activity_sodiem.*
import kotlinx.android.synthetic.main.itemsodiem.*

class SoDiemActivity : AppCompatActivity() {
    var adapter : sodiemAdapter?= null
    var list = ArrayList<sodiem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sodiem)
        var recycsodiem = findViewById<RecyclerView>(R.id.recyclerviewsodiem)
        var chusoimage = findViewById<TextView>(R.id.textviewchuso)
        list.add(0, sodiem(1,R.drawable.vecto))
        list.add(1,sodiem(2,R.drawable.vecto))
        list.add(2,sodiem(3,R.drawable.vecto))
        list.add(3,sodiem(4,R.drawable.vecto))
        list.add(4,sodiem(5,R.drawable.vecto))
        list.add(5,sodiem(6,R.drawable.vecto))
        list.add(6,sodiem(7,R.drawable.vecto))
        list.add(7,sodiem(8,R.drawable.vecto))
        list.add(8,sodiem(9,R.drawable.vecto))


        list.add(9, sodiem(0,R.drawable.vecto))
        recycsodiem?.layoutManager = GridLayoutManager(this,3,RecyclerView.VERTICAL,false)
        adapter = sodiemAdapter(list,this,object : sodiemAdapter.onclick{
            override fun click(position: Int) {
                  textviewchuso.text = list.get(position).chuso.toString()


                }

        })
        recycsodiem?.adapter = adapter
    }

}
