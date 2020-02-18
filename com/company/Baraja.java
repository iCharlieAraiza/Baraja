package com.company;
import java.lang.reflect.Array;
import java.util.*;

public class Baraja {

    String cartas[];

    public Baraja(){
        crearBaraja();
    }


    private void crearBaraja(){
        String tipo, b;
        String cartas[] = new String[52];
        int k = 0;

        for(int i = 0; i < 4; i++){
            for (int j= 0; j< 13; j++){
                b = ((j+2) == 11 ) ? ("Jack ") : ((j+2) == 12 ) ? "Reina " : ((j+2) == 13 ) ? "Rey" : "As";
                tipo = (i==0) ? "Espadas" : i==1 ?  "Corazones" : i==2 ? "Rombos" : "Tréboles";
                cartas[k] = ((j+2 < 11) ? String.valueOf(j+2) : b)  + " de " + tipo ;
                k++;
            }
        }

        this.cartas = cartas;
    }


    public void getCartas(){
        for(int i = 0; i<52; i++){
            System.out.println(this.cartas[i]);
        }
    }

    public void mezclarCartas(){
        List <String> cartas = Arrays.asList(this.cartas);
        Collections.shuffle(cartas);
        cartas.toArray(this.cartas);
    }


}
