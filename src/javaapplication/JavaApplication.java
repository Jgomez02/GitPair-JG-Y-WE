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
        String nombre="";
        int edad=0,dias=0,horas=0,minutos=0,segundos=0;        
        
        /* Preguntamos el nombre del usuario*/
        //System.out.println("Introduce tu nombre");
        //nombre=Entrada.texto();
       
        /* Preguntamos la edad en años usuario*/
        //System.out.println("Introduce tu edad");
        //edad=Entrada.entero();
        
        /*Aqui calculamos los dias*/
        //dias=edad*365;
        
        /*Aqui calculamos las horas*/
        //horas=dias*24;
        
        /*Aqui calculamos los minutos*/
        //minutos=horas*60;
        
        /*Aqui calculamos los segundos*/
        //segundos=minutos*60;
        
        /*Salida por pantalla*/
        System.out.println("Felicidades "+nombre+", has vivido:");
        System.out.println(dias+ " dias");
        System.out.println(horas+ " horas");
        System.out.println(minutos+ " minutos");
        System.out.println(segundos+ " segundos");
    }

}
