/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String[] viviendas = new String[10];
        double[][] consumo = new double[10][12];
        double[] consumoAnual = new double[10];

        viviendas = obtenerListado();
        consumo = obtenerConsumos();
        consumoAnual = obtenerConsumosAnuales(consumo);
        obtenerReporte(viviendas, consumoAnual);

    }

    public static String[] obtenerListado() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadena[] = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el nombre de la vivienda ");
            cadena[i] = entrada.nextLine();
        }
        return cadena;
    }

    public static double[][] obtenerConsumos() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double matriz[][] = new double[10][12];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("Ingrese el consumo del mes");
                matriz[i][j] = entrada.nextDouble();
            }
        }
        return matriz;
    }

    public static double[] obtenerConsumosAnuales(double[][] consumo) {
        double[] totalesVivienda = new double[10];

        for (int i = 0; i < 10; i++) {
            double suma = 0;
            for (int j = 0; j < 12; j++) {
                suma = suma + consumo[i][j];
            }
            totalesVivienda[i] = suma;
        }
        return totalesVivienda;
    }

    public static void obtenerReporte(String[] viviendas, double[] gastoAnual) {
        String cadenaFinal = "";

        for (int i = 0; i < 10; i++) {
            cadenaFinal = cadenaFinal + String.format("Vivienda: %s - Consumo "
                    + "Total: %.2f\n", viviendas[i], gastoAnual[i]);
        }
        System.out.print(cadenaFinal);
    }
}
