package com.example.mivok

import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.AdapterView
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_numbers.*

class NumbersActivity : AppCompatActivity(){
    private  lateinit var mediaPlayer:MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers)

    numbersR.layoutManager=LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        val words=ArrayList<word>()

        words.add(word("lutti", "One", R.drawable.number_one, R.raw.number_one))
        words.add(word("otiiko", "Two", R.drawable.number_two, R.raw.number_two))
        words.add(word("tolookosu", "Three", R.drawable.number_three, R.raw.number_three))
        words.add(word("oyyisa", "Four", R.drawable.number_four, R.raw.number_four))
        words.add(word("massokka", "Five", R.drawable.number_five, R.raw.number_five))
        words.add(word("temmokka", "Six", R.drawable.number_six, R.raw.number_six))
        words.add(word("kenekaku", "Seven", R.drawable.number_seven, R.raw.number_seven))
        words.add(word("kawinta", "Eight", R.drawable.number_eight, R.raw.number_eight))
        words.add(word("woe", "Nine", R.drawable.number_nine, R.raw.number_nine))
        words.add(word("naaacha", "Ten", R.drawable.number_ten, R.raw.number_ten))

        val adapter = CustomAdapter( words, { partItem : word -> ItemClicked(partItem) })



        numbersR.adapter=adapter



    }
    private fun ItemClicked(ele : word) {

        mediaPlayer=MediaPlayer.create(this,ele.audio)

        mediaPlayer.start()

    }
}