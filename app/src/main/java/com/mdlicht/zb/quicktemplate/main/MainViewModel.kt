package com.mdlicht.zb.quicktemplate.main

import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.mdlicht.zb.quicktemplate.R
import com.mdlicht.zb.quicktemplate.common.BaseViewModel
import com.mdlicht.zb.quicktemplate.twitter.TwitterFragment

class MainViewModel(repository: MainRepository): BaseViewModel<MainRepository>(repository) {

    fun onNavigationItemSelected(fm: FragmentManager, item: MenuItem): Boolean {
        fm.beginTransaction()
            .replace(R.id.container, getFragmentById(item.itemId))
            .commit()
        return true
    }

    private fun getFragmentById(menuId: Int): Fragment {
        return when (menuId) {
            R.id.menu_twitter -> {
                TwitterFragment.newInstance()
            }
            R.id.menu_board -> {
                TwitterFragment.newInstance()
            }
            R.id.menu_map -> {
                TwitterFragment.newInstance()
            }
            else -> {
                throw Exception("Invalid Menu Id")
            }
        }
    }
}