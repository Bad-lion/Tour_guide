package com.example.tourgude2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tourgude2.fragments.MonumentsFragment
import com.example.tourgude2.fragments.ParksFragment
import com.example.tourgude2.fragments.RestaurantFragment
import com.example.tourgude2.fragments.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(RestaurantFragment(), "RESTAURANT")
        adapter.addFragment(ParksFragment(), "PARKS")
        adapter.addFragment(MonumentsFragment(), "MONUMENTS")

        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)

    }

}