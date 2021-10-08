package com.example.baitapapp.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.fragment_doi_qua.view.*
import kotlinx.android.synthetic.main.itemdoiquahoctap.view.*

class Adaptermonquahoctap(var list : ArrayList<doiquahoctap>) : RecyclerView.Adapter<monquahoctapViewHoder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): monquahoctapViewHoder {
        var v = LayoutInflater.from(p0.context).inflate(R.layout.itemdoiquahoctap,p0,false)
        return monquahoctapViewHoder(v)
    }

    override fun onBindViewHolder(p0: monquahoctapViewHoder, p1: Int) {
        p0.hinhanhdoiquahoctap.setImageResource(list[p1].hinhanhdoiquahoctap)
        p0.tendoiquahoctap.text = list.get(p1).tendoimonquahoctap
        p0.sodiemmonquahoctap.text = list.get(p1).txtsodiem
        p0.diemdoiquahoctap.text = list.get(p1).sodiemdedoimonquahoctap

    }

    override fun getItemCount(): Int {
        return list.size
    }

}

class monquahoctapViewHoder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var hinhanhdoiquahoctap = itemView.hinhanhdoiquahoctap
    var tendoiquahoctap = itemView.txttenmonquahoctap
    var sodiemmonquahoctap = itemView.txtsodiemmonquahoctap
    var diemdoiquahoctap = itemView.sodiemdedoiquahoctap

}
