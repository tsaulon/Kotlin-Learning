fun main(args: Array<String>){
    //Replace all vowel to exclamation mark in the sentence.
    println(replace("HI!"))
}

fun replace(s: String): String{
    //  replace, case non-sensitive, all vowels with '!'.
    return s.replace(Regex("[aeiou]", RegexOption.IGNORE_CASE), "!")
}