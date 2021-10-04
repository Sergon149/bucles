fun main(){
    println(generarPalabraAleatoria())
}

fun generarPalabraAleatoria ():String {
    var cad=""
    val Rango = 'a'..'z'
    cad=cad+Rango.random().uppercaseChar()
    repeat(3) {
        cad=cad+Rango.random()
    }
    return cad
}