package com.example.baitapapp.maugiao

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.activity_sodiem.view.*
import kotlinx.android.synthetic.main.itemsodiem.view.*

class sodiemAdapter(var list: ArrayList<sodiem>, var context: Context, var clickn: onclick) :
    RecyclerView.Adapter<sodiemAdapterViewHolder>() {

  var checksodiem : Int = -1

    open interface onclick {
        fun click(position: Int)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): sodiemAdapterViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.itemsodiem, parent, false)
        return sodiemAdapterViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: sodiemAdapterViewHolder, position: Int) {
        holder.chuso.text = list[position].chuso.toString()
        if (checksodiem==position)
        {
            holder.backgrou.setImageResource(R.drawable.vectodo)
        }
        else{
            holder.backgrou.setImageResource(R.drawable.vecto)
        }
        holder.backgrou.setOnClickListener {

            clickn.click(position)
            checksodiem = position
            notifyDataSetChanged()



        }


    }

}


class sodiemAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var backgrou = itemView.imagebackgroudiemso
    var chuso = itemView.textviewdiemso
    var textview = itemView.textviewchuso


}
