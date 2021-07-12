package com.example.lovelaceapis

import android.graphics.PostProcessor
import android.telecom.Call
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiInterface {
    @GET ("posts")
    fun getPosts():retrofit2.Call<List<Post>>

}