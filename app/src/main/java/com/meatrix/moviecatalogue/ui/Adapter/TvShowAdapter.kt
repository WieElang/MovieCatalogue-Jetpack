package com.meatrix.moviecatalogue.ui.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.meatrix.moviecatalogue.Data.TvShowEntity
import com.meatrix.moviecatalogue.R
import com.meatrix.moviecatalogue.ui.Detail.DetailActivity
import kotlinx.android.synthetic.main.item_all.view.*

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.ViewHolder>() {
    private var list = ArrayList<TvShowEntity>()

    fun setList(data : List<TvShowEntity>?){
        if (data == null)return
        list.clear()
        list.addAll(data)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(tvShow : TvShowEntity){
            with(itemView){
                tv_title.text = tvShow.title
                tv_release_date.text = tvShow.releaseDate

                Glide.with(context)
                    .load(tvShow.posterPath)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                    .error(R.drawable.ic_error)
                    .into(home_poster)

                setOnClickListener {
                    val intent = Intent(context,DetailActivity::class.java).apply {
                        putExtra(DetailActivity.EXTRA_ID,tvShow.id)
                        putExtra(DetailActivity.EXTRA_TYPE,"TvShow")
                    }
                    context.startActivity(intent)
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_all,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val tvShow = list[position]
        holder.bind(tvShow)
    }
}