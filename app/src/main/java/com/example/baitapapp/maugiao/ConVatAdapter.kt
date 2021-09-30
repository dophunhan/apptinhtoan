package com.example.baitapapp.maugiao

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.itemconvat.view.*

class ConVatAdapter (var list : ArrayList<convat> , var clickconvat : onclickconvat) : RecyclerView.Adapter<ConVatAdapterHolder>() {
      interface onclickconvat {
        fun clickdoiconvat(position: Int)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConVatAdapterHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.itemconvat,parent,false)
        return ConVatAdapterHolder(view)

    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: ConVatAdapterHolder, position: Int) {
        holder.imageviewconvat.setImageResource(list[position].convat)
        holder.imageviewconvat.setOnClickListener {
            clickconvat.clickdoiconvat(position)
        }
    }
}



class ConVatAdapterHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
    var imageviewconvat = itemView.imageviewitemconvat

}
