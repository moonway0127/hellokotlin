package xin.moonway._06_objectandentrust._01_object

open class Myclass(name: String){
    open var name = name
    open fun verify(){
        println("verify")
    }
}

fun process(obj:Myclass){
    obj.verify()
}

fun main(args: Array<String>) {
    process(object :Myclass("Bill"){
        override fun verify() {
            println("object verify")
        }
    })
}