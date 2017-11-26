package xin.moonway._01_foundation._06_if

fun main(args: Array<String>) {
    //标准条件
    var a:Int = 20
    var b = 30

    var max:Int
    if(a<b){
        max = b
    }else {
        max = a
    }

    var min:Int
    if(a<b){
        min = a
    }else{
        min = b
    }
    println("max:$max,min:$min")


    //将if语句作为表达式使用
    val max1 = if(a>b) a else b
    println(max1)

    val min1 = if(a<b){
        println("choose a")
        a
    }else{
        println("choose b")
        b
    }

    println("_______________________________________")
    println(min1)


}