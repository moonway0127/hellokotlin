package xin.moonway._1_foundation._7_when

fun main(args: Array<String>) {
    var x = 1
    when (x) {
        1 ->
            println("""x ==1
                        hello world
            """)

        2-> println("x==2")
        else ->{
            println("x is not:")
            println("1 or 2")
        }
    }
    //when 作为语句使用
    var temp = 4
    val a = when(temp){
        1,4 ->{
            println("""x ==1
                        hello world 2
            """)
            40
        }
        2-> println("x==2")
        else ->{
            println("x is not:")
            println("1 or 2")
        }
    }

    println(a)


    var w:Int = 4
    when(w){
        getValue(2) -> {
            println("满足")
        }
        getValue(3) ->{
            println("不满足")
        }
    }
}

fun getValue(x:Int):Int{
    return x*x
}