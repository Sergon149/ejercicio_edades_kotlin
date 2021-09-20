import kotlin.random.Random

fun main(){
    ifedades()
    numeroentero()
    parimpar()
}

fun ifedades(){
    val numero = Random.nextInt(0,65)
    val nombre = ("Sergio")

    println("La edad es $numero")
    if (numero < 18) println("$nombre, debes abonar 5€")
    if (numero in 18..65) println("$nombre, debes abonar 10€")
    else println("$nombre, para ti es gratis")

}

fun numeroentero(){
    var numero = 3
    var aux1 = 0
    var aux2 = 0

    if (numero > 0){
        aux1=numero*2
        aux2=aux1+2
        println(aux2)
    }
    if (numero < 0){
        aux1=numero/2
        aux2=aux1-3
        println(aux2)
    }else println(numero)
}

fun parimpar(){
    var numero = 3

    if (numero%2 == 0){
        println("Es par")
    }else println("Es impar")
}