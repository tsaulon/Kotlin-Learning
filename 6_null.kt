//  Handling Null Datatypes
fun main(args: Array<String>){
    printProduct("12", "15")    //  180
    printProduct("Ham", "Eggs") //  java.lang.NumberFormatException: For input string: "Ham"
}

//  Return null if str does not hold an integer
fun parseInt(str: String) : Int?{
    return str.toInt();
}

//  Example:
fun printProduct(a: String, b: String){

    try {
        val x = parseInt(a)
        val y = parseInt(b)

        if(x !== null && y !== null)
        println(x * y)

    } catch(e: Exception){
        println(e.message);
    }
}

//  TODO: Pick up from 'Using type checks and automatic casts' from 'Basic Syntax' Kotlin Documentation.