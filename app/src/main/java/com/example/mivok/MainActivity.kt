package com.example.mivok

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)
        numbers.setOnClickListener(this)
        family.setOnClickListener(this)
        colors.setOnClickListener(this)
        phrases.setOnClickListener(this)



    }

    override fun onClick(v: View?) {
        when(v?.id)
        {


            R.id.numbers-> {
                startActivity(Intent(this,NumbersActivity::class.java))
            }
            R.id.family->   {
                startActivity(Intent(this,FamilyActivity::class.java))
            }
            R.id.colors->{
                startActivity(Intent(this,ColorsActivity::class.java))
            }
            R.id.phrases->{


                startActivity(Intent(this,PhrasesActivity::class.java))

            }
            else->{
                Toast.makeText(this,"Invalid Activity",Toast.LENGTH_SHORT).show()

            }


        }
    }

}
