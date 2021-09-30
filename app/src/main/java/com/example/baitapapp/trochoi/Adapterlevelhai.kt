package com.example.baitapapp.trochoi

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.itemlevelhai.view.*

class Adapterlevelhai (var list: ArrayList<leveltraicay> , var onclicktraicay : clicktraicay , var context: LevelHai) : RecyclerView.Adapter<AdapterlevelhaiViewHolder>() {
    open interface clicktraicay {
        fun xulyinterface(position: Int)
    }
    var check = -1
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterlevelhaiViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemlevelhai,parent,false)
        return AdapterlevelhaiViewHolder(view)

    }

    override fun getItemCount(): Int {
        return list.size

    }

    override fun onBindViewHolder(holder: AdapterlevelhaiViewHolder, position: Int) {
        holder.imageloaiqua.setImageResource(list[position].loaiqua)
        holder.backgrouloaiqua.setImageResource(list[position].backgrou)
        if(position==check)
        {
            holder.backgrouloaiqua.setImageResource(R.drawable.vienmaudocuaquatao)
        }else
        {
            holder.backgrouloaiqua.setImageResource(R.drawable.backgrouquataodo)
        }

        holder.backgrouloaiqua.setOnClickListener {
            holder.backgrouloaiqua.setImageResource(R.drawable.vienmaudocuaquatao)
            check = position
            onclicktraicay.xulyinterface(position)
            notifyDataSetChanged()
        }
    }
}

class AdapterlevelhaiViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var backgrouloaiqua = itemView.backgroulevelhai
    var imageloaiqua = itemView.tenloaiqua
}
