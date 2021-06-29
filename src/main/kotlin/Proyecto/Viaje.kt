package Proyecto

abstract class Viaje {

    protected var viajePedido = false
    protected var montoPagado = 0f
    protected var contador: Int = 0

    // Funcion para el ingresar las coordenadas del usuario
    fun ingresarCoordenadas(coordenadaActual: Int, coordenadaDestino: Int): Boolean {
        fun validate (input: Int): Boolean {
            if (input == null || input.equals("")){
                println("Error al ingresar coordenadas")
                return false
            }else if(coordenadaActual>500)
            { return true
            } else{
                println("Coordenadas incorrectas")
                return false
            }
        }

        val coorActualValidate = validate(coordenadaActual)
        val coorDestinoValidate = validate(coordenadaDestino)

        if(viajePedido){
            println("""¡Ya pediste tu viaje!""".trimMargin())

        }
        this.montoPagado = calcularCostoViaje(coordenadaActual,coordenadaDestino)
        this.viajePedido = true
        /*montoPagado = amount*/
        println("""¡Viaje pedido exitosamente!""".trimMargin())


        return coorActualValidate && coorDestinoValidate
    }

    //Funcion que calcula el tiempo estimado al lugar del destino del usuario
    fun llegadaDestino(coordenadaActual: Int,coordenadaDestino: Int): Float{
        var diferenciaCoordenadas = coordenadaDestino - coordenadaActual
        var tiempoLlegada: Float = diferenciaCoordenadas.toFloat()
        val proximidad = diferenciaCoordenadas
        when (proximidad){
            0 -> println("Ha llegado a su destino")
            in 1..100 ->{
                for(i: Int in proximidad downTo 0){
                    tiempoLlegada-= contador
                    if (tiempoLlegada <= 0) {
                        println("Ha llegado a su destino")
                        break
                    } else {
                        println("Tardaras en llegar ${((tiempoLlegada)).toInt()} segundos")
                        contador ++
                    }

                    if (tiempoLlegada.toInt() == 0) {
                        println("Ha llegado a su destino")
                    }
                }

            }

            in 100..200 ->{
                for(i: Int in proximidad downTo -1){
                    tiempoLlegada-= contador
                    if ( tiempoLlegada < 0 ) {
                        break
                    } else {
                        println("Tardaras en llegar ${((tiempoLlegada)).toInt()} segundos")
                        contador ++
                    }

                    if (tiempoLlegada.toInt() == 0) {
                        println("Ha llegado a su destino")
                    }
                }
            }

            in 200..250 -> {
                for (i: Int in proximidad downTo -1){
                    tiempoLlegada-= contador
                    if (tiempoLlegada < 0) {
                        break
                    } else {
                        println("Tardaras en llegar ${((tiempoLlegada)).toInt()} segundos")
                        contador ++
                    }

                    if (tiempoLlegada.toInt() == 0) {
                        println("Ha llegado a su destino")
                    }
                }
            }

            in 250..550 -> {
                for (i: Int in proximidad downTo -1){
                    tiempoLlegada-= contador
                    if (tiempoLlegada < 0) {
                        break
                    } else {
                        println("Tardaras en llegar ${((tiempoLlegada)).toInt()} segundos")
                        contador ++
                    }
                    if (tiempoLlegada.toInt() == 0) {
                        println("Ha llegado a su destino")
                    }
                }
            }

            in 550..1050 -> {
                for (i: Int in proximidad downTo -1){
                    tiempoLlegada-= contador
                    if (tiempoLlegada < 0) {
                        break
                    } else {
                        println("Tardaras en llagar ${((tiempoLlegada)).toInt()} segundos")
                        contador ++
                    }

                    if (tiempoLlegada.toInt() == 0) {
                        println("Ha llegado a su destino")
                    }
                }
            }

            in 1050..1500 -> {
                for (i: Int in proximidad downTo -1){
                    tiempoLlegada-= contador
                    if (tiempoLlegada < 0) {
                        break
                    } else {
                        println("Tardaras en llagar ${((tiempoLlegada)).toInt()} segundos")
                        contador ++
                    }

                    if (tiempoLlegada.toInt() == 0) {
                        println("Ha llegado a su destino")
                    }
                }
            }
            else -> {
                println("Hay mucho tráfico")
                println("Llegara en unos cuantos minutos...")

                // Se implemento un sleep para desimular el tiempo que llega el usuario a su destino
                Thread.sleep(10000)
                println("Ha llegado a su destino")

            }
        }

        return proximidad.toFloat()
    }

    //es protected para que sólo se pueda obtener el valor numérico desde la clase
    protected abstract fun calcularCostoViaje(coorActual: Int, coorDestino: Int): Float

    // Indica el estado del viaje si esta en espera o ya termino su viaje el usuario
    protected abstract fun estadoViaje(viajeObj: String)
}