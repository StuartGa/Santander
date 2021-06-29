package s4p2

fun main() {

    val viajeMonterrey = National("Monterrey")
    viajeMonterrey.quotePrice(2)
    viajeMonterrey.reserve(4)

    println("--------------")

    val viajeBajaMonterrey = NationalLowSeason("Monterrey")
    viajeBajaMonterrey.reserve(4)

    println("--------------")
    val viajeBajaGdl = NationalLowSeason("Guadalajara")
    viajeBajaGdl.reserve(4)
    viajeBajaGdl.CancelTravel()
    viajeBajaGdl.CancelTravel()
    viajeBajaGdl.reserve(2)
}