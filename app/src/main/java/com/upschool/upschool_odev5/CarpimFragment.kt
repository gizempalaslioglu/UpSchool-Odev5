package com.upschool.upschool_odev5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_carpim.view.*

class CarpimFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val tasarim=inflater.inflate(R.layout.fragment_carpim, container, false)
        tasarim.carpimButton.setOnClickListener {

            val carpim=tasarim.carpimtext1.text.toString().toInt()*tasarim.carpimText2.text.toString().toInt()

            val gecis=CarpimFragmentDirections.carpimSonucaGecis(carpim)

            Navigation.findNavController(it).navigate(gecis)
        }
        return tasarim
    }

}