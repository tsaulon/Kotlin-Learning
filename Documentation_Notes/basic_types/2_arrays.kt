import java.util.*

fun main(args: Array<String>){

    //  ARRAYS

    //  Creation Method 1
    //  creates an Array<String> with values ["0", "1", "4", "9", "16"]
    //  library functions arrayOf(1, 2, 3, ...) and arrayOfNulls() are also available
    val arr = Array(5){i -> (i * i).toString()} //  lambda expression can be moved outside of argument list
    println("First Array: ${Arrays.toString(arr)}")
    println("Concatenations".plus(arr.reduce{acc, element -> acc.plus(" $element")}))  //  0 1 4 9 16

    println()

    //  Creation Mathod 2
    //  In Kotlin, arrays are invariant and subject to one type passed into <template>
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
    println("Second Array: ${Arrays.toString(x)}")  //  [5, 2, 3]
    println("Sum:".plus(println(x.reduce{acc, element -> acc + element})))  //  10
}