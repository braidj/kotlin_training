fun main(args: Array<String>) {

    val options: Array<String> = arrayOf("rock", "paper", "scissors")

    for (x in 1..5) {
        val gameChoice = getGameChoice(options)
        val userChoice = getUserChoice(options)
        printResult(userChoice, gameChoice)
    }
}

    fun getGameChoice(options: Array<String>): String {

        val choice = (Math.random() * options.size)
        return options[choice.toInt()]

    }

    fun getUserChoice(optionsParam: Array<String>): String {
        var isValidChoice = false
        var userChoice = ""

        //loop until get a valid choice from user
        while (!isValidChoice) {
            print("Please enter one of the following")
            for (item in optionsParam) print(" $item")
            print(".  ")
            val userInput = readLine()

            if (userInput != null && userInput in optionsParam) {
                isValidChoice = true
                userChoice = userInput
            }
            // If the choice is invalid inform the user
            if (!isValidChoice) println("You must enter a valid choice")
        }
        return userChoice
    }

    fun printResult(user: String, computer: String) {

        val result: String
        if (user == computer) result = "Tie"
        else if ((user == "rock" && computer == "scissors") ||
            (user == "paper" && computer == "rock") ||
            (user == "scissors" && computer == "paper")
        ) result = "You win"
        else result = "You lose"

        println("You chose $user, I chose $computer. $result")

    }
