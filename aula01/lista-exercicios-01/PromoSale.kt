/*

    Section PT: Desenvolva um algoritmo que calcule o desconto na venda de um produto
    Section EN: Develop an algorithm that calculates the discount on the sale of a product
    Code Author: João Lucas
    Course: Android Course - Cellep

*/

fun main() {
    val productName = "Gigabyte AMD Radeon RX 5600"
    var product = 2434
    val discauntValue = 15

    var productFinalValue = product - ((product * discauntValue) / 100)

    println("The product $productName \nFull Price: $product \nDiscount for cash $discauntValue% \nFinal value: $productFinalValue")
}
