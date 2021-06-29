package s4p2


class NationalLowSeason(city: String) : National(city),IPromotion,CancelTravel {
    override  val discount = 10 //es porcentaje, o sea 10%
    override val typeDiscount = 0 //0 para porcentaje, 1 para cantidad

    override fun getPrice(numDays: Int): Int {
        val amount = super.getPrice(numDays)
        return if (amount == 0) 0 else getDiscountPrice(amount)
    }

    override fun CancelTravel() {
        if(this.reserved){
            this.reserved=false
            this.paidAmount=0
            println("Viaje cancelado exitosamente")
        }
        println("No se ha reservado viaje aun")
    }
}