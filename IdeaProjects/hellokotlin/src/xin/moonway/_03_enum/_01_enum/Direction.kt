package xin.moonway._03_enum._01_enum

enum class Direction{
    NORTH,SOUTH,WEST,EAST
}

enum class Direction1 private constructor(val d:Int){
    HORTH(1),SOUTH(2),WEST(3),EAST(4);

    override fun toString(): String {
        return d.toString()
    }


}


fun main(args: Array<String>) {
    var direction1 :Direction
    var direction2 :Direction = Direction.NORTH
    var direction3  = Direction.EAST
    var direction4 = Direction.EAST
    if (direction3==direction4){
        println("相同")
    }else{
        println("不同")
    }

    println(direction2)
    var direction5 = Direction1.EAST
    println(direction5)
    println(direction5.name)
    println(direction5.ordinal)
    println(Direction1.valueOf("WEST"))

    for (d in Direction1.values()){
        println(d)
    }
}

