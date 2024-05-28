package org.example;

import java.util.Scanner;

public class exerciseSeven {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        int num1;
        System.out.println("Vamos a realizar la tabla de multiplicar multiplicación");
        System.out.print("Ingresa el primer numero: ");
        num1= entrada.nextInt();


        for (int i = 1; i < 10; i++) {
            int resul = num1 * i;

            System.out.println(i+".  "+resul);
        }




    }
}
