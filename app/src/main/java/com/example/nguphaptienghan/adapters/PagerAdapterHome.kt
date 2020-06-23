package com.example.nguphaptienghan.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.nguphaptienghan.fragments.GrammarFragment
import com.example.nguphaptienghan.fragments.VocabularyFragment

class PagerAdapterHome (fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> VocabularyFragment()
            else -> return GrammarFragment()
        }
    }

    override fun getCount(): Int = 2
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0-> "Từ vựng"
            else -> return "Ngữ pháp"
        }
    }
}