package xin.moonway._02_classandinterface._07_extend

//使用open 才可以被继承
open class Parent(){
    open val name1 = "moonway"
    protected var mname:String ="Bill"
    open fun getName():String{
        return mname
    }


}

//继承
class Child:Parent(){

    override val name1: String
        get() = "cool"

    fun printName(){
        println(mname)
        println(getName())
    }

    override fun getName():String{
        return "<"+super.getName()+">"
    }

}

fun main(args: Array<String>) {
    Child().printName()
    Child().getName()
}