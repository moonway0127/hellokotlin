package xin.moonway._02_classandinterface._05_classmember

class ClassMember(){
    //只读
    val name:String
    get() = "BillKing"


    var flag:Boolean = true

    //读写
    var v =20
    var value:Int
    get() = v
    set(value) {
        v = value
        println("v被设置成${v}")
    }

    //使用field
    var age:Int =10
    get() = field
    set(value) {
        field =value
        println("age被设置成${field}")
    }

    fun description(){
        println("name:${name} value:${v} flag:${flag}")
    }

    fun defaultParameterFun(url:String,schema:String ="Https"){
        println("$schema://$url")
    }





}

class Other(){
    private val bar:Int =1
    //无法通过外部类实例引用
    class Nested(){
        fun foo() = 1
    }
    //可通过外部类实例引用
    inner class inner(){
        fun foo() = 2
    }
}



class ClassMembers{
    //可变参数个数
    fun addClassMembers(vararg classMembers: ClassMember):List<ClassMember>{
        val result = ArrayList<ClassMember>()
        for (classMember in classMembers){
            result.add(classMember)
        }
        return result
    }
}

fun main(args: Array<String>) {
    var c = ClassMember()
    c.description()
    println(c.name)
    println("value:${c.value}")
    c.value = 30
    println("value(change):${c.value}")

    println("age:${c.age}")
    c.age = 30
    println("age(change):${c.age}")

    c.defaultParameterFun("moonway.xin")

    var a:List<ClassMember>  = ClassMembers().addClassMembers(c, ClassMember(), ClassMember(),ClassMember())//.....and more

    println(a.get(0).age)
    println(a.get(1).age)


    var b = Other()
    println(b.inner())
    println(Other.Nested().foo())

}

