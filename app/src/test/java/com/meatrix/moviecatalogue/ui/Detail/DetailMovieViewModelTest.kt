package com.meatrix.moviecatalogue.ui.Detail

import com.meatrix.moviecatalogue.Utils.StaticData
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailMovieViewModelTest {
    private lateinit var movieViewModel: DetailMovieViewModel
    private val movieData = StaticData.generateMovie()[0]
    private val extraId = movieData.id

    @Before
    fun setUp(){
        movieViewModel = DetailMovieViewModel()
        movieViewModel.selectedId(extraId)
    }


    @Test
    fun getMovie() {
        movieViewModel.selectedId(movieData.id)
        val entity = movieViewModel.getMovie()
        assertNotNull(entity)
        assertEquals(movieData.id,entity.id)
        assertEquals(movieData.title,entity.title)
        assertEquals(movieData.releaseDate,entity.releaseDate)
        assertEquals(movieData.overview,entity.overview)
        assertEquals(movieData.posterPath,entity.posterPath)
    }
}