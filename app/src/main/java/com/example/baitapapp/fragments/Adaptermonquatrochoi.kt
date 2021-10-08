package com.example.baitapapp.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.itemdoiquahoctap.view.*

class Adaptermonquatrochoi (var listdoiquatrochoi : ArrayList<classdoiquatrochoi>) : RecyclerView.Adapter<doiqatrochoiViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): doiqatrochoiViewHolder {
        var v = LayoutInflater.from(p0.context).inflate(R.layout.itemdoiquatrochoi,p0,false)
        return doiqatrochoiViewHolder(v)
    }

    override fun onBindViewHolder(p0: doiqatrochoiViewHolder, p1: Int) {
        p0.hinhanhdoiquahoctap.setImageResource(listdoiquatrochoi[p1].hinhanhdoiquahoctap)
        p0.tendoiquahoctap.text = listdoiquatrochoi.get(p1).tendoimonquahoctap
        p0.sodiemmonquahoctap.text = listdoiquatrochoi.get(p1).txtsodiem
        p0.diemdoiquahoctap.text = listdoiquatrochoi.get(p1).sodiemdedoimonquahoctap

    }

    override fun getItemCount(): Int {
        return listdoiquatrochoi.size
    }
}

class doiqatrochoiViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var hinhanhdoiquahoctap = itemView.hinhanhdoiquahoctap
    var tendoiquahoctap = itemView.txttenmonquahoctap
    var sodiemmonquahoctap = itemView.txtsodiemmonquahoctap
    var diemdoiquahoctap = itemView.sodiemdedoiquahoctap

}
