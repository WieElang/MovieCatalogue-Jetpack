package com.meatrix.moviecatalogue.ui.tv_show

import androidx.lifecycle.ViewModel
import com.meatrix.moviecatalogue.data.TvShowEntity
import com.meatrix.moviecatalogue.utils.StaticData

class TvShowViewModel : ViewModel() {

    fun getTv() : List<TvShowEntity> = StaticData.generateTv()
}