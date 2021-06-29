package s3

class Vehiculo {
    var Color = ""
    var Marca=""
    var placas= ""
    var Encendido=false
    var Gasolina = 0
    var Modelo=""


    fun TurOn(){
        Encendido=true
    }
    fun TurnOff(){
        Encendido=false

    }

    fun Status(){
        var Status= if(Encendido) "Encendido" else "Apagado"
        println("El vehiculo esta: $Status")
    }

    fun Recarga(){
        println("El tanque del vehiculo es: $Gasolina")
        println("Ingrese los litros a recargar")
        this.Gasolina = readLine()!!.toInt()

    }
}