/*

    Section PT: Crie funções para as 4 operações aritméticas básicas
    Section EN: Create functions for the 4 basic arithmetic operations
    Code Author: João Lucas
    Course: Android Course - Cellep

*/

fun main() {

    println("Sum: " + sum(10.0, 20.0))
    println("Sub: " + sub(10.0, 20.0))
    println("Mult: " + mult(10.0, 20.0))
    println("Div: " + div(10.0, 20.0))
}

fun sum(numer1: Double, number2: Double): Double {
    return numer1 + number2
}

fun sub(numer1: Double, number2: Double): Double {
    return numer1 - number2
}

fun mult(numer1: Double, number2: Double): Double {
    return numer1 * number2
}

fun div(numer1: Double, number2: Double): Double {
    return (numer1 / number2).toDouble()
}
