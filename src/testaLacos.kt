fun testaLacos() {
    for (i in 5 downTo 1 step 3) {

        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = 0.0 + i
        saldo = 100 + 2.0
        saldo += 200
        saldo -= 1000.0

        println("Titular $titular")
        println("O número da conta é $numeroConta")
        println("O seu saldo é $saldo")
    }
}
