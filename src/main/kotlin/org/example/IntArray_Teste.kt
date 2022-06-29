package org.example

fun main(){

    val values=IntArray(5)

    println("-------Print-1-a-1----------")
    values[0]=1
    values[1]=7
    values[2]=6
    values[3]=3
    values[4]=2

    for (valor in values)
        println(valor)
    println()
    println()
    println("--------Each---------")
    values.forEach {
        println(it)
    }
    println()
    println()
    println("-------indice----")

    for (index in values.indices) {
        println(values[index])
    }
    println()
    println()
    println("-------Orden----")

    values.sortDescending()
    for (valor in values) {
        println(valor)
    }
}