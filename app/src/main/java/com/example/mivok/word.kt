package com.example.mivok

class word (val word:String, val meaning:String, val image:Int,val audio:Int)
{

   constructor(word:String,meaning: String,audio: Int) : this(word,meaning,R.drawable.phrases,audio)


}


