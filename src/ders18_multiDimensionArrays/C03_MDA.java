package ders18_multiDimensionArrays;

import java.util.Arrays;

public class C03_MDA {
    public static void main(String[] args) {

       int[][] arr = {{3,4,5},{2,3},{1}};

        // int[][] iki katli array belirtir
        // ilk [] ana array'i (outerArray) kontrol eder
        // ikinci[] ise icerdeki array'leri (innerArray) kontrol eder

        System.out.println(arr[1][1]); // 3

        System.out.println(arr[0][2]); // 5

        System.out.println(arr[2].length); // 1

        System.out.println(arr[1]); // [I@568db2f2

        System.out.println(Arrays.toString(arr[1])); // [2, 3]

        System.out.println(Arrays.toString(arr)); // [[I@378bf509, [I@568db2f2, [I@5fd0d5ae]

        System.out.println(Arrays.deepToString(arr)); // [[3, 4, 5], [2, 3], [1]]

        System.out.println(arr.length); // 3



    }
}
