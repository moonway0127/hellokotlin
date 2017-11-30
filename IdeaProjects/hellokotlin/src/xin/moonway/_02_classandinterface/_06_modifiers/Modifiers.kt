package xin.moonway._02_classandinterface._06_modifiers

open class Outer{
    private val a = 1
    protected open val b = 2
    internal val c =3
    val d =4 //默认public

    protected class Nested{
        public val e =5
    }

    inner class inner(){
        public val f =6
    }

    class Subclass:Outer(){
        //无法访问父类a
        //可以访问 b、c、d
        //Nested和e可以访问

         override val b = 5

        fun subFun():String{
            return ("a:获取失败，b:$b,c:$c,d:$d,e:${Outer.Nested().e},f:${Outer().inner().f}")
        }

    }
}

fun main(args: Array<String>) {
    var outher = Outer()

    //outher.a 无法使用（private）除本类均不可使用
    //Outer().b 无法使用（protected) 子类可引用
    Outer().c
    Outer().d
    //Outer.Nested()  无法使用（protected) 子类可引用
    Outer().inner().f


    //Outer.Subclass().b 在没有设置新的修饰符情况下自动使用父类中的修饰符
    Outer.Subclass().subFun()


}