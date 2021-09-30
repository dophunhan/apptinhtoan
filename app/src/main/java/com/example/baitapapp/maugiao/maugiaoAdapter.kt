package com.example.baitapapp.maugiao

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.itemmaugiao.view.*

class maugiaoAdapter(var list : ArrayList<maugiao> , var context : MauGiaoActivity) : RecyclerView.Adapter<maugiaoadapterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): maugiaoadapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemmaugiao,parent,false)
        return maugiaoadapterViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: maugiaoadapterViewHolder, position: Int) {
        holder.imageView.setImageResource(list[position].ImageView)
        holder.imageView.setOnClickListener {
            if (position==0)
            {
                var intent = Intent(context,giaotiep::class.java)
                context.startActivity(intent)

            }else if (position==1)
            {
                var intent = Intent(context,SoDiemActivity::class.java)
                context.startActivity(intent)
            }else if(position==2)
            {
                var intent = Intent(context,ChuCaiActivity::class.java)
                context.startActivity(intent)
            }else if (position == 3 )
            {
                var intent = Intent(context,MausacActivity::class.java)
                context.startActivity(intent)
            }else if (position==4)
            {
                var intent = Intent(context,CacconvatActivity::class.java)
                context.startActivity(intent)
            }
        }
    }

}

class maugiaoadapterViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview) {
    var imageView = itemView.itemimage

}


