package xin.moonway._02_classandinterface._08_interface

import xin.moonway._01_foundation._05_package.Myclass

interface MyInterface{
    fun process()
    fun getName():String{
        return "Bill"
    }

}

class MyClass:MyInterface{
    override fun process() {
    println("process")
    }

    //在kotlin中 接口中的方法可以设置默认方法体 并且可以选择不重写

}

fun main(args: Array<String>) {
    MyClass().process()
    MyClass().getName()
}