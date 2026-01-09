/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] args) {
        String[] ciudadesEcuador = obtenerCiudades();
        presentar(ciudadesEcuador);
    }

    public static String[] obtenerCiudades() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el tamaño del arreglo");
        int numero = entrada.nextInt();
        entrada.nextLine();
        String[] ciudades = new String[numero];
        for (int i = 0; i < numero; i++) {
            System.out.println("Ingrese el nombre de la Ciudad" + (i + 1));
            ciudades[i] = entrada.nextLine();

        }
        return ciudades;
    }

    public static void presentar(String[] lista) {
        String resultado = "";
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].length() == 4 || lista[i].length() == 5) {
                resultado = String.format("%s\n", lista[i]);
            }
        }
        System.out.printf("CIUDADES CON 4 o 5 CARACTERES\n%s\n", resultado);

    }

}
