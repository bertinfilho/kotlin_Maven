package org.example

fun main(){
    val nomes = Array(3) {""}

    println()
    println()
    println("------1---------")
    nomes.sort()

    nomes[0]="Maria"
    nomes[1]="Zaz"
    nomes[2]="Bertin"

    for (nome in nomes) {
        println(nome)
    }
    println()
    println()
    println("-------2--------")
    nomes.sort()
    nomes.forEach {
        println(it)
    }
    println()
    println()
    println("-------3--------")

    val nomes2 = arrayOf("Zica", "Deca", "Anna")
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }

}