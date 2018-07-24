fun main(args: Array<String>){

    //  IF STATEMENTS

    //  conventional
    val a = 0
    val b = 1
    var max = a
    if(a < b) max = b

    //  using else
    var maxDeux: Int
    if(a > b)
        maxDeux = a
    else
        maxDeux = b

    //  as expression
    val maxTrois = if(a > b) a else b

    //  as expression w/ block use
    //  Note: Last expression will define the value of the code block
    val maxQuatre = if(a > b){
        print("I AM NOW CHOOSING A!!!")
        a
    } else{
        print("I don't want to BE choosing b ;)")
        b
    }
}