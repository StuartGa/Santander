package Proyecto

import java.util.*
import kotlin.system.exitProcess
const val PRECIO_BASE = 2
const val PRECIO_POR_COR = .5f
fun main() {

    val usuario = Usuario()

    var salida = false
    var pago:String = ""

    //Menu Inicio de sesion, Registrar usuario y salir de la aplicacion
    do {
        println()
        println("Bienvenido a Carpool.")
        println("Por favor ingrese una opcion para utilizar nuestra aplicacion")
        println("1.- Registrarse")
        println("2.- Iniciar Sesion")
        println("3.- Salir de la aplicacion")
        var opcionMenu= readLine()?.toInt()
        when (opcionMenu){
            1 -> {
                println()
                println("Usted selecciono Registro")
                print("Ingresa tu nombre: ")
                val nombreUsuario = readLine().toString()
                print("Ingresa tu contraseña: ")
                val passwordUsuario = readLine().toString()
                do{
                    print("Ingresa tu forma de pago: Efectivo o Tarjeta: ")
                    pago = readLine()!!.toString()
                    when(pago) {
                        "Efectivo" -> {
                            println("Agregado Exitosamente el pago con efectivo")
                            break
                        }
                        "Tarjeta" -> {
                            println("Agregado Exitosamente el pago con tarjeta")
                            break
                        }

                        else -> {
                            println()
                            println("METODO DE PAGO INCORRECTO")
                        }
                    }
                } while (pago.isEmpty() || pago != "Efectivo" || pago != "Tarjeta")
                usuario.setUsuario(nombreUsuario)
                usuario.setPassword(passwordUsuario)
                usuario.registroUsuario(usuario.getUsuario(),usuario.getPassword(),pago)

            }

            2 -> {
                println()
                println("Usted selecciono Iniciar Sesion")
                //login de usuario
                print("Ingresa tu nombre: ")
                val nombreUsuario = readLine().toString()
                print("Ingresa tu contraseña: ")
                val passwordUsuario = readLine().toString()

                if (usuario.loginUsuario(nombreUsuario, passwordUsuario)) {
                    if (!usuario.getUsuario().equals("") && !usuario.getPassword().equals("")) {
                        println()
                        /*
                        El usuario después de iniciar sesion tiene que ingresar sus coordenadas
                        Coordenadas actuales en donde está ubicado actualmente
                        Coordenadas destino a donde quiere ir
                         */
                        print("Ingrese sus coordenadas actuales: ")
                        var coordenadasActuales = readLine()!!.toInt()
                        print("Ingrese las coordenadas de su destino: ")
                        var coordenadaDestino = readLine()!!.toInt()
                        usuario.setCoorActuales(coordenadasActuales)
                        usuario.setCoorDestino(coordenadaDestino)
                        usuario.ingresarCoordenadas(usuario.getCoorActuales(), usuario.getCoorDestino())

                        println()
                        // Muestra los datos del conductor
                        val conductor = Conductor("Juan", 100, Automovil("Nissan", "Azul", "Versa"))
                        println()

                        usuario.solicitarViaje(conductor.getCoordenadasConductor(), coordenadasActuales)

                        do {
                            println()
                            println("Desea cancelar su viaje")
                            println("1.- Si")
                            println("2.- No")
                            var opcionMenu2= readLine()?.toInt()
                            when(opcionMenu2){
                                1 -> {
                                    println()
                                    println("Se le descontara por cancelar el viaje: $${usuario.obtenerPenalizacion(100)}")
                                    usuario.cancelarViaje()

                                }

                                2 -> {
                                    println()
                                    // Muesta el tiempo en el que el usuario podría llegar a su destino
                                    usuario.llegadaDestino(coordenadasActuales, coordenadaDestino)
                                    println()
                                    var montoF=usuario.calcularCostoViaje(coordenadasActuales, coordenadaDestino)
                                    println("El costo de su viaje es: ${usuario.calcularCostoViaje(coordenadasActuales, coordenadaDestino)}")
                                    var forma=FormaPago()
                                    if (forma.Pago(montoF)){
                                        println("Viaje Pagado Exitosamente")
                                    }
                                        else{
                                            println("No se pudo realizar el pago")
                                    }
                                    // La condicion es por si el precio es mayor a 1000 al usuario le haran un descuento de un monto de $200
                                    if (usuario.calcularCostoViaje(coordenadasActuales, coordenadaDestino) > 500) {
                                        var descuento = usuario.obtenerDescuento(200)
                                        println("Obtienes un descuento de $${descuento}")
                                        println("El total que pagarías es de $${usuario.calcularCostoViaje(coordenadasActuales, coordenadaDestino) - descuento}")
                                        montoF=usuario.calcularCostoViaje(coordenadasActuales, coordenadaDestino)-descuento
                                        if (forma.Pago(montoF)){
                                            println("Viaje Pagado Exitosamente")
                                        }
                                        else{
                                            println("No se pudo realizar el pago")
                                        }
                                    }
                                    println()
                                    usuario.estadoViaje("Viaje Terminado")
                                    println("Ingrese la calificacion del chofer")
                                    conductor.asignarCalificacion(readLine()!!.toFloat())

                                    break
                                }

                                else -> {
                                    println()
                                    println("OPCIÓN INVALIDA!!")
                                }
                            }

                        }while (opcionMenu2 != 1 && opcionMenu2 != 2)

                        break
                    } else
                        salida = false
                }
            }

            3 -> salida = true
            else ->{
                println()
                println("OPCIÓN INVALIDA!!")
            }
        }

    }while (!salida)
}