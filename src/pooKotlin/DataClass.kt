package pooKotlin

class Quadrado(val area: Float)
data class Triangulo(val area:Float)

fun teste(b:Boolean, s:String, i:Int) {

}
fun main() {
    var q1 = Quadrado(10f)
    var q2 = Quadrado(10f)
    var t1 = Triangulo(10f)
    var t2 = Triangulo(10f)

    println(q1.toString())
    println(t1)

    println(q1 == q2)
    println(t1 == t2)

    println(q1.hashCode())
    println(q2.hashCode())
    println(t1.hashCode())
    println(t2.hashCode())

    val t3 = t2.copy()
    println(t3)
}