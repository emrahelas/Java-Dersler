package ders16_scope_arrays;

import java.util.Arrays;

public class C03_ArrayElementleriniYazdirma {

    public static void main(String[] args) {

        int[] arr= {2,5,6,7,8};

        // Tum array'i yazdirin

        System.out.println(Arrays.toString(arr)); // [2, 5, 6, 7, 8]

        // Array'in tum elementlerini yanyana aralarinda bir bosluk olacak sekilde yazdirin

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+" "); // 2 5 6 7 8

        }

    }

}
