package com.luizfranzon.kotlinbasics.rockpaperscissors

fun main() {
    println("Choose 'Rock', 'Paper' or 'Scissors': ")
    val playerChoice = readln().lowercase()
    val randomNumber: Int = (1..3).random()

    val computerChoice = when (randomNumber) {
        1 -> "rock"
        2 -> "paper"
        3 -> "scissors"
        else -> "0"
    }

    val gameResult = runGame(computerChoice, playerChoice)
    println(gameResult)
}

fun runGame(computerChoice: String, playerChoice: String): String {
    val gameTable = mapOf(
        "rock" to "scissors",
        "scissors" to "paper",
        "paper" to "rock"
    )

    println("Computer chose $computerChoice")

    return if (computerChoice == playerChoice) "Draw!"
    else if (gameTable[computerChoice] == playerChoice) "Computer won!"
    else "You won!"
}