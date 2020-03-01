package com.mdlicht.zb.quicktemplate.common

import android.view.View
import androidx.databinding.BindingAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView

object BindingAdapter {
    @JvmStatic
    @BindingAdapter("onNavigationItemSelectedListener")
    fun setOnNavigationItemSelectedListener(view: BottomNavigationView, listener: BottomNavigationView.OnNavigationItemSelectedListener?) {
        view.setOnNavigationItemSelectedListener(listener)
    }

    @JvmStatic
    @BindingAdapter("navigationVisibility")
    fun setBottomNavigationVisibility(view: BottomNavigationView, useOption: Boolean = false) {
        if (useOption) {
            view.visibility = if (view.menu.size() == 0 || !view.menu.hasVisibleItems()) View.GONE else View.VISIBLE
        }
    }
}