fun main() {
    //1- Faça um programa que receba três inteiros e diga qual deles é o maior.

    print("Digite o primeiro numero? ")
    val n1 = readln().toInt()
    print("Digite o primeiro numero? ")
    val n2 = readln().toInt()
    print("Digite o primeiro numero? ")
    val n3 = readln().toInt()

    if (n1 == 0 && n2 == 0 && n3 == 0) {
        println("O valor digitado não é valido")
    }else if(n1 > n2 && n1 >n3){
        print("O número $n1 é o maior de todos")
    }else if(n2 > n1 && n2 >n3){
        print("O número $n2 é o maior de todos")
    }else{
        println("O número $n3 é o maior de todos")
    }

}