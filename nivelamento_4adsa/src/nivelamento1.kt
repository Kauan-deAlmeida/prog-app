fun main() {
    println("é nóis no kotlin")

    /*
    Aqui usamos a técnica de tipagem DINÂMICA
    O compilador da linguagem INFERIU o tipo da variável a partir do valor
     */
    var cidade = "São Paulo"
    var populacao = 10_000_000

    // aqui implementamos INTERPOLAÇÃo ou "String Template"
    println("Na cidade $cidade moram $populacao pessoas")

    // se quisermos executar expressões na interpolação
    // basta usarmos ${}
    println("Na cidade ${cidade.uppercase()} moram ${populacao*2} pessoas")

    // Aqui usamos a tipagem estática
    var pais:String = "Brasil"
    var filhos:Int = 2
    var idh:Double = 0.85
    var palmeirasTemMundial:Boolean = false

    val cpf = "12345678912"
    // cpf = "11111111111" // NÃO compila! cpf é val
}