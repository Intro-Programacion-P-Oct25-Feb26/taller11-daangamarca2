/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String resultado;
        int opcion;
        System.out.println("Ingrese el área a calcular: 1=cuadrado, "
                + "2=triángulo, 3=rectángulo");
        opcion = entrada.nextInt();
        if (opcion == 1) {
            obtenerAreaCuadrado();
        } else {
            if (opcion == 2) {
                obtenerAreaTriangulo();
            } else {
                if (opcion == 3) {
                    obtenerAreaRectangulo();
                } else {
                    System.out.println("La opcion ingresada es invalida");
                }
            }
        }
    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double lado;
        double area;
        String mensaje = "";
        System.out.println("Ingrese la longitud del cuadrado");
        lado = entrada.nextDouble();
        area = lado * lado;
        mensaje = mensaje + String.format("El area del cuadrado de lado %.2f es: "
                + "%.2f", lado, area);
        System.out.println(mensaje);;
    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double base;
        double altura;
        double area;
        String mensaje = "";
        System.out.println("Ingrese la base del triangulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        altura = entrada.nextDouble();
        area = (base * altura) / 2;
        mensaje = mensaje + String.format("El area del triangulo de base %.2f y"
                + " lado %.2f es: %.2f ", base, altura, area);
        System.out.println(mensaje);;
    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double base;
        double altura;
        double area;
        String mensaje = "";
        System.out.println("Ingrese la base del triangulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        altura = entrada.nextDouble();
        area = base * altura;
        mensaje = mensaje + String.format("El area del rectangulo de base %.2f y"
                + " lado %.2f es: %.2f ", base, altura, area);
        System.out.println(mensaje);;
    }
}
