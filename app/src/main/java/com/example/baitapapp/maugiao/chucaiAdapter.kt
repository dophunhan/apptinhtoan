package com.example.baitapapp.maugiao

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.itemchucai.view.*

class chucaiAdapter(var list : ArrayList<chucai> , var clickchucai : kichchucai) : RecyclerView.Adapter<chucaiAdapterViewHolder>() {
   var check : Int = -1
    open interface kichchucai {
        fun clickchucain(position: Int)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): chucaiAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemchucai,parent,false)
        return chucaiAdapterViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: chucaiAdapterViewHolder, position: Int) {

        holder.textview.text = list[position].chucai
        if (check==position)
        {
            holder.imageView.setImageResource(R.drawable.vectovang)
        }else
        {
            holder.imageView.setImageResource(R.drawable.vectorchucai)
        }
        holder.imageView.setOnClickListener {
            clickchucai.clickchucain(position)
            holder.imageView.setImageResource(R.drawable.vectovang)
            check = position
            notifyDataSetChanged()
        }
    }
}



class chucaiAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var imageView = itemView.imagechucai
    var textview = itemView.textviewchucai

}
