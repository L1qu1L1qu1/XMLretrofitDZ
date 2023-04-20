package com.example.xmlretrofitdz

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.xmlretrofitdz.data.SomethinkApi
import com.example.xmlretrofitdz.data.SomethinkList

class MyViewModel: ViewModel() {

    var repository: Repository = Repository()
    var myLiveData: MutableLiveData<SomethinkList> = MutableLiveData()
    fun getList(){
        myLiveData.value = repository.getSomethink()
    }

}
