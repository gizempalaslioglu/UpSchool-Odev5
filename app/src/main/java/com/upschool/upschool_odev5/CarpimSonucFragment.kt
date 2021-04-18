package com.upschool.upschool_odev5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_carpimsonuc.view.*

class CarpimSonucFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val tasarim=inflater.inflate(R.layout.fragment_carpimsonuc, container, false)

        val bundle:CarpimSonucFragmentArgs by navArgs()

        val carpma=bundle.carpimsonuc.toString()

        tasarim.textView2.text="ÇARPMA SONUÇ: $carpma"


        return tasarim
    }

}