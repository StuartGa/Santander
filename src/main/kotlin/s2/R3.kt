package s2

fun main() {
    println("Ingrese su nombre")
    val nombres= listOf("Pedro Luis", "Juan Manuel", "Juan Luis", "María Inés", "Romeo", "Ernesto", "Juan Pedro", "Ariadna", "Mireya María", "Ana Sofía", "José Juan")

    var nomre= readLine()!!

    println("El numero de contador es: ${countNames(nombres = nombres,CurrentName = nomre )}")
    dowhile();
}
/*
fun countNames(CurrentName: String): Int{
    var contador = 0
    for (nombre in nombres ) {
        if (CurrentName in nombre)
            contador++
    }
    return contador
}*/

fun dowhile(){
    var x = 20
    do
    {
        println(x)
        x--
    } while (x > 0)
}
fun countNames(nombres: List<String> ,CurrentName: String): Int{
    var contador = 0
    for(nombre in nombres){
        if (CurrentName in nombres)
            contador++
        }
    return contador
}