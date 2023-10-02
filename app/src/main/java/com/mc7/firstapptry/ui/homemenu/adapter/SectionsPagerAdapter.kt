package com.mc7.firstapptry.ui.homemenu.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mc7.firstapptry.ui.homemenu.fragmentactivity.CategoryFragment
import com.mc7.firstapptry.ui.homemenu.fragmentactivity.DashboardFragment

class SectionsPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = DashboardFragment()
            1 -> fragment = CategoryFragment()
        }
        return fragment as Fragment
    }

}