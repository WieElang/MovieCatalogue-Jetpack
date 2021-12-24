package com.meatrix.moviecatalogue.ui.detail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.meatrix.moviecatalogue.R
import com.meatrix.moviecatalogue.utils.Constants
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.content_detail.*

class DetailActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_ID = "extra_id"
        const val EXTRA_TYPE = "extra_type"

        fun newInstance(context: Context, id: String, type: Constants.TYPE) {
            val intent = Intent(context, DetailActivity::class.java).apply {
                putExtra(EXTRA_ID, id)
                putExtra(EXTRA_TYPE, type.value)
            }
            context.startActivity(intent)
        }
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

        val viewModel = ViewModelProvider(this,ViewModelProvider.NewInstanceFactory())[DetailViewModel::class.java]

        intent.extras?.let {
            val extraId = it.getString(EXTRA_ID)
            val type = it.getInt(EXTRA_TYPE)
            if (extraId != null) {
                when (type) {
                    Constants.TYPE.MOVIE.value -> {
                        viewModel.selectedId(extraId)
                        title = viewModel.getMovie().title
                        date = viewModel.getMovie().releaseDate
                        overview = viewModel.getMovie().overview
                        posterPath = viewModel.getMovie().posterPath
                    }
                    Constants.TYPE.TV_SHOW.value -> {
                        viewModel.selectedId(extraId)
                        title = viewModel.getTvShow().title
                        date = viewModel.getTvShow().releaseDate
                        overview = viewModel.getTvShow().overview
                        posterPath = viewModel.getTvShow().posterPath
                    }
                }
            }
        }
        setupUI()
    }

    private fun setupUI() {
        tv_title_detail.text = title
        tv_date_detail.text = date
        tv_description.text = overview

        /** Setup image with glide */
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
