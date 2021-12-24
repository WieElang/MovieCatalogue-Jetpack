package com.meatrix.moviecatalogue.ui.detail

import com.meatrix.moviecatalogue.utils.StaticData
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailMovieViewModelTest {
    private lateinit var movieViewModel: DetailViewModel
    private val movieData = StaticData.generateMovie()[0]
    private val extraId = movieData.id

    @Before
    fun setUp(){
        movieViewModel = DetailViewModel()
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