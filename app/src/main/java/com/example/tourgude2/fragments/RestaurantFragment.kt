package com.example.tourgude2.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tourgude2.R
import com.example.tourgude2.fragments.adapters.versionAdapterR
import com.example.tourgude2.versionR
import kotlinx.android.synthetic.main.fragment_restourant.*


class RestaurantFragment : Fragment()  {

    private val versionList =  ArrayList<versionR>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        initData()
        return inflater.inflate(R.layout.fragment_restourant, container, false)
    }
    private fun initData() {
        versionList.clear()
        versionList.add(versionR(R.drawable.duet_rest, "DUET", "Leninskiy","traditional Turkish", "900 som","daily from 11 to 23"," 153 kiev street, Bishkek", "+996 227‒44‒77‒33"))
        versionList.add(versionR(R.drawable.imperator_rest, "Imperator", "Octaborsky","China", "500 som","daily from 11 to 23", "Bishkek, 153 Kievskaya", "+996 778‒88‒83‒30\n" +
                "+996 705‒61‒29‒43\n" +
                "+996 557‒22‒27‒49"))
        versionList.add(versionR(R.drawable.stake_house_rest, "Etiler Steakhouse", "Sverdlovsky"," China", "1000 som","daily from 12 to 24", " 381 Park Avenue South, New York", "+996 770‒00‒45‒35" ))
        versionList.add(versionR(R.drawable.buhara, "Buhara", " Pervomaysky","East", "700 som","daily from 12 to 24", "381 Park Avenue South", "++996 555‒12‒44‒44" ))
        versionList.add(versionR(R.drawable.barshek_rest, "Barashek", " Asanbay","Asian, Japon, East", "500 som","daily from 10 to 23", "Bishkek, Ala-Too Square", "+996 (312) 52‒11‒11\n" +
                "+996 556‒52‒11‒11" ))


    }
    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        recycle_view_id.apply {

            layoutManager = LinearLayoutManager(activity)
            setRecycledView()

        }
    }


    private fun setRecycledView() {
        val versionAdapter = versionAdapterR(versionList)
        recycle_view_id.adapter = versionAdapter
        recycle_view_id.setHasFixedSize(true)
    }





}
