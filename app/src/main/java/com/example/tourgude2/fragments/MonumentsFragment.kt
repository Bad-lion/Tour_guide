package com.example.tourgude2.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tourgude2.R
import com.example.tourgude2.fragments.adapters.versionAdapterP
import com.example.tourgude2.fragments.adapters.versionAdapterR
import com.example.tourgude2.versionP
import com.example.tourgude2.versionR
import kotlinx.android.synthetic.main.fragment_monuments.*
import kotlinx.android.synthetic.main.fragment_parks.*
import kotlinx.android.synthetic.main.fragment_restourant.*


class MonumentsFragment : Fragment() {

    private val versionList =  ArrayList<versionP>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        initData()

        return inflater.inflate(R.layout.fragment_monuments, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        recycle_view_id_monum.apply {
            layoutManager = LinearLayoutManager(activity)
            setRecycledView()

        }
    }

    private fun setRecycledView() {
        val versionAdapter = versionAdapterP(versionList)
        recycle_view_id_monum.adapter = versionAdapter
        recycle_view_id_monum.setHasFixedSize(true)
    }

    private fun initData() {
        versionList.clear()

        versionList.add(versionP(R.drawable.ormon,"Monument to Ormon-Khan", "The monument was opened on November 5, 2002 by President A. Akayev to his \"great ancestor\".", ""))
        versionList.add(versionP(R.drawable.frunze,"Monument to  Frunze", "It was installed on October 25, 1967 on a high pedestal decorated with polished red granite with the inscription: \"M. V. Frunze from the Communist party of Kyrgyzstan and the workers of the Kyrgyz SSR»", ""))
        versionList.add(versionP(R.drawable.chingiz,"Monument to  Chingiz Aytmaov","The monument was opened on August 30, 2011. Sculptor -at the start of Mamai . The height of the statue is 4 meters, the height of the arch is 7 meters 70 cm. It is timed to the 20th anniversary of Kyrgyzstan's independence.","" ))

    }

}