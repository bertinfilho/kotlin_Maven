package org.example

fun main() {

    val nomeF1 = Funcionario("Joao", 1_000.00)
    val nomeF2 = Funcionario("Dani", 5_000.00)
    val nomeF3 = Funcionario("WEB", 2_500.00)

    val funcionarios = listOf(nomeF1,nomeF2,nomeF3)

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


}
data class Funcionario(
    val nomeF:String,
    val salario:Double
)   {
    override fun toString(): String =
        """
            nome:       $nomeF
            Salario:    R$ $salario
        """.trimIndent()
    }
