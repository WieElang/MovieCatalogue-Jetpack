package com.meatrix.moviecatalogue.ui.Home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import com.meatrix.moviecatalogue.R
import com.meatrix.moviecatalogue.Utils.StaticData
import org.junit.Rule
import org.junit.Test

class HomeActivityTest{
    private val dataMovie = StaticData.generateMovie()
    private val dataTv = StaticData.generateTv()

    @get:Rule
    var activityRule = ActivityTestRule(HomeActivity::class.java)

    @Test
    fun loadMovie(){
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataMovie.size))
    }

    @Test
    fun loadDetailMovie(){
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tv_title_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title_detail)).check(matches(withText(dataMovie[0].title)))
        onView(withId(R.id.tv_date_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_date_detail)).check(matches(withText(dataMovie[0].releaseDate)))
        onView(withId(R.id.tv_description)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_description)).check(matches(withText(dataMovie[0].overview)))
    }

    @Test
    fun loadTv(){
        onView(withText("Tv Show")).perform(click())
        onView(withId(R.id.rv_tv)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tv)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataTv.size))
    }

    @Test
    fun loadDetailTv(){
        onView(withText("Tv Show")).perform(click())
        onView(withId(R.id.rv_tv)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tv_title_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title_detail)).check(matches(withText(dataTv[0].title)))
        onView(withId(R.id.tv_date_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_date_detail)).check(matches(withText(dataTv[0].releaseDate)))
        onView(withId(R.id.tv_description)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_description)).check(matches(withText(dataTv[0].overview)))
    }
}