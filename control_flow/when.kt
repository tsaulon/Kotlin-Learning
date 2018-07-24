fun main(args: Array<String>){

    //  WHEN OPERATOR
    //  replaces the switch operator (Look into performance comparisons)
    var x = 2
    when(x){
        1 -> print("The AI singularity is imminent!")
        2 -> print("Look at that spaghetti!")
        //  set default route
        else -> {
            //  can implement code blocks per route
            print("x is neither 1 nor 2")
        }
    }

    println()

    //  combining branch conditions
    when(--x){
        0, 1 -> print("Share the load Frodo")
        else -> print("otherwise")
    }

    println()

    val validNumbers = 0..1 //  expressing a range

    //  checking for ranges
    when(x){
        in validNumbers -> print("x is valid")
        in 1..10 -> print("x is in the range")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }

    println()

    println("It is ${!hasPrefix(x)} that $x has no prefix")
    println("It is ${hasPrefix("prefix Hello")} that 'prefix Hello' has a prefix")

    println()


    //  Assumes x is an object and calling internal methods
    //  No arguments passed to 'when' but results are deduced based
    //  on what expression returns true first.

    /*
        when{
            x.isOdd() -> print("x is odd")
            x.isEven() -> print("x is even")
            else -> print("x is funny like that")
        }
    */

}

//  functions implementation
fun hasPrefix(x: Any) = when(x){
    is String -> x.startsWith("prefix")
    else -> false
}