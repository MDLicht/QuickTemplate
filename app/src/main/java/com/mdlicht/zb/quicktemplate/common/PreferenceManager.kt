package com.mdlicht.zb.quicktemplate.common

import android.content.Context
import android.content.SharedPreferences

class PreferenceManager(context: Context) {
    private val preference: SharedPreferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)

    fun putString(key: String, value: String) {
        with(preference.edit()) {
            putString(key, value)
            apply()
        }
    }

    fun putBoolean(key: String, value: Boolean) {
        with(preference.edit()) {
            putBoolean(key, value)
            apply()
        }
    }

    fun putFloat(key: String, value: Boolean) {
        with(preference.edit()) {
            putFloat(key, value)
            apply()
        }
    }

    fun putInt(key: String, value: Int) {
        with(preference.edit()) {
            putInt(key, value)
            apply()
        }
    }

    fun putLong(key: String, value: Long) {
        with(preference.edit()) {
            putLong(key, value)
            apply()
        }
    }

    fun getString(key: String): String {
        return preference.getString(key, "") ?: ""
    }

    fun getBoolean(key: String): Boolean {
        return preference.getBoolean(key, false)
    }

    fun getFloat(key: String): Float {
        return preference.getFloat(key, (-1).toFloat())
    }

    fun getInt(key: String): Int {
        return preference.getInt(key, -1)
    }

    fun getLong(key: String): Long {
        return preference.getLong(key, (-1).toLong())
    }

    companion object {
        private const val PREFERENCE_NAME = "quick_template_preference"
    }
}