package com.example.maro.slider

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.app.ActionBar
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity()  {


    lateinit var tabLayout:TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager.adapter = PagerAdapter(supportFragmentManager)
        tabLayoutId.setupWithViewPager(viewPager)
        tabLayoutId.setTabTextColors(Color.GRAY, Color.GREEN)
        // viewPager.setCurrentItem(1)


    }




    class PagerAdapter (fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager) {
        override fun getItem(position: Int): Fragment? {
            when(position){
                0-> return CategoryFragment()
                1->return NumberFragment()
                2->return ViewFragment()
            }
            return null
        }

        override fun getCount(): Int {
            return 3
        }

        override fun getPageTitle(position: Int): CharSequence ? {
            when(position){
                0-> return "Catgory"
                1->return "Number"
                2->return "View"
            }
            return null
        }

    }

}
