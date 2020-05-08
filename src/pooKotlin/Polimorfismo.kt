package pooKotlin

import com.sun.corba.se.spi.legacy.connection.GetEndPointInfoAgainException

interface Funcionario{
    fun calculaBonus()
}

class Gerente : Funcionario {
    override fun calculaBonus() {
        println("Bonus: 500")
    }
}

class Tecnico : Funcionario {
    override fun calculaBonus() {
        println("Bonus: 200")
    }
}

class Analista : Funcionario {
    override fun calculaBonus() {
        println("Bonus: 300")
    }
}

fun main() {
    var f1:Funcionario = Gerente()
    var f2:Funcionario = Tecnico()
    var f3:Funcionario = Analista()

    f1.calculaBonus()
    f2.calculaBonus()
    f3.calculaBonus()

    calculo(f1)
    calculo(f2)
    calculo(f3)
}

fun calculo(funcionario:Funcionario) {
    funcionario.calculaBonus()
}