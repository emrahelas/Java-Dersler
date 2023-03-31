package ders21_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayiArrayListeCevirme {
    public static void main(String[] args) {

        Integer[] arr = {1,3,4,6,6,7,9,4,7,2,9,8,6,7,4,9};

        // arr array'inin elementlerini iceren bir arrayList olusturun

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }

        System.out.println("Sayılar listesi: "+sayilar);

        /*
            Java'da bir array'i arrayList'e çevirmek için kullanılan asList() vardır.
            Ancak kullanımı tavsiye edilmez, çünkü 2 tane büyük dezavantajı vardır.

           1- asList() kullanilarak array'den list'e cevrilen listelerde
              ekleme / silme gibi uzunlugu degistiren method'lar kullanilamaz
           2- Arka planda array ve array'den donusturdugumuz list beraber hareket eder
              birinde yaptigimiz update'ler otekine de islenir
         */

        List<Integer> arraydenList = Arrays.asList(arr);

        System.out.println("Array'den liste çevrilen: "+arraydenList);

        // iki list'e de 11 ekleyelim

        sayilar.add(11);
        //arraydenList.add(11); UnsupportedOperationException

        System.out.println("Sayılar listesi: "+sayilar);
        System.out.println("Array'den liste çevrilen: "+arraydenList);

        // iki list'in 0.index'indeki elementleri silelim

        sayilar.remove(0);
        //arraydenList.remove(0); UnsupportedOperationException

        System.out.println("Sayılar listesi: "+sayilar);
        System.out.println("Array'den liste çevrilen: "+arraydenList);

        // 2. dezavantaj

        System.out.println("Array           : "+Arrays.toString(arr));
        System.out.println("Array'den list  : "+arraydenList);

        // array'in bir elementine yeni deger atayalim

        arr[0] = 22;

        System.out.println("======== array'i degistirdikten sonra =========");
        System.out.println("Array           : "+Arrays.toString(arr));
        System.out.println("Array'den list  : "+arraydenList);

        // list'in bir elementini update edelim

        arraydenList.set(1,45);

        System.out.println("===== list'i degistirdikten sonra ====");
        System.out.println("Array           : "+Arrays.toString(arr));
        System.out.println("Array'den list  : "+arraydenList);







    }
}
