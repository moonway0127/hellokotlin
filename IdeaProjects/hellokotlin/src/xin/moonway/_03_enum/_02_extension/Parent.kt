package xin.moonway._03_enum._02_extension

import xin.moonway._03_enum._02_extension.*

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}


open class Parent(val value: Int, val value2: Int) {
    var mValue1: Int = value
    var mValue2: Int = value2
    fun add(): Int {
        return mValue1 + mValue2
    }


    //伴随对象，解决kotlin类不支持静态成员的尴尬
    companion object {
        fun test() {
            println("test")
        }
    }

}

//扩展伴随对象
fun Parent.Companion.test2() {
    println("test2")
}


class Child(value1: Int, value2: Int) : Parent(value1, value2) {
    var mValue: Int = 66666
    fun sub(): Int {
        return mValue1 - mValue2
    }


}

fun Parent.printResult() {
    println("$mValue1+$mValue2 = ${add()}")
}


fun Child.printResult() {
    println("$mValue1-$mValue2 = ${sub()}")
}

var Child.value233: Int
    get() = mValue
    set(value) {
        mValue = value
    }


//在类中对其他类进行扩展
class D {
    fun bar() {
        println("D.bar")
    }

    //分别观察C、D类中toString的调用
    override fun toString(): String {
        return "D类"
    }
}

class C(val v: Int) {
    fun baz() {
        println(v)
    }

    fun D.foo() {
        bar()
        baz()
    }

    fun caller() {
        //var d:Int
        //d.foo()
        D().foo()
    }

    fun D.show() {
        println(toString())

        //想要调用C类中的toString或D中已经存在同名的函数 需要使用 this@C
        println(this@C.toString())
    }

    fun showString() {
        D().show()
    }


    //分别观察C、D类中toString的调用
    override fun toString(): String {
        return "C类"
    }

}




//写在顶层的扩展成员不能饿被继承 因为不能添加open关键字。但是在类中对另一个类扩展却可以添加open关键字
open class Z(){

}

class Z1():Z(){

}

open class Y{
    open fun Z.foo(){
        println("Z.foo in Y")
    }
    open fun Z1.foo(){
        println("Z1.foo in Y")
    }

    fun  caller(z:Z){

        z.foo()

    }
}

 class Y1:Y(){
     override fun Z.foo() {
         println("Z.foo in Y1")
     }

     override fun Z1.foo(){
         println("Z1.foo in Y1")
     }
 }



fun main(args: Array<String>) {
    val m = mutableListOf(1, 2, 3)
    m.swap(0, 2)
    println(m)
    var a: Parent = Parent(1, 2)
    var b: Parent = Child(1, 2)
    var c = Child(1, 2)



    a.printResult()
    b.printResult()
    println(c.value233)

    Parent.test()
    Parent.test2()
    println(Child(1, 2).add1(2, 3))
    C(233).caller()

    C(1).showString()

    //不能实现下面代码 只能在C类中访问扩展的D类成员
    //D().foo()


    Y().caller(Z())
    Y1().caller(Z())
    Y().caller(Z1())

}