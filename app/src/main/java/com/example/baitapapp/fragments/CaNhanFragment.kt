package com.example.baitapapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.baitapapp.R

/**
 * A simple [Fragment] subclass.
 */
class CaNhanFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v : View = inflater.inflate(R.layout.fragment_ca_nhan2, container, false)

        return v
    }

}
