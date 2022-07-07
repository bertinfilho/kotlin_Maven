package org.example

fun main() {
    val nomeF1 = Funcionario("Joao", 1_000.00,"CLT")
    val nomeF2 = Funcionario("Dani", 5_000.00,"PJ")
    val nomeF3 = Funcionario("WEBF", 2_500.00,"CLT")

    val grupoFunc1 = setOf(nomeF1,nomeF2)
    val grupoFunc2 = setOf(nomeF3)

    println("----- Junta Grupos f1 e f2 --------")
    val juntaGrupos = grupoFunc1.union(grupoFunc2)
    juntaGrupos.forEach{ println(it)
        println() }
    println("-----------------------")


    println()
    println()
    println("------- Revonve duplicado --------")
    val todosFunc = setOf(nomeF1,nomeF2,nomeF3)             // >> ou val juntaGrupos = grupoFunc1.union(grupoFunc2)
    val removeDuplicado = todosFunc.subtract(grupoFunc2)    // >> No lugar da VAL "todosFunc" poderia ter sido usado o "juntaGrupos" criado anteriormente!
    removeDuplicado.forEach{ println(it) }
    println("-----------------------")


    println()
    println()
    println("------- Mostra duplicado --------")
    val mostraDuplicado = juntaGrupos.intersect(grupoFunc2)
    mostraDuplicado.forEach { println(it) }
    println("-----------------------")


}