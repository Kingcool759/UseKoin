package com.example.myapplication

/**
 * @Author : zhaojianwei02
 * @Date : 2022/8/1 2:42 下午
 * @Description : 创建控制器类来操作仓库
 */
class TestPresenter(val person: Person) {
    fun getData() = "${person.introduce()} from $this"
}