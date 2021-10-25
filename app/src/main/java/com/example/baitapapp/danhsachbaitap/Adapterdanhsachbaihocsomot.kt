package com.example.baitapapp.danhsachbaihoc

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import com.example.baitapapp.danhsachbaitap.Danhsachbaitapsomot
import com.example.baitapapp.danhsachbaitap.Databaisomot
import com.example.baitapapp.danhsachbaitap.classdanhsachbaisomot
import kotlinx.android.synthetic.main.itemdanhsachbaihocsomot.view.*

class Adapterdanhsachbaihocsomot(var list : MutableList<Databaisomot> , var click : clickdanhsachbaitapmot ) : RecyclerView.Adapter<danhsachbaihocViewHolder>() {
   open interface clickdanhsachbaitapmot {
       fun xyludanhsachbaitapmot(p1: Int)
   }
    var check = -1
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): danhsachbaihocViewHolder {
        var v = LayoutInflater.from(p0.context).inflate(R.layout.itemdanhsachbaihocsomot,p0,false)
        return danhsachbaihocViewHolder(v)

    }

    override fun onBindViewHolder(p0: danhsachbaihocViewHolder, p1: Int) {
        p0.bgrou.setImageResource(list[p1].backgrou)
        p0.txtdapan.text = list.get(p1).cautraloi.toString()
        if (p1 == check)
        {
            p0.bgrou.setImageResource(R.drawable.backgroumauxanhdanhsachbaihocsomot)
        }else {
            p0.bgrou.setImageResource(R.drawable.backgrodtraloidanhsachbaitap)
        }
        p0.bgrou.setOnClickListener {
            p0.bgrou.setImageResource(R.drawable.backgroumauxanhdanhsachbaihocsomot)
            check = p1
            click.xyludanhsachbaitapmot(p1)
            notifyDataSetChanged()
        }



    }

    override fun getItemCount(): Int {
        return list.size
    }
}

class danhsachbaihocViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var bgrou = itemView.backgroudanhsachbaihocsomot
    var txtdapan = itemView.textviewdanhsachbaihocsomot

}
