package ders21_arrayList_forEachLoop;

public class C02_ForEachLoop {

    public static void main(String[] args) {

        /*
            Bizden istenen görevde sıralama önemsiz ise
            asıl amaçlanan tüm elementleri elden geçirmek ise
            for loop yerine for each loop tercih edilir.

            for each loop'da;
                - index yok,
                - başlangıç değeri yok,
                - bitiş değeri yok.
         */

        int[] arr = {1, 3, 4, 6, 6, 7, 9, 4, 7, 2, 9, 8, 6, 7, 4, 9};

        // arr'in tum elementlerinin toplamını yazdırın

        int toplam = 0;
        for (int each : arr
        ) {
            toplam += each;

        }

        System.out.println("Elementler toplamı: "+toplam);

        // arr'in elementlerinden 3 ile bölünebilenleri yazdırın

        for (int each: arr
             ) {
            if (each %3 ==0) System.out.print(each +" ");
        }

        System.out.println("");



        // arr'in elementleri içinde kaç tane tek sayı olduğunu bulun

        int sayac = 0;

        for (int each: arr
             ) {
            if (each%2!=0) sayac++;
        }

        System.out.println("Array'deki tek sayı adedi :"+sayac);

    }
}
