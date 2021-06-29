package s4
open class Koopa():
    Enemy("Koopa",2){

    init {
        println("iniciando subclase de $name")
    }
    protected open var state = "Walking"
    set(value) {
        field=value
        println("El estado ahora es $field")
    }
    override fun collision(collider: String){
        when(collider){
            "Weapon" -> {
                if(state=="Walking"){
                state = "Shell"
                println("El estado es $state")}
                else if(state=="Shell"){
                    state="Died"
                    die()
                }
            }
            "Enemy" -> changeDirection()
        }
    }
}
