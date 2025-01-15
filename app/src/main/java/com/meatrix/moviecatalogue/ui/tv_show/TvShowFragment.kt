package com.meatrix.moviecatalogue.ui.tv_show


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

import com.meatrix.moviecatalogue.R
import com.meatrix.moviecatalogue.ui.adapter.TvShowAdapter
import kotlinx.android.synthetic.main.fragment_tv_show.rv_tv

/**
 * A simple [Fragment] subclass.
 */
class TvShowFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_tv_show, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewModel = ViewModelProvider(this,ViewModelProvider.NewInstanceFactory())[TvShowViewModel::class.java]
        val tv = viewModel.getTv()

        val tvAdapter = TvShowAdapter()
        tvAdapter.setList(tv)

        with(rv_tv) {
            layoutManager = StaggeredGridLayoutManager(2, RecyclerView.VERTICAL)
            setHasFixedSize(true)
            adapter = tvAdapter
        }
    }
}
