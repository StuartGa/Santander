package s2

fun main() {
    var nombres= arrayOf("Nombre Uno", "Nombre Uno", "Nombre Uno", "Nombre Uno", "Nombre Uno", "Nombre Uno")


    for (nombre in nombres){
        println(nombre)
    }

    nombres.forEach { println(it) }
}
