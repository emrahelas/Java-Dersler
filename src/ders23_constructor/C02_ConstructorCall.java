package ders23_constructor;

public class C02_ConstructorCall {

    /*
        Java'da ihtiyac olursa bir constructor icinden baska constructor cagirilabilir
        this(ilgili parametreler) yazarak istedigimiz constructor'i cagirabiliriz
        Constructor call icin 2 kural vardir
        1- constructor call icinde bulundugu constructor'in ilk satirinda olmalidir
        2-
     */

    int sayi;
    String str;

    public C02_ConstructorCall() {
        System.out.println("Parametresiz cons çalıştı");
    }

    public C02_ConstructorCall(int sayi) {
        System.out.println("int Parametreli cons çalıştı");
        this.sayi = sayi;
    }

    public C02_ConstructorCall(String str) {
        this(5);
        System.out.println("String Parametreli cons çalıştı");
        this.str = str;
    }

    public C02_ConstructorCall(int sayi, String str) {
        // C02_ConstructorCall(); böyle yazıldığında method call olarak algılar
        this(); // Java syntax olarak constructor call için bunu belirlemiştir

        this.sayi = sayi;
        this.str = "Java";
        System.out.println("2 parametreli cons çalıştı");
    }

    public static void main(String[] args) {

        C02_ConstructorCall obj3 = new C02_ConstructorCall(7,"Selcuk");
        System.out.println(obj3.sayi);
        System.out.println(obj3.str);


        /*C02_ConstructorCall obj2 = new C02_ConstructorCall("Java");
        System.out.println(obj2.sayi);
        System.out.println(obj2.str);

        C02_ConstructorCall obj1 = new C02_ConstructorCall();

         */
    }
}
