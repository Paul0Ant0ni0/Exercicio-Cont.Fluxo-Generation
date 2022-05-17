import kotlin.math.pow
import kotlin.math.sqrt

//4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
//ímpar exiba o número elevado ao quadrado.

fun main() {
    print("Digite um número? ")
    val n = readln().toDouble()

   if(n%2.0 == 0.0){
       //Exibi o valor elavado ao quadrado
        val q = n.pow(2.0)
             print("Par: O quadrado de ${"%.0f".format(n)} é ${"%.0f".format(q)}")
    }else{
        //Exibi a raiz quadrada do valor no inout
        val q = sqrt(n)
        print("Impar: Raiz quadrada de ${"%.0f".format(n)} é ${"%.11f".format(q)}")
    }

}
