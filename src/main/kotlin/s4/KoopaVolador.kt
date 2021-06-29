package s4

class KoopaVolador: Koopa() {

    override var state = "Flying"

    override fun collision(collider: String) {
        when(collider){
            "Weapon" -> {
                if(state=="Flying"){
                    state = "Walking"
                    println("El estado es $state")}
                else if(state=="Walking"){
                    state="Shell"
                    println("El estado es $state")
                }else{
                    state="Died"
                    println("El estado es $state")
                    die()
                }
            }
            "Enemy" -> changeDirection()
        }
    }
}