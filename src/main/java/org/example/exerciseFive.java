package org.example;

import java.util.Scanner;

public class exerciseFive {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        int num1,num2;
        System.out.println("Vamos a realizar una multiplicación");
        System.out.print("Ingresa el primer numero: ");
        num1= entrada.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        num2= entrada.nextInt();

        int a = num1*num2;


        System.out.println("Tu resultado es: "+a);

    }
}
