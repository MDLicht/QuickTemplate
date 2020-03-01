package com.mdlicht.zb.quicktemplate.twitter

import android.content.Context

object TwitterRepositoryInjection {
    @JvmStatic
    fun create(context: Context): TwitterRepository {
        return TwitterRepositoryImpl(context)
    }
}