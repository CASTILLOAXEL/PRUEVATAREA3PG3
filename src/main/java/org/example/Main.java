package org.example;

import org.example.Ventas.Ventas;

public class Main {
public static void main(String[] args) {
    // Crear una instancia de la clase Ventas utilizando el constructor
    Ventas ventas = new Ventas();

// Llamar al método de la instancia para imprimir la matriz por filas
    ventas.imprimirMatrizPorFilas();

// Llamar al método de la instancia para ordenar la matriz por columna
    ventas.ordenarMatrizPorColumna();

// Llamar al método de la instancia para filtrar la matriz por un criterio (en este caso, 5000)
    ventas.filtrarMatrizPorCriterio(5000);


}
}
