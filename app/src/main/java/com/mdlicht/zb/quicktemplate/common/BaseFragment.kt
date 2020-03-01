package com.mdlicht.zb.quicktemplate.common

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseFragment<T : ViewDataBinding, VM : BaseViewModel<R>, R> : Fragment() {

    private lateinit var _binding: T
    protected val binding: T
        get() = _binding

    private lateinit var _viewModel: VM

    protected abstract fun getLayoutId(): Int

    protected abstract fun getViewModelId(): Int

    protected abstract fun createViewModel(repository: R): VM

    protected abstract fun createRepository(context: Context): R

    abstract fun setView()

    abstract fun setData()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        setBinding(container)

        setView()

        setData()

        return _binding.root
    }

    private fun setBinding(container: ViewGroup?) {
        _binding = DataBindingUtil.inflate(layoutInflater, getLayoutId(), container, false)
        _viewModel = if (::_viewModel.isInitialized) {
            _viewModel
        } else {
            createViewModel(createRepository(context!!))
        }
        _binding.lifecycleOwner = this
        _binding.setVariable(getViewModelId(), _viewModel)
        _binding.executePendingBindings()
    }
}