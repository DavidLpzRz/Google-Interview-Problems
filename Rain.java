package com.david.test.Water;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class main {

    //Almacenar agua, si el lado no hay que no coja, en cuanto hay que empiece a cojer hasta el proximo hueco, verificar si despues de ese hay algo

    public static void main(String[] args) {
        ArrayList<Integer> bloques = new ArrayList<>(Arrays.asList(1,0,2,1,0,1,3,2,1,2,1));
        int agua = 0;
        int max = 0;
        ArrayList<ArrayList<Boolean>> count = new ArrayList<>();

        for (int i = 0; i < bloques.size(); i++) {
            if (bloques.get(i) > max) {
                max = bloques.get(i);
            }
        }

        for (int i = 0; i < max; i++) {
            ArrayList<Boolean> fila = new ArrayList<>();
            count.add(fila);
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < bloques.size(); j++) {
                if (bloques.get(j) > i) {
                    count.get(i).add(true);
                } else {
                    count.get(i).add(false);
                }
            }
        }

        System.out.println(count);

        ArrayList<Boolean> fila = new ArrayList<>();

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < count.get(i).size(); j++) {
                if (count.get(i).get(j) && Collections.frequency(count.get(i), false) >= 2) {
                    fila.add(count.get(i).get(j));

                } else if (count.get(i).indexOf(true) < j && j < count.get(i).lastIndexOf(true)) {
                    fila.add(count.get(i).get(j));
                }
            }
            System.out.println(fila);
            agua += Collections.frequency(fila,false);
            fila.clear();
        }

        System.out.println("Entran: " + agua + " de agua.");
    }
}
