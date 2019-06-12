package com.example.mivok


import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.element.view.*


class CustomAdapter(val list:ArrayList<word>,val clickListener: (word)->Unit): RecyclerView.Adapter<CustomAdapter.ViewHolder>(){
            //second argument is a lambda function
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CustomAdapter.ViewHolder {
        val v=LayoutInflater.from(p0.context).inflate(R.layout.element,p0,false)
        return ViewHolder(v)
    }

    class ViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        fun bind(part: word, clickListener: (word) -> Unit) {
            itemView.word.text=part.word
            itemView.meaning.text=part.meaning
            itemView.image.setImageResource(part.image)

            itemView.setOnClickListener{clickListener(part)}
        }


    }


    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(p0: CustomAdapter.ViewHolder, p1: Int) {

       p0.bind(list[p1], clickListener)


    }

}