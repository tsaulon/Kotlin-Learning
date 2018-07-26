//  Declaring Enumerators
enum class basicColor{
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

enum class awesomeColor(
        val r: Int, val g: Int, val b: Int
){
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);  //  semicolon required to finish enums list
    fun rgb() = (r * 256 + g) * 256 + b
}

fun main(args: Array<String>){
    println(awesomeColor.BLUE.rgb())
    println(getMnemonic((awesomeColor.BLUE)))
    println(mix(awesomeColor.YELLOW, awesomeColor.BLUE)) // returns the enum type
    try{
        println(mix(awesomeColor.YELLOW, awesomeColor.INDIGO))
    } catch(e: Exception){
        println(e.message)
    }
}

//  Using 'when' to deal with enumerated classes
fun getMnemonic(color: awesomeColor) = when(color){
    awesomeColor.RED -> "Tyrone"
    awesomeColor.BLUE -> "Made"
    awesomeColor.GREEN -> "A"
    awesomeColor.INDIGO -> "Delicious"
    awesomeColor.ORANGE -> "Salad"
    awesomeColor.VIOLET -> "In"
    awesomeColor.YELLOW -> "Vain"
}

//  Using 'when' with arbitrary objects
//  IMPORTANT: Remember useful utility of setOf()
fun mix(c1: awesomeColor, c2: awesomeColor) = when(setOf(c1, c2)){
    setOf(awesomeColor.RED, awesomeColor.YELLOW) -> awesomeColor.ORANGE
    setOf(awesomeColor.YELLOW, awesomeColor.BLUE) -> awesomeColor.GREEN
    setOf(awesomeColor.BLUE, awesomeColor.VIOLET) -> awesomeColor.INDIGO
    else -> throw Exception("Dirty Color")
}

//  Using 'when' without an argument
//  Personally, this implementation is too redundant
fun mixOptimized(c1: awesomeColor, c2: awesomeColor) = when{
    (c1 == awesomeColor.RED && c2 == awesomeColor.YELLOW) ||
    (c1 == awesomeColor.YELLOW && c2 == awesomeColor.RED) ->
            awesomeColor.ORANGE
    (c1 == awesomeColor.BLUE && c2 == awesomeColor.YELLOW) ||
    (c1 == awesomeColor.YELLOW && c2 == awesomeColor.BLUE) ->
        awesomeColor.GREEN
    (c1 == awesomeColor.BLUE && c2 == awesomeColor.VIOLET) ||
    (c1 == awesomeColor.VIOLET && c2 == awesomeColor.BLUE) ->
        awesomeColor.INDIGO
    else -> throw Exception("Dirty Color")

}