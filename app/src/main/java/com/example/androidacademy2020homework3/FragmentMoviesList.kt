package com.example.androidacademy2020homework3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentMoviesList : Fragment(){

    private var listener: TransactionsFragmentClicks? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movies_list, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
     //   !!!.setClickListener(listener.addFragment())
    }

    fun setClickListener(l: TransactionsFragmentClicks?) {
        listener = l
    }


    interface TransactionsFragmentClicks {
        fun addFragment()
    }

}