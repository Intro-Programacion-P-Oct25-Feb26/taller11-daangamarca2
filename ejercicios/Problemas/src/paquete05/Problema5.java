/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class Problema5 {

    public static void main(String[] args) {
        // TODO code application logic here\

        int[][] informacion = {
            {1, 2, 3},
            {10, 20, 30},
            {100, 200, 300}
        };

        int[][] informacion2 = {
            {1, 2, 3},
            {10, 20, 30},
            {100, 200, 300}
        };

        int[][] resultado = sumarMatrices(informacion, informacion2);

        imprimirMatriz(resultado);
    }

    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] suma = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return suma;
    }

    public static void imprimirMatriz(int[][] matriz) {
        String mensaje = "";
        for (int i = 0; i < matriz.length; i++) {
            mensaje = "";
            for (int j = 0; j < matriz[i].length; j++) {
                mensaje = mensaje + String.format("%s\t", matriz[i][j]);
            }
            System.out.printf(mensaje + "\n");
        }
    }
}
