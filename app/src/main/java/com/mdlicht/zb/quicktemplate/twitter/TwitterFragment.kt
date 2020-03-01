package com.mdlicht.zb.quicktemplate.twitter

import android.content.Context
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.mdlicht.zb.quicktemplate.BR
import com.mdlicht.zb.quicktemplate.R
import com.mdlicht.zb.quicktemplate.common.BaseFragment
import com.mdlicht.zb.quicktemplate.databinding.FragmentTwitterBinding

class TwitterFragment : BaseFragment<FragmentTwitterBinding, TwitterViewModel, TwitterRepository>() {

    override fun getLayoutId(): Int = R.layout.fragment_twitter

    override fun getViewModelId(): Int = BR.vm

    override fun createViewModel(repository: TwitterRepository): TwitterViewModel {
        val factory = TwitterViewModelFactory(repository)
        return ViewModelProvider(this, factory).get(TwitterViewModel::class.java)
    }

    override fun createRepository(context: Context): TwitterRepository = TwitterRepositoryInjection.create(context)

    override fun setView() {
        binding.apply {

        }
    }

    override fun setData() {

    }

    companion object {
        @JvmStatic
        fun newInstance() =
            TwitterFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}
