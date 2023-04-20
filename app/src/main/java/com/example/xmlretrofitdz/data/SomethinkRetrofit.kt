package com.example.xmlretrofitdz.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object SomethinkRetrofit {
    val api: SomethinkApi by lazy{
        Retrofit.Builder()
            .baseUrl("https://www.themealdb.com/api/json/v1/1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(SomethinkApi::class.java)
    }
}
