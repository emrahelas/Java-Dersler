package ders12_forLoops;

public class C07_NestedForLoop {
    public static void main(String[] args) {
        // verilen bir rakam icin carpim tablosu olusturun

        int sayi = 5;

        int k=1;
        for (int i = 1; i <= sayi; i++) {
            System.out.print(k*i + " ");
        }
        System.out.println("");
        k++;
        for (int i = 1; i <= sayi; i++) {
            System.out.print(k*i + " ");
        }
        System.out.println("");
        k++;
        for (int i = 1; i <= sayi; i++) {
            System.out.print(k*i + " ");
        }
        System.out.println("");
        k++;
        for (int i = 1; i <= sayi; i++) {
            System.out.print(k*i + " ");
        }


        System.out.println();
        System.out.println("===================");

        for (int m = 1; m <=sayi ; m++) {
            for (int i = 1; i <=sayi ; i++) {
                System.out.print(m*i+" ");

            }
            System.out.println("");

        }

        System.out.println("------------------------");

        for (int h = 1; h <=sayi ; h++) {
            for (int t = 1; t <sayi; t++) {
                System.out.print(h*t+" ");
            }
            System.out.println("");
        }

    }
}
