package pooKotlin

class PessoaLateInit {
    lateinit var nome:String // to falando que essa variavel só vai ser inicializada depois
    var nome2:String? = null // to falando que essa variavel só vai ser inicializada depois
    fun geradorNome(s:String) {
        nome = s
        nome2?.length
        nome.length
    }
}

fun main() {
    val p = PessoaLateInit()
    p.geradorNome("predro")
    println(p.nome)
}