package exercicies

fun countVowels(str: String): Int {
    var VOWELS = "aeiou"
    var totalvawels = 0
    for(letter in str) {
        if(letter.toLowerCase() in VOWELS) totalvawels++
    }
    return totalvawels
}

fun countConsonants(str: String): Int {
    var CONSONANTS = "bcdfghjklmnpqrstvwxyz"
    var totalConsonants = 0
    for(letter in str) {
        if(letter.toLowerCase() in CONSONANTS) totalConsonants++
    }
    return totalConsonants
}

fun countVolwelsFilter(str:String) = str.filter { it.toLowerCase() in "aeiou"}.length
