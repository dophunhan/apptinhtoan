package com.example.baitapapp.danhsachbaihoc

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import com.example.baitapapp.danhsachbaitap.BaiTap
import com.example.baitapapp.danhsachbaitap.Danhsachbaitapsomot
import com.example.baitapapp.danhsachbaitap.Databaitap
import com.example.baitapapp.maugiao.sodiemAdapter
import kotlinx.android.synthetic.main.itembaitap.view.*

open class BaiTapAdapter(
    var list: MutableList<Databaitap>,
    var context: Context,
    var onclick: xulionclick
) : RecyclerView.Adapter<BaiTapViewHolder>() {

    open interface xulionclick {
        fun xuliOnclick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaiTapViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.itembaitap, parent, false)
        return BaiTapViewHolder(view)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: BaiTapViewHolder, position: Int) {
        holder.backgroubaitap.setImageResource(list[position].backgroubaitap)
        holder.backgroudiembaitap.setImageResource(list[position].backgroudiembaitap)
        holder.imageplay.setImageResource(list[position].imageplay)
        holder.name.text = list.get(position).name
        holder.diem.text = list.get(position).diem.toString()
        holder.name.setOnClickListener {
            onclick.xuliOnclick(position)


        }


    }
}

class BaiTapViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var backgroubaitap = itemView.backgroubaitap
    var backgroudiembaitap = itemView.backgroudiembaitap
    var imageplay = itemView.imageplaybaitap
    var name = itemView.textviewbaitap
    var diem = itemView.textviewdiembaitap

}
