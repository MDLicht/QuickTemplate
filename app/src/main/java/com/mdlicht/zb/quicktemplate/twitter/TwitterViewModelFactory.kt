package com.mdlicht.zb.quicktemplate.twitter

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

@Suppress("UNCHECKED_CAST")
class TwitterViewModelFactory(private val repository: TwitterRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return TwitterViewModel(repository) as T
    }
}