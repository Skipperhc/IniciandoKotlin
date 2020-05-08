package colecoes

fun main(args: Array<String>) {
    val l1 = listOf("vitor","kimii","shazam")
    val l2 = mutableListOf("vitor","kimii","shazam")
//    l1.add
    l2.add("Geovana")
    val a1 = arrayListOf("vitor","kimii","shazam")

    val s1 = setOf("vitor","kimii","shazam", "shazam")
    val s2 = mutableSetOf("vitor","kimii","shazam", "shazam")

    val h1 = hashMapOf<String, String>(Pair("vitor", "Eu"),Pair("kimii", "fofa"),Pair("shazam", "heroi"))

    val m1 = mapOf(Pair("vitor", "Eu"),Pair("kimii", "fofa"),Pair("shazam", "heroi"))
    val m2 = mutableMapOf(Pair("vitor", "Eu"),Pair("kimii", "fofa"),Pair("shazam", "heroi"))
}