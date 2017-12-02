package xin.moonway._04_dataclass._01_dataclass

//普通类
class User(name:String,age:Int){
    var name :String = name
    get() = field
    set(value) {field = value}

    var age:Int = age
    get() = field
    set(value) {field = value}

    override fun toString(): String {
        return "name:$name,age:$age."
    }

    override fun equals(other: Any?): Boolean {

        return other is User&&name==other.name&&age == other.age

    }

}

//数据类
data class User_data(val name:String ,val age :Int)


fun main(args: Array<String>) {
    var user1 = User("moonway",18)
    var user2 = User("moonway",18)
    println(user1)
    println(user2)
    println(user1.equals(user2))

    println("-------------------------------------------------------")
    var data1 = User_data("moonway",18)
    var data2 = User_data("moonway",18)
    println(data1)
    println(data2)
    println(data1.equals(data2))

}