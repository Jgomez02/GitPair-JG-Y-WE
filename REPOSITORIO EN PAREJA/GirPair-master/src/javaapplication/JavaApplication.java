/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * El programador A rellenará el main para hacer un programa que pregunte 
 * la edad y el nombre a una persona por teclado y calcule su tiempo de vida en
 *  dias, horas , minutos y segundos con la frase:
 * 
 * Felicidades [nombre] has vivido:
 * x dias
 * xx horas
 * xxxx minutos
 * xxxxxxxxx segundos
 * 
 * @author Pon tu nombre programador A
 */
public class JavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Inicializamos las variables necesarias*/
        String nombre= "";
        int edad =0;
        int dias = 0;
        int horas =0;
        int minutos =0;
        int segundos =0;
        
        
        
        /* Preguntamos el nombre del usuario*/
        System.out.println("Introduzca su Nombre");
        //nombre = 
       
        /* Preguntamos la edad en años usuario*/
          System.out.println("Cuantos años tienes");
        edad= Entrada.entero();
        
        /*Aqui calculamos los dias*/
        dias= edad*365;
        
        /*Aqui calculamos las horas*/
        horas=dias*24;
        
        /*Aqui calculamos los minutos*/
        minutos= horas*60;
        
        /*Aqui calculamos los segundos*/
        segundos= minutos*60;
        
        /*Salida por pantalla*/
        System.out.println("Felicidades" + nombre + "haz vidido" );
    }

}
