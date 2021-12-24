package com.meatrix.moviecatalogue.ui.detail

import com.meatrix.moviecatalogue.utils.StaticData
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailTvViewModelTest {
    private lateinit var tvViewModel: DetailViewModel
    private val tvData = StaticData.generateTv()[0]
    private val extraId = tvData.id

    @Before
    fun setUp(){
        tvViewModel = DetailViewModel()
        tvViewModel.selectedId(extraId)
    }

    @Test
    fun getTvShow() {
        tvViewModel.selectedId(tvData.id)
        val entity = tvViewModel.getTvShow()
        assertNotNull(entity)
        assertEquals(tvData.id,entity.id)
        assertEquals(tvData.title,entity.title)
        assertEquals(tvData.releaseDate,entity.releaseDate)
        assertEquals(tvData.overview,entity.overview)
        assertEquals(tvData.posterPath,entity.posterPath)

    }
}