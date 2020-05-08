package pooKotlin

interface MaquinaInterface {
    fun ligar()
    fun desligar() {
        println("OFF")
    }
}

class ComputadorInterface() : MaquinaInterface {
    override fun ligar() {
        println("Ligando")
    }

    override fun desligar() {
        super.desligar()
    }
}

interface Interface1{
    fun tchau() {
        println("tchau interface 1")
    }
    fun ola() {
        println("interface 1")
    }
}
interface Interface2{
    fun tchau()
    fun ola() {//nunca implementei uma interface com código pronto
        println("interface 2")
    }
}
class ImplementaInterfaces : Interface1, Interface2 {//o que está acontecendo AQUIII
    override fun tchau() {
        super.tchau()
    }

    override fun ola() {
        super<Interface1>.ola()
        super<Interface2>.ola()
    }

}

fun main() {
    var c = ComputadorInterface()
    c.ligar()
    c.desligar()
    var i = ImplementaInterfaces()
    i.ola()
    i.tchau()
}