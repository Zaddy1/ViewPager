package com.example.axalidavelbai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.viewpager2.widget.ViewPager2
import com.example.axalidavelbai.adapters.ViewPagerFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
    private lateinit var viewPagerFragmentAdapter: ViewPagerFragmentAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPagerFragmentAdapter = ViewPagerFragmentAdapter(this)
        tabLayout = findViewById(R.id.tabLayout)
        viewPager2 = findViewById(R.id.viewPager2)
        viewPager2.adapter = viewPagerFragmentAdapter

        val actionBar: ActionBar? = supportActionBar
        actionBar?.hide()

        TabLayoutMediator(tabLayout, viewPager2){
            tab,position ->
            when(position){
                0 -> tab.text = "kai"
                1 -> tab.text = "isev"
                2 -> tab.text = "isevdaisev"
            }
        }.attach()
    }
}