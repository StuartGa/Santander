package Proyecto

class FormaPago {
    var Credito=1000f

    open fun Pago(Monto:Float):Boolean{
        if(Credito>Monto){
            this.Credito -= Monto
            return true
        }else{
            return false
        }
    }

}