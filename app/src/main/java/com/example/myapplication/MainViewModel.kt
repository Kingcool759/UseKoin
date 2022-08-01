package com.example.myapplication

import androidx.lifecycle.ViewModel

/**
 * @Author : zhaojianwei02
 * @Date : 2022/8/1 2:07 下午
 * @Description :
 */
class MainViewModel(val repo: HelloRepository): ViewModel() {
    fun sayHello() = "${repo.giveHello()} from $this"
}