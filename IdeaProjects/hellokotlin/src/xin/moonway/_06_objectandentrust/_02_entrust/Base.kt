package xin.moonway._06_objectandentrust._02_entrust

import kotlin.reflect.KProperty


/***
 * 委托
 */
interface Base {
    fun print()
    fun a() {}
}

class BaseImpl(val x: Int) : Base {
    override fun print() {
        print(x)
    }

}

class Derived(b: Base) : Base by b {
    fun getName(): String {
        return "Bill"
    }
}


//委托类

class Delegate {

    //用于保存属性值的成员变量
    var a: String = ""

    //调用委托属性的getter函数，会调用委托类的getValue函数
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        //获取 thisRef指定的类名
        val className = thisRef.toString().substringBefore('@')
        println("${className}.get 已经被调用")
        return a
    }

    //调用委托属性的setter函数，会调用委托类的setValue函数
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        //获取thisRef指定的类名
        val className = thisRef.toString().substringBefore('@')
        println("${className}.set 已经被调取")
        a = value
    }


}

class MyClass1(){
    var name : String by Delegate()
    var age : String by Delegate()
}


class MyClass2(){
    var name : String by Delegate()
}


//委托类的初始化函数


class Delegate1<T>(initializer: () -> T){
    var name:String  =""
    var className = initializer()
    operator fun getValue(thisRef: Any?,property: KProperty<*>):String{
        println("${className}.get 已被调用")
        return name
    }

    operator fun setValue(thisRef: Any?,property: KProperty<*>,value: String){
        println("${className}.set 已被调用")
        name =value
    }
}

public fun<T>delegate(initializer:()->T):Delegate1<T> = Delegate1(initializer)

class MyClass3{
    //name 委托给了delegate函数，并指定了初始化函数
    var name:String by delegate {
        //这里的代码是委托类的初始化函数（通过主构造器传入）
        println("MyClass3.name 初始化函数调用")
        "<MyClass3>" //初始化函数返回的字符串
    }
}

class MyClass4{
    //name 委托给了delegate函数，并指定了初始化函数
    var name:String by delegate {
        //这里的代码是委托类的初始化函数（通过主构造器传入）
        println("MyClass4.name 初始化函数调用")
        "<MyClass4"
    }
}

fun main(args: Array<String>) {
//    val b = BaseImpl(10)
//    Derived(b).print()
//
//    var c1 = MyClass1()
//    var c2 = MyClass2()
//    c1.name = "Bill"
//    c1.age = "11"
//    c2.name = "Mike"
//    println(c1.name)
//    println(c1.age)
//    println(c2.name)

    var c3 = MyClass3()
    var c4 = MyClass4()

    c3.name = "Bill"
    c4.name = "Mike"
    println(c3.name)
    println(c4.name)






}