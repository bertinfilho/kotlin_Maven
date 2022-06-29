package org.example

fun main(){
    val values = intArrayOf(2,3,4,1,10,7)

    values.forEach {
        println(it)
    }

    println()
    println()
    println()

    values.reverse()
    values.forEach {
        println(it)
    }
    println()
    println()
    println()

    values.sort()
    values.forEach {
        println(it)
    }
}
