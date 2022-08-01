# UseKoin
Koin（依赖注入）-使用

### 基本概念
- 懒加载 与 立即加载
// Lazy Inject ViewModel，注入依赖
val mainViewModel: MainViewModel by viewModel()
// Inject ViewModel, not lazy
//    val mainViewModel: MainViewModel = getViewModel() //可能会报错：Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call

    // Lazy Inject Class
    val person: Person by inject()
    // Inject Class, not lazy
//    val person: Person = get()

### 基本语法

- startKoin

- module

- single

- factory

- viewmodel

- fragment

- by inject()/get()，前者在Android的运行时组件（AFSC）有效

- by viemwodel()/getViewModel()

- named()//限定标示符，string和type

- bind类似于类型扩展，接口实现，通过get<T>获取，泛型时候，koin.bind(T,instance)来获取，另有getAll（）
