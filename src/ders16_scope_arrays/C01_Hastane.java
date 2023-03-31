package ders16_scope_arrays;

public class C01_Hastane {
    public static void main(String[] args) {

        Adoktor dok1= new Adoktor();
        System.out.println(dok1.askerlikYaptiMi); // false
        dok1.isim="Kemal";
        dok1.soyisim="Yilmaz";
        dok1.dogumYili=1980;

        System.out.println(dok1.isim);

        Adoktor dok2= new Adoktor();
        System.out.println(dok2.isim); // null
        dok2.soyisim="Celik";
        System.out.println(dok2.soyisim);

        System.out.println(dok1); // referansini yazdirir

        System.out.println(dok1.fakulte); // Tip
        System.out.println(dok2.fakulte); // Tip

        dok1.isim = "Burcu";
        System.out.println(dok2.isim); // null

        dok1.fakulte = "Tip fakultesi";
        System.out.println(dok2.fakulte);

        Adoktor dok3 = new Adoktor();
        System.out.println(dok3.dogumYili); // 0
        System.out.println(dok3.fakulte); // Tip fakultesi

        System.out.println(Adoktor.fakulte);
        // static variable'lar icin tavsiye edilen erisim yontemi
        // classIsmi.staticUyeIsmi seklinde yazimdir
        // bu kullanim bicimine static yontem denir.

    }
}
