fun main(args: Array<String>){
    //  Single Expression Returns on Functions

    println(square(3.14))   //  9.86
}

//  When a funtion returns a single expressions, the curly braces
//  and the body of the function can be omitted and instead be written
//  like this:
fun square(num: Double) : Double = String.format("%.2f", num * num).toDouble()  //  return square formatted to 2 decimals