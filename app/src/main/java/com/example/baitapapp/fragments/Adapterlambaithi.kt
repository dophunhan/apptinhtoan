package com.example.baitapapp.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.itemlambaithi.view.*

class Adapterlambaithi(var list : ArrayList<classlambaithi>) : RecyclerView.Adapter<lambaithiViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): lambaithiViewHolder {
        var v = LayoutInflater.from(p0.context).inflate(R.layout.itemlambaithi,p0,false)
        return lambaithiViewHolder(v)
    }

    override fun onBindViewHolder(p0: lambaithiViewHolder, p1: Int) {
        p0.backgroudlambaithi.setImageResource(list[p1].backrou)
        p0.txtcauhoi.text = list.get(p1).txtcauhoi
        p0.backgroudapana.setImageResource(list[p1].backroudapana)
        p0.backgroudapanb.setImageResource(list[p1].backroudapanb)
        p0.backgroudapanc.setImageResource(list[p1].backroudapanc)
        p0.backgroudapand.setImageResource(list[p1].backroudapand)
        p0.txtdapana.text = list.get(p1).txtdapana
        p0.txtdapanb.text = list.get(p1).txtdapanb
        p0.txtdapanc.text = list.get(p1).txtdapanc
        p0.txtdapand.text = list.get(p1).txtdapand
    }

    override fun getItemCount(): Int {
        return list.size
    }
}

class lambaithiViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var backgroudlambaithi = itemView.backgroulambaithi
    var txtcauhoi = itemView.txtcauhoi
    var backgroudapana = itemView.bgroua
    var backgroudapanb = itemView.bgroub
    var backgroudapanc = itemView.bgrouc
    var backgroudapand = itemView.bgroud
    var txtdapana = itemView.txtdapana
    var txtdapanb = itemView.txtdapanb
    var txtdapanc = itemView.txtdapanc
    var txtdapand = itemView.txtdapand



}
