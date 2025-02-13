lateinit var bairro:String
//lateinit var populacao:Int
//lateinit var idh:Double

fun main() {
//    var cidade:String = null
    var cidade:String? = null

    println(cidade?.uppercase())
//    println(cidade!!.uppercase())
    println(cidade ?: "Cidade não informada")
    println(cidade?.uppercase() ?: "Cidade não informada")

    bairro = "sé"
    println("O bairro é: $bairro")
}