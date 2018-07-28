import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

//  Towers of Hanoi

fun main(args: Array<String>){

    towers(3, 'a', 'b', 'c')

}

fun towers(size: Int, from: Char, to: Char, spare:Char){
    when(size){
        1 -> println("Move disk from $from to $to")
        else -> {
            towers(size - 1, from, spare, to)
            towers(1, from, to, spare)
            towers(size-1, spare, to, from)
        }
    }
}