package com.example.randomfacts.api

import com.example.randomfacts.ApiEndPoints.DogImagesByBreedEndPoint
import com.example.randomfacts.ApiEndPoints.RandomDogImageEndPoint
import com.example.randomfacts.dataclassess.DogImagesByBreed
import com.example.randomfacts.dataclassess.RandomDogImage
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET

interface ApiService {

    @GET(RandomDogImageEndPoint)
    suspend fun getRandomDogImage(): Flow<RandomDogImage>

    @GET(DogImagesByBreedEndPoint)
    suspend fun getDogImagesByBreed(): Flow<DogImagesByBreed>



}