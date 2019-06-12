package com.example.mivok

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_phrases.*

class PhrasesActivity : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phrases)
        phrasesR.layoutManager= LinearLayoutManager(this, LinearLayout.VERTICAL,false)


        val words=ArrayList<word>()


        words.add(word("minto wuksus", "Where are you Going", R.raw.phrase_where_are_you_going))
        words.add(word("tina ayaasena", "What is your Name", R.raw.phrase_what_is_your_name))
        words.add(word("oyaaset", "My Name is", R.raw.phrase_my_name_is))
        words.add(word("michksas?", "How are you feeling", R.raw.phrase_how_are_you_feeling))
        words.add(word("kuchi achit", "I'm feeling Good", R.raw.phrase_im_feeling_good))
        words.add(word("aanasaa", "Are you coming", R.raw.phrase_are_you_coming))
        words.add(word("hhaaanam", "Yes I'm coming", R.raw.phrase_yes_im_coming))
        words.add(word("aanam", "i'm coming", R.raw.phrase_come_here))

        val adapter=CustomAdapter(words,{ partItem : word -> ItemClicked(partItem) })



        phrasesR.adapter=adapter






    }
    private fun ItemClicked(ele : word) {

        mediaPlayer= MediaPlayer.create(this,ele.audio)

        mediaPlayer.start()

    }
}
