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
public class EjercicioTres {
   public static void main(String[] args){
Scanner entrada = new Scanner(System.in);
String nombres;
int nota1;
int nota2;
String ciclo;
System.out.println("Nombres Completos");
nombres = entrada.nextLine();
System.out.println("Nota1");
nota1 = entrada.nextInt();
System.out.println("Nota2");
nota2 = entrada.nextInt();
entrada.nextLine();
System.out.println("Ciclo");
ciclo = entrada.nextLine();

System.out.printf("Informe alumno:\nNombres: %s\nCiclo: %s\nNota1: %d\nNota2: %s\n", nombres, ciclo, nota1, nota2);


   
    
}
}