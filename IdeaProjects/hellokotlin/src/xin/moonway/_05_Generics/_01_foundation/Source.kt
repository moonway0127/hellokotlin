
abstract class Source<out T>{
    abstract fun nextT():T
}

abstract class Comparable<in T>{
    abstract fun compareTo(other:T):Int
}

fun demo(strs:Source<String>){
    val objects:Source<Any> = strs
}

fun demo(x: Comparable<Number>){
    x.compareTo(1.0)
    val y: Comparable<Double> = x
}
