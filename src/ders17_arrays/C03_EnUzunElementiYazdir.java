package ders17_arrays;

public class C03_EnUzunElementiYazdir {
    public static void main(String[] args) {

        // Soru 6- Verilen String bir array'deki
        //          en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String[] arr = {"Ahmet", "Arife", "Mustafa", "Unsal", "Omer", "Meryem"};

        enUzunEnKisaYazdir(arr);

    }

    public static void enUzunEnKisaYazdir(String[] arr){

        String enUzunKelime = arr[0]; // uzunluk 0
        String enKisaKelime = arr[0]; // uzunluk 0

        for (int i = 0; i < arr.length; i++) {

            if(arr[i].length()>=enUzunKelime.length()){  // >= yapilirsa bir sonraki buyuk kelimeyi alir
                enUzunKelime=arr[i];

            }

            if(arr[i].length()<enKisaKelime.length()){
                enKisaKelime=arr[i];
            }

        }

        System.out.println("Array'deki en uzun kelime: "+enUzunKelime+"\nArray'deki en kisa kelime: "+enKisaKelime);


    }
}
