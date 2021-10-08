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
    var listdoiquatrochoi = ArrayList<classdoiquatrochoi>()
    var adaptermonquatrochoi : Adaptermonquatrochoi? = null
    var listdoiquaphukien = ArrayList<classdoiquaphukien>()
    var adaptermonquaphukien : Adaptermonquaphukien ? = null
    var listdoiquaquanao = ArrayList<classdoiquaquanao>()
    var adaptermonquaquanao : Adaptermonquaquanao? = null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view: View = inflater.inflate(R.layout.fragment_doi_qua, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list.add(
            0,
            doiquahoctap(R.drawable.doiquahoctapxedieukhien, "Bộ đồ dùng học tập", "Số điểm", "-50")
        )
        list.add(
            1, doiquahoctap(R.drawable.bosachgiaokhoa, "Bộ sách giáo khoa", "Số điểm", "-50")
        )
        list.add(
            2,
            doiquahoctap(R.drawable.doiquahoctapxedieukhien, "Bộ đồ dùng học tập", "Số điểm", "-50")
        )

         recyclerviewdoiquahoctap?.layoutManager =
            LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        adapter = Adaptermonquahoctap(list)
        recyclerviewdoiquahoctap?.adapter = adapter



        listdoiquatrochoi.add(
            0,
            classdoiquatrochoi(R.drawable.quatao, "Bộ đồ dùng học tập", "Số điểm", "-50")
        )
        listdoiquatrochoi.add(
            1,
            classdoiquatrochoi(R.drawable.quatao, "Bộ đồ dùng học tập", "Số điểm", "-50")
        )
        listdoiquatrochoi.add(
            2,
            classdoiquatrochoi(R.drawable.quatao, "Bộ đồ dùng học tập", "Số điểm", "-50")
        )

        recyclerviewdoiquatrochoi?.layoutManager =
            LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        adaptermonquatrochoi = Adaptermonquatrochoi(listdoiquatrochoi)
        recyclerviewdoiquatrochoi?.adapter = adaptermonquatrochoi
        listdoiquaphukien.add(0, classdoiquaphukien(R.drawable.quaduahau,"qussss","số điểm","10"))
        listdoiquaphukien.add(1, classdoiquaphukien(R.drawable.quaduahau,"qussss","số điểm","10"))
        listdoiquaphukien.add(2, classdoiquaphukien(R.drawable.quaduahau,"qussss","số điểm","10"))
        listdoiquaphukien.add(3, classdoiquaphukien(R.drawable.quaduahau,"qussss","số điểm","10"))

        recyclerviewdoiquaphukien?.layoutManager =
            LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        adaptermonquaphukien = Adaptermonquaphukien(listdoiquaphukien)
        recyclerviewdoiquaphukien?.adapter = adaptermonquaphukien
        listdoiquaquanao.add(0, classdoiquaquanao(R.drawable.qualecovien,"123","123","321"))
        listdoiquaquanao.add(1,classdoiquaquanao(R.drawable.qualecovien,"123","123","321"))
        listdoiquaquanao.add(2,classdoiquaquanao(R.drawable.qualecovien,"12213","123","321"))
        recyclerviewdoiquaquanao?.layoutManager =
            LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        adaptermonquaquanao = Adaptermonquaquanao(listdoiquaquanao)
        recyclerviewdoiquaquanao?.adapter = adaptermonquaquanao









    }




}


