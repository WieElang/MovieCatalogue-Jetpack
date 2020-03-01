package com.meatrix.moviecatalogue.ui.Home

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.meatrix.moviecatalogue.R
import com.meatrix.moviecatalogue.ui.Movie.MovieFragment
import com.meatrix.moviecatalogue.ui.TvShow.TvShowFragment

class PagerAdapter(private val context: Context, fm : FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    companion object{
        @StringRes
        private val TAB_TITLE = intArrayOf(R.string.movie,R.string.tvShow)
    }

    override fun getItem(position: Int): Fragment =
        when (position){
            0 -> MovieFragment()
            1 -> TvShowFragment()
            else -> Fragment()
        }

    override fun getPageTitle(position: Int): CharSequence? = context.resources.getString(TAB_TITLE[position])

    override fun getCount(): Int = 2
}