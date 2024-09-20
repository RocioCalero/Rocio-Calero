# Rocio-Calero
/*
 * Unidad1 - Ejercicio2
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float distancia;
        float velocidad;
        System.out.println("Introduzca una distancia(km): ");
        distancia = sc.nextInt();
        System.out.println("Introduzca una velocidad(km/h): ");
        velocidad = sc.nextInt();
        float tiempo = distancia / velocidad;
        System.out.println("El tiempo que tardara en recorrer el trayecto es de: " + tiempo);
    }
    
}
