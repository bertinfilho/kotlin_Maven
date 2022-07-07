package org.example

data class Funcionario(
    val nomeF:String,
    val salario:Double,
    val contrato:String
)   {
    override fun toString(): String =
        """
            nome:       $nomeF
            Salario:    R$ $salario
            Contrato:   $contrato
        """.trimIndent()
}
