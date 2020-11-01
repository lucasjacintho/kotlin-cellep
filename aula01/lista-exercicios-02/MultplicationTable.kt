/*

    Section PT: Utilizando o loop de repetição for, desenvolva um algoritmo que imprima qualquer tabuada
    Section EN: Using the for repeat loop, develop an algorithm that prints any multiplication tables
    Code Author: João Lucas
    Course: Android Course - Cellep

*/

fun main(){
  var number = 9

  for (i in 1..10){
    println("$number x $i = " + number * i)
  }
}