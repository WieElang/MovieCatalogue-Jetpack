package com.meatrix.moviecatalogue.ui.movie

import androidx.lifecycle.ViewModel
import com.meatrix.moviecatalogue.data.MovieEntity
import com.meatrix.moviecatalogue.utils.StaticData

class MovieViewModel : ViewModel() {

    fun getMovies() : List<MovieEntity> = StaticData.generateMovie()
}