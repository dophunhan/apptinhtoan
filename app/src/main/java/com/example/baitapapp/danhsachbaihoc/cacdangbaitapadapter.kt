package com.example.baitapapp.danhsachbaihoc

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.itemdanhsachbaitap.view.*

class cacdangbaitapadapter (var list: ArrayList<danhsachbaihoc>) : RecyclerView.Adapter<cacdangbaitapadapterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cacdangbaitapadapterViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.itemdanhsachbaitap,parent,false)
        return cacdangbaitapadapterViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size

    }

    override fun onBindViewHolder(holder: cacdangbaitapadapterViewHolder, position: Int) {
        holder.backgrou.setImageResource(list[position].backgrou)
        holder.backgoruvecto.setImageResource(list[position].vectomau)
        holder.chamxanh.setImageResource(list[position].chamxanh)
        holder.sotrongvecto.text = list.get(position).socuavecto
        holder.baihoc.text = list.get(position).baihoc
        holder.dadoc.text = list.get(position).dadoc
    }
    
}

class cacdangbaitapadapterViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    var backgrou = itemView.backgroucacdangbaitap
    var backgoruvecto = itemView.vectocacdangbaitap
    var chamxanh = itemView.chamxanhcacdangbaitap
    var sotrongvecto = itemView.txtsocacdangbaitap
    var baihoc = itemView.txtbaihoc
    var dadoc = itemView.txtdadoc


}
