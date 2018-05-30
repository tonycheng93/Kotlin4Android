package com.sky.baselibrary

import android.app.Application

/**
 * 所有模块 {@link Application} 的基类
 */
open class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}