package ders18_multiDimensionArrays;

import java.util.Arrays;

public class C02_StringSplitMetodu {
    public static void main(String[] args) {

        // Bir String'i istedigimiz parcalara ayirmak icin kullanilir

        String str= "Java candir can, bundan suphesi olan var mi?";

        // str kac kelimedir?

        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); // [Java, candir, can.]

        System.out.println("Kelime sayisi : "+kelimeler.length ); // Kelime sayisi : 3

        // en uzun kelime kac harflidir?
        int enUzunKelimeLength=kelimeler[0].length();

        for (int i = 0; i < kelimeler.length; i++) {

            if (kelimeler[i].length()>enUzunKelimeLength){
                enUzunKelimeLength=kelimeler[i].length();
            }

        }

        System.out.println("En uzun kelimenin karakter sayisi : "+enUzunKelimeLength);

        // bir String'i karakterlerine ayirmak istersek

        String[] karakterler = str.split("");
        System.out.println(Arrays.toString(karakterler));
        System.out.println("Cumledeki karakter sayisi : "+karakterler.length);


    }
}
