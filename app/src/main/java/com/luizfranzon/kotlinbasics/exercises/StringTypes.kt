package com.luizfranzon.kotlinbasics.exercises

fun main() {
    var name = "Luiz"

    println(name.uppercase())
    println(name.lowercase())
    println(name)

    println(name + " Franzon") //String interpolation
    println("$name Franzon")   //String literals

    println("""
       Multiline
       string
    """.trimIndent())

    println("""
       Multiline
       string
    """)
}