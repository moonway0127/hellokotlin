package xin.moonway.array


fun main(args: Array<String>) {
    val arr1 = arrayOf(1,2,3,'a')
    println(arr1[3])
    arr1[2] = 'b'
    println(arr1[2])

    val arr2 = arrayOfNulls<Int>(10)
    println("arr2长度："+arr2.size)

    var n  = 0
    val arr3 =Array(10,{i -> (i*(n++)) })

    for ( w in arr3.indices){
        println(arr3[w])
    }



}