package com.meatrix.moviecatalogue.ui.Movie

import androidx.lifecycle.ViewModel
import com.meatrix.moviecatalogue.Data.MovieEntity
import com.meatrix.moviecatalogue.Utils.StaticData

class MovieViewModel : ViewModel() {

    fun getMovies() : List<MovieEntity> = StaticData.generateMovie()
}