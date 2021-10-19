import java.util.Scanner;

public class j11ÜstAlma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int n = inp.nextInt();
        System.out.print("Üst Dğerini Giriniz: ");
        int power = inp.nextInt();
        int sayi = 1;

        for (int i = 1; i <= power; i++){
            sayi *= n;
        }
        System.out.println(sayi);
    }
}
