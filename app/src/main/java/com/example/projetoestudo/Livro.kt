package com.example.projetoestudo


//Pra armazenar dados, no kotlin utilzamos data class, da uma olhada https://kotlinlang.org/docs/data-classes.html
class Livro {
    var titulo:String
    var dataPublicacao: String
    var autor: String

    constructor(titulo: String, dataPublicacao: String, autor: String) {
        this.titulo = titulo
        this.dataPublicacao = dataPublicacao
        this.autor = autor
    }
}
