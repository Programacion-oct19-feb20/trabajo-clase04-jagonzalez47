/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class EjercicoDos {
    /*
    Generar un programa que permita pedir datos por teclado para:
    ingreso de nombres
    ingreso de ciudad de nacimineto
    ingreso de edad
    ingreso de costo de matricula
    
    Luego presentar en pantalla los datos de la siguiente forma;
    Datos Personales:
    Nombres:
    Ciudad de Nacimiento:
    Edad:
    Matricula:
    */
public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    String nombres;
    String CiudadDeNacimiento;
    int edad;
    double matricula;
    
    System.out.println("Ingrese sus nombres");
    nombres = entrada.nextLine();
    System.out.println("Ingresa su ciudad de nacimiento");
    CiudadDeNacimiento = entrada.nextLine();
    System.out.println("Ingrese su edad");
    edad = entrada.nextInt(); //ingreso entero
    System.out.println("Ingrese su valor de matricula");
    matricula = entrada.nextDouble(); // ingreso de decimales
    
    System.out.printf("Datos Personales:\nNombres: %s\nCiudad de Nacimiento:" " %s\nEdad: %d\nMatricula: %f.2\n", nombres, CiudadDeNacimiento, edad, matricula);
    
    
}
}
