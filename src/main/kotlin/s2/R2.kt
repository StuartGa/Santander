package s2

fun main() {
    println("Ingrese el primer lado del triangulo")
    var lado1 = readLine()!!.toInt()
    println("Ingrese el segundo lado del triangulo")
    var lado2 = readLine()!!.toInt()
    println("Ingrese el tercer lado del triangulo")
    var lado3 = readLine()!!.toInt()

    typeTriangle(lado1,lado2,lado3)

    var Dato: Any= (5)
    typeDate(Dato)
}
fun typeTriangle(lado1: Int, lado2: Int, lado3: Int){
    if (lado1 == lado2 && lado1== lado3 &&lado3==lado1){
        println("Es un triangulo equilatero")
    } else if(lado1==lado2 || lado2==lado3 || lado3==lado1){
        println("Es un triangulo Isoceles")
    }else{
        println("Es un triangulo Escaleno")
    }
}

fun typeDate(Dato: Any){
    when(Dato){

        is Int -> {
            println("El dato es int")
        }
         is Float -> {
            println("El dato es Float")
        }
        is Boolean -> {
            println("El dato es boolean")
        }
        is Long -> {
            println("El dato es Long")
        }
        is Double -> {
            println("El dato es Double")
        }
        else -> println("El tipo de dato es: ${Dato.javaClass.kotlin}")
}}