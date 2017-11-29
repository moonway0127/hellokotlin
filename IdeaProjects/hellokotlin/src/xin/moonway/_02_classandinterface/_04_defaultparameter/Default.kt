package xin.moonway._02_classandinterface._04_defaultparameter

class Default(val defaultString:String = "BillKing",val defaultFloat:Float =3.141592F){
    init {
        println(defaultFloat)
        println(defaultString)
    }
}