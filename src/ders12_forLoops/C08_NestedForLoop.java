package ders12_forLoops;

public class C08_NestedForLoop {
    public static void main(String[] args) {
        // dinamik olarak verilen satir ve sutun sayisina gore
        // yildizlardan bir dikdortgen olusturun

        /*
           * * * * *
           * * * * *
           * * * * *
         */

        int satirSayisi=6;
        int sutunSayisi=18;

        for (int m = 1; m <=satirSayisi ; m++) { // satir sayisini
            for (int i = 1; i <=sutunSayisi ; i++) { // sutun sayisini
                System.out.print("* ");
            }

            System.out.println(""); // bir satirdaki tum sutunlar bitince alt satira geciyor

        }


    }
}
