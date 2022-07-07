package org.example

fun main() {

    val pair:Pair<String,Double> = Pair("WEBF", 1_000.00)
    val mapeamento1= mapOf(pair)
    println()
    println("----------------------------")
    mapeamento1.forEach{ (vp1,vp2) -> println("Valor pair: $vp1 - R$ $vp2")}


    println()
    println()
    println("----------------------------")
    val mapeamento2 = mapOf("Dani" to 2_500.00, "Toni" to 3_000.00)
    mapeamento2.forEach{ (vp1,vp2) -> println("Valor pair: $vp1 - R$ $vp2") }

    println()
    println()
    println("----------------------------")
    val  listaMinha = setOf(mapeamento1,mapeamento2)
    println(listaMinha)
    println()
    listaMinha.forEach{ println(it) }
    println()


}