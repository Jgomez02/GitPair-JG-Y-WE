/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * El programador B creará los metodos necesarios para: (seguir instrucciones)
 *
 * @author Juan Gomez DAM1A
 */
public class Entrada {

    /**
     * Metodo que pide un numero entero al usuario y lo devuelve con un return
     *
     * @throws InputMismatchException error de argumentos
     * @return int Devuelve el numero
     *
     */
    public static int entero() {
        int aux = 0;

        /*Definir un scanner*/
        Scanner entrada = new Scanner(System.in);

        try {
            aux = entrada.nextInt();
            /*Si el usuario digita un numero amyor de 100
            se lanzara un error con el mensaje de que debe introducir una edad valida*/
            if (aux > 100) {
                throw new IllegalArgumentException("Introduzca una edad valida");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        return aux;
    }

    public static String texto() {
        String aux = "";
        // Definir un scanner 

        Scanner entrada = new Scanner(System.in);

        try {
            //Leer el valor de la entrada y asignarla a aux
            aux = entrada.nextLine();

        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        return aux;
    }
}
