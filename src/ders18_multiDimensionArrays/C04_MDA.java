package ders18_multiDimensionArrays;

public class C04_MDA {
    public static void main(String[] args) {

        String[][] siniflar = {{"A","B","G","M"},{"F","P","A","V"},{"K","D","Q"}};

        // G'yi yazdirin

        System.out.println(siniflar[0][2]); // G

        // Q'yu Y yapin
        siniflar[2][2]="Y";
        System.out.println(siniflar[2][2]);

        // ilk sinifin mevcudunu yazdirin

        System.out.println(siniflar[0].length); // 4

        // siniflarda toplam kac kisi oldugunu yazdirin

        int toplamOgrSayisi=0;

        for (int i = 0; i < siniflar.length ; i++) {

            toplamOgrSayisi += siniflar[i].length;


        }

        System.out.println("Toplam ogrenci sayisi : "+toplamOgrSayisi);
    }
}
