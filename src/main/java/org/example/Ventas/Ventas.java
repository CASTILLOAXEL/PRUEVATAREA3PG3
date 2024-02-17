package org.example.Ventas;

import java.util.Arrays;
import java.util.Random;

// Definición de la clase Ventas
public class Ventas {

    // Declaración de la matriz que almacena las ventas
    private int[][] matrizVentas;

    // Constructor de la clase, llamando al método para inicializar la matriz
    public Ventas() {
        inicializarMatrizVentas();
    }

    // Método privado para inicializar la matriz de ventas con valores aleatorios
    private void inicializarMatrizVentas() {
        // Crear una instancia de la clase Random para generar números aleatorios
        Random random = new Random();
        // Inicializar la matriz como un arreglo de 5 filas por 12 columnas
        matrizVentas = new int[5][12];
        // Bucle externo para recorrer cada fila de la matriz
        for (int i = 0; i < matrizVentas.length; i++) {
            // Bucle interno para recorrer cada columna de la matriz
            for (int j = 0; j < matrizVentas[i].length; j++) {
                // Asignar valores aleatorios entre 1 y 10000 a cada elemento de la matriz
                matrizVentas[i][j] = random.nextInt(10000) + 1;
            }
        }
    }

    // Método para imprimir la matriz por filas
    public void imprimirMatrizPorFilas() {
        System.out.println("Matriz de ventas por filas:");
        // Utilizar streams para imprimir cada elemento de la matriz por filas
        Arrays.stream(matrizVentas)
                .forEach(row -> {
                    // Utilizar streams nuevamente para imprimir cada valor con formato
                    Arrays.stream(row)
                            .forEach(value -> System.out.printf("%8d  ", value));
                    // Imprimir un salto de línea al final de cada fila
                    System.out.println();
                });
    }

    // Método para ordenar la matriz por columna
    public void ordenarMatrizPorColumna() {
        System.out.println("\nMatriz de ventas ordenada por columna:");
        // Bucle para iterar sobre cada columna de la matriz
        for (int j = 0; j < matrizVentas[0].length; j++) {
            // Variable final para almacenar el índice de la columna actual
            final int colIdx = j;
            // Utilizar streams para ordenar la matriz por columna
            Arrays.stream(matrizVentas)
                    .sorted((row1, row2) -> Integer.compare(row1[colIdx], row2[colIdx]))
                    // Imprimir cada valor de la columna ordenada con formato
                    .forEach(row -> System.out.printf("%8d  ", row[colIdx]));
            // Imprimir un salto de línea al final de cada columna
            System.out.println();
        }
    }

    // Método para filtrar la matriz por un criterio
    public void filtrarMatrizPorCriterio(int criterio) {
        System.out.println("\nMatriz de ventas filtrada por criterio (" + criterio + "):");
        // Utilizar streams para filtrar valores que cumplen con el criterio
        Arrays.stream(matrizVentas)
                .flatMapToInt(Arrays::stream)
                .filter(value -> value > criterio)
                // Imprimir cada valor filtrado con formato
                .forEach(value -> System.out.printf("%8d  ", value));
    }
}
