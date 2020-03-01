package com.meatrix.moviecatalogue.ui.TvShow

import androidx.lifecycle.ViewModel
import com.meatrix.moviecatalogue.Data.MovieEntity
import com.meatrix.moviecatalogue.Data.TvShowEntity
import com.meatrix.moviecatalogue.Utils.StaticData

class TvShowViewModel : ViewModel() {

    fun getTv() : List<TvShowEntity> = StaticData.generateTv()
}