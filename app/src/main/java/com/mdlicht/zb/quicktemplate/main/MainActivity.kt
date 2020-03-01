package com.mdlicht.zb.quicktemplate.main

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import com.mdlicht.zb.quicktemplate.BR
import com.mdlicht.zb.quicktemplate.R
import com.mdlicht.zb.quicktemplate.common.BaseActivity
import com.mdlicht.zb.quicktemplate.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel, MainRepository>() {

    override fun getLayoutId(): Int = R.layout.activity_main

    override fun getViewModelId(): Int = BR.vm

    override fun createViewModel(repository: MainRepository): MainViewModel {
        val factory = MainViewModelFactory(repository)
        return ViewModelProvider(this, factory).get(MainViewModel::class.java)
    }

    override fun createRepository(context: Context): MainRepository = MainRepositoryInjection.create(this)

    override fun setView() {
        binding.apply {

        }
    }

    override fun setData() {
        binding.fm = supportFragmentManager
    }
}
