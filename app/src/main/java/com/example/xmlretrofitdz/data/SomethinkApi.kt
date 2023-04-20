package com.example.xmlretrofitdz.data

import retrofit2.http.GET

interface SomethinkApi {
    @GET("facts")
    fun getSomethink(): SomethinkList
}