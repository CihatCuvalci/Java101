import java.util.Scanner;

public class J13VucutKitleIndeksi {
    public static void main(String[] args) {
        double boy, vki,kilo;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu Metre Cinsinden Griniz: ");
        boy = inp.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz: ");
        kilo = inp.nextDouble();

        vki = kilo / (boy * boy) ;
        System.out.println("Vucut Kitle İndeksiniz: " + vki);
    }
}
