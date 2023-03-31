package ders27_stringBuilder;

public class C04_StringBuilderdeStringMethodlari {
    public static void main(String[] args) {

        /*
            StringBuilder Class'inda olmayip,
            String Class'inda olan method'lari kullanmak istersek
            sb.toString() kullanarak, StringBuilder'i önce String'e çevirir
            sonra istediğimiz String method'larini kullanırız

            bu konuda DİKKAT etmemiz gereken konu
            String döndüren method'lar
            veya String Class'indan kullanacağımız method'lar
            kalıcı değişiklik YAPMAZ
         */

        StringBuilder sb1 = new StringBuilder("Java Candir");
        StringBuilder sb2 = new StringBuilder("Java candir");

        sb1.substring(5);

        System.out.println(sb1);

        // sb1 = sb1.substring(5);

        System.out.println(sb1.compareTo(sb2)); // -32

        System.out.println(sb1.toString().equalsIgnoreCase(sb2.toString())); // true

        sb1.subSequence(3,6);

        System.out.println(sb1); // Java Candir
    }
}
