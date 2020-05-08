package exercicies

import java.lang.StringBuilder

fun reverseUsingSB(str: String): String {

    return StringBuilder(str).reverse().toString()
}

fun reverseUsingLoop(str: String): String {
    var sbPhrase = StringBuilder()
    var i = str.length - 1

    while (i >= 0) {
        sbPhrase.append(str[i])
        i--
    }
    return sbPhrase.toString()
}