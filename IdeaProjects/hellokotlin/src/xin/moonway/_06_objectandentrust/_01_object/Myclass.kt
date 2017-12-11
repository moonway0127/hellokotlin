package xin.moonway._06_objectandentrust._01_object



open class MyClass(name: String){
    open var name = name
    open fun verify(){
        println("verify")
    }

    companion object {
        fun create():MyClass = MyClass("Bill")
    }
}


interface Myinterface{
    fun closeData(){
        println("closeData")
    }

}



fun process(obj:MyClass){
    obj.verify()
    if(obj is Myinterface){
        obj.closeData()
    }
}


fun foo(){
    val temp = object {
        var x:Int =0
        var y: Int = 0
    }
    println(temp.x+temp.y)

}

//声明匿名对象
class Myclass2{
    var w:Int =0

    private fun foo() = object{
        val x :String = "x"

    }

    fun publicFoo() = object {
        val x:String ="x"
    }

    val x1 = foo().x

    //public方法，返回值是Any
    //val x2 = publicFoo().x
}




fun main(args: Array<String>) {
    process(object :MyClass("Bill"),Myinterface{
        override fun verify() {
            println("object verify")
        }

        override fun closeData() {
            println("object closeData")
        }
    })
    //访问封闭作用域内的变量
    var n =20
    process(object :MyClass("Bill"){
        override fun verify() {
            if(n==20){
                n=30
                println("success"+n)

            }else{
                println("failed")
            }
        }
    })

    val instance = MyClass.create()

}