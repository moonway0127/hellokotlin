package xin.moonway._06_objectandentrust._03_standardentrust

import kotlin.properties.Delegates

val lazyValue:String by lazy{
    //该属性初始化函数的执行部分，只有第一次访问该属性是才会调用
    println("computed!")
    "hello"
}



class User{
    var name :String by Delegates.observable("Mike"){
        property, oldValue, newValue ->
        println(oldValue+"   "+newValue)
    }
}

fun main(args: Array<String>) {
    println(lazyValue)
    println(lazyValue)
    var user = User()
    user.name = "Bill"
    user.name = "John"
}