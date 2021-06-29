package Proyecto

class Automovil {

    private var color: String = ""
    private var marca: String = ""
    private var modelo:String = ""
    private var placas: String = ""


    constructor (marca: String, color: String, modelo: String){
        this.marca = marca
        this.color = color
        this.modelo = modelo
        this.placas = "65I6UN"
    }

    fun getColor(): String {
        return color
    }

    fun setColor(color: String) {
        this.color = color
    }

    fun getMarca(): String {
        return marca
    }

    fun setMarca(marca: String) {
        this.marca = marca
    }

    fun getModelo(): String {
        return modelo
    }

    fun setModelo(modelo: String) {
        this.modelo = modelo
    }

    fun getPlacas(): String {
        return placas
    }

    fun setPlacas(placas: String) {
        this.placas = placas
    }




}