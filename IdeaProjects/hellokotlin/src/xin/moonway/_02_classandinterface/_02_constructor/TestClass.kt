package xin.moonway._02_classandinterface._02_constructor

class TestClass (firstName: String) {
    var a :Int = 0
    init {
        println(firstName)
    }

    constructor(value:Int):this("moonway.xin"){
        var test:Int = value
        a = value;
        println(a)
    }

    constructor(description:String, url:String):this("["+url+"]"){
        println(description+":"+url+"      "+a)
    }
    constructor():this(20){
        println("<https://moonway.xin>")
    }

}