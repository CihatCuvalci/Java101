import java.util.Scanner;

public class J10FaktöriyelHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        double n = inp.nextDouble(), fakN = 1;
        System.out.print("Sayının Kaçlı Kombinasyonu?: ");
        double r = inp.nextDouble(),fakR = 1;
        double fakNR = 1;
        double total;

        for (int i = 1; i <= n; i++){
            fakN *= i;
        }

        for (int i = 1; i <= r; i++){
            fakR *= i;
        }

        for (int i = 1; i <= (n-r); i++){
            fakNR *= i;
        }
        total = fakN/(fakR * fakNR);
        System.out.println(total);
    }
}
