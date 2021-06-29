package s4p2

open class International(override val city: String, override val country: String ):Travel() {

    protected val Alemanfees= mapOf(
        "Munich" to 980,
        "Berlin" to 820,
        "Francfort" to 850)
    protected val Chilefees = mapOf(
        "Santiago" to 643,
        "Valparaiso" to 721)

    protected val Canadafees= mapOf(
        "Vancouver" to 620,
        "Ottawa" to 680,
        "Montreal" to 600)
    val TaxGerman=.16
    val TaxChile = .5
    val TaxCanada=.1
    override fun getPrice(numDays: Int): Int {

        when(country){
           "Alemania"-> {
               val fee =Alemanfees[city]
               if( fee ==null){
                   return 0
               }

               return (fee * numDays)*(1+ TaxGerman).toInt()
           }
            "Chile"-> {
                val fee =Chilefees[city]
                if( fee ==null){
                    return 0
                }

                return (fee * numDays)*(1+ TaxChile).toInt()
            }
            "Canada"-> {
                val fee =Canadafees[city]
                if( fee ==null){
                    return 0
                }
                return (fee * numDays)*(1+ TaxCanada).toInt()
            }
            else -> {
                return 0
            }
       }}}


