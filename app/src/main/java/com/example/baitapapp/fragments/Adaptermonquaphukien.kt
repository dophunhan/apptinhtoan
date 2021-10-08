package com.example.baitapapp.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.itemdoiquahoctap.view.*

class Adaptermonquaphukien(var listphukien : ArrayList<classdoiquaphukien>) : RecyclerView.Adapter<monquaphukienViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): monquaphukienViewHolder {
        var v = LayoutInflater.from(p0.context).inflate(R.layout.itemdoiquatrochoi,p0,false)
        return monquaphukienViewHolder(v)
    }

    override fun onBindViewHolder(p0: monquaphukienViewHolder, p1: Int) {
        p0.hinhanhdoiquahoctap.setImageResource(listphukien[p1].hinhanhdoiquahoctap)
        p0.tendoiquahoctap.text = listphukien.get(p1).tendoimonquahoctap
        p0.sodiemmonquahoctap.text = listphukien.get(p1).txtsodiem
        p0.diemdoiquahoctap.text = listphukien.get(p1).sodiemdedoimonquahoctap
    }

    override fun getItemCount(): Int {
        return listphukien.size
    }
}

class monquaphukienViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var hinhanhdoiquahoctap = itemView.hinhanhdoiquahoctap
    var tendoiquahoctap = itemView.txttenmonquahoctap
    var sodiemmonquahoctap = itemView.txtsodiemmonquahoctap
    var diemdoiquahoctap = itemView.sodiemdedoiquahoctap


}
