package ders21_arrayList_forEachLoop;

public class C04_KarelerinToplami {
    public static void main(String[] args) {
        /*
            Soru 2- Verilen int array'deki her elementin karelerini alıp,
            karelerinin toplamını yazdıran bir method oluşturun.
         */

        int[] arr = {2, 3, 5};

        karelerToplaminiYazdir(arr);
    }

    public static void karelerToplaminiYazdir(int[] arr) {

        int karelerToplami = 0;

        for (int each : arr
        ) {
            karelerToplami += each * each;
        }

        System.out.println("Verilen array'deki elementlerin kareleri toplamı: " + karelerToplami);
    }
}
