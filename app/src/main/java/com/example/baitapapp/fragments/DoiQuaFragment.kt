package com.example.baitapapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.ActionBarContainer

import com.example.baitapapp.R

/**
 * A simple [Fragment] subclass.
 */
class DoiQuaFragment : Fragment() {
    lateinit var toggle : ActionBarDrawerToggle

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_doi_qua, container, false)

        return view
    }

}
