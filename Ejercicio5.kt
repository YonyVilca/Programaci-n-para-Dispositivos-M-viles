/**
 * Descripción:Adivina Numero.
 * Autor: Yony Alex Vilca Mamani.
 * Fecha: 22/03/2024
 * Modificación: 22/03/2024
 *
 */
import kotlin.random.Random

fun main() {
    val aleatorio = Random.nextInt(1, 31)
    var intentos = 5

    println("Adivina el número (entre 1 y 30):")

    while (intentos > 0) {
        val adivina = readLine()?.toIntOrNull()

        if (adivina == null) {
            println("Entrada inválida. Inténtalo de nuevo.")
            continue
        }

        if (adivina == aleatorio) {
            println("¡Felicidades! ¡Has adivinado el número!")
            return
        } else if (adivina < aleatorio) {
            println("El número a adivinar es mayor.")
        } else {
            println("El número a adivinar es menor.")
        }

        intentos--
        println("Intentos restantes: $intentos")
    }

    println("Game over. No has logrado adivinar el número.")
}
