package ders03_scanner_dataCasting;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        // Kullanicidan bir cemberin yaricapini alip cevresini ve alanini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen cemberin yaricapini girin");

        // Kullanicinin girdigi bilgiyi kaydedebilecek data turunce bir variable olusturun
        // Kullanicidan bilgiyi almak icin scan objesini ve ilgili next method'unu kullanin

        double ycap = scan.nextDouble();

        System.out.println("Cemberin cevresi: " + 2 *3.14 * ycap);
        System.out.println("Cemberin alani: " + 3.14 * ycap * ycap);


    }
}
