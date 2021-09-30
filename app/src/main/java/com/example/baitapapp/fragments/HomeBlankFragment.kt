package com.example.baitapapp.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager
import com.example.baitapapp.danhsachbaihoc.CacDangBaTap
import com.example.baitapapp.R
import com.example.baitapapp.StudentAdapter
import com.example.baitapapp.Sudent
import kotlinx.android.synthetic.main.fragment_home_blank.*

class HomeBlankFragment() : Fragment() {
    private var list = ArrayList<Sudent>()
    private var adapter: StudentAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home_blank, container, false)
        var recyc = view.findViewById<RecyclerView>(R.id.recyclerview)
        list.clear()
        list.add(0, Sudent("Mẫu Giáo", R.drawable.student))
        list.add(1, Sudent("Lớp 1 ", R.drawable.student))
        list.add(2, Sudent("Lớp 2", R.drawable.student))
        list.add(3, Sudent("Lớp 3",R.drawable.student))
        list.add(4, Sudent("Lớp 4", R.drawable.student))
        list.add(5, Sudent("Lớp 5",R.drawable.student))
        recyc?.layoutManager = GridLayoutManager(activity, 2, RecyclerView.VERTICAL, false)
        adapter = StudentAdapter(list, this, object : StudentAdapter.btncicklistener {
            override fun onbtnclick(position: Int) {
                recyclerview.visibility = View.GONE
                relativelayoutrecycler.visibility = View.GONE
                relativelayout.visibility = View.VISIBLE
                imageluive.setOnClickListener {
                    recyclerview.visibility = View.VISIBLE
                    relativelayout.visibility=View.GONE
                }
            }
        })
        recyc?.adapter = adapter

        init()

        return view
    }
    fun init() {


        hoctoan?.setOnClickListener {
            var intent = Intent(context, CacDangBaTap::class.java)
            context?.startActivity(intent)
        }
        hoctienganh?.setOnClickListener {
            var intent = Intent(context, CacDangBaTap::class.java)
            context?.startActivity(intent)
        }
        hoctiengviet?.setOnClickListener {
            var intent = Intent(context, CacDangBaTap::class.java)
            context?.startActivity(intent)
        }

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

}


