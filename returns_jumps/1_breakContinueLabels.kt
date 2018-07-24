import com.sun.org.apache.xpath.internal.operations.Bool

fun main(args: Array<String>){

    //  Kotlin has 3 structural jump expression
    //  -   return
    //  -   break
    //  -   continue
}

fun foo(something: Boolean) : Any{
    val s = something ?: return 0
    return s
}

//  TODO: Continue reading 'Returns and Jumps' from 'Basics' in Kotlin documentation
//  https://kotlinlang.org/docs/reference/returns.html