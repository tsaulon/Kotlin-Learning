import basic_syntax.parseInt

fun main(args: Array<String>){
    println(invertColor("#FFFFFF"))
}

fun invertColor(hex: String): Any?{
    val tmp: String = hex.substring(1, hex.length)

    println(0x0ff.toString())

    return "0x${tmp.slice(0..1)}".toLong()
}

//  TODO: Find solution to convert hexadecimal numbers to be represented as actual integers.