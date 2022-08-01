package com.example.myapplication

import android.app.Application
import org.koin.android.ext.android.get
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

/**
 * @Author : zhaojianwei02
 * @Date : 2022/8/1 11:39 上午
 * @Description : Koin使用
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    fun initKoin() {
        startKoin {
            androidLogger()
            androidContext(this@App)
            androidFileProperties()
            modules(appModule)
        }
    }

    /**
     * 定义组件
     */
    val appModule = module {

        // single instance of HelloRepository
        single<HelloRepository> { HelloRepositoryImpl() }

        // MyViewModel ViewModel
        viewModel { MainViewModel(get()) }

        //
        factory { Person() }
    }
}
