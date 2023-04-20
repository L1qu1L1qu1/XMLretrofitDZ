package com.example.xmlretrofitdz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.xmlretrofitdz.data.SomethinkList
import com.example.xmlretrofitdz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val myViewModel: MyViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        myViewModel.myLiveData.observe(this){
//            binding.button2.setOnClickListener(){
//                myViewModel.getList()
        
            }
        }





    }
}