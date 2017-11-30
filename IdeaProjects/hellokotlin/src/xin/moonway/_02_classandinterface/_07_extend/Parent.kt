package xin.moonway._02_classandinterface._07_extend

//使用open 才可以被继承
open class Parent(){
    protected var mname:String ="Bill"
    fun getName():String{
        return mname
    }


}

//继承
class Child:Parent(){
    fun printName(){
        println(mname)
        println(getName())
    }


}

fun main(args: Array<String>) {
    Child().printName()
}