package pooKotlin

class Constants private constructor() {
        companion object BANCO{
        val TABLE_CONPANION = "Companion"
        fun metodoEstatico() {
            println("Sou um método estático")
        }
    }
    object VENDAS{
        val table_Object = "Object"
        object COLUNAS{
            val id = "Id"
            val total = "Total"
        }
    }
}

fun main() {
    println(Constants.BANCO.TABLE_CONPANION)
    Constants.BANCO.metodoEstatico()
    println(Constants.VENDAS.COLUNAS.id)
    println(Constants.VENDAS.COLUNAS.total)
}