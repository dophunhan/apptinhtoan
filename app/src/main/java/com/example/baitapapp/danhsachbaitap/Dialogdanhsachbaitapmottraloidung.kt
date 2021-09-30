package com.example.baitapapp.danhsachbaitap

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.itemdiglog.view.*

class Dialogdanhsachbaitapmottraloidung : DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var v : View = inflater.inflate(R.layout.itemdiglog,container,false)
        v.dongdialog.setOnClickListener {
            dismiss()
        }
        return v
    }

}