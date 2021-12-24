package com.meatrix.moviecatalogue.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.meatrix.moviecatalogue.data.MovieEntity
import com.meatrix.moviecatalogue.R
import com.meatrix.moviecatalogue.utils.Constants
import com.meatrix.moviecatalogue.ui.detail.DetailActivity
import kotlinx.android.synthetic.main.item_all.view.*

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {
    private var list = ArrayList<MovieEntity>()

    fun setList(data: List<MovieEntity>?){
        if (data == null) return
        list.clear()
        list.addAll(data)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var movie: MovieEntity

        fun bind(){
            with(itemView){
                tv_title.text = movie.title
                tv_release_date.text = movie.releaseDate

                Glide.with(context)
                    .load(movie.posterPath)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                    .error(R.drawable.ic_error)
                    .into(home_poster)
            }
        }

        init {
            itemView.setOnClickListener {
                DetailActivity.newInstance(it.context, movie.id, Constants.TYPE.MOVIE)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_all,parent,false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        list[position].let {
            holder.movie = it
            holder.bind()
        }
    }
}