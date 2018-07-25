fun main(args: Array<String>){

//  STRICT NULL SAFETY
//  explictly defines a variable to have permissions to store a null value.
/*  val name: String = null   //  Error */
    var name: String? = null
    println(name)

    //  null checking
    toUpper(name)
    name = "Cletus"
    toUpper(name)

    var nullString: String?
    var string: String

    nullString = "a string"
    string = nullString
    println(string)

    //  Type definitions when defining generic types
    var dec1: ArrayList<Int>    //  ArrayList of Integer elements
    var dec2: ArrayList<Int>?   //  ArrayList of Integer elements where identifier can be null
    var dec3: ArrayList<Int?>   //  ArrayList of possibly null Integer elements where identifier CANNOT be null
    var dec4: ArrayList<Int?>?  //  AraryList of possibly null Integer elements where identifier can be null
}

fun toUpper(name: String?){
    //  Cannot perform method calls to nullable object unless null check is performed prior.
    if(name != null)
        println(name.toUpperCase())
}
