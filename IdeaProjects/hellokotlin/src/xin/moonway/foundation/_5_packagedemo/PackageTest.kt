package xin.moonway.foundation._5_packagedemo
import xin.moonway.foundation._5_packagedemo.getName
//别名
import  xin.moonway.foundation._5_packagedemo.getName as f


fun main(args: Array<String>) {
    println(xin.moonway.foundation._5_packagedemo.getName())
    println(xin.moonway.foundation._5_packagedemo.Myclass())
    println(getName())
    println(Myclass())
    println(f())
}