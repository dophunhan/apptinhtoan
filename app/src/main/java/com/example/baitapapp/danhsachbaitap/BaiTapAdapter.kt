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
import kotlinx.android.synthetic.main.itembaitap.view.*

open class BaiTapAdapter (var list : ArrayList<BaiTap> , var context: Context) : RecyclerView.Adapter<BaiTapViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaiTapViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.itembaitap,parent,false)
        return BaiTapViewHolder(view)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: BaiTapViewHolder, position: Int) {
        holder.backgroubaitap.setImageResource(list[position].backgroubaitap)
        holder.backgroudiembaitap.setImageResource(list[position].backgroudiembaitap)
        holder.imageplay.setImageResource(list[position].imageplay)
        holder.textviewbaitap.text = list.get(position).textviewbaitap
        holder.textviewdiembaitap.text = list.get(position).textviewdiembaitap
        holder.backgroubaitap.setOnClickListener {
            if (position==0)
            {
                var intent = Intent (context,Danhsachbaitapsomot::class.java)
                context.startActivity(intent)

            }
        }

    }
}



class BaiTapViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var backgroubaitap = itemView.backgroubaitap
    var backgroudiembaitap = itemView.backgroudiembaitap
    var imageplay = itemView.imageplaybaitap
    var textviewbaitap = itemView.textviewbaitap
    var textviewdiembaitap = itemView.textviewdiembaitap

}
