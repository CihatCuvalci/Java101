import java.util.Scanner;

public class J11TaksimetreHesaplama {
    public static void main(String[] args) {
        double acilisTutarı = 10, kmTurtarı = 2.20, minTutar = 20,tutar,mesafe,sonTutar;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen Bir Mesafe Giriniz: ");
        mesafe = girdi.nextDouble();
        tutar = mesafe*kmTurtarı + acilisTutarı;

        sonTutar = tutar>minTutar ? tutar:minTutar;
        System.out.println("Ödenecek Tutar: " + sonTutar);

    }
}
