import java.util.Scanner;

public class J13ManavKasaHesaplaması {
    public static void main(String[] args) {
        double armutKiloFiyatı = 2.14,
                elmaKiloFiyatı = 3.67,
                domatesKiloFiyatı = 1.11,
                muzKiloFiyatı = 0.95,
                patlıcanKiloFiyatı = 5;
        int armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo;
        double tutar;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç Kilo Armut? : ");
        armutKilo = inp.nextInt();
        System.out.print("Kaç Kilo Elma? : ");
        elmaKilo = inp.nextInt();
        System.out.print("Kaç Kilo Domates? : ");
        domatesKilo = inp.nextInt();
        System.out.print("Kaç Kilo Muz? : ");
        muzKilo = inp.nextInt();
        System.out.print("Kaç Kilo Patlican? : ");
        patlicanKilo = inp.nextInt();

        tutar = (armutKilo*armutKiloFiyatı) + (elmaKilo*elmaKiloFiyatı) +
                (domatesKilo*domatesKiloFiyatı) + (muzKilo*muzKiloFiyatı) +
                (patlicanKilo*patlıcanKiloFiyatı);
        System.out.println("Toplam Tutar: " + tutar);
    }
}
