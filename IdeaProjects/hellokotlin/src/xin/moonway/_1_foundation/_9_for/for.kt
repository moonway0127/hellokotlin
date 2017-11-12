package xin.moonway._1_foundation._9_for

fun main(args: Array<String>) {
    var arr = intArrayOf(2,4,6,8,10)
    for(item:Int in arr){
        println(item)
    }

    for(i in arr.indices){
        println("arr[$i] = ${arr[i]}")
    }

    for((a,b) in arr.withIndex()){
        println("arr[$a] = $b")
    }
}