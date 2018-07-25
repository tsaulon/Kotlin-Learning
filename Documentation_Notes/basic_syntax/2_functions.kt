package basic_syntax

//  create functions that finds sum of 2 arguments

//  Explicit return type
fun convSum(a: Int, b: Int) : Int{
    return a + b
}

//  Inferred return type
fun infSum(a: Int, b: Int) = a + b

//  (void === Unit) no value returned
//  Note: Considered redundant practice in IntelliJ IDE
fun voidSum(a: Int, b: Int) : Unit{
    println("Sum of $a and $b is ${a + b}")
}

//  (void === Unit) no value returned and omitting explicit declaration of Unit.
fun omitVoidSum(a: Int, b: Int) {
    println("Sum of $a and $b is ${a + b}")
}
fun main(args: Array<String>){

    println(convSum(12, 13))
    println(infSum(13, 14))
    voidSum(14, 15)
    omitVoidSum(16, 17)

}

//  Also, actually enjoying this language.