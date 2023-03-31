package ders07_genelTekrar_ifElseStatements;

import java.util.Scanner;

public class C04_IfElseIf {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alin;
        // sayi 3 ile bolunebiliyorsa "3'un kati",
        // sayi 5 ile bolunebiliyorsa "5'in kati",
        // sayi hem 3 hem 5 ile bolunebiliyorsa "3 ve 5'in kati" yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tam sayi girin");

        int sayi = scan.nextInt();

        if (sayi % 3 == 0 && sayi % 5 == 0) {
            System.out.println("sayi 3 ve 5'in kati");

        } else if (sayi % 5 == 0) {
            System.out.println("sayi 5'in kati");

        } else if (sayi % 3 == 0) {
            System.out.println("sayi 3'un kati");
        }

        /*
          Bazen sartlar olasi tum durumlari karsilamaz,
          bu durumda if else if ... cumleleri else ILE BITMEZ.

          else ile bitmeyen if else if ... cumlelerinde
          bazi durumlarda hicbir if body'si devreye girmeyebilir.
         */
    }
}
