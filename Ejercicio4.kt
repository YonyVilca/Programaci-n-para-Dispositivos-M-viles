/**
 * Descripción:Calculadora Elemental.
 * Autor: Yony Alex Vilca Mamani.
 * Fecha: 22/03/2024
 * Modificación: 22/03/2024
 *
 */
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var option: Int

    do {
        println("==== Menú ====")
        println("1. Suma")
        println("2. Resta")
        println("3. Multiplicación")
        println("4. División")
        println("5. Salir")
        print("Ingrese una opción: ")
        option = scanner.nextInt()

        when (option) {
            1 -> Suma()
            2 -> Resta()
            3 -> Multiplicacion()
            4 -> Divicion()
            5 -> println("Saliendo...")
            else -> println("Opción inválida. Por favor, seleccione una opción válida.")
        }
    } while (option != 5)
}

fun Suma() {
    val scanner = Scanner(System.`in`)
    print("Ingrese el primer número: ")
    val num1 = scanner.nextDouble()
    print("Ingrese el segundo número: ")
    val num2 = scanner.nextDouble()
    val result = num1 + num2
    println("El resultado de la suma es: $result")
}

fun Resta() {
    val scanner = Scanner(System.`in`)
    print("Ingrese el primer número: ")
    val num1 = scanner.nextDouble()
    print("Ingrese el segundo número: ")
    val num2 = scanner.nextDouble()
    val result = num1 - num2
    println("El resultado de la resta es: $result")
}

fun Multiplicacion() {
    val scanner = Scanner(System.`in`)
    print("Ingrese el primer número: ")
    val num1 = scanner.nextDouble()
    print("Ingrese el segundo número: ")
    val num2 = scanner.nextDouble()
    val result = num1 * num2
    println("El resultado de la multiplicación es: $result")
}

fun Divicion() {
    val scanner = Scanner(System.`in`)
    print("Ingrese el dividendo: ")
    val dividend = scanner.nextDouble()
    print("Ingrese el divisor: ")
    val divisor = scanner.nextDouble()

    if (divisor != 0.0) {
        val result = dividend / divisor
        println("El resultado de la división es: $result")
    } else {
        println("No se puede dividir entre cero.")
    }
}