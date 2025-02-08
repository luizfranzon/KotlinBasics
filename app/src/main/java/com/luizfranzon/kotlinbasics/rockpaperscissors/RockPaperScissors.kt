package com.luizfranzon.kotlinbasics.rockpaperscissors

fun main() {

    while (true) {
        val playerChoice = getUserChoice()

        if (playerChoice == "leave") break

        val computerChoice = getComputerChoice()

        val gameResult = runGame(computerChoice, playerChoice)
        println(gameResult)
    }
}

fun runGame(computerChoice: String, playerChoice: String): String {
    val gameTable = mapOf(
        "rock" to "scissors",
        "scissors" to "paper",
        "paper" to "rock"
    )

    println("--- Computer chose $computerChoice")

    return if (computerChoice == playerChoice) "\n- Draw!\n"
    else if (gameTable[computerChoice] == playerChoice) "\n- Computer won!\n"
    else "\n- You won!\n"
}

fun getUserChoice(): String {
    println("Choose 'Rock', 'Paper' or 'Scissors' (or 'leave' to close the game): ")
    val userInput = readln().lowercase()

    return validateUserInput(userInput)
}

fun validateUserInput(userInput: String): String {
    if (userInput != "rock" && userInput != "paper" && userInput != "scissors") {
        println("Invalid choice!")
        return getUserChoice()
    }

    return userInput
}

fun getComputerChoice(): String {
    val randomNumber: Int = (1..3).random()

    val computerChoice = when (randomNumber) {
        1 -> "rock"
        2 -> "paper"
        3 -> "scissors"
        else -> "0"
    }

    return computerChoice
}
