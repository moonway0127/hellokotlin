package xin.moonway._01_foundation._08_in

fun main(args: Array<String>) {
    var n = 25
    when(n){
        in 1..10 -> println("满足条件")
        in 11..20 -> println("不满足条件")
        !in 30..60 -> println("hello kotlin")
        else -> println("boom")
    }
}