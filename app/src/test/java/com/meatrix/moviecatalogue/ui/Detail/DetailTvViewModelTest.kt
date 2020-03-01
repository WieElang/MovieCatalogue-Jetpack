package com.meatrix.moviecatalogue.ui.Detail

import com.meatrix.moviecatalogue.Utils.StaticData
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailTvViewModelTest {
    private lateinit var tvViewModel: DetailTvViewModel
    private val tvData = StaticData.generateTv()[0]
    private val extraId = tvData.id

    @Before
    fun setUp(){
        tvViewModel = DetailTvViewModel()
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