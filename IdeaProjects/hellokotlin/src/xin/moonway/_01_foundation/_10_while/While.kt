package xin.moonway._01_foundation._10_while

fun main(args: Array<String>) {
    var i = 0
    while (i++ < 10) {
        println(i)
    }

    do {
        if (i == 6)
            continue
        println(i)
        if (i == 5)
            break
    } while (--i > 0)
}