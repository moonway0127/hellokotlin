package xin.moonway._02_classandinterface._03_singleton

fun main(args: Array<String>) {
    var obj1 = Singleton.getInstance()
    var obj2 = Singleton.getInstance()
    println(obj1)
    println(obj2)
}