package com.mdlicht.zb.quicktemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mdlicht.zb.quicktemplate.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
    }
}
