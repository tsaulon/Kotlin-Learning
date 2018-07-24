package basic_syntax

fun main(args: Array<String>){

    val str = "Herp-derp!";

    println("Length of $str is ${getStringLength(str)}")
}

//  'is' operator checks if expression is instance of a type
//  If immutable variable or property is type checked, can omit explicit casting.
fun getStringLength(obj: Any) : Int?{
    return if(obj is String && obj.length > 0) obj.length else null
}