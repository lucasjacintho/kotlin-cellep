/*

    Section PT: Desenvolva uma função que calcule o IMC de uma pessoa, imprimir o valor do IMC e sua classificação
    Section EN: Develop a function that calculates a person's BMI, print the BMI value and its classification
    Code Author: João Lucas
    Course: Android Course - Cellep

*/

fun main() {
  var weight = 97.0
  var height = 1.85
  var bmiCalculation = weight / (height * height)

  if(bmiCalculation < 18.5) {
    println("You'r Underweight: $bmiCalculation")
  }else if(bmiCalculation < 24.9){
    println("You'r Normal Weight: $bmiCalculation")
  }else if(bmiCalculation < 29.9){
    println("You'r Overweight: $bmiCalculation")
  }else if(bmiCalculation > 29.9){
    println("You'r Obesity: $bmiCalculation")
  }
}