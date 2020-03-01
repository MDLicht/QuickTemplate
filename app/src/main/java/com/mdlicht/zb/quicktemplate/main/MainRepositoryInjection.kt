package com.mdlicht.zb.quicktemplate.main

import android.content.Context

object MainRepositoryInjection {
    @JvmStatic
    fun create(context: Context): MainRepository {
        return MainRepositoryImpl(context)
    }
}