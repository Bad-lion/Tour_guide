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
        versionList.add(versionR(R.drawable.duet_rest, "DUET", "district: Leninskiy","Cuisine: traditional Turkish", "900","daily from 11 to 23", "https://go.2gis.com/x27j3", "+996 227‒44‒77‒33"))
        versionList.add(versionR(R.drawable.imperator_rest, "Imperator", "district: Octaborsky","Cuisine: China", "500","daily from 11 to 23", "https://go.2gis.com/gh5sp", "+996 778‒88‒83‒30\n" +
                "+996 705‒61‒29‒43\n" +
                "+996 557‒22‒27‒49"))
        versionList.add(versionR(R.drawable.stake_house_rest, "Etiler Steakhouse", "district: Sverdlovsky","Cuisine: China", "1000","daily from 12 to 24", "42.8263617, 74.60417400000006", "+996 770‒00‒45‒35" ))
        versionList.add(versionR(R.drawable.buhara, "Buhara", "district: Pervomaysky","Cuisine: East", "700","daily from 12 to 24", "https://go.2gis.com/gh5sp", "++996 555‒12‒44‒44" ))
        versionList.add(versionR(R.drawable.barshek_rest, "Barashek", "district: Asanbay","Cuisine: Asian, Japon, East", "500","daily from 10 to 23", "https://go.2gis.com/gh5sp", "+996 (312) 52‒11‒11\n" +
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
