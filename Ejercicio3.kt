/**
 * Descripción:Estadistica alumnos.
 * Autor: Yony Alex Vilca Mamani.
 * Fecha: 22/03/2024
 * Modificación: 22/03/2024
 *
 */
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Ingrese la cantidad de alumnos en el salón: ")
    val cantidadAlumnos = scanner.nextInt()

    var edadMaxima = Int.MIN_VALUE
    var edadMinima = Int.MAX_VALUE
    var todasLasEdades = ""

    for (i in 1..cantidadAlumnos) {
        print("Ingrese la edad del alumno $i: ")
        val edad = scanner.nextInt()

        if (edad > edadMaxima) {
            edadMaxima = edad
        }

        if (edad < edadMinima) {
            edadMinima = edad
        }

        todasLasEdades += "$edad, "
    }

    todasLasEdades = todasLasEdades.dropLast(2)

    println("=== Edades ===")
    println("Máximo = $edadMaxima")
    println("Mínimo = $edadMinima")
    println("Todos = $todasLasEdades")
}