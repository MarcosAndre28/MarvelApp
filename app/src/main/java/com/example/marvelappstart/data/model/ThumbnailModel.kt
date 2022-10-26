package com.example.marvelappstart.data.model

import com.google.gson.annotations.SerializedName

data class ThumbnailModel(

    @SerializedName("path")
    val path:String,

    @SerializedName("extension")
    val extension: String
)
