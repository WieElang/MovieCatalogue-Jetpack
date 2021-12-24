package com.meatrix.moviecatalogue.data

data class MovieEntity (
    var id : String,
    var title : String,
    var releaseDate : String,
    var overview : String,
    var posterPath : Int
)