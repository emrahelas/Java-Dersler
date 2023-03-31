package ders15_doWhileLoop_scope;

import java.util.Scanner;

public class C07_Static_Instance {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        scan.nextInt(); // nextInt static olmamasina ragmen 'scan' objesi ile birlikte kullanilinca
                        // static olan method'un icinde kullanilabilir.
    }
}
