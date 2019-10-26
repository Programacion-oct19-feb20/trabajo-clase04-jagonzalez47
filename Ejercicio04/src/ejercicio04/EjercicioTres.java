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
public class EjercicioTres {
    /*
    Generar un programa que permita pedir datos por teclado para:
    INgreso de nombres completos de un estudiante
    ingreso de nota 1 (debe ser entero)
    ingreso de nota 2 (debe ser entero)
    ingreso del ciclo que cursa el alumno (debe ser cadena)
    
    Luego presentar en pantalla los datos de la siguiente forma:
    Informe del Alumno
    Nombres completos:
    Ciclo:
    Nota 1:
    Nota 2:
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombres;
        int nota1;
        int nota2;
        String ciclo;
        System.out.println("Nombres Completos");
        nombres = entrada.nextLine();
        System.out.print("Ciclo");
        ciclo = entrada.nextLine();
        System.out.println("Nota1");
        nota1 = entrada.nextInt();
        System.out.println("Nota2");
        nota2 = entrada.nextInt();
        System.out.printf("Informe alumno:\nNombres: %s\nCiclo:" " %s\nNota1: %d\nNota2: %s\n", nombres, ciclo, nota1, nota2);
                
        
        
    }
}
