package ders03_scanner_dataCasting;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        // girilen bilgiler : J Doe, 44

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminizi, soyisminizi ve yasinizi girin"+
        "\nHer bilgiden sonra ENTER'a basin");

        char isimIlkHarf=scan.nextLine().charAt(0);

        /* Scanner method'unda nextChar() olmadigi icin once kullanicinin girisine gore next()
        veya nextLine() yazip sonra .charAt(0) yazariz. Parantez icindeki 0 almak istedigimiz
        char'in index'idir ve Java'da index 0'dan baslar.
        */

        String soyisim=scan.nextLine();
        double yas=scan.nextDouble();

        System.out.println("Girilen bilgler: "+isimIlkHarf+" "+soyisim+", "+yas);

    }



}

