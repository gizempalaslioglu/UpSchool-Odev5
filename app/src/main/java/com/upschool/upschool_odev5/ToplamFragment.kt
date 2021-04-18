package com.upschool.upschool_odev5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_toplam.view.*

class ToplamFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val tasarim=inflater.inflate(R.layout.fragment_toplam, container, false)

        tasarim.toplamButton.setOnClickListener {

            val topla=tasarim.toplamText1.text.toString().toInt()+tasarim.toplamText2.text.toString().toInt()

            val gecis=ToplamFragmentDirections.toplamSonucaGecis(topla)

            Navigation.findNavController(it).navigate(gecis)
        }

        return tasarim
    }

}