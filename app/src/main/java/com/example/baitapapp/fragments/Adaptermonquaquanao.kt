package com.example.baitapapp.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.itemdoiquahoctap.view.*

class Adaptermonquaquanao (var listquanao : ArrayList<classdoiquaquanao>) : RecyclerView.Adapter<monquaquanaoViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): monquaquanaoViewHolder {
        var v = LayoutInflater.from(p0.context).inflate(R.layout.itemdoiquatrochoi,p0,false)
        return monquaquanaoViewHolder(v)
    }

    override fun onBindViewHolder(p0: monquaquanaoViewHolder, p1: Int) {
        p0.hinhanhdoiquahoctap.setImageResource(listquanao[p1].hinhanhdoiquahoctap)
        p0.tendoiquahoctap.text = listquanao.get(p1).tendoimonquahoctap
        p0.sodiemmonquahoctap.text = listquanao.get(p1).txtsodiem
        p0.diemdoiquahoctap.text = listquanao.get(p1).sodiemdedoimonquahoctap
    }

    override fun getItemCount(): Int {
        return listquanao.size
    }
}

class monquaquanaoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var hinhanhdoiquahoctap = itemView.hinhanhdoiquahoctap
    var tendoiquahoctap = itemView.txttenmonquahoctap
    var sodiemmonquahoctap = itemView.txtsodiemmonquahoctap
    var diemdoiquahoctap = itemView.sodiemdedoiquahoctap

}
