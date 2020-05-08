package colecoes

data class Comida(val nome:String, val calorias:Double, val ingredientes:List<Ingrediente> = listOf())
data class Ingrediente(val nome:String, val quantidade:Int)

fun main() {
    val data = listOf(
            Comida("Lasanha", 1200.0,
                        listOf(Ingrediente("Farinha",1),
                                Ingrediente("Presunto",5),
                                Ingrediente("Queijo",10),
                                Ingrediente("Molho de tomate",2),
                                Ingrediente("Manjericão",3)
                        )
                    ),
            Comida("Panqueca", 500.0),
            Comida("Omelete", 200.0),
            Comida("Parmegiana", 700.0),
            Comida("Sopa de feijão", 300.0),
            Comida("Hamburguer", 2000.0,
                    listOf(Ingrediente("Pão", 1),
                            Ingrediente("Hamburguer", 3),
                            Ingrediente("Queijo", 1),
                            Ingrediente("Catupiry", 1),
                            Ingrediente("Bacon", 3 ),
                            Ingrediente("Alface", 1),
                            Ingrediente("Tomate", 1)
                    ))

    )

    println("Tenho receitas? ${if(data.any()) "Sim eu tenho" else "Não tenho"}")

    println("\nQuantas receitas eu tenho na coleção?")
    println("Tenho exatamente ${data.count()} receitas")

    println("\nQual a primeira e a ultima receita?")
    println("A 1°: ${data.first().nome} e a ultima ${data.last().nome}")

    println("\nQual é a soma das calorias?")
    val sumCalorias = data.sumByDouble { it.calorias }
    println("A soma das calorias é: $sumCalorias")

    println("\nMe dê as duas primeiras receitas")
    val duasPrimeiras = data.take(2)
    for(x in duasPrimeiras.withIndex()) {
        println("Index na lista: ${x.index + 1} e o valor: ${x.value.nome}")
    }

    println("\nEu se fazer panqueca? e sushi?")
    var seiFazer:(nome:String) -> List<Comida> = {nome -> data.filter { it.nome.equals(nome) }}
    println("${if(seiFazer("Panqueca").any()) "Eu sei fazer" else "Não sei fazer"} panqueca")
    println("${if(seiFazer("Sushi").any()) "Eu sei fazer" else "Não sei fazer"} sushi")
    // isso daqui está certo?

    println("\nQuais são as comidas com mais de 500 calorias")
    println("\nAs comidas com mais de 500 calorias")
    var maisCaloriasQueX:(minCalories:Double) -> Unit = {minCalorias ->
        data.filter { it.calorias > minCalorias }.forEach { println(it.nome)}}
    maisCaloriasQueX(500.0)

    println("\nPar das comidas com mais de 500 calorias")
    var parComMaisCaloriasQueX:(minCalories:Double) -> Unit = {minCalorias ->
        data.filter { it.calorias > minCalorias }
                .map { Pair(it.nome, it.calorias) }
                .forEach{ println("${it.first}: ${it.second} calorias")} }
    parComMaisCaloriasQueX(500.0)

    println("\nQuais das receitas possuem farinha como ingrediente")
    var receitaTemIngrediente:(list: List<Ingrediente>, ingrediente:String) -> Boolean = {list, ingrediente ->
        var listaComIngrediente = list.filter { it.nome.equals(ingrediente) }
        if(listaComIngrediente.any()) true else false
    }
    var ingredienteX:(ingrediente:String) -> Unit = {ingrediente ->
        data.filter { receitaTemIngrediente(it.ingredientes, ingrediente)}
                .forEach{ println("A receita ${it.nome} possui o ingrediente ${ingrediente}")} }
    ingredienteX("Farinha")
}