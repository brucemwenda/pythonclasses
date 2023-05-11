open class Wazazi{
    val mama="She likes cooking"
    val baba="He likes watching news"
}
class boy:Wazazi(){
    fun mvulana(){
        println(baba)
    }

}
class girl:Wazazi(){
    fun msichana(){
        println(mama)
    }

}

fun main(args: Array<String>) {
    val kijanaobjct=boy()
    kijanaobjct.mvulana()
    val msichanaobjct=girl()
    msichanaobjct.msichana()
}
