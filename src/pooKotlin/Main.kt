package pooKotlin
class Pessoa2(var nome: String, var nasc: Int)
class Pessoa3(var nome: String) {

    var nasc:Int? = null
    constructor(nome: String, nasc: Int) : this(nome) {
        this.nasc = nasc
    }
    constructor(nome: String, nasc: Int, nasc2:Int) : this(nome, nasc) {
        this.nasc = nasc
    }

    fun saudacao() {
        println("Olá $nome")
    }
}
class MaquinaMain(var marca:String) {
    var nucleos:Int = 0
    get() {
        println("Get foi chamado")
        return field
    }
    set(value) {
        println("set foi chamado")
        field = value
    }
}

fun main() {
    var m: MaquinaMain = MaquinaMain("LG");
    m.nucleos = 10
}