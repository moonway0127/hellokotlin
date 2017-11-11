package xin.moonway.char

fun decimalDigitValue(a: Char):Int{
    if(a !in '0'..'9'){
        throw IllegalAccessException("boom")
    }
    return a.toInt()-'0'.toInt()
}

fun main(args:Array<String>){

    println(decimalDigitValue('9'))
}