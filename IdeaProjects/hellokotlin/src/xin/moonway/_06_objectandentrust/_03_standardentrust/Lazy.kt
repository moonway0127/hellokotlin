package xin.moonway._06_objectandentrust._03_standardentrust

import kotlin.properties.Delegates

val lazyValue:String by lazy{
    //该属性初始化函数的执行部分，只有第一次访问该属性是才会调用
    println("computed!")
    "hello"
}

//可观察属性
class User{
    var name :String by Delegates.observable("Mike"){
        property, oldValue, newValue ->
        println(oldValue+"   "+newValue)
    }
}




//阻止属性的赋值操作
class User1{
    var name:String by Delegates.vetoable("Mike"){
        property, oldValue, newValue ->
        println("old:$oldValue,new:$newValue")
        var result = true
        //Name属性值不能是mary
        if(newValue.equals("Mary")){
            result = false
            println("name 不能是mary")

        }
        result
    }
}


fun main(args: Array<String>) {
    println(lazyValue)
    println(lazyValue)
    var user = User()
    user.name = "Bill"
    user.name = "John"

    var user1 = User1()
    user1.name = "Bill"
    println(user1.name)
    user1.name = "Mary"
    println(user1.name)

}