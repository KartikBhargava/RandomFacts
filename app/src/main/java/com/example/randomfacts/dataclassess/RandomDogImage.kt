package com.example.randomfacts.dataclassess

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class RandomDogImage(
    @SerializedName("message")
    val message: String,
    @SerializedName("status")
    val status: String
): Parcelable