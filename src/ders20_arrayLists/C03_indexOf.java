package ders20_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Kubra");
        isimler.add("Mustafa");
        isimler.add("Emre");
        isimler.add("Ferhat");
        isimler.add("Mustafa");
        isimler.add("Erdal");
        isimler.add("Emre");

        System.out.println(isimler);

        // 2. index'deki elementi yazdirin

        System.out.println(isimler.get(2)); // Emre

        // Ferhat'in index'ini yazdirin

        System.out.println(isimler.indexOf("Ferhat")); // 3

        System.out.println(isimler.lastIndexOf("Ferhat")); // 3

        System.out.println(isimler.indexOf("Hilal")); // -1

        System.out.println(isimler.lastIndexOf("Emre")); // 6

        System.out.println(isimler.lastIndexOf("Mustafa")); // 4
    }
}
