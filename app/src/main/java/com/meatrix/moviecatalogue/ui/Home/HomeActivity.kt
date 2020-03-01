package com.meatrix.moviecatalogue.ui.Home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.meatrix.moviecatalogue.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val pagerAdapter = PagerAdapter(this,supportFragmentManager)
        viewPager.adapter = pagerAdapter
        tabs.setupWithViewPager(viewPager)

        supportActionBar?.elevation = 0f
    }
}
