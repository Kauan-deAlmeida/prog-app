class ContaCorrente {
    // atributos
    lateinit var titular:String
    var saldo:Double = 0.0
    var bloqueada:Boolean = false

    // métodos
    fun depositar(valor:Double) {
        saldo += valor
    }

    fun descrever(): String{
        return "Conta de $titular tem R$$saldo de saldo"
    }

    fun descrever2() = "Conta de $titular tem R$$saldo de saldo"

    fun mudarTitulo(novoTitulo:String):String{
        if(novoTitulo.equals(titular)) return "Sem mudança de titular"
        val original = titular
        titular = novoTitulo
        return "Titular mudou de $original p/ $titular"
    }
}