package xin.moonway._05_Generics._01_foundation

class Box<T>(t:T){
    var value = t
}


fun main(args: Array<String>) {
    var box1:Box<Int> = Box(1)
    var box2:Box<String> = Box("monkey")

    println(box1.value)
    println(box2.value)


}