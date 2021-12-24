package com.meatrix.moviecatalogue.ui.tv_show

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class TvShowViewModelTest {

    private lateinit var viewModel: TvShowViewModel

    @Before
    fun setUp(){
        viewModel = TvShowViewModel()
    }

    @Test
    fun getTv() {
        val entities = viewModel.getTv()
        assertNotNull(entities)
        assertEquals(10,entities.size)
    }
}