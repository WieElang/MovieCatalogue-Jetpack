package com.meatrix.moviecatalogue.ui.Detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.meatrix.moviecatalogue.R
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.content_detail.*

class DetailActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_ID = "extra_id"
        const val EXTRA_TYPE = "extra_type"
    }
    private var title : String? = null
    private var date : String? = null
    private var overview : String? = null
    private var posterPath : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val viewModelMovie = ViewModelProvider(this,ViewModelProvider.NewInstanceFactory())[DetailMovieViewModel::class.java]
        val viewModelTv = ViewModelProvider(this,ViewModelProvider.NewInstanceFactory())[DetailTvViewModel::class.java]

        val extras = intent.extras
        if (extras != null){
            val extraId = extras.getString(EXTRA_ID)
            val type = extras.getString(EXTRA_TYPE)
            if (extraId != null){
                if (type == "Movie"){
                    viewModelMovie.selectedId(extraId)
                    title = viewModelMovie.getMovie().title
                    date = viewModelMovie.getMovie().releaseDate
                    overview = viewModelMovie.getMovie().overview
                    posterPath = viewModelMovie.getMovie().posterPath
                }
                else if (type == "TvShow"){
                    viewModelTv.selectedId(extraId)
                    title = viewModelTv.getTvShow().title
                    date = viewModelTv.getTvShow().releaseDate
                    overview = viewModelTv.getTvShow().overview
                    posterPath = viewModelTv.getTvShow().posterPath
                }

                tv_title_detail.text = title
                tv_date_detail.text = date
                tv_description.text = overview

                Glide.with(applicationContext)
                    .load(posterPath)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                    .error(R.drawable.ic_error)
                    .into(img_background)

                Glide.with(applicationContext)
                    .load(posterPath)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                    .error(R.drawable.ic_error)
                    .into(img_poster)

            }
        }

    }

}
