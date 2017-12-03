package xin.moonway._03_enum._03_sealed

/***
封闭类 可以理解为枚举类的扩展功能

 ***/


sealed class Expr

data class Const(val number:Double):Expr()
data class Sum(val e1:Expr,val e2:Expr):Expr()
object NotANumber :Expr()



fun eval(expr: Expr):Double =when(expr){
        is Const -> expr.number
        is Sum -> eval(expr.e1)+ eval(expr.e2)
        NotANumber -> Double.NaN
    }


fun main(args: Array<String>) {

    println(eval(Const(1.0)))

    println(Sum(Const(2.0),Const(3.0)))


}