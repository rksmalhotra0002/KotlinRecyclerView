package com.status.kotlinrecyclerview

import android.content.Context
import android.graphics.text.TextRunShaper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class ExampleAdapter(private val context:Context,private val examplelist:List<ExampleItem>) : RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {

     val itemView=LayoutInflater.from(parent.context).inflate(R.layout.example_item,parent,false)
        return ExampleViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {

        val currentItem=examplelist[position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textViewone.text=currentItem.text1
        holder.textViewtwo.text=currentItem.text2

        holder.itemView.setOnClickListener {

            if (holder.adapterPosition==0)
            {
                val toastshow=Toast.makeText(context,"this is cool",Toast.LENGTH_LONG)
                toastshow.show()
            }

        }

    }

    override fun getItemCount()= examplelist.size


    class ExampleViewHolder(itemView:View) :RecyclerView.ViewHolder(itemView){

        val imageView:ImageView=itemView.findViewById(R.id.image_view)
        val textViewone:TextView=itemView.findViewById(R.id.text_view_1)
        val textViewtwo:TextView=itemView.findViewById(R.id.text_view_2)

    }

}
