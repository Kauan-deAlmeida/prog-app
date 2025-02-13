fun main() {
    val cao1 = Cachorro("au", "lulu", 2000.0)
    val cao2 = Cachorro(preco = 150.0, nome = "caramelo", raca = "SRD")

    println(cao1)

    val cao3 = Cachorro("au", "lulu", 2000.0)
    println(cao1 == cao3)
}