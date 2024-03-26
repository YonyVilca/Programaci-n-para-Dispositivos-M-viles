/**
 * Descripción: Cuenta bancaria.
 * Autor: Yony Alex Vilca Mamani.
 * Fecha: 23/03/2024
 * Modificación: 25/03/2024
 *
 */

// Clase que representa una cuenta bancaria.

class CuentaBancaria(private var saldo: Double, private val limiteRetiro: Double) {
     //Obtiene el saldo actual de la cuenta.
    fun getSaldo(): Double {
        return saldo
    }
     //Establece un nuevo saldo para la cuenta.
    fun setSaldo(nuevoSaldo: Double) {
        saldo = nuevoSaldo
    }
    //Realiza un retiro de dinero de la cuenta.
    fun realizarRetiro(monto: Double): Boolean {
        if (monto <= saldo && monto <= limiteRetiro) {
            saldo -= monto
            return true
        }
        return false
    }
}
// Función principal 

fun main() {
    val cuenta = CuentaBancaria(1000.0, 500.0)
    println("Saldo inicial: ${cuenta.getSaldo()}")
    cuenta.realizarRetiro(200.0)
    println("Saldo después del retiro: ${cuenta.getSaldo()}")
    cuenta.realizarRetiro(800.0)
    println("Saldo después del segundo retiro: ${cuenta.getSaldo()}")
    cuenta.setSaldo(1500.0)
    println("Saldo actualizado: ${cuenta.getSaldo()}")
}