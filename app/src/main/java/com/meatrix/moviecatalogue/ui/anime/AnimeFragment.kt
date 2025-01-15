package com.meatrix.moviecatalogue.ui.anime

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.meatrix.moviecatalogue.R
import com.meatrix.moviecatalogue.ui.adapter.AnimeAdapter
import kotlinx.android.synthetic.main.fragment_anime.rv_anime

/**
 * A simple [Fragment] subclass.
 */
class AnimeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? = inflater.inflate(R.layout.fragment_anime, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewModel = ViewModelProvider(this,
            ViewModelProvider.NewInstanceFactory())[AnimeViewModel::class.java]
        val anime = viewModel.getAnime()

        val animeAdapter = AnimeAdapter()
        animeAdapter.setList(anime)

        with(rv_anime) {
            layoutManager = StaggeredGridLayoutManager(2, RecyclerView.VERTICAL)
            setHasFixedSize(true)
            adapter = animeAdapter
        }
    }
}