package pooKotlin

enum class Prioridade1 {
    BAIXA, MEDIO, ALTA
}

enum class Prioridade2(val id:Int) {
    BAIXA(id = 1), MEDIO(id = 2), ALTA(id = 3)
}

private class Alarme(var desc:String, var p:Prioridade2)

fun main() {
    val ala: Alarme = Alarme("asd", Prioridade2.BAIXA)
    var text = if(false)ala.desc else ala.p.id
    for(p in Prioridade2.values()) {
        println("$p - ${text}")
    }
    ala.desc = "asdasd"

    var func:(qtd:Int, qtd2:Int, qtd3:Int) -> Int = {valor, valor2, valor3->
        valor3 + valor + valor2
    }
    println(func.invoke(23,40,100))
}