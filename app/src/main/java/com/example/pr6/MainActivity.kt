package com.example.pr6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    var LOG_TAG = "MYlOG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(LOG_TAG,"По вечерам над ресторанами\n" +
                "Горячий воздух дик и глух,\n" +
                "И правит окриками пьяными\n" +
                "Весенний и тлетворный дух.")
    }

        override fun onStart() {
            super.onStart()
            Log.d(LOG_TAG,"Вдали над пылью переулочной,\n" +
                    "Над скукой загородных дач,\n" +
                    "Чуть золотится крендель булочной,\n" +
                    "И раздается детский плач.")
    }
}