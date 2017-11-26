package xin.moonway._01_foundation._09_for

fun main(args: Array<String>) {
    var arr = intArrayOf(2, 4, 6, 8, 10)
    for (item: Int in arr) {
        println(item)
    }

    for (i in arr.indices) {
        println("arr[$i] = ${arr[i]}")
    }

    for ((index, value) in arr.withIndex()) {
        println("arr[$index] = $value")
    }
}