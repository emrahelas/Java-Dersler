package ders27_stringBuilder;

public class C02_MetniTerseCevirme {
    public static void main(String[] args) {

        // Verilen bir metni tersine çevirin

        String str= "Ey Edip Adana'da pide ye!";

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        System.out.println(sb);
    }
}
