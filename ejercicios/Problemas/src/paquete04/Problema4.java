/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String cedula;
        int opcion;
        String resultado = "";
        System.out.println("Ingrese la opcion 1 = Calcular valor de planilla "
                + "2 = Calcular valor del predio");
        opcion = entrada.nextInt();
        entrada.nextLine();
        if (opcion == 1) {
            System.out.println("Ingrese el nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la cedula");
            cedula = entrada.nextLine();
            resultado = obtenerPlanillaLuz(nombre, cedula);
        } else {
            if (opcion == 2) {
                System.out.println("Ingrese el nombre");
                nombre = entrada.nextLine();
                System.out.println("Ingrese la cedula");
                cedula = entrada.nextLine();
                resultado = obtenerPredio(nombre, cedula);
            } else {
                System.out.println("Valor ingresado es invalido");
            }
        }
        System.out.printf(resultado);
    }

    public static String obtenerPlanillaLuz(String n, String c) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double numeroKilovatio;
        double valorPorKilovatio;
        double valorPlanilla;
        String mensaje = "";
        System.out.println("Ingrese el numero de kilovatios consumidos");
        numeroKilovatio = entrada.nextDouble();
        System.out.println("Ingrese el valor por kilovatio consumido");
        valorPorKilovatio = entrada.nextDouble();
        valorPlanilla = numeroKilovatio * valorPorKilovatio;
        mensaje = mensaje + String.format("Cliente %s con cedula %s debe "
                + "cancelar el valor de $%.2f\n", n, c, valorPlanilla);
        return mensaje;
    }

    public static String obtenerPredio(String n, String c) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double valorInmueble;
        double valorPredio;
        String mensaje = "";
        System.out.println("Ingrese el valor del inmueble");
        valorInmueble = entrada.nextDouble();
        valorPredio = (valorInmueble * 2) / 100;
        mensaje = mensaje + String.format("Cliente %s con cedula %s tiene "
                + "un bien inmueble valorado en %.2f y tiene que pagar el predio"
                + " de $%.2f\n", n, c, valorInmueble, valorPredio);
        return mensaje;
    }
}
