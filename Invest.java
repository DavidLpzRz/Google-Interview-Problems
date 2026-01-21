package com.david.test.WInvesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        int[] prices = {1,3,6,9,11};
        int saveprice = 0;
        ArrayList<Integer> totalprice = new ArrayList<>(Arrays.asList(0));

//        for (int i = 0; i < prices.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (prices[i] > prices[j]) {
//                    saveprice = prices[i] - prices[j];
//                    totalprice.add(saveprice);
//                }
//            }
//        }
//        System.out.println("La subida maxima es de: " + Collections.max(totalprice));


        //MEJOR

        int numAc = 0;
        int line = 0;
        ArrayList<Integer> totalprice2 = new ArrayList<>(Arrays.asList(0));

        int i = 0;
        while (line < prices.length) {
            if (prices[line] > prices[i] && i < line) {
                saveprice = prices[line] - prices[i];
                totalprice2.add(saveprice);
            }
            i ++;
            if (i == prices.length) {
                i = 0;
                line ++;
            }
        }
//        System.out.println(totalprice2);
        System.out.println("La subida maxima es de: " + Collections.max(totalprice2));
    }
}
