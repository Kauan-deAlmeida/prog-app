class ContaCorrente {
    lateinit var titular:String
    var saldo:Double = 0.0
    var bloqueada:Boolean = false
    var list:MutableList<Usuario> = mutableListOf()

    fun depositar(objetivoDeposito:String, valor:Double) {

        list.forEach{
            if(it.descricao.equals(objetivoDeposito)){
                it.valor += valor
                return
            }
        }

        list.add(Usuario(objetivoDeposito, valor))
    }

    fun getExtrato():String {
        var mensagem:String = ""
        list.forEach{ mensagem+= "${it.valor} - ${it.descricao} \n"}
        return mensagem
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