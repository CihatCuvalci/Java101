import java.util.Scanner;

public class J17MaxMinBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int mx, mn;
        int select;

        do {
            System.out.println("Kaç Giriş Yapacaksınız?: ");
            select = inp.nextInt();
            if (select < 2){
                System.out.println("En az 2 Giriş Yapmalısınız: ");
            }
        }while(select < 2);

        System.out.print("1. Sayıyı Giriniz: ");
        int n1 = inp.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        int n2 = inp.nextInt();
        if (n1 > n2){
            mx = n1;
            mn = n2;
        } else {
            mx = n2;
            mn = n1;
        }

        if (select > 2){
            for (int i = 3; i <= select;i++){
                System.out.print(i + ". Sayıyı Giriniz: ");
                int n = inp.nextInt();
                if (n > mx){
                    mx = n;
                } else if (n < mn){
                    mn = n;
                }
            }
        }
        System.out.println("En Büyük Sayı: " + mx);
        System.out.println("En Küçük Sayı: " + mn);

    }
}
