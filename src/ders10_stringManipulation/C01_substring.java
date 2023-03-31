package ders10_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        String str = "Hayaller ve gercekler";

        // substring iki farkli sekilde kullanilabilir
        // 1- tek parametre olursa, o index'den baslar sonuna kadar yazdirir

        System.out.println(str.substring(9)); // ve gercekler

        System.out.println(str.substring(str.length()-9)); // gercekler

        System.out.println(str.substring(str.length())); // hiclik
        // System.out.println(str.charAt(str.length())); str'in uzunlugu 19, son harfin index'i 18
        //                                               19. index'de karakter yok

        // 2- iki parametre girilirse baslangicIndex'inden(dahil baslar
        //  bitirIndex'ine(haric) kadar olan bolumu yazdirir.

        System.out.println(str.substring(9,11)); // ve
        System.out.println(str.substring(0, 8)); // Hayaller

        // str'in 5. index'deki karakterini yazdirin
        System.out.println(str.charAt(5)); // l
        System.out.println(str.substring(5,6)); // l




    }
}
