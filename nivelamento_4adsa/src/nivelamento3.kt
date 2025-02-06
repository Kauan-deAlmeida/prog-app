fun main() {
    // if e if-else é 100% igual à java e JS
    var idade = 15

    // if-esle de uma linha só
    println(if (idade>=18) "maior idade" else "de menor")

    when(idade) {
        in 0..1 -> println("bebezinho")
        2 -> println("bebezão")
        in 11..17 -> {
            println("adolescente")
            println("muita espinha")
            println("muito estresse")
        }
        25 -> println("adulto")
        else -> println("idade inválida")
    }

    var resultado = when (idade){
        in 0..8 -> "proibida entrada"
        in 9..59 -> "paga inteira"
        in 60..65 -> "gratuidade"
        else -> "risco à saúde"
    }
    println(resultado)
}