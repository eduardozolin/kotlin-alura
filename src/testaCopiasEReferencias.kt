fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX

    println("numero X é igual a $numeroX")
    println("numero Y é igual a $numeroY")

    val contaJoao = Conta("João", 1003)
    contaJoao.titular = "João"
    val contaMaria = contaJoao

    println("Conta João é igual a ${contaJoao.titular}")
    println("Conta Maria é igual a ${contaMaria.titular}")
}
