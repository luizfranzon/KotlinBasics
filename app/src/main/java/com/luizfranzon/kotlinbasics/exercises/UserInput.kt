package com.luizfranzon.kotlinbasics.exercises

fun main() {

    val userAge = getUserInputAsInteger()

    if (userAge >= 18) {
        println("Pode entrar!")
    } else {
        println("Nao poder....")
    }

    val secondUserAgr = getUserInputAsInteger()

//    userAge >= 18 && userAge <= 32 equivalent
    if (userAge in 18..32) {
        println("Tem entre 18 e 32 anos")
    } else {
        println("n tem isso memo")
    }

}

fun getUserInputAsInteger() : Int {

    print("Insira sua idade: ")
    try {
        return readln().toInt()
    } catch (error : NumberFormatException) {
        println("Insira um valor numérico! \n")
        return getUserInputAsInteger()
    }
}
