package xin.moonway.foundation.string

fun main(args: Array<String>) {
    val i =10
    val s1 = "i = $i"
    println(s1)

    val s2 = "abc"
    val str = "$s2 的长度是 ${s2.length}"
    println(str)

}