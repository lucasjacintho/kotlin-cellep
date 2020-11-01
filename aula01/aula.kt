/*
    Aula do dia 24/10 sobre os fundamentos da linguagem
    ps: Executar um main por vez
*/

fun main() {
   // Comentário de uma linha

    /* Esse
    Comentário
    Tem
    muitas
    linhas */

    // Declarando variáveis
    // Variáveis Mutáveis: var
    var idade = 17

    // Alterar o valor da variável mutável
    idade = 18
    // println(idade)

    // Variáveis Imutáveis: val
    val tipoSanguineo = "A+"
    // println()

    // Saída de dados no console: println() e print()
    // println(idade)
    // println(tipoSanguineo)

        // Tipos de Dados:
    // Inteiro: Byte, Short, Int e Long
    // Decimais: Float, Double
    // Caractere: Char
    // Boolenana: Boolean

    // Inferência de tipo
    val idade = 45 // Inteiro -> Int
    val distancia = 15062652L // Inteiro -> Long
    val peso = 65.33 // Decimal -> Double
    val altura = 1.75f // Decimal -> Float
    var casado = false // Boolean

    // Declaração explícita de tipo
    var quartos: Byte = 1
    val salario: Double = 10.0
    val letra: Char = 'R' // Tipo Char -> Apenas um caractere

    // Tipo de texto: String
    var nome = "Kaory"
    var cpf = "111.111.111-11"
    val letra2 = "R" // Tipo String -> Sequência de caracteres
    val vazio = "" // String vazia

    // Concatenação de String
    var sobrenome = "Japa"
    val nomeCompleto = nome + " " + sobrenome

    println(nomeCompleto)

    // Interpolação/Template String/String Format

    var saudacao = "$nome tem $idade anos e tem $peso kg de peso"
    println(saudacao)

        // Operadores aritméticos
    val a = 33
    val b = 25
    val idade = 17
    val c = 33.0
    val d = 25.5

    // Soma: +
    val soma = a + b // 58
    println(soma)

    // Subtração: -
    val sub = a - b // 8
    println(sub)

    // Multiplicação: *
    val multi = a * b // 825
    println(multi)

    // Divisão: /
    val div = a / b //
    val div2 = c / d
    println(div)
    println(div2)

    // Resto da divisão (Módulo ou mod): %
    val resto = a % b
    println(resto)
}

fun main2() {
    val nome = "Kaory"
    sauda(nome)
    // Código complexo
    // ...
    dizOi()

    val valor = 33
    val dobro = dobrar(33)
    val soma = somar(1, 2)

    println(dobro)
    println(soma)
}

// Declarando (Criando/Definindo) uma função: fun
fun dizOi() {
    println("Oi")
}

// Declarando uma função com parâmetro
fun sauda(pessoa: String) {
    println("Oi, $pessoa. Tudo bem?")
}

// Declarando uma função com valor de retorno
fun dobrar(numero: Int): Double {
    var vezes = 2 * numero
    val vezesDouble = vezes.toDouble()
    return vezesDouble
}

// Declarando função de múltiplos parâmetro
fun somar(a: Int, b: Int): Int {
    val soma = a + b
    return soma
}

fun main3() {
    // Operadores relacionais
       val idadeRaul = 18
    val idadeKaory = 45
    val idadeNicholas = 16

    // Igualdade: ==
    // println(idadeRaul == 18) // true
    // println(idadeKaory == 18) // false
    // println(idadeNicholas == 18) // false

    // Diferente: !=
    // println(idadeRaul != 18) // false
    // println(idadeKaory != 18) // true 
    // println(idadeNicholas != 18) // true

    // Maior que: >
    // println(idadeRaul > 18) // false
    // println(idadeKaory > 18) // true 
    // println(idadeNicholas > 18) // false

    // Maior ou igual: >=
    // println(idadeRaul >= 18) // true
    // println(idadeKaory >= 18) // true 
    // println(idadeNicholas >= 18) // false

    // Menor que: <
    // println(idadeRaul < 18) // false
    // println(idadeKaory < 18) // false 
    // println(idadeNicholas < 18) // true

    // Menor ou igual: <=
    // println(idadeRaul <= 18) // true
    // println(idadeKaory <= 18) // false 
    // println(idadeNicholas <= 18) // true

    // Comparando Strings:
    // println("Raul" >= "Kaory") // true
    // println("Raul" == "raul") // false
    // println("Raul" >= "raul") // false
    // println("Z" < "a") // true

    // Operadores lógicos: 

    // Operador E ou AND: &&
    // println(false && false) // false
    // println(true && false) // false
    // println(false && true) // false
    // println(true && true) // true

    // Operador OU ou OR: ||
    // println(false || false) // false
    // println(true || false) // true
    // println(false || true) // true
    // println(true || true) // true

    // Operador NÃO ou NOT: !
    // println(!true) // false
    // println(!false) // true

    println(idadeRaul > 18 || idadeRaul == 18) // >=
}

