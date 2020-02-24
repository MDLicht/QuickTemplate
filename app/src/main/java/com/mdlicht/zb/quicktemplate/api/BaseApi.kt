package com.mdlicht.zb.quicktemplate.api

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

open class BaseApi {

    companion object {
        @JvmStatic
        protected fun createXXX(): Retrofit {
            return Retrofit.Builder()
                .baseUrl("")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}