package com.example.marvelappstart.data.model.comic

import com.example.marvelappstart.data.model.ThumbnailModel
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ComicModel(
    @SerializedName("id")
    val id: Int,

    @SerializedName("title")
    val title: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("thumbnail")
    val thumbnailModel: ThumbnailModel

) : Serializable
