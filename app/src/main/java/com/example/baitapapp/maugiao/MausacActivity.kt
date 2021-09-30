package com.example.baitapapp.maugiao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.graphics.drawable.toDrawable
import androidx.core.graphics.toColorInt
import androidx.core.view.get
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import com.example.baitapapp.maugiao.mausacAdapter.onclickmausac
import kotlinx.android.synthetic.main.activity_mausac.*
import androidx.core.graphics.drawable.toDrawable as toDrawable1

class MausacActivity : AppCompatActivity() {
    var adapter : mausacAdapter? = null
    var list = ArrayList<mausac>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mausac)
        var clickdoimaubackgrou = findViewById<ImageView>(R.id.backgroumausac)

        list.add(mausac(R.drawable.maudo))
        list.add(mausac(R.drawable.maucam))
        list.add(mausac(R.drawable.mauvang))
        list.add(mausac(R.drawable.mauxanhchuoi))
        list.add(mausac(R.drawable.mauxanhbien))
        list.add(mausac(R.drawable.mauxanhdatroi))
        list.add(mausac(R.drawable.mautim))
        list.add(mausac(R.drawable.mauhong))
        list.add(mausac(R.drawable.mautrang))
        list.add(mausac(R.drawable.mauxam))
        list.add(mausac(R.drawable.mauda))
        list.add(mausac(R.drawable.mauden))
        recyclerviewmausac?.layoutManager = GridLayoutManager(this,3,RecyclerView.VERTICAL,false) as RecyclerView.LayoutManager?
       adapter = mausacAdapter(list,object : mausacAdapter.onclickmausac{
           override fun clickdoimau(position: Int) {
             clickdoimaubackgrou.setImageResource(list.get(position).ten)
               if(position==0)
               {
                   textviewmausac.text = "Màu đỏ"
               }else if (position==1)
               {
                   textviewmausac.text = "Màu cam "
               }
               else if (position==2)
               {
                   textviewmausac.text = "Màu vàng "
               }
               else if (position==3)
               {
                   textviewmausac.text = "Màu xanh lá "
               }
               else if (position==4)
               {
                   textviewmausac.text = "Màu nước biển "
               }else if (position==5)
               {
                   textviewmausac.text = "Màu xanh da trời "
               }
               else if (position==6)
               {
                   textviewmausac.text = "Màu tím "
               }
               else if (position==7)
               {
                   textviewmausac.text = "Màu hồng "
               }
               else if (position==8)
               {
                   textviewmausac.text = "màu trắng "
               }
               else if (position==9)
               {
                   textviewmausac.text = "Màu xám "
               }else if (position==10)
               {
                   textviewmausac.text = "Màu đà "
               }
               else if (position==11)
               {
                   textviewmausac.text = "Màu đen "
               }

           }
       })
        recyclerviewmausac?.adapter = adapter

    }
}
