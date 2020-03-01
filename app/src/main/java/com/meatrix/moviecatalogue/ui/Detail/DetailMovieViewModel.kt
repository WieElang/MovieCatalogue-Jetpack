package com.meatrix.moviecatalogue.ui.Detail

import androidx.lifecycle.ViewModel
import com.meatrix.moviecatalogue.Data.MovieEntity
import com.meatrix.moviecatalogue.Data.TvShowEntity
import com.meatrix.moviecatalogue.Utils.StaticData

class DetailMovieViewModel : ViewModel() {
    private lateinit var extraId : String

    fun selectedId(extraId :String){
        this.extraId = extraId
    }

    fun getMovie() : MovieEntity{
            lateinit var extra: MovieEntity
            val entities = StaticData.generateMovie()
            for (entity in entities) {
                if (entity.id == extraId) {
                    extra = entity
                }
            }
            return extra
    }
}