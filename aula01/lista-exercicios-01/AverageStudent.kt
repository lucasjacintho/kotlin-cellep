/*

    Section PT: Desenvolva um algoritmo que calcule e imprima a média das cinco notas de um aluno
    Section EN: Develop an algorithm that calculates and prints the average of a student's five grades
    Code Author: João Lucas
    Course: Android Course - Cellep

*/

fun main(){
    var name = "João Lucas"
    val grade1 = 10.0
    val grade2 = 7.5
    val grade3 = 8.0
    val grade4 = 4.5
    val grade5 = 7.5

    var average = (grade1 + grade2 + grade3 + grade4 + grade5) / 5

    println("$name - \nGradebook $grade1 - $grade2 - $grade3 - $grade4 - $grade5 \nAverage $average")
}