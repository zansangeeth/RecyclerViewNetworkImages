package com.zasa.recyclerviewnetworkimages

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.single_item_view.view.*

/**
 **@Project -> RecyclerViewNetworkImages
 **@Author -> Sangeeth on 4/21/2022
 */
class WallpaperAdapter(val context: Context, val wallpapers : List<Wallpaper>) : RecyclerView.Adapter<WallpaperAdapter.ViewHolder>() {

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bind(wallpaper: Wallpaper){
            itemView.tvWallpaperName.text = wallpaper.name
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.single_item_view, parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val wallpaper = wallpapers[position]
        holder.bind(wallpaper)
    }

    override fun getItemCount(): Int {
        return wallpapers.size
    }
}