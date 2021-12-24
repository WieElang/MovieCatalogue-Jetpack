package com.meatrix.moviecatalogue.ui.detail

import androidx.lifecycle.ViewModel
import com.meatrix.moviecatalogue.data.MovieEntity
import com.meatrix.moviecatalogue.data.TvShowEntity
import com.meatrix.moviecatalogue.utils.StaticData

class DetailViewModel : ViewModel() {
    private lateinit var extraId : String

    fun selectedId(extraId :String){
        this.extraId = extraId
    }

    fun getMovie() : MovieEntity {
        lateinit var extra: MovieEntity
        val entities = StaticData.generateMovie()
        for (entity in entities) {
            if (entity.id == extraId) {
                extra = entity
            }
        }
        return extra
    }

    fun getTvShow() : TvShowEntity {
        lateinit var extra: TvShowEntity
        val entities = StaticData.generateTv()
        for (entity in entities) {
            if (entity.id == extraId) {
                extra = entity
            }
        }
        return extra
    }
}