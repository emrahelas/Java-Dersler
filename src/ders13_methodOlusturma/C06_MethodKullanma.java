package ders13_methodOlusturma;

import java.util.Scanner;

public class C06_MethodKullanma {
    public static void main(String[] args) {

        // Verilen bir String'in polindrome(duzden ve tersten ayni sekilde yazilan)
        // olup olmadigini yazdirin (madam, 12321, kabak, kayak, radar)

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin girin:");

        String metin = scan.next();

        String tersMetin = C05_StringiTerseCevirme.stringTersineCevir(metin);

        if (metin.equals(tersMetin)) {
            System.out.println("Girilen metin PALINDROME");
        } else {
            System.out.println("Girilen metin PALINDROME degil");
        }

    }
}
