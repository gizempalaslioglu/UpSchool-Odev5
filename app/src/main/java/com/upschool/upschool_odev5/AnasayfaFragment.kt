package com.upschool.upschool_odev5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class AnasayfaFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val tasarim = inflater.inflate(R.layout.fragment_anasayfa, container, false)


        return tasarim
    }

}