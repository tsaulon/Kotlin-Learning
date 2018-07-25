class Person2(firstName: String){

    init{
        var name = firstName
    }

    constructor(parent: Person2){
        parent.children.add(this)
    }
}

fun main(args: Array<String>){

}

//  TODO: Pick up from 'Classes and Inheritance' inside Secondary Constructors
//  https://kotlinlang.org/docs/reference/classes.html