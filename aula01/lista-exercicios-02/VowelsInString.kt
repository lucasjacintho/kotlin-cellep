/*

    Section PT: Utilizando o loop de repetição for, desenvolva um algoritmo que conte a quantidade de vogais em uma String
    Section EN: Using the for repetition loop, develop an algorithm that counts the number of vowels in a String
    Code Author: João Lucas
    Course: Android Course - Cellep

*/

fun main(){
  var string = "repetition"
  var count = 0

  for(v in string.split("")){
    if(v.equals("a") || v.equals("e") || v.equals("i") || v.equals("o") || v.equals("u")){
      count++
    }
  }

  println("Amount Vowels in $string = $count")
}
