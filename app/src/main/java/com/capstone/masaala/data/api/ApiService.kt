package com.capstone.masaala.data.api

import com.capstone.masaala.data.model.UploadResponse
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface ApiService {
    @Multipart
    @POST("/spice")
    fun uploadImage(
        @Part spice: MultipartBody.Part
    ): Call<UploadResponse>
}