package ders10_stringManipulation;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C04_endsWith {
    public static void main(String[] args) {
        // SORU: Kullanicidan bir email adresi girmesini isteyin
        // - email @ icermiyorsa "gecersiz email"
        // - email @gmail.com icermiyorsa, "email gmail olmali"
        // - email @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir email adresi girin");

        String mail = scan.nextLine();

        if (!mail.contains("@")) {
            System.out.println("gecersiz mail");
        }else if (!mail.contains("@gmail.com")) {
            System.out.println("email gmail olmali");
        }else if (!mail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");

        }
    }
}
