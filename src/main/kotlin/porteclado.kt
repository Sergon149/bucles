fun main() {

    val rangonum = 0..9

    val numaquina = getRandomNumber(0..9)
    println("Encuentra el número  $rangonum")
    do {
        println("Escribe un numero")
        val usuario = readIntFromKeyboard()
        val encontrado = when {
            numaquina > usuario -> {
                println("El numero es mas grande")
                false
            }
            numaquina < usuario -> {
                println("El numero es mas pequeño")
                false
            }
            else -> {
                println("Correcto el numero es $numaquina")
                true
            }
        }
    } while (!encontrado)
}

fun readIntFromKeyboard(): Int {

    var result : Int?

    do {
        val option = readLine()
        result = try {
            option?.toInt()
        } catch (e: NumberFormatException) {
            println("Lo que has introducido no es un número.")
            null
        }

    } while (result == null)
    return result
}

fun getRandomNumber(rango: IntRange): Int {
    return rango.random()
}