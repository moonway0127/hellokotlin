package xin.moonway._02_classandinterface._09_abstract

open class Base{
    open fun f(){}
}

abstract class Derived:Base() {
    override abstract fun f()
    abstract fun a()
    fun w(){
        println("w")
    }

}

    class sub :Derived(){
    override fun a() {

    }

    override fun f() {

    }


}

fun main(args: Array<String>) {
    sub().w()
}