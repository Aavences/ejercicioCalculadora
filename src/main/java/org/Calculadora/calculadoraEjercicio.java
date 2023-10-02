package org.Calculadora;

import java.util.Scanner;

public class calculadoraEjercicio {
    public static void main(String[] args){

        int numero1;
        int numero2;
        int resultado;
        int menu;
        int opc;


        do {
            Scanner cal = new Scanner(System.in);
            System.out.println("Coloca el primer numero:");
            numero1 = cal.nextInt();
            System.out.println("Coloca el segundo numero:");
            numero2 = cal.nextInt();
            System.out.println("Eligue una opcion del menu 1.-Sumar 2.-Restar 3.-Dividir 4.-Multiplicar");
            menu = cal.nextInt();

            switch (menu){
                case 1:
                    resultado = numero1+numero2;
                    System.out.println("El resultado de la operacion de "+numero1+" + "+numero2+" = "+resultado);
                    break;
                case 2:
                    resultado = numero1-numero2;
                    System.out.println("El resultado de la operacion de "+numero1+" + "+numero2+" = "+resultado);
                    break;
                case 3:
                    resultado = numero1/numero2;
                    System.out.println("El resultado de la operacion de "+numero1+" + "+numero2+" = "+resultado);
                    break;
                case 4:
                    resultado = numero1*numero2;
                    System.out.println("El resultado de la operacion de "+numero1+" + "+numero2+" = "+resultado);
                    break;
            }

            System.out.println("Deseas realizar otra operacion 1.-Si / 2.-No");
            opc = cal.nextInt();
        }while (opc != 0);

    }
}
