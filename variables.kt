fun main(args: Array<String>){

    //  Immutable Variables
    //  (Const) Immutable local variables declare as 'val'
    //  Undefined declarations are not allowed.
    val num: Int = 12;
    val string: String = "$num greetings from Based String Constant"
    println(string)

    //  Mutable Variables
    //  (var) mutable local variables declare as 'var'
    var x = 5  //  Inferred Type Declaration(Sets datatype based on value"
    var y: Int = 10 //  Explicit Type declaration
    println("$x + 1 = ${++x}")
    println("$y + 1 = ${++y}")

    //  Top level variables
    val PI = 3.14
    var foo = 2

    fun decrement() : Int{
        return --foo
    }
    println("Why be #$foo When you can be #${decrement()}?")
}