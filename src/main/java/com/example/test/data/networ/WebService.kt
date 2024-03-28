package com.example.test.data.networ

import com.example.test.data.model.DataResponse
import retrofit2.Response
import retrofit2.http.GET

interface WebService {

    @GET("?page=1/")
    suspend fun getData(): Response<DataResponse>
}