package com.melendez.paulo.laboratoriocalificado01

import org.junit.Test

class Ejercicio01Kotlin {

    @Test
    fun verificarAnagramas() {
        // Caso 1: Palabras que son anagramas
        val palabra1 = "listen"  // Primera palabra
        val palabra2 = "silent"  // Segunda palabra
        compararAnagramas(palabra1, palabra2)  // Llamamos a la función para verificar anagramas

        // Caso 2: Palabras que no son anagramas
        val palabra3 = "hello"  // Tercera palabra
        val palabra4 = "world"  // Cuarta palabra
        compararAnagramas(palabra3, palabra4)  // Llamamos a la función para verificar anagramas
    }

    // Función para comparar si dos pares de palabras son anagramas
    private fun compararAnagramas(p1: String, p2: String) {
        // Convertimos ambas palabras a minúsculas, las convertimos en arreglos de caracteres y las ordenamos
        val caracteres1 = p1.lowercase().toCharArray().sorted()  // Ordenamos la primera palabra
        val caracteres2 = p2.lowercase().toCharArray().sorted()  // Ordenamos la segunda palabra

        // Comparamos los arreglos ordenados para determinar si son anagramas
        val sonAnagramas1 = caracteres1 == caracteres2  // Resultado de la comparación para el primer par

        // Imprimimos el resultado de la comparación
        println("palabras: $p1 y $p2")  // Mostramos las palabras que se están comparando
        println("Resultado: $sonAnagramas1")  // Imprimimos true o false según el resultado de la comparación
    }
}