package com.example.mivok

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_colors.*

class ColorsActivity : AppCompatActivity() {
    private lateinit var mediaPlayer:MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colors)
        colorsR.layoutManager= LinearLayoutManager(this, LinearLayout.VERTICAL,false)

        val words=ArrayList<word>()

        words.add(word("wetetti", "Red", R.drawable.color_red, R.raw.color_red))
        words.add(word("chokokki", "Green", R.drawable.color_green, R.raw.color_green))
        words.add(word("takaakki", "Brown", R.drawable.color_brown, R.raw.color_brown))
        words.add(word("topoppi", "Gray", R.drawable.color_gray, R.raw.color_gray))
        words.add(word("kululli", "Black", R.drawable.color_black, R.raw.color_black))
        words.add(word("kelelli", "White", R.drawable.color_white, R.raw.color_white))
        words.add(word("topiisa", "Yellow", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow))
        words.add(word("chiwiita", "Mustard Yellow", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow))

        val adapter=CustomAdapter(words,{ partItem : word -> ItemClicked(partItem) })


        colorsR.adapter=adapter





    }
    private fun ItemClicked(ele : word) {

        mediaPlayer= MediaPlayer.create(this,ele.audio)

        mediaPlayer.start()

    }
}
