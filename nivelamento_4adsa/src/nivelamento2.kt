fun main() {
    /*
    Aqui, criamos uma lista SOMENTE LEITURA
    (nada entra, nada sai, nada pode ser alterado)
     */

    val frutas = listOf("maçã", "abacaxi", "pêra", "amora")

    println("Segundo: ${frutas[1]}")
    println("Primeiro: ${frutas.first()}")
    println("Ultimo: ${frutas.last()}")

//    frutas.add("laranja")

    /*
    Aqui, criamos uma lista que permite alteração
    (podemos inserir, remover, alterar etc)
     */
    val paises = mutableListOf("Brasil" , "México", "Chile")
    paises.add("Argentina")
    println(paises)
    paises.remove("Chile")
    paises.removeAt(0)
    println(paises)

    frutas.forEach {
        // o 'it' é o nome automático que a variável com o valor
        // do elemnto da iteração recebe
        println("Olha essa fruta: $it")
    }

    // é possível dar um nome explícito p/ a variável da iteração
    frutas.forEach { fruta ->
        println("Olha essa fruta: $fruta")
    }

    // pegando a 1a fruta com "r"
    // o resultado é uma String
    val frutaComR = frutas.find { it.contains("r") }
    println(frutaComR)

    // pegando todas as frutas com "r"
    // o resultado é uma lista
    val frutasComR = frutas.filter { it.contains("r") }
    println(frutasComR)

    // realizando uma contagem a partir de um critério
    val frutasNomeLong = frutas.count { it.length > 6 }
    println(frutasNomeLong)

    /*
    .sorted() usa a ordenação "natural" conforme o tipo da lista
    texto -> ord alfabética
    números -> ord de valor
    datas -> das mais antigas p/ as mais recentes
    lista -> das menores p/ as maiores
     */
    val frutasOrdenadas = frutas.sorted()
    println(frutasOrdenadas)

    // for com intervalo numérico
    // ambos os limites podem ser fixos ou variáveis
    for(x in 1..10){
        println(x)
    }

    // usando for, imprima todas as frutas e seus indices
    // 0 - maçã
    // 1 - abacaxi
    // ou x in 0..frutas.size() - 1
    for(x in frutas.indices){
        println("$x - ${frutas[x]}")
    }

    // lista com tipo "travado"
    val lista = listOf<String>("ok")
}