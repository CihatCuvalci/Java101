import java.util.Scanner;

public class J13HarmonikSayıBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("BirSayı Giriniz: ");
        double n = inp.nextDouble();
        double sum = 0;

        for (double i = 1; i <= n;i++){
            sum += 1/i;
        }
        System.out.println(sum);
    }
}
