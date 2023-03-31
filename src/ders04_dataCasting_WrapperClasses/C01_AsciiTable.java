package ders04_dataCasting_WrapperClasses;

public class C01_AsciiTable {

    public static void main(String[] args) {

        /*
        a -> 97(ASCII) -> 10100010(Decimal)
        */

        // Char data turundeki variable ve degerler sayisal data turlerine atanirsa veya
        // sayisal data turundeki datalarla isleme sokulursa ASCII table'daki degerleri ile isleme girer.

        System.out.println(5+'a'); // 5 + 97(ASCII) = 102

        char ilkHarf = 101;
        System.out.println(ilkHarf); // e

        char girilenChar = 'c';
        System.out.println(girilenChar+1); // 102(ASCII) + 1 = 103
        // Sonucu char ifadesi olarak yazdirmak istersek explicit casting yapariz.

        System.out.println("Girilen harfin bir sonrasi: "+(char)(girilenChar+1)); // d

        // Verilen bir harften 2 onceki harfi yazdirin.
        girilenChar='E';
        System.out.println("Girilen harfin 2 oncesi: "+(char)(girilenChar-2)); // C


    }
}
