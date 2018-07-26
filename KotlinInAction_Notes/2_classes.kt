import java.util.*
import kotlin.collections.ArrayList

/*
    KEY NOTES
    >   Implement Kotlin classes
    >   Declaring Properties
    >   Overriding Functions
    >   Writing Custom Accessors
 */
class basicPerson(val name: String) //Kotlin class

/*
    /* Java Equivalent*/

    public class Person {
        private final String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
 */

class moreThanBasicPerson(
        val name: String,
        val isMarried: Boolean
){
    override fun toString(): String{
        return "${this.name} is ${if(!this.isMarried) "not" else ""}married."
    }
}

class Rectangle(val height: Int, val width: Int){
    //  implementing a property accessor
    val isSquare: Boolean
        get(){
            return height == width
        }
    override fun toString(): String{
        return "Height: ${this.height} Width: ${this.width}"
    }
}

fun main(args: Array<String>){

    var array: Array<Any> = Array(5){i -> i * i}    //  fixed size array
    var arrayList: ArrayList<Any> = ArrayList<Any>()     //  dynamic size array

    var answer = 42 //  type is fixed after implicitly setting the variable
    //  Illegal statement: answer = "no answer"

    var person = basicPerson("Jeremy")
    println(person.name)

    var person2 = moreThanBasicPerson("Cletus", true)
    println(person2.toString())

    var myRectangle = Rectangle(12, 6)
    println(myRectangle.toString())

}