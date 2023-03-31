package ders21_arrayList_forEachLoop;

import java.util.Arrays;

public class C05_istenenHarfAdediniBulma {
    public static void main(String[] args) {
        /*
            Soru4- Kullanıcıdan bir cümle ve bir harf alın,
                    harf cümlede kullanılmışsa kaç kere kullanıldığını yazdırın,
                    kullanılmadıysa "harf cümlede kullanılmamış" yazdırın.
         */

        String cumle = "Yatin kalkin Java calisin";
        String istenenHarf= "a";

        String[] karakterler= cumle.split("");

        System.out.println(Arrays.toString(karakterler));
        // [Y, a, t, i, n,  , k, a, l, k, i, n,  , J, a, v, a,  , c, a, l, i, s, i, n]


        int sayac=0;

        for (String each : karakterler
        ) {

            if (each.equalsIgnoreCase(istenenHarf)){
                sayac++;
            }
        }


        if (sayac==0){
            System.out.println("Istenen harf cumlede kullanilmamis");
        }else {
            System.out.println("istenen harf cumlede " + sayac + " adet kullanilmis");
        }


    }
}
