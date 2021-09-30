package com.example.baitapapp.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.baitapapp.R
import kotlinx.android.synthetic.main.fragment_mo_rong.*
import kotlinx.android.synthetic.main.fragment_mo_rong.view.*

/**
 * A simple [Fragment] subclass.
 */
class MoRongFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         var v : View = inflater.inflate(R.layout.fragment_mo_rong, container, false)
          v.hoctrungtam.setOnClickListener {
              var intent = Intent (context,Hoctrungtam::class.java)
              context?.startActivity(intent)
          }
        v.lambaithi.setOnClickListener {
            var intent = Intent (context,ChonMonThi::class.java)
            context?.startActivity(intent)
        }

        return v
    }

}
