import java.util.*

fun main(){
    val scan = Scanner(System.`in`)

    println("¿Cuantas ventanas quieres?")
    val v = scan.nextLine().trim().toInt()
    //println(v)

    println("¿Cuantos pisos quieres?")
    val p = scan.nextLine().trim().toInt()
    //println(p)

    edificio(v, p)

}
fun edificio(v :Int, p :Int){
    var total=v*3+2
    var cadena:String
    repeat(total-1){
        print("-")
    }
    println("-")
    repeat(p){
        print("|")
        repeat(v){
            print("_▋_")
        }
        println("|")
    }
}