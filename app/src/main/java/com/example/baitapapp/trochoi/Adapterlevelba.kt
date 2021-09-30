package com.example.baitapapp.trochoi

import android.content.Context
import android.service.autofill.OnClickAction
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.activity_level_ba.view.*
import kotlinx.android.synthetic.main.itemlevelba.view.*
import java.util.ArrayList

class Adapterlevelba(var list: ArrayList<levelbar> , var click : Clicklevelba , var context : Context  ) : RecyclerView.Adapter<AdapterlevelbaViewHolder>(){
    var check = -1

    open interface Clicklevelba {
        fun onclicklevelba(position: Int)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterlevelbaViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.itemlevelba,parent,false)
        return AdapterlevelbaViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterlevelbaViewHolder, position: Int) {
        holder.backgroun.setImageResource(list[position].backgrou)
        holder.textviewlevelba.text = list.get(position).ten


            if (check==position)
            {
                holder.backgroun.setImageResource(R.drawable.backgroumauvang)
            }else
            {
                holder.backgroun.setImageResource(R.drawable.backgroulevel1)
            }

        holder.backgroun.setOnClickListener {
            holder.backgroun.setImageResource(R.drawable.backgroumauvang)
            check = position
            click.onclicklevelba(position)
            notifyDataSetChanged()
        }



    }

    override fun getItemCount(): Int {
        return list.size
    }
}



class AdapterlevelbaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var backgroun = itemView.backgroulevelba
    var textviewlevelba = itemView.textviewlevelba


}
