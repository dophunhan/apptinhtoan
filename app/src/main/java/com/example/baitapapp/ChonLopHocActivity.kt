package com.example.baitapapp

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.baitapapp.fragments.CaNhanFragment
import com.example.baitapapp.fragments.DoiQuaFragment
import com.example.baitapapp.fragments.HomeBlankFragment
import com.example.baitapapp.fragments.MoRongFragment
import kotlinx.android.synthetic.main.activity_chonlophoc.*

class ChonLopHocActivity() : AppCompatActivity() {
    private val homefragment = HomeBlankFragment()
    private val morongfragment = MoRongFragment()
    private val doiquafragment = DoiQuaFragment()
    private val canhanfragment = CaNhanFragment()
    private var list = ArrayList<Sudent>()
    private var adapter: StudentAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chonlophoc)
        makeCurrentFragment(homefragment)
        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.ic_home -> makeCurrentFragment(homefragment)
                R.id.ic_morong -> makeCurrentFragment(morongfragment)
                R.id.icon -> makeCurrentFragment(doiquafragment)
                R.id.ic_canhan -> makeCurrentFragment(canhanfragment)
            }
            true
        }


    }

    private fun makeCurrentFragment(fragment: Fragment) {
        if (fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.framlayout, fragment)
            transaction.commit()
        }
    }

}