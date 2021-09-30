package com.example.baitapapp
import android.content.Intent
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.fragments.HomeBlankFragment
import com.example.baitapapp.maugiao.MauGiaoActivity
import kotlinx.android.synthetic.main.item.view.*

class StudentAdapter(
    var list: ArrayList<Sudent>,
    var context: HomeBlankFragment,
    var clicklistener : btncicklistener


) : RecyclerView.Adapter<StudentAdapterViewHolder>(){
    open interface btncicklistener{
        fun onbtnclick(position: Int)
    }
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentAdapterViewHolder {
       val v = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return StudentAdapterViewHolder(v)
    }


    override fun getItemCount(): Int {
        return list.size
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onBindViewHolder(holder: StudentAdapterViewHolder, position: Int) {
        holder.imageview.setImageDrawable(context.resources.getDrawable(list[position].anh))
        holder.textview.text = list.get(position).ten


        holder.imageview.setOnClickListener {
            if (position==0)
            {
                var intent = Intent (context.context , MauGiaoActivity::class.java)
                context.startActivity(intent)
            }
            else if (position==1){
                holder.imageview.setOnClickListener {

                    clicklistener.onbtnclick(position)
                }
            }

        }
    }




}



class StudentAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var imageview = itemView.imageviewrecycler
    var textview =itemView.textviewrecycler
}
