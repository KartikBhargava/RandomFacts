package com.example.randomfacts.dataclassess

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class DogImagesByBreed(
    @SerializedName("message")
    val message: ArrayList<String?> = arrayListOf(),
    @SerializedName("status")
    val status: String? = null
): Parcelable