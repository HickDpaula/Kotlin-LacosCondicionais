/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
*/
import kotlin.math.sqrt
fun main(){

    print("Digite um numero: ")
    val numero = readln().toInt()

    if (numero % 2 == 0 ) {
        println("O numero digitado é par!")
        var rq : Double = sqrt(numero.toDouble())
        print("A raiz quadrada de $numero é: $rq")
    } else {
        println("O numero digitado é ímpar!")
        var eq = numero * numero
        println("Esse numero elevado ao quadrado é: $eq ")
    }
}

