package com.meatrix.moviecatalogue.ui.TvShow


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager

import com.meatrix.moviecatalogue.R
import com.meatrix.moviecatalogue.ui.Adapter.MovieAdapter
import com.meatrix.moviecatalogue.ui.Adapter.TvShowAdapter
import kotlinx.android.synthetic.main.fragment_tv_show.*

/**
 * A simple [Fragment] subclass.
 */
class TvShowFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_tv_show, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (activity != null) {
            val viewModel = ViewModelProvider(this,ViewModelProvider.NewInstanceFactory())[TvShowViewModel::class.java]
            val tv = viewModel.getTv()

            val tvAdapter = TvShowAdapter()
            tvAdapter.setList(tv)

            with(rv_tv) {
                layoutManager = GridLayoutManager(context,2)
                setHasFixedSize(true)
                adapter = tvAdapter
            }
        }
    }
}
