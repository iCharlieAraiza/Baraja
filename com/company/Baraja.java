package com.company;
import java.util.*;

public class Baraja {

    ArrayList <String> cartas;

    public Baraja(){
        String tipo, b;
        cartas = new ArrayList<String>();

        for(int i = 0; i < 4; i++){
            for (int j= 0; j< 13; j++){
                b = ((j+2) == 11 ) ? ("Jack ") : ((j+2) == 12 ) ? "👸" : ((j+2) == 13 ) ? "🤴" : "A";
                tipo = (i==0) ? "♠️" : i==1 ?  "♥️️" : i==2 ? "♦️" : "♣️";
                cartas.add( ((j+2 < 11) ? String.valueOf(j+2) : b)  + " de " + tipo );
            }
        }
    }

    public void getCartas(){
        for(int i = 0; i<52; i++){
            System.out.println(cartas.get(i));
        }
    }

    public void mezclarCartas(){
        Collections.shuffle(cartas);
    }


}
