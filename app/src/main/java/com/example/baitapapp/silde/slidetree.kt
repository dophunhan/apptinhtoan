package com.example.baitapapp.silde

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.baitapapp.ChonLopHocActivity
import com.example.baitapapp.R

class slidetree : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.slide_3, container, false)
        val button = view.findViewById<Button>(R.id.btntieptuc)
        button.setOnClickListener {
            val intent = Intent(activity!!.application, ChonLopHocActivity::class.java)
            startActivity(intent)


        }

        return view

    }
    fun xuly(){

        val intent = Intent(activity!!.application, ChonLopHocActivity::class.java)
        startActivity(intent)
    }


}