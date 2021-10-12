import java.util.Scanner;

public class j12DaireHesaplaması {
    public static void main(String[] args) {
        double pi = 3.14,yarıCap,alan,cevre;
        Scanner inp = new Scanner(System.in);
        System.out.print("Yarı Çapı Giriniz");
        yarıCap = inp.nextDouble();
        alan = pi*yarıCap*yarıCap;
        cevre = 2*pi*yarıCap;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);
    }

}
