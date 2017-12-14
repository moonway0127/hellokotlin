package xin.moonway._06_objectandentrust._03_standardentrust

val lazyValue:String by lazy{
    //该属性初始化函数的执行部分，只有第一次访问该属性是才会调用
    println("computed!")
    "hello"
}

fun main(args: Array<String>) {
    println(lazyValue)
    println(lazyValue)
}