package com.zasa.recyclerviewnetworkimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wallpaper = createImages()

        rvImages.adapter = WallpaperAdapter(this, wallpaper)
        rvImages.layoutManager = LinearLayoutManager(this)
    }

    fun createImages() : List<Wallpaper>{
        val wallpapers = mutableListOf<Wallpaper>()
        for (i in 1..150){
            wallpapers.add(Wallpaper("name is $i"))
        }
        return wallpapers
    }
}