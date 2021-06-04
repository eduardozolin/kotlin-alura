fun testaComportamentosConta() {
    println("Bem vindo ao ByteBank")

//    testaCondicoes(10.0)
//
//    testaLacos()

    val contaAlex = Conta("Alex", 1000)
    contaAlex.deposita(200.0)
    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    val contaFran = Conta("Fran", 1001)
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("Depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println("O saldo é ${contaAlex.saldo}")
    println("Depositando na conta da Fran")
    contaFran.deposita(100.0)
    println("O saldo é ${contaFran.saldo}")


    println("Sacando na conta do Alex")
    contaAlex.saca(200.0)
    println("O saldo é ${contaAlex.saldo}")

    println("Sacando na conta da Fran")
    contaFran.saca(500.0)
    println("O saldo é ${contaFran.saldo}")


    println("Transferência da conta da Fran para o Alex")

    if (contaFran.transfere(1000.0, contaAlex)) {
        println("Transferência com sucesso")
    } else {
        println("Falha na transferência")
    }

    println("saldo do Alex é ${contaAlex.saldo}")
    println("saldo da Fran é ${contaFran.saldo}")
}
