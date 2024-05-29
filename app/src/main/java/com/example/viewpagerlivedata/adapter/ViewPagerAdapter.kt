package com.example.viewpagerlivedata.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpagerlivedata.FirstFragment
import com.example.viewpagerlivedata.SecondFragment

class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        if (position == 0) {
            return FirstFragment()
        } else {
            return SecondFragment()
        }
    }

}