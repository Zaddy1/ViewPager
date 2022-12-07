package com.example.axalidavelbai.adapters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.axalidavelbai.fragments.FirstFragment
import com.example.axalidavelbai.fragments.SecondFragment
import com.example.axalidavelbai.fragments.ThirdFragment

class ViewPagerFragmentAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        if(position == 0){
            return FirstFragment()
        }else if(position == 1){
            return SecondFragment()
        }else if(position == 2){
            return ThirdFragment()
        }else{
            return Fragment()
        }
    }
}