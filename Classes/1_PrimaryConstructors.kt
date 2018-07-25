//  Constructor can be added to class signature
//  Also, constructor identifier can be omitted if primary has no annotations or visibility modifiers
//  Example:
//      > With the keyword
//      > class Person constructor(firstName: String, ...)
//
//  Primary constructors do not contain code implementations
//  Implementations are created through 'init'
//  Also, implements C++ default params

class Person(firstName: String = "John", lastName: String = "Doe", age: Int = 1000){
    val name = "First property: ${firstName.plus(" $lastName").also(::println)}"

    init{
        println("First initializer block that prints $name")
    }

    val age = "Second property: $age".also(::println)

    init{
        println("Second initializer block that prints name: ${name.length}, and age: $age")
    }
}

fun main(args: Array<String>){

    val person = Person("Tyrone", "Saulon", 23)
    println(person.name)
}