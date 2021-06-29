package Proyecto

class Conductor {
    private var nombre: String = ""
    private var coordenadasConductor: Int = 0
    private var Calificacion = 4.5f
    private lateinit var automovil: Automovil

    constructor(nombre:String, coordenas: Int, automovil: Automovil) {
        this.nombre = nombre
        this.coordenadasConductor = coordenas
        this.automovil = automovil

        println("""Los datos del conductor son:
            Nombre: ${this.nombre}
            Coordenadas: ${this.coordenadasConductor}
            Datos del Automovil:
            Marca: ${automovil.getMarca()}
            Modelo: ${automovil.getModelo()}
            Color: ${this.automovil.getColor()}
            Placas: ${this.automovil.getPlacas()}""")
    }

    fun getNombre(): String {
        return nombre
    }

    fun setUsuario(nombre: String) {
        this.nombre = nombre
    }

    fun getCoordenadasConductor(): Int {
        return coordenadasConductor
    }

    fun setCoordenadasConductor(coordenas: Int) {
        this.coordenadasConductor = coordenas
    }
    fun asignarCalificacion(Calif: Float) {
        this.Calificacion=Calif
    }
}