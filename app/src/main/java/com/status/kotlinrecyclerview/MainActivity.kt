package com.status.kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

private lateinit var recyclerView: RecyclerView

private lateinit var exampleAdapter: ExampleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeViews()

    }

    private fun initializeViews()
    {

        try{

            recyclerView=findViewById(R.id.recyclerview)

            val list=ArrayList<ExampleItem>()

            list.add(ExampleItem(R.drawable.ic_android_black_24dp, "shubham","karan"))
            list.add(ExampleItem(R.drawable.ic_android_black_24dp, "ff","ss"))
            list.add(ExampleItem(R.drawable.ic_android_black_24dp, "ff","dd"))
            list.add(ExampleItem(R.drawable.ic_android_black_24dp, "ff","gg"))
            list.add(ExampleItem(R.drawable.ic_android_black_24dp, "ff","hh"))
            list.add(ExampleItem(R.drawable.ic_android_black_24dp, "ff","jk"))

            val linearLayoutManager=LinearLayoutManager(this)
            linearLayoutManager.orientation=LinearLayoutManager.VERTICAL
            exampleAdapter= ExampleAdapter(this,list)
            recyclerView.apply {

                setHasFixedSize(true)
                adapter=exampleAdapter
                layoutManager=linearLayoutManager

            }
        }catch (e:Exception)
        {
            e.printStackTrace()
        }
    }
}
