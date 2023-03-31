package ders14_methodOverloading_whileLoop;

public class C04_MethodOverloading {
    public static void main(String[] args) {
        /*
            Java overloading kurallari
            1- isim ve parametreleri ayni olan birden fazla method olusturulamaz
            2- data turleri farkli olan parametlerin yerlerini degistirirsek
                java yeni bir method olarak kabul eder. (int, double) (double, int)

             Overloading olan class'larda
             Java hangi method'un calistirilacagina su sekilde karar verir

             1- cagrilan isimde method var mi?
             2- method call'da kullanilan arguments(parantez icinde yazan) ile method'lardaki
                parametlerin %100 uyumlu oldugu var mi?
             3- argument ile parametre ayni olmasa bile
                verilen argumentleri kabul edecek parametre var mi?
             4- Casting ile birden fazla method'u kullanabiliyorsa
                daha az casting ile calisacak method'u kullanir
         */

        topla(45,33);
        topla(32,55);
        topla(33.33,22.11);

        // topla("ali","veli"); CTE bu argument'leri kabul edebilecek parametre yok

        topla('a','b'); // iki int 195

        topla(3f, 4f); // iki double 7.0

        topla(3f, 4); // double ve tamsayi 7.0

    }

    public static void topla(int a, int b){
        System.out.println("iki tamsayinin toplami: "+(a+b));
    }

    public static void topla(double a, double b){
        System.out.println("iki double sayinin toplami: "+(a+b));
    }

    public static void topla(int sayi1, double sayi2){
        System.out.println("Tam sayi ve double sayinin toplami: "+(sayi1+sayi2));
    }

    public static void topla(double sayi1, int sayi2){
        System.out.println("Double ve tam sayinin toplami: "+(sayi1+sayi2));
    }



}
