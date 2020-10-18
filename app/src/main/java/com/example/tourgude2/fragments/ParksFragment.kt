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
import kotlinx.android.synthetic.main.fragment_parks.*
import kotlinx.android.synthetic.main.fragment_restourant.*


class ParksFragment : Fragment() {


    private val versionList =  ArrayList<versionP>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        initData()
        return inflater.inflate(R.layout.fragment_parks, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        recycle_view_id_park.apply {

            layoutManager = LinearLayoutManager(activity)
            setRecycledView()

        }
    }


    private fun setRecycledView() {
        val versionAdapter = versionAdapterP(versionList)
        recycle_view_id_park.adapter = versionAdapter
        recycle_view_id_park.setHasFixedSize(true)
    }

    private fun initData() {
        versionList.clear()

        versionList.add(versionP(R.drawable.pobedy,"Victory Park n. a. D. Asanova","Dair Asanov Victory Park (also known as South gate Park) is a large and green Park in the southern part of the city, one of the quietest and most peaceful places in Bishkek. .. Also in the Park there is a Linden alley dedicated to the Kyrgyz border guards and emergency workers, as well as a monument to the blockade of Leningrad",
        "sfsaf"))
        versionList.add(versionP(R.drawable.panfilov,"The Park n. a. I. Panfilov","Panfilov Park of culture and recreation is an ideal place to relax with your loved ones, and for those who want to get away from the hustle and bustle of the city and retire in the shade of trees. There is a great Playground for children, where they will find suitable entertainment. Also in the Park are the carousel, which, if desired, will be able to ride and to remember their childhood by adults.",
        "sfasfasd"))
        versionList.add(versionP(R.drawable.health_park,"HEALTH PARK", "\"For active recreation, the Park provides football, volleyball and basketball fields, as well as health trails: Bicycle and running tracks with rubber surfaces, sidewalks. It is planned to install a chess platform with figures and a velodrome. Lighting of the Park traditionally is managed by the municipal enterprise \"Bishkeksut\" future gardening \"Bishkektalas\"\", — reported in Department.",
            "dsafd"))
        versionList.add(versionP(R.drawable.chingis_park, "Park n. a. Chingiz Aitmatov","Oak Park is one of the oldest parks in Bishkek. It is home to an open-air sculpture Museum, as well as several important monuments and buildings. Despite the fact that in 2010 the Park was renamed in honor of Chingiz Aitmatov, it is still known by the old name among residents and guests of the capital. \"Most of the oaks growing in the Park are the same age as the city. The first trees were planted here by the famous Russian botanist Alexey Fetisov in 1890. The oaks have grown quite large, so in the summer there is a lot of shade in the Park, and in the fall you can watch the colorful foliage. The Park is home to the red guard memorial, as well as the Russian drama theater and the Church of St. Nicholas. St. Nicholas, which once housed the Museum of fine arts.", "safdfsa"))

    }

}
