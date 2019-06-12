package com.example.mivok

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_family.*
import kotlinx.android.synthetic.main.activity_numbers.*

class FamilyActivity : AppCompatActivity() {
    private lateinit var mediaPlayer:MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_family)
        familyR.layoutManager= LinearLayoutManager(this, LinearLayout.VERTICAL,false)

        val words=ArrayList<word>()

        words.add(word("apa", "Father", R.drawable.family_father, R.raw.family_father))
        words.add(word("ata", "Mother", R.drawable.family_mother, R.raw.family_mother))
        words.add(word("angsi", "Son", R.drawable.family_son, R.raw.family_son))
        words.add(word("tune", "Daughter", R.drawable.family_daughter, R.raw.family_daughter))
        words.add(word("taachi", "Older Brother", R.drawable.family_older_brother, R.raw.family_older_brother))
        words.add(word("chalitti", "Younger Brother", R.drawable.family_younger_brother, R.raw.family_younger_sister))
        words.add(word("tete", "Older Sister", R.drawable.family_older_sister, R.raw.family_older_sister))
        words.add(word("kolliti", "Younger Sister", R.drawable.family_younger_sister, R.raw.family_younger_sister))
        words.add(word("ama", "Grandmother", R.drawable.family_grandmother, R.raw.family_grandmother))
        words.add(word("pappa", "Grandfather", R.drawable.family_grandfather, R.raw.family_grandfather))

        val adapter=CustomAdapter(words,{ partItem : word -> ItemClicked(partItem) })

        familyR.adapter=adapter













    }
    private fun ItemClicked(ele : word) {

        mediaPlayer= MediaPlayer.create(this,ele.audio)

        mediaPlayer.start()

    }
}
