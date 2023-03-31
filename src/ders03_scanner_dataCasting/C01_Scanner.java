package ders03_scanner_dataCasting;

import javax.swing.*;
import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {
        /* Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin;
            Isminiz: John
            Soyisminiz: Doe
            Yasiniz: 44
            Kaydiniz basariyla tamamlanmistir.
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminizi girin");

        String isim=scan.nextLine();

        System.out.println("Lutfen soyisminizi girin");

        String soyisim=scan.nextLine();

        System.out.println("Lutfen yasinizi girin");

        double yas=scan.nextDouble();

        System.out.println("Isminiz: "+isim);
        System.out.println("Soyisminiz: "+soyisim);
        System.out.println("Yasiniz: "+yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");

        String name = JOptionPane.showInputDialog("İsminizi girin");
        System.out.println("Yaşa "+name+"!");

        // System.out.println()'deki ln yazdirma bitince alt satira gecmeyi saglar.

        // Tek System.out.println() komutu ile alt satirlar yazdirabilmek icin her string ifade basina \n eklemek gerekir.




    }
}
