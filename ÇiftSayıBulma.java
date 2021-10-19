import java.util.Scanner;

public class J7ÇifTSayılarıBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int sayi = inp.nextInt();

        for (int i = 1; i <= sayi; i++){
            if (i % 2 == 0 ){
                System.out.println(i);
            }

        }
    }
}
