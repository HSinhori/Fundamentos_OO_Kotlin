package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Henrique"

    var cpf: String = "123.123.123-12"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {

    val henrique = Pessoa()
    //henrique.nome = "5454"

    //println(henrique.nome)
    println(henrique.pessoaInfo())

}