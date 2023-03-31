package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        // 1. Adim: Scanner objesi olusturun
        Scanner scan = new Scanner(System.in);

        // 2. Adim: Kullaniciya ne istedinizi soyleyin
        System.out.println("Lutfen isminizi giriniz");

        // 3. Adim: Girilen bilgiyi icine koyabileceginiz bir variable olusturun
        //          olusturdugunuz scanner objesi ile uygun method'u kullanarak bilgiyi alin.

        String kullaniciIsmi = scan.next();

        System.out.println("Girilen isim: " + kullaniciIsmi);

    }
}