// Situação 1: Aviso
fun main4() {
    // Estrutura condiconal: if/else

    val idade = 16

   // Estrutura if: if (condição) { Código } 
   println("Pessoa entrando no bar...")

   if (idade < 18) {
       println("Você não poderá pedir bebidas alcoólicas")
   }

   println("Bem-vindo ao bar do Raul")
}

// Situação 2: Rejeito
fun main5() {
    // Estrutura condiconal: if/else

    val idade = 40

   // Estrutura if/else: if (condição) { Código } else { Código alternativo } 
   println("Pessoa entrando no bar...")

   if (idade < 18) {
       println("Você não pode entrar no bar")
   } else {
       println("Bem-vindo ao bar do Raul")
   }
}

// Situação 3: Faixa de clientes
fun main6() {
    // Estrutura condiconal: if/else

    val idade = 40

   println("Pessoa entrando no bar...")

   if (idade >= 18) { // Primeira condição
       println("Bem-vindo ao bar do Raul")
   } else if (idade > 14) { // Segunda condição (Já sabemos que idade < 18)
       println("Você não poderá pedir bebidas alcoólicas")
       println("Bem-vindo ao bar do Raul")
   } else {
       println("Você não pode entrar no bar")
   }

   // ...
}

fun main7() {
    val idade = 40
    val cnh = true

    if (idade >= 18 && cnh) {
        println("Pode comprar um carro")
    } else if (idade < 18 && cnh) {
        println("Você é um hacker, vamos chamar a polícia")
    } else {
        println("Não pode comprar um carro")
    }
}

// Situação um: Imprimindo sequência
fun main8() {
    // Estrutura de repetição: for

    for (n in 1..10) { // 1 2 3 4 5 6 7 8 9 10
        println(n)
    }
}

// Situação um: Imprimindo o dobro da sequência
fun main9() {
    // Estrutura de repetição: for

    for (numerozinho in 1..10) { // 1 2 3 4 5 6 7 8 9 10
        println(2*numerozinho)
    }
}

// Situação 3: Imprimindo a sequência inversa
fun main0() {
    // Estrutura de repetição: for

    for (i in 10 downTo 1) {
        println(i)
    }
}

// Situação 4: Imprimindo a sequência pulando
fun main11() {
    // Estrutura de repetição: for

    for (n in 1 until 20 step 2) {
        println(n)
    }
}

// Situação 5: Imprimindo apenas número pares
fun main12() {
    // Estrutura de repetição: for

    for (n in 1..10) {
        if (n % 2 == 0) {
            println(n)
        } else {
            println("KKKKK")
        }
    }
}

fun main13() {
    // Listas
    // Criando uma lista
    // 						  0        1           2            3
    val profs = arrayListOf("Raul", "Kaory", "Luiz Gustavo", "David")

    // Imprimir a lista
    println(profs)

    // Obtendo um elemento único
    println(profs[0])
    println(profs[1])
    println(profs[3])
    // println(profs[4]) -> Erro

    // Obtendo o tamanho da lista
    println(profs.size)
    println(profs[profs.size - 1])

    // Adicionando um novo item na lista
    profs.add("Josua")
       println(profs)
    println(profs.size)

    // Removendo um item da lista
    profs.removeAt(profs.size - 1)
    println(profs)

    // Obtendo um elemento aleatório da lista
    println(profs.random())

    // Iterando sobre os itens da lista
    for (professor in profs) { // Raul, Kaory, Luiz Gustavo, David
        println("Olá, $professor. Tenho uma dúvida!")
    }
}
