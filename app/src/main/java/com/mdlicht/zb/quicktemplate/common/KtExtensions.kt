package com.mdlicht.zb.quicktemplate.common

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

class KtExtensions {
    fun CompositeDisposable.plusAssign(disposable: Disposable) {
        this.add(disposable)
    }
}