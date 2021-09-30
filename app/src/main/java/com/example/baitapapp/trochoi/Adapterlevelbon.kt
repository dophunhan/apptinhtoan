package com.example.baitapapp.trochoi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.itemlevelbon.view.*

class Adapterlevelbon (var list: ArrayList<levelbonc>) : RecyclerView.Adapter<levelbonViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): levelbonViewHolder {
        var v = LayoutInflater.from(p0.context).inflate(R.layout.itemlevelbon,p0,false)
        return levelbonViewHolder(v)

    }

    override fun onBindViewHolder(p0: levelbonViewHolder, p1: Int) {
        p0.bgrou.setImageResource(list[p1].backgr)
        p0.txtabc.text = list.get(p1).abc
        p0.text.text = list.get(p1).textv
    }

    override fun getItemCount(): Int {
        return list.size
    }
}

class levelbonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var bgrou = itemView.backgroudlevel4
    var txtabc = itemView.textviewabc
    var text = itemView.textviewlevel4

}
