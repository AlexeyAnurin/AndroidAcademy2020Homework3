package com.example.androidacademy2020homework3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity(), FragmentMoviesList.TransactionsFragmentClicks {

    private val fragmentMoviesDetails = FragmentMovieDetails()
    private val fragmentMoviesList = FragmentMoviesList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentMoviesList.setClickListener(this)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.fl_mainContainer, fragmentMoviesList)
            .commit()


    }

    override fun addFragment() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fl_mainContainer, fragmentMoviesDetails)
            .commit()
    }


}