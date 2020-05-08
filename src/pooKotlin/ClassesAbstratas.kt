package pooKotlin

abstract class Mamifero(var nome:String) {//colocando o abstract na frente definimos a classe abstrata

    var peso:Float = 0f
    abstract fun falar()//mema coisa para
    fun dormir() {
        println("Estou dormindo")
    }
}

class Cachorro(nome:String, meuPeso:Float) : Mamifero(nome){
    init { //não entendi isso direito, é um construtor?
        this.peso = meuPeso
    }

    override fun falar() {
        println("au au")
    }
}
class Gato(nome:String) : Mamifero(nome){
    override fun falar() {
        println("Certamente dominarei o mundo")
    }
}

fun main() {
    var c = Cachorro("catchoro", 100f).falar()
    var g = Gato("catchoro").falar()
}