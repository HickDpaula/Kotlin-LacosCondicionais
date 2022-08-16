fun main () {

    /*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
            categoria ela se encontra:
     10-14 infantil
     15-17 juvenil
     18-25 adulto


     */
    
    println("Digite sua idade: ")
    var idade = readln().toInt()



    if (idade >= 1 && idade <= 14) {
        println("categoria infantil")
    }else if (idade < 1) {
        print("Idade abaixo do limite permitido")
    } else if (idade >= 15 && idade <= 17) {
        println("sua categoria é juvenil")
    } else if (idade >= 18 && idade <=  25) {
        println("sua categoria é adulto")
    }else{
        println("Idade limite atingida")
    }
}

