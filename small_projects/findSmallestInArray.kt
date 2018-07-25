import java.util.*

fun main(args: Array<String>){
    println(getSmallest(Array(10){i -> i * i + 4}))
    //  TODO: implement for a List object
}

fun getSmallest(array: Array<Int>): Int?{
    return array.min()
}