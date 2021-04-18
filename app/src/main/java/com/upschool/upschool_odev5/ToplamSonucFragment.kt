package com.upschool.upschool_odev5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_toplamsonuc.*
import kotlinx.android.synthetic.main.fragment_toplamsonuc.view.*

class ToplamSonucFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val tasarim=inflater.inflate(R.layout.fragment_toplamsonuc, container, false)

        val bundle:ToplamSonucFragmentArgs by navArgs()

        val toplama=bundle.toplamasonuc.toString()

        tasarim.textView1.text="TOPLAMA SONUÇ: $toplama"


        return tasarim
    }

}