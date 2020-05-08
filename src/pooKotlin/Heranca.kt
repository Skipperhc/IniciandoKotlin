package pooKotlin

open class MaquinaHeranca(val marca:String) {
    open fun minhaMarca() {
        println("Minha marca $marca")
    }
}

private class ComputadorHeranca(marca:String, val nucleos:Int) : MaquinaHeranca(marca) /*herança no kotlin, tem de "chamar" a classe pai*/{
    //override
    override fun minhaMarca() {//override da classe pai, só adicionar o override no inicio
        println("Minha marca sobrescrita $marca")
    }

    fun minhaMarcaPai() {
        super.minhaMarca()//chamando metodo da classe pai
    }

    fun ligar() {}
    fun desligar() {}
    //overload
    fun ligar(programasIniciais:String) {println("iniciando os programas $programasIniciais")}// sobrecarga no kotlin
    fun desligar(guardarProgramas:String) {println("Guardando os programas $guardarProgramas")}//sobrecarga no kotlin
    private fun privado() { println("Essa frase é privada") }
}

fun main() {
    val c:ComputadorHeranca = ComputadorHeranca("LG", 8)
    with(c) {
        ligar()
        minhaMarcaPai()
        desligar()
        ligar("Discord")
        minhaMarca()
        desligar("Abas navegador")
    }
}