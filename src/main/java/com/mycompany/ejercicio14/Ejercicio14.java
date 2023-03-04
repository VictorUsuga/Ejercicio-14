
package com.mycompany.ejercicio14;

import java.util.Scanner;


public class Ejercicio14 {

    public static void main(String[] args) {
        int X, cuadrado, cubo;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese un número: ");
        X= entrada.nextInt();
        cuadrado = X*X;
        cubo = X*X*X;
        System.out.println("El cuadrado es: " + cuadrado);
        System.out.println("El cubo es: " + cubo);
    }
}
