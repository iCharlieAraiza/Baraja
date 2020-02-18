package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean c = true;
        int n;

        Scanner in = new Scanner(System.in);
        Baraja Cartas = new Baraja();


        do{
            System.out.println("\nEscoge una opción:\n\n(1) Mostrar las cartas (2) Mezclar baraja (se imprimirá en pantalla el resultado) (3) Salir");
            n =  Integer.parseInt( in.nextLine() );

            switch (n){
                case 1:
                    Cartas.getCartas();
                    break;
                case 2:
                    Cartas.mezclarCartas();
                    System.out.println("\n");
                    Cartas.getCartas();
                    break;
                case 3:
                    c = false;
                    break;
                default:
                    System.out.println("Has elegido una opción no válida");
            }
        }while (c);

    }
}
