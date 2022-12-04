package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.adapters.RameAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

private lateinit var viewPager2: ViewPager2
private lateinit var tabLayout: TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager2 = findViewById(R.id.pager)
        tabLayout = findViewById(R.id.tabLayout)


        val adapter = RameAdapter(this)
        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            when(position){
                0 -> tab.text = "1rame"
                1 -> tab.text = "2rame"
                2 -> tab.text = "3rame"
                3 -> tab.text = "4rame"
            }

        }.attach()

    }
}