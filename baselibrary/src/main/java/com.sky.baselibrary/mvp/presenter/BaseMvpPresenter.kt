package com.sky.baselibrary.mvp.presenter

import com.sky.baselibrary.mvp.view.BaseMvpView
import kotlin.RuntimeException

open class BaseMvpPresenter<V : BaseMvpView> : MvpPresenter<V> {

    private var mvpView: V? = null

    override fun attachView(mvpView: V) {
        this.mvpView = mvpView
    }

    override fun detachView() {
        mvpView = null
    }

    public fun isViewAttached(): Boolean {
        return mvpView != null
    }

    public fun getMvpView(): V {
        return mvpView ?: throw MvpViewNotAttachedException()
    }

    public fun checkViewAttached() {
        if (!isViewAttached()) {
            throw MvpViewNotAttachedException()
        }
    }

    class MvpViewNotAttachedException : RuntimeException("Please call Presenter.attach(MvpView)" +
            "before requesting data to the Presenter.")
}