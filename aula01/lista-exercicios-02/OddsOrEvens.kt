/*

    Section PT: Utilizando a estrutura condicional e operadores relacionais, desenvolva um algoritmo que identifique se um determinado número inteiro é par ou ímpar
    Section EN: Using a conditional structure and relational operators, develop an algorithm that identifies whether an integer is even or odd
    Code Author: João Lucas
    Course: Android Course - Cellep

*/

fun main() {
  var number = 11

  if(number % 2 == 0) {
    print("$number is a even!")
  }else{ 
    print("$number is a odd!")
  }
}