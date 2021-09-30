package com.example.baitapapp.danhsachbaitap

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.baitapapp.R
import kotlinx.android.synthetic.main.itemdialogtraloisai.view.*

class Dialogdanhsachbaitaptraloisai : DialogFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        var v : View = inflater.inflate(R.layout.itemdialogtraloisai,container,false)
        v.dongdialogtraloisai.setOnClickListener {
            dismiss()
        }
        return v
    }
}