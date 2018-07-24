import java.util.*

fun main(args: Array<String>){

    val dice1 = (1..5).random()
    val dice2 = (1..5).random()

    println("Dice 1: $dice1")
    println("Dice 2: $dice2")
    println("You rolled a ${dice1 + dice2}!")
}

fun ClosedRange<Int>.random() =
        Random().nextInt((endInclusive + 1) - start) +  start
