package org.example

class Operacoes_Teste

fun main() {
    val salarios = doubleArrayOf(2500.00, 2225.00, 4000.00, 1999.99,4_000.00)
    println("--------------------------")
    println("Imprime todos valores")
    println("--------------------------")
    for (salario in salarios)
        println(salario)
    println()
    println()
    println()

    println("--------------------------")
    println("Maio, menor e medio")
    println("--------------------------")
        println("Maior: R$ ${salarios.maxOrNull()}")
        println("Menor: R$ ${salarios.min()}")
        println("Media: R$ ${salarios.average()}")
    println()
    println()
    println()

    val salariosMaiorQue2500 = salarios.filter { it > 2500.00 }
    println("--------------------------")
    println("IMPRIME VALOR > 2500")
    println("--------------------------")
        salariosMaiorQue2500.forEach { println(it) }
    println()
    println()
    println()

    println("--------------------------")
    println("Conta se valor entre 2500.00 a 5000.00")
    println("--------------------------")
        println(salarios.count {it in 2500.00 .. 5000.00 })
    println()
    println()
    println()


    println("--------------------------")
    println("Imprime  valor de 4000.00 ou 8000.00")
    println("--------------------------")
        println(salarios.find {it == 4000.00 })
        println(salarios.find {it == 8000.00 })
    println()
    println()
    println()

    println("--------------------------")
    println("informa se ha valor de 4000.00 ou 8000.00")
    println("--------------------------")
        println(salarios.any {it == 4000.00 })
        println(salarios.any {it == 8000.00 })
    println()
    println()
    println()


}