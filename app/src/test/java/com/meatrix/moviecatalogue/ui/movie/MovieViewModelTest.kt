package com.meatrix.moviecatalogue.ui.movie

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class MovieViewModelTest {

    private lateinit var viewModel: MovieViewModel

    @Before
    fun setUp(){
        viewModel = MovieViewModel()
    }

    @Test
    fun getMovies() {
        val entities = viewModel.getMovies()
        assertNotNull(entities)
        assertEquals(10,entities.size)
    }
}