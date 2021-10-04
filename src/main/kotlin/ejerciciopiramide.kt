import java.util.*

fun main() {
    val scan = Scanner(System.`in`)

    println("¿Cuantos pisos quieres?")
    val p = scan.nextLine().trim().toInt()

    construirpiramide(p)
}
fun construirpiramide(p:Int){
    repeat(p){
        print("/")
    }
        repeat(p){
        print("__")
        }
    println("\\")
}