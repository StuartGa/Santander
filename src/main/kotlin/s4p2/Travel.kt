package s4p2

abstract class Travel {

    abstract val country: String
    abstract val city: String

    protected val serviceType = "Viaje"
    protected var reserved = false
    protected var paidAmount = 0

    fun reserve(numDays: Int){
        if(reserved){
            println("""¡Ya reservaste tu viaje! 
                       País: $country
                       Ciudad: $city
                       Precio: $paidAmount""".trimMargin())
            return
        }
        val amount = getPrice(numDays)
        if(amount==0){
            return
        }
        reserved = true
        paidAmount = amount
        println("""¡Viaje reservado exitosamente! 
                       País: $country
                       Ciudad: $city
                       Precio: $paidAmount""".trimMargin())
    }

      fun quotePrice(numDays:Int){
         val price = getPrice(numDays) //Obtenesmos la tarifa segun la ciudad
         if(price == 0) println("Lo sentimos no hacemos viajes a esta ciudad") else println("El viaje a la ciudad: $city , es: $price")

     }


    //es protected para que sólo se pueda obtener el valor numérico desde la clase
    protected abstract fun getPrice(numDays: Int): Int

}