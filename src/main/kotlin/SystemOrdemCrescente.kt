//2-Faça um programa que entre com três números e coloque em ordem crescente.

fun main(){
    print("Digite o primeiro numero? ")
    val n1 = readln().toInt()
    print("Digite o primeiro numero? ")
    val n2 = readln().toInt()
    print("Digite o primeiro numero? ")
    val n3 = readln().toInt()

    val order = listOf(n1,n2,n3)

    print("Ordem: ${order.sorted()}")
}