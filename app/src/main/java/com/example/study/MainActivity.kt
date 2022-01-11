package bot

import java.util.Scanner


val scanner = Scanner(System.`in`) // Do not change this line

fun main() {
    greet("Aid", "2020") // change it as you need
    remindName()
    guessAge()
    count()
    // ...
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is Niko.")
    println("I was created in 2021.")
    println("Please, remind me your name.")
}

fun remindName() {
    val name = scanner.nextLine()
    println("What a great name you have, ${name}!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val age1 = readLine()!!.toInt()
    val age2 = readLine()!!.toInt()
    val age3 = readLine()!!.toInt()
    val age_true = ((((age1 % 3) * 70)) + (((age2 % 5) * 21)) + ((age3 % 7) * 15)) % 105
    println("Your age is $age_true; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val inpNumber = readLine()!!.toInt()
    for (i in 0..inpNumber) {
        println("$i!")
    }
    println("Completed, have a nice day!")
}

fun test() {
    println("Let's test your programming knowledge.")
    println("Why do we use methods?")
    println("1. To repeat a statement multiple times.")
    println("2. To decompose a program into several small subroutines.")
    println("3. To determine the execution time of a program.")
    println("4. To interrupt the execution of a program.")
    var next = 0
    do {
        val otvet = scanner.nextInt()
        if (otvet != 2) {
            println("Please, try again.")
        } else {
            next = 1
        }
    } while (next != 1)
}

fun end() {
    println("Congratulations, have a nice day!") // Do not change this text
}