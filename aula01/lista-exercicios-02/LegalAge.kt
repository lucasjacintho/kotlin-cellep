/*

    Section PT: Utilizando a estrutura condicional, desenvolva um algoritmo que determine se uma pessoa é maior ou menor de idade
    Section EN: Using the conditional structure, develop an algorithm that determines whether a person is older or younger
    Code Author: João Lucas
    Course: Android Course - Cellep

*/

fun main() {
    var age = 18
    val legalAge = 18

    if (age >= legalAge) {
        println("You'r in the legal age, now life is gonna be hard, good luck! ;)")
    }else if(age < legalAge){
        println("Nice! You'r still have a good life, So... Enjoy it!")
    }else{
        println("You don't know how to count??")
    }
}
