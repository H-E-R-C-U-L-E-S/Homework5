package com.example.myapplication.adapters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.fragments.*

private const val NUM_TABS = 4

class RameAdapter(activity : AppCompatActivity) : FragmentStateAdapter(activity)  {
    override fun getItemCount(): Int {
        return NUM_TABS
    }

    override fun createFragment(position: Int): Fragment {
         when (position) {
            0 -> return SpecialFragment()
            1 -> return InterestingFragment()
            2 -> return RagacnairiFragment()
            3 -> return SaucxooFragment()
        }
        return SaucxooFragment()
    }

}