package ders02_dataTurleri_scanner;

public class C02_DataTurleri {

    public static void main(String[] args) {

        boolean EvetHayir=true; // Sadece 2 deger barindirir; true/false. Hafizada 1 bit yer kaplar.
        char tekKarakter= 'e'; // Tek tirnak icinde tek karakter. Hafizada 16 bit yer kaplar.

        //Tam sayi barindiran data turleri:
        byte sayi1;  // Hafizada 8 bit yer kaplar.
        short sayi2; // Hafizada 16 bit yer kaplar.
        int sayi3; // Hafizada 32 bit yer kaplar.
        long sayi4; // Hafizada 64 bit yer kaplar.

        //Ondalikli sayi barindiran data turleri:
        float sayi5; // Sayi tamamladigimizda double'dan farkli oldugunu belirtmek için f veya F yazmak zorundayiz. Hafizada 32 bit yer kaplar.
        double sayi6; // Virgulden sonra 16 hane yazdirir, ama cok kucuk sayilara indigi icin ondalikli kismin sonunda hatalar olabilir. Hafizada 64 bit yer kaplar.


        // Biz dersler boyunca hafiza onemli olmadigi icin tam sayilar icin int, ondalikli sayilar icin double kullaniriz.

    }
}
