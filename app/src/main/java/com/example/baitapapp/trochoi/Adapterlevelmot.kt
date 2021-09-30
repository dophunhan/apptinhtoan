package com.example.baitapapp.trochoi

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.itemlevelmot.view.*

class Adapterlevelmot(var list : ArrayList<levelconvat> , var click : onclicklevelmot , var context : Context ) : RecyclerView.Adapter<AdapterlevelmotViewHolder>() {
    open interface onclicklevelmot {
        fun clicklevelmot (position: Int)
    }
    var check = -1
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterlevelmotViewHolder {
      var view = LayoutInflater.from(parent.context).inflate(R.layout.itemlevelmot,parent,false)
    return AdapterlevelmotViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: AdapterlevelmotViewHolder, position: Int) {
        holder.backgrou.setImageResource(list[position].backgrou)
        holder.textview.text = list.get(position).tenconvat
        if(position==check)
        {
             holder.backgrou.setImageResource(R.drawable.backgroumauvang)
        }else
        {
            holder.backgrou.setImageResource(R.drawable.backgroumautrang)
        }
        holder.backgrou.setOnClickListener {
             holder.backgrou.setImageResource(R.drawable.backgroumauvang)
            check = position
            click.clicklevelmot(position)
            notifyDataSetChanged()
        }


    }
}



class AdapterlevelmotViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
var backgrou = itemView.imageconca
    var textview = itemView.textviewconca
}
