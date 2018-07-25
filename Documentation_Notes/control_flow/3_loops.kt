fun main(args: Array<String>){

    //  LOOPS

    val collection = listOf("Newt's Tail", "Rat's hair", "Rotting mollusk")


    //FOR LOOPS

    //  conventional
    for(item in collection)
        print(item + " ")

    println()

    //  'for' iterate through anything that provides an 'iterator'
    //  has members or extensions:  > iterator()
    //                              > next()
    //                              > hasNext()

    val ints = Array(5){i -> (i * i) + 5}
    for(item: Int in ints){
        print(item.toString() + " ")
    }

    //  iterating through a range
    for(i in 1..3)
        print(i)

    println()

    //  iterating through a range with an explicit increment
    for(i in 6 downTo 0 step 2)
        print(i)

    println()

    //  iterating through an indexed data structure
    for( i in ints.indices){
        print(ints[i])
    }

    println()

    //  WHILE LOOPS

    var x = 10

    println(x)

    while(x > 0){
        x--
    }

    println(x)

    do{
        x++
    } while(x < 10)

    println(x)
}