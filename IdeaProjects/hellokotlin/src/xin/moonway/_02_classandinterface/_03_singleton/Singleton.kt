package xin.moonway._02_classandinterface._03_singleton

class Singleton private constructor() {
     var value: Singleton? = null
    private object mHolder{
        val INSTANCE = Singleton()
    }
    companion object Factory{
        fun getInstance():Singleton{
            return mHolder.INSTANCE
        }
    }


}