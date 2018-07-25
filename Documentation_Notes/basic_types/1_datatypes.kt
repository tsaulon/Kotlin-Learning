import com.sun.org.apache.xpath.internal.operations.Bool

fun main(args: Array<String>){

    //  DATATYPES
    //  Integer values refer to  it's bit width

    val double: Double = 64.0
    val float: Float = 32.0F  //  requires trailing 'F'
    val long: Long = 64L   //  Optional but good practice needs trailing 'L'
    val integer: Int = 32
    val short: Short = 16
    val byte: Byte = 8
    val char: Char
    val boolean: Boolean

    //  NUMERIC LITERALS
    //  can use '_' to make numbers more readable
    val oneMillion: Int? = 1_000_000
    val creditCardNumber: Long? = 1234_5678_9012_3456L

    //  REPRESENTATION
    val a: Int = 10_000
    println(a === a) // true
    val boxedA: Int? = a                //  Int? signifies nullable reference value
    val anotherBoxedA: Int? = a

    println(boxedA === anotherBoxedA)   //  false
                                        //  comparing identities or references pointing to an address

    println(boxedA == anotherBoxedA)    // true
                                        // comparing value equality
}