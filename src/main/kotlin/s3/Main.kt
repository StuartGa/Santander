package s3

fun main() {
    /*
    var myVehiculo = Vehiculo()
    println("Ingrese el color de su vehiculo: ")
    myVehiculo.Color = readLine()!!

    println("Ingrese las placas de su vehiculo: ")
    myVehiculo.placas = readLine()!!

    println("Ingrese la marca de su vehiculo: ")
    myVehiculo.Marca = readLine()!!

    println("Ingrese el modelo de su vehiculo: ")
    myVehiculo.Modelo = readLine()!!

    myVehiculo.Status()
    myVehiculo.TurOn()
    myVehiculo.Status()
    myVehiculo.Recarga()
    println("El tanque del vehiculo es: ${myVehiculo.Gasolina}")
*/
    /*println("Ingrese su nombre")
    var Nombre = readLine()!!
    println("Ingrese su Apellido")
    var Apellidos = readLine()!!
    println("Ingrese su Sexo")
    var Sexo = readLine()!!
    println("Ingrese su Altura")
    var Altura = readLine()!!.toFloat()

    var myPersona = Persona(Nombre,Apellidos, Sexo, Altura)*/

    var myMario = Mario(3)
    for (i in 1..5){
        if(myMario.isAlive){
            myMario.collision("Goomba")
            println("Te quedan ${myMario.getLives()}")
        }
    }
    myMario.collision("Star")

}