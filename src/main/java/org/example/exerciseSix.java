package org.example;

import java.util.Scanner;

public class exerciseSix {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        int num1,num2;
        System.out.println("Vamos a realizar todas las operaciones matematicas");
        System.out.print("Ingresa el primer numero: ");
        num1= entrada.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        num2= entrada.nextInt();

        int a = num1+num2;
        int b = num1-num2;
        int c = num1*num2;
        int d = num1/num2;
        int e = num1 % num2;


        System.out.print("Tu resultado es: "+a+ "\n " +b+ "\n " +c+ "\n " +d+ "\n " +e);

    }
}
