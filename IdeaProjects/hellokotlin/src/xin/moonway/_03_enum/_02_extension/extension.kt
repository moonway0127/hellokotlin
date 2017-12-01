package xin.moonway._03_enum._02_extension

fun MutableList<Int>.swap(index1:Int,index2:Int){
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

fun main(args: Array<String>) {
    val m = mutableListOf(1,2,3)
    m.swap(0,2)
    println(m)
}