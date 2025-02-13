fun main() {
    val p1 = Pokemon("Charmander", "Fogo", 100.00, "123")

    p1.nome
    p1.ataques = "Fogo e choque" // setAtaques()
    println(p1.ataques) // getAtaques()
    println(p1)

    val p2 = Pokemon("Charmander", "Fogo", 100.00, "123")
    val p3 = Pokemon("Charmander", "Fogo", 100.00, "123")

    println(p2 == p3)
}