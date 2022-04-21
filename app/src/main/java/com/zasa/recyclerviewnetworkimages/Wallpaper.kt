package com.zasa.recyclerviewnetworkimages

/**
 **@Project -> RecyclerViewNetworkImages
 **@Author -> Sangeeth on 4/21/2022
 */
data class Wallpaper(val name :String) {

    val imageUrl = "https://picsum.photos/200/300?random=$name"
}
