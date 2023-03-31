package ders02_dataTurleri_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C05_ScannerIlkGorev {

    public static void main(String[] args) {
        // Kullanicidan bir sayi alin ve sayinin karesini yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin");

        double girilenSayi=scan.nextDouble();

        System.out.println("Girilen sayinin karesi:"+ girilenSayi*girilenSayi);
    }
}
