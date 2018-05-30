package com.sky.baselibrary.mvp.presenter

import com.sky.baselibrary.mvp.view.BaseMvpView

interface MvpPresenter<V : BaseMvpView> {

    fun attachView(mvpView: V)

    fun detachView()
}