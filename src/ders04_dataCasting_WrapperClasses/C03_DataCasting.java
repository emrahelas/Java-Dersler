package ders04_dataCasting_WrapperClasses;

public class C03_DataCasting {

    public static void main(String[] args) {

     int a = 45;
     int b = 13;
        System.out.println(a/b); // 45/13=3

        // Java bolunen 2 sayı tamsayi ise sonucun da tamsayi kismini verir.

        double c=6;
        System.out.println(a/c); // 45/6=7,5
        // int / double -> double

        // bolunen sayilarin data turleri farkli ise sonucu daha genis olanin cinsinden verir.

        float d= 6f;
        System.out.println(a/d); // 45/6=7,5

        // a/b isleminin sonucunu ondalikli olarak nasil yazdirabiliriz?

        System.out.println((double) (a/b));

        /* Islem onceligi (a/b)'dedir.
        Java oncelikle (a/b) islemini yapar ve sonucunu 3 bulur.
        Sonra (double) oldugundan 3'u double'a cast eder ve 3.0 bulur.
        */

        // Bolme isleminin sonucunun double olmasi icin isleme girenlerden birisi double olmalidir.

        System.out.println((double)a/b); // 3.4615384615384617
        System.out.println(a/(double)b); // 3.4615384615384617


        int e=1467;
        System.out.println(e=e/10); // 146
        System.out.println(e); // 146
        e=e/10;
        System.out.println(e); // 14
        e=e/10;
        System.out.println(e); // 1
        e=e/10;
        System.out.println(e); // 0

    }

}
