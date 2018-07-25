import com.sun.org.apache.xpath.internal.operations.Bool

fun main(args: Array<String>){

    //  Kotlin has 3 structural jump expression
    //  -   return
    //  -   break
    //  -   continue

    fun foo(something: Boolean?){
        val s = something ?: return //  return if the parameter is null
    }

    //  Labels - Expression Identifiers
    foo@ for(i in 1..100){
        if(i === 2) {
            println("Stopped at 2 label@foo")
            break@foo   //  or 'continue'
        }
    }

    println("Iterations")
    foo()
    println()
    bar()
    println()
    baz()

}

//  Explicitly calling Lambda Expression's identifier
fun foo(){
    return listOf(1, 2, 3, 4, 5).forEach lit@{
        if(it == 3) return@lit
        print("$it ")
    }
}

//  Implicitly calling the Lambda Expression of the calling function (forEach)
fun bar(){
    return listOf(1, 2, 3, 4, 5).forEach{
        if(it == 3) return@forEach
        print("$it ")
    }
}

//  JS Anonymous function styles
fun baz(){
    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int){
        if(value == 3) return
        print("$value ")
    })
}