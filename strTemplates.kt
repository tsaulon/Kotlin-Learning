import java.util.Date
import java.time.LocalDateTime
fun main(args: Array<String>){

    var a = 1
    val s1 = "a is $a"

    a = 2
    val s2 = "${s1.replace( Regex("is"), "was")}, but now is $a"
    println(s2)
}