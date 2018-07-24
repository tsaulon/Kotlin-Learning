package basic_syntax

fun main(args: Array<String>){

    //  for loops
    val items = listOf("apple", "banana", "kiwifruit")
    var itemStr: String = "For: "
    for(item in items){
        itemStr += " $item${if(item != items.last()) ", " else ""}"
    }
    println(itemStr)

    //  while loops
    itemStr = "While: " //  reset
    var index = 0
    while(index < items.size){
       itemStr += "[$index]${items[index]}${if(items[index++] !== items.last()) ", " else ""}"
    }
    println(itemStr)

}