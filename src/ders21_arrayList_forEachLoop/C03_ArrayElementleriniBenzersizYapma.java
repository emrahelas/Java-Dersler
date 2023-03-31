package ders21_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArrayElementleriniBenzersizYapma {
    public static void main(String[] args) {
        /*
            Soru1- Verilen bir array'de tekrar eden elementler için,
            mükerrer olanları silip, tüm elemanlardan sadece 1 tane yapıp
            eski array'e yeni halini atayıp yazdırın
         */

        int[] arr = {1, 3, 4, 6, 6, 7, 9, 4, 7, 2, 9, 8, 6, 7, 4, 9};

        List<Integer> benzersizElementListesi = new ArrayList<>();

        // array'deki her bir elementi kontrol edelim,
        // list'te yoksa ekleyelim, varsa eklemeyelim

        for (int each:arr
             ) {
            if (!benzersizElementListesi.contains(each)){
                benzersizElementListesi.add(each);
            }
        }
        System.out.println(benzersizElementListesi);

        arr = new int[benzersizElementListesi.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = benzersizElementListesi.get(i);
        }
        System.out.println(Arrays.toString(arr));


    }

}
