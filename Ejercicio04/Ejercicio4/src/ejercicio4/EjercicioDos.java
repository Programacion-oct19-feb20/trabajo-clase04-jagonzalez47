/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioDos {
public static void main(String[] args){
Scanner entrada = new Scanner(System.in);
String nombres;
String  ciudadDeNacimiento;
int edad;
double matricula;
System.out.println("Ingrese sus nombres");
nombres = entrada.nextLine();
System.out.print("Ingrese su ciudad de nacimiento");
ciudadDeNacimiento = entrada.nextLine();
System.out.print("Ingrese su edad");
edad = entrada.nextInt(); //Ingreso de entero
System.out.println("Ingrese su valo de matricula");
matricula = entrada.nextDouble(); //Ingreso de decimales

System.out.printf("Datos Personales:\nNombres: %s\nCiudad de Nacimiento:"
        + "%s\nEdad: %d\nMatricula: %.2f\n", nombres, ciudadDeNacimiento, edad, matricula);


    
    
}   
}
