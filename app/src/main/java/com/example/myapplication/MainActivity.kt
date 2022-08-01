package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.getViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.name

    // Lazy Inject ViewModel，注入依赖
    val mainViewModel: MainViewModel by viewModel()
    // Inject ViewModel, not lazy
//    val mainViewModel: MainViewModel = getViewModel() //可能会报错：Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call

    // Lazy Inject Class
    val person: Person by inject()
    // Inject Class, not lazy
//    val person: Person = get()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // koin单独注入类
        person.name = "zjw"
        Log.d(TAG, person.introduce())
        // koin配合viewModel使用
        Log.d(TAG, mainViewModel.sayHello())
    }
}