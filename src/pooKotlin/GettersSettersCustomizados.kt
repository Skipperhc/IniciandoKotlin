package pooKotlin
class MaquinaEx(var marca:String) {
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
    var m:MaquinaEx = MaquinaEx("LG");
    m.nucleos = 10

}