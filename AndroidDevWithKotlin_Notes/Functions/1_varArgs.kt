fun main(args: Array<String>){

    //  USING VARARGS (Similar to rest usage in JS)
    println(printSum(1, 2, 3, 4, 5, 6, 7, 8, 9))    //  45
    println(printSum()) //  0
    println(printAll("Lions", "Tigers", "Bears", "oh my"))  //  Lions,Tigers,Bears,oh my
    println(printAll2("All texts: ", "!", "Nice", "To", "Meet", "Kotlin"))  //  All texts: Nice,To,Meet,Kotlin!
    println(printAllTypes("A", 1, 2, 3, "ABCD"))    //  A,1,2,3,ABCD

    val texts = arrayOf("B", "C", "D")
    //  Using the spread operator to pass all elements of texts as arguments (Much like the ... rest operator in JS)
    println(printAll("A", "E", *texts))
}

fun printSum(vararg numbers: Int): Int{
    return numbers.sum()
}

fun printAll(vararg strings: String): String{
    return strings.joinToString(",")
}

//  Can specify more arguments before or after vararg. Argument direction must be clear.
fun printAll2(prefix: String, postfix: String, vararg texts: String): String{
    return "$prefix${texts.joinToString(",")}$postfix"
}

//  Using varargs with mixed types
fun printAllTypes(vararg texts: Any): String{
    return texts.joinToString(",")
}