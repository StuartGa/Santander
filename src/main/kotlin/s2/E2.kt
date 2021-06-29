package s2

fun main(){
    /*if (true){
        println("Si")
    }
    if (false){
        println("no")
    }*/
    verifyAge()
    gradoEscolar()
}
fun verifyAge(){
    println("Ingresa la edad y da enter: ")
    val age = readLine()?.toInt()

    when  {
        age!!> 18 -> {
            println("Ya eres mayor de edad")
        }
        age ==18 -> {
            println("Acabas de cumplir 18")}
        else -> {

            println("Eres menor de edad")
        }
    }
   /* if (age!!> 18){
        println("Ya eres mayor de edad")
    } else if(age ==18){
        println("Acabas de cumplir 18")}
    else{

        println("Eres menor de edad")
    }*/
}

fun gradoEscolar(){
    print("Ingresa edad y presiona enter (escribe solo el numero): ")
    val age = readLine()?.toInt()

    when(age){
        0 -> println("Apeas eres recien nacido!")
        1 -> println("Solo tienes un año de edad")
        in 2..5 -> println("Estas en preescolar")
        in 6..11 -> println("Estas en la primaria")
        else -> {
            println("El SAT te esta buscando")
        }
    }
}