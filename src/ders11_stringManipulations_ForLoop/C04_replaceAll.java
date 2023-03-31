package ders11_stringManipulations_ForLoop;

public class C04_replaceAll {
    public static void main(String[] args) {

        String str = "J1a23va34 5C54and65ir87";

        // str'daki sayilari method'la temizleyin

        /*
          Eger degistirmek istedigimiz metin tek bir metin degil,
          ortak ozelligi olan farkli metinlerse

          - tum sayilar
          - sayi olmayanlarin tumu
          - tum space'ler
          - space olmayan tum karakterler

          bu ortak ozellikelri belirtmek icin Java regex tanimlanmistir
         */

        str = str.replaceAll("\\d","");
        System.out.println("String son hali :" +str);

    }
}
