package basic_syntax

//If Statements Implementation

fun main(args: Array<String>){

    var x = 10
    var y = 20

    //  Conventional Declaration
    if(max(x, y)){
        println("$x is greater than $y");
    } else{
        println("$x is not greater than $y");
    }

    //  Ternary Operations (Kind of...)
    println(if(max(++x, ++y)) "$x is greater than $y" else "$x is not greater than $y")

}

fun max(a: Int, b: Int): Boolean {
    return a > b
}