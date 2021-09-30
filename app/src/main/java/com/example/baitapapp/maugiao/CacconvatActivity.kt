package com.example.baitapapp.maugiao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.activity_cacconvat.*

class CacconvatActivity : AppCompatActivity() {
    var list = ArrayList<convat>()
    var adapter : ConVatAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cacconvat)
        list.add(0, convat(R.drawable.concho))
        list.add(1,convat(R.drawable.conmeo))
        list.add(2,convat(R.drawable.conga))
        list.add(3,convat(R.drawable.conbo))
        list.add(4,convat(R.drawable.contrau))
        list.add(5,convat(R.drawable.conheo))
        list.add(6,convat(R.drawable.consutu))
        list.add(7,convat(R.drawable.contho))
        list.add(8,convat(R.drawable.bosua))
        recyclerviewcacconvat?.layoutManager = GridLayoutManager(this,3,RecyclerView.VERTICAL,false)
        adapter = ConVatAdapter(list,object : ConVatAdapter.onclickconvat{
            override fun clickdoiconvat(position: Int) {
                backgrouconvat.setImageResource(list.get(position).convat)
                if (position==0)
                {
                    textviewconvat.text = "Con chó"
                }else if (position==1)
                {
                    textviewconvat.text = "Con mèo"
                }else if (position==2)
                {
                    textviewconvat.text = "Con gà"
                }else if (position==3)
                {
                    textviewconvat.text = "Con bò"
                }
                else if (position==4)
                {
                    textviewconvat.text = "Con trâu"
                }else if (position==5)
                {
                    textviewconvat.text = "Con lợn"
                }
                else if (position==6)
                {
                    textviewconvat.text = "Con sư tử"
                }else if (position==7)
                {
                    textviewconvat.text = "Con thỏ"
                }
                else if (position==8)
                {
                    textviewconvat.text = "Con bò sữa"
                }
            }

        })
        recyclerviewcacconvat?.adapter = adapter
    }
}
