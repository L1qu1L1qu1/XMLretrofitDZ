package com.example.xmlretrofitdz

import com.example.xmlretrofitdz.data.SomethinkApi
import com.example.xmlretrofitdz.data.SomethinkList
import com.example.xmlretrofitdz.data.SomethinkRetrofit

class Repository {
    var api: SomethinkApi = SomethinkRetrofit.api
    fun getSomethink(): SomethinkList {
        return api.getSomethink()
    }
}