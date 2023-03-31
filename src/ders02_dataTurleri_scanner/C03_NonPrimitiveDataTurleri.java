package ders02_dataTurleri_scanner;

public class C03_NonPrimitiveDataTurleri {

    public static void main(String[] args) {

        String isim="Emrah";

        String harf="E";
        char harf2='c';

        // Tek bir karakter atayacaksak ikisini de kullanabiliriz.

        System.out.println(harf.toLowerCase()); // e
        System.out.println(harf2);


        // Primitive data turundeki variable'lar sadece DEGER tasiyabilir.
        // Non-Primitive data turundeki variable'larin hem DEGER hem de METHOD'lari olur.

        // Variable isimleri buyuk-kucuk harf duyarlidir. Isimlerde harf, rakam, _ ve $ kullanilabilir.
        // Isimler harf ile baslamalidir. Isimlerde keyword(int, short, for, class, vb.) kullanilamaz.
        // Kucuk harf ile baslar, birden fazla kelime iceriyorsa sonraki her kelimenin ilk harfi buyuk olur. (camelCase)

        // Primitive data turundeki variable ve deger Stack Memory'de store edilir.
        // Non-primitive data turundeki variable'in referansi Stack Memory'de, variable degeri Heap Memory'de store edilir.






    }
}
