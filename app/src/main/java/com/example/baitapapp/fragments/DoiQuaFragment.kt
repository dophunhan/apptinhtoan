package com.example.baitapapp.fragments

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.ActionBarContainer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.baitapapp.R
import kotlinx.android.synthetic.main.fragment_doi_qua.*

/**
 * A simple [Fragment] subclass.
 */
class DoiQuaFragment : Fragment() {
    var list = ArrayList<doiquahoctap>()
    var adapter: Adaptermonquahoctap? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view : View = inflater.inflate(R.layout.fragment_doi_qua, container, false)
        list.add(
            0,
            doiquahoctap(R.drawable.doiquahoctapxedieukhien, "Bộ đồ dùng học tập", "Số điểm", 0)
        )
        list.add(
            1,
            doiquahoctap(R.drawable.doiquahoctapxedieukhien, "Bộ đồ dùng học tập", "Số điểm", 0)
        )
        list.add(
            2,
            doiquahoctap(R.drawable.doiquahoctapxedieukhien, "Bộ đồ dùng học tập", "Số điểm", 1)
        )

        recyclerviewdoiquahoctap?.layoutManager = LinearLayoutManager(activity,RecyclerView.VERTICAL,false)
        adapter = Adaptermonquahoctap(list)
        recyclerviewdoiquahoctap?.adapter = adapter
        return view

    }

}
