package com.meatrix.moviecatalogue.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.meatrix.moviecatalogue.R
import com.meatrix.moviecatalogue.data.AnimeEntity
import com.meatrix.moviecatalogue.ui.detail.DetailActivity
import com.meatrix.moviecatalogue.utils.Constants
import kotlinx.android.synthetic.main.item_all.view.home_poster
import kotlinx.android.synthetic.main.item_all.view.tv_release_date
import kotlinx.android.synthetic.main.item_all.view.tv_title

class AnimeAdapter : RecyclerView.Adapter<AnimeAdapter.ViewHolder>() {
    private var list = ArrayList<AnimeEntity>()

    fun setList(data : List<AnimeEntity>?){
        if (data == null)return
        list.clear()
        list.addAll(data)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var anime: AnimeEntity

        fun bind(){
            with(itemView){
                tv_title.text = anime.title
                tv_release_date.text = anime.releaseDate

                context?.let { safeContext ->
                    Glide.with(safeContext)
                        .load(anime.posterPath)
                        .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                        .error(R.drawable.ic_error)
                        .into(home_poster)
                }
            }
        }

        init {
            itemView.setOnClickListener {
                DetailActivity.newInstance(it.context, anime.id, Constants.TYPE.ANIME)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_all,parent,false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        list[position].let {
            holder.anime = it
            holder.bind()
        }
    }
}