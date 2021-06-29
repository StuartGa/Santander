package s2

import kotlin.math.pow

const val PI = 3.1416f
const val PHI = 1.618f

fun main() {
    val radius = 4f
    val area = circleArea(radius)
    printName("Andres")
    printAge(28)
    getPi()
    val session = login("andres","123")
    println("Usuario loeggeado? $session")

    println("Are con valores por defecto ${rectangelArea()}")
    println("Are con base por defecto ${rectangelArea(10.0)}")
    println("Are con altura por defecto ${rectangelArea(height = 20.0)}")
    println("Are con altura por defecto ${rectangelArea(10.0,25.0)}")

}
fun rectangelArea(base: Double=20.0, height: Double=10.0): Double{
    return base*height
}

fun circleArea(radius: Float): Float{
    return PI*radius.pow(2)
}

fun printName(name: String){
    println("Mi nombre es: $name")
}

fun printAge(age: Int){
    println("Tengo: $age")

}

fun getPi():Float {
    return PI
}

fun login(user: String, password: String): Boolean{
    fun validate(input: String): Boolean{
        if (input.isEmpty()){
            return false
        }
        return true
    }
    val userValidated = validate(user)
    val passValidate = validate(password)
    return passValidate && passValidate
}