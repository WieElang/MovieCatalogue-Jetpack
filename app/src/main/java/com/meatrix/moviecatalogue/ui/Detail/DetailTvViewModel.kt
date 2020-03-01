package com.meatrix.moviecatalogue.ui.Detail

import androidx.lifecycle.ViewModel
import com.meatrix.moviecatalogue.Data.TvShowEntity
import com.meatrix.moviecatalogue.Utils.StaticData

class DetailTvViewModel : ViewModel() {
    private lateinit var extraId : String

    fun selectedId(extraId :String){
        this.extraId = extraId
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