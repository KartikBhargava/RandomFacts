package com.example.randomfacts.dataclassess

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class RandomCatFact(
    @SerializedName("fact")
    val fact: String?,
    @SerializedName("length")
    val length: Int?
): Parcelable