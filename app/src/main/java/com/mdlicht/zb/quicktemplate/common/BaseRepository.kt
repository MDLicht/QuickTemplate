package com.mdlicht.zb.quicktemplate.common

import android.content.Context

open class BaseRepository(private val context: Context) {

    protected val preferenceManager = PreferenceManager(context)
}