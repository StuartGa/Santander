package s2

import kotlin.math.roundToInt

fun main() {
    //Area rectangulo
    var AreaRectangle = rectangleArea(15.0,6.2)
    println("El area del rectangulo es: $AreaRectangle")

    //Area prisma
    var AreaPrism = prismArea()
    println("El area del prisma es: $AreaPrism")

    //Promedio cal
    //println("El promedio de las calificaciones es: ${promedioCalif()}")

    //Promedio cal 5
    println("El promedio de las calificaciones es: ${promedioCalif(cal3 = 10f)} ")

    //Redondear la calificacion
    println("El promedio de las calificaciones es: ${promedioCalif(cal3 = 10f).roundToInt()} ")
}
fun rectangleArea(base: Double=20.0, height: Double=10.0): Double{
    return base*height
}

fun prismArea(a: Double=3.0,b: Double=4.0, height: Double= 5.0): Double{
    return 2*((a*b)+(a*height)+(b*height))
}

fun promedioCalif(cal1: Float=8f,cal2: Float=8f ,cal3: Float):Float{
    return (cal1+cal2+cal3)/3f
}