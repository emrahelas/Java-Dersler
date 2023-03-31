package ders03_scanner_dataCasting;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // Kullanicidan iki sayi alip ikisinin degerlerini degistirin (swap)

        Scanner scan = new Scanner(System.in);

        System.out.println("Sayi 1'i girin(Tamsayi)");
        int sayi1 = scan.nextInt();
        System.out.println("Sayi 2'yi girin(Tamsayi)");
        int sayi2 = scan.nextInt();

        int temp=0;
        temp=sayi2;
        sayi2=sayi1;
        sayi1=temp;

        System.out.println("Sayi1'in yeni degeri: "+sayi1);
        System.out.println("Sayi2'in yeni degeri: "+sayi2);




    }
}
