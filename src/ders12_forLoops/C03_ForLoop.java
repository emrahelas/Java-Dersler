package ders12_forLoops;

import java.util.Scanner;

public class C03_ForLoop {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan baslangic ve bitis degeris olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucuk olsa da program calissin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Baslangic degerini girin :");
        int bas = scan.nextInt();

        System.out.println("Bitis degerini girin :");
        int bit = scan.nextInt();

        int sayilarToplami = 0;

        if (bas<=bit){

            for (int i = bas; i <=bit ; i++) {
                sayilarToplami +=i;
            }

        } else { // baslangic degeri bitis degerinden buyuk

            for (int i = bas; i >=bit ; i--) {
                sayilarToplami +=i;

            }


        }

        System.out.println("Sayilar toplami :"+sayilarToplami);

    }

}
