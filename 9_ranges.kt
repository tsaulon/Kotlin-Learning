fun main(args: Array<String>){

    val x = 10
    val y = 9

    //  CHECKING RANGES
    //  check if x is between 1 and 10 (9 + 1) using 'in' operator
    //  easier than righting x > 1 && x < 10
    if(x in 1..y+1)
        println("Within range")
    else
        println("Outside range")

    //  check outside range
    val list = listOf("a", "b", "c")

    //  check if -1 does not exist between 0 and the last index of 'list' @ [2]
    if(-1 !in 0..list.lastIndex){
        println("-1 is out of range")
    }

    //  check if the size of list is not within the range of indexes returned from list.indices
    if(list.size !in list.indices){
        println("list size is out of valid list indices range too")         //  list size is out of valid list indices range too
        println("${list.size} is outside the IntRange of ${list.indices}")  //  3 is outside the IntRange of 0..2
    }



    //  ITERATING RANGES
    for(x in 1..5)
        print("$x ".trim())     //  12345
    println()

    //  ITERATING RANGES OVER PROGRESSION
    //  iterate starting from 1 and increment 2 times every loop while
    //  x !== 10
    for(x in 1..10 step 2)
        print("$x ".trim())     //  13579
    println()

    //  iterate starting from 9 and decrement 3 times every loop while
    //  x !== 0
    for(x in 9 downTo 0 step 3){
        print("$x ".trim())     //  9630
    }
}