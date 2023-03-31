package ders17_arrays;

import javax.swing.*;

public class C02_ArraydeIstenenElemaniBulma {

    public static void main(String[] args) {

        // Soru 4- Verilen bir array'de istenen bir elemanin var olup olmadigini
        //          ve varsa kac kere kullanildigini yazdiran bir method olusturun


        int[] arr1 = {2, 4, 5, 6, 6, 8, 6, 9, 6};

        elemanSayisiYazdir(arr1, 6); // 4
        elemanSayisiYazdir(arr1, 8); // 1

        String[] arr2 = {"E", "C", "D", "F", "F", "D" };
        elemanSayisiYazdir(arr2, "E"); // 1
        elemanSayisiYazdir(arr2, "D"); // 2


    }

    public static void elemanSayisiYazdir(int[] arr, int arananSayi) {

        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == arananSayi) {
                sayac++;
            }

        }

        System.out.println(sayac);


    }

    public static void elemanSayisiYazdir(String[] arr, String arananElement) {

        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals(arananElement)) {
                sayac++;
            }

        }

        System.out.println(sayac);
    }
}
