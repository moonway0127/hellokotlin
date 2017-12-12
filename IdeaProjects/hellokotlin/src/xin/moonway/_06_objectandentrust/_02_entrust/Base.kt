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
    var name: String = ""

    //调用委托属性的getter函数，会调用委托类的getValue函数
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        //获取 thisRef指定的类名
        val className = thisRef.toString().substringBefore('@')
        println("${className}.get 已经被调用")
        return name
    }

    //调用委托属性的setter函数，会调用委托类的setValue函数
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        //获取thisRef指定的类名
        val className = thisRef.toString().substringBefore('@')
        println("${className}.set 已经被调取")
        name = value
    }


}


class MyClass1(){
    var name : String by Delegate()
}


class MyClass2(){
    var name : String by Delegate()
}

fun main(args: Array<String>) {
    val b = BaseImpl(10)
    Derived(b).print()

    var c1 = MyClass1()
    var c2 = MyClass2()
    c1.name = "Bill"
    c2.name = "Mike"
    println(c1.name)
    println(c2.name)
}