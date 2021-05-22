fun main() {
    println("Bem vindo ao ByteBank")

    testaCondicoes(10.0)

//    var i = 0
//    while (i < 5) {
//        val titular: String = "Alex $i"
//        val numeroConta: Int = 1000 + i
//        var saldo: Double = 0.0 + i
////    saldo = 100 + 2.0
////    saldo += 200
////    saldo -= 1000.0
//
//        println("Titular $titular")
//        println("O número da conta é $numeroConta")
//        println("O seu saldo é $saldo")
//        println()
//        i++
//    }

//    for (i in 5 downTo 1 step 3) {
//
//        val titular: String = "Alex $i"
//        val numeroConta: Int = 1000 + i
//        var saldo: Double = 0.0 + i
////    saldo = 100 + 2.0
////    saldo += 200
////    saldo -= 1000.0
//
//        println("Titular $titular")
//        println("O número da conta é $numeroConta")
//        println("O seu saldo é $saldo")
//
//        testaCondicoes(10.0)
//
//    }

// Mesmo funcionamento de If e When
//    if (saldo > 0.0) {
//        println("Conta positiva")
//    } else if (saldo == 0.0) {
//        println("Conta neutra")
//    } else {
//        println("Conta negativa")
//    }
//
//    when{
//        saldo > 0.0 -> println("Conta positiva")
//        saldo == 0.0 -> println("Conta neutra")
//        else -> println("Conta negativa")
//    }
    }

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Conta positiva")
    } else if (saldo == 0.0) {
        println("Conta neutra")
    } else {
        println("Conta negativa")
    }
}