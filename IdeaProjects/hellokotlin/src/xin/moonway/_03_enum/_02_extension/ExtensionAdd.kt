package xin.moonway._03_enum._02_extension

import xin.moonway._03_enum._02_extension.Parent

fun Child.add1(value:Int,value1:Int):String{
    mValue1 = value
    mValue2 = value1

    return "$mValue1,$mValue2"
}