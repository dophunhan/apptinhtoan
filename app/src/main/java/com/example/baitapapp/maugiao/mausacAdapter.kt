package com.example.baitapapp.maugiao

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.itemmausac.view.*

class mausacAdapter(var list : ArrayList<mausac> , var clickmausac : onclickmausac) : RecyclerView.Adapter<mausacAdapterViewHolder>() {
    open interface onclickmausac {
        fun clickdoimau (position: Int)


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): mausacAdapterViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.itemmausac,parent,false)
        return mausacAdapterViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size

    }

    override fun onBindViewHolder(holder: mausacAdapterViewHolder, position: Int) {
        holder.imageview.setImageResource(list[position].ten)
        holder.imageview.setOnClickListener {
            clickmausac.clickdoimau(position)
        }
    }
}



class mausacAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var imageview = itemView.imageviewmau
}
