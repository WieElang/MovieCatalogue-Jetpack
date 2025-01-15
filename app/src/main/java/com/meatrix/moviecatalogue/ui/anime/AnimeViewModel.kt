package com.meatrix.moviecatalogue.ui.anime

import androidx.lifecycle.ViewModel
import com.meatrix.moviecatalogue.data.AnimeEntity
import com.meatrix.moviecatalogue.utils.StaticData

class AnimeViewModel : ViewModel() {
    fun getAnime() : List<AnimeEntity> = StaticData.generateAnime()
}