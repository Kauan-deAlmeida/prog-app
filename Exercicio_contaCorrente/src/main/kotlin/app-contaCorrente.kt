fun main() {
    val contaCorrente1 = ContaCorrente()

    contaCorrente1.depositar("Poupança", 150.0)
    contaCorrente1.depositar("Poupança", 190.0)
    contaCorrente1.depositar("Casa", 150.0)
    contaCorrente1.depositar("Casa", 70.0)
    contaCorrente1.depositar("Investimentos", 100.0)
    contaCorrente1.depositar("Carro", 100.0)
    contaCorrente1.depositar("Carro", 10.0)
    contaCorrente1.depositar("Viagem", 30.0)

    println(contaCorrente1.getExtrato())
}