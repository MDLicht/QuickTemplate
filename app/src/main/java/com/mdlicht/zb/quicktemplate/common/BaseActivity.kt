package com.mdlicht.zb.quicktemplate.common

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<T : ViewDataBinding, VM : BaseViewModel<R>, R> : AppCompatActivity() {

    private lateinit var _binding: T
    protected val binding: T
        get() = _binding

    private lateinit var _viewModel: VM

    protected abstract fun getLayoutId(): Int

    protected abstract fun getViewModelId(): Int

    protected abstract fun getViewModel(): VM

    abstract fun setView()

    abstract fun setData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setBinding()

        setView()

        setData()
    }

    private fun setBinding() {
        _binding = DataBindingUtil.setContentView(this, getLayoutId())
        _viewModel = if (::_viewModel.isInitialized) {
            _viewModel
        } else {
            getViewModel()
        }
        _binding.setVariable(getViewModelId(), _viewModel)
        _binding.executePendingBindings()
    }
}