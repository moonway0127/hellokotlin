package xin.moonway.foundation.packagedemo
import xin.moonway.foundation.packagedemo.getName
//别名
import  xin.moonway.foundation.packagedemo.getName as f


fun main(args: Array<String>) {
    println(xin.moonway.foundation.packagedemo.getName())
    println(xin.moonway.foundation.packagedemo.Myclass())
    println(getName())
    println(Myclass())
    println(f())
}