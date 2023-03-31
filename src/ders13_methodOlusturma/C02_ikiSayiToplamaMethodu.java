package ders13_methodOlusturma;

import java.util.Scanner;

public class C02_ikiSayiToplamaMethodu {
    public static void main(String[] args) {

        // kullanicidan 2 sayi alip
        // toplamlarini yazdiran bir method olusturun

        ikiSayiTopla();


    }

    public static void ikiSayiTopla(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Toplama üzere 2 sayı girin:");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("İki sayının toplamı :"+(sayi1+sayi2));
    }
}
