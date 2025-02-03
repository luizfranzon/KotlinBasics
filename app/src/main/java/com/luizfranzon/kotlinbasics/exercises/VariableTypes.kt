package com.luizfranzon.kotlinbasics.exercises

fun main() {
//  Data Types

//  Numbers
    val byte  : Byte  = 100        // -128           -> 127
    val short : Short = 30450      // -32768         -> 32767
    val int   : Int   = 2147483647 // -2,147,483,648 -> 2,147,483,647
    val long  : Long  = 1          // muito grande
    val long2 = 1L

//  In Kotlin, number will be defined as the type Int by default.
//  If the number defined in the variable is out of the int range, it's gonna be a Long type

//  Float and Double

    var userAge : Byte = 21 //Variable
    val userName = "Luiz" //Constant

    var phrase = "$userName tem $userAge anos de idade"
    println(phrase)

    println("Passou um ano no mundão aí")

    userAge++
    phrase = "$userName agora tem $userAge anos de idade"

    println(phrase)
}