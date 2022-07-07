package org.example

fun main() {

    val nomeF1 = Funcionario("Joao", 1_000.00,"CLT")
    val nomeF2 = Funcionario("Dani", 5_000.00,"PJ")
    val nomeF3 = Funcionario("WEB", 2_500.00,"CLT")

    val funcionarios = listOf(nomeF1,nomeF2,nomeF3)
    println("------------------")
    funcionarios.forEach{ println(it)
    println()
    }
    println("------------------")

    println()
    println()
    println("------------------")
    println(funcionarios.find { it.nomeF == "WEB" })
    println("------------------")

    println()
    println()
    println("------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }
    println()
    println("------------------")


    println()
    println()
    println("------------------")
    funcionarios
        .groupBy { it.contrato }
        .forEach { println(it) }
    println()
    println("------------------")

}

