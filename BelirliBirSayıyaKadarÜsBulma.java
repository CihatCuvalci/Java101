import java.util.Scanner;

public class J9a2ninKuvvetleriniBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz: ");
        int power4 = 1, power5 = 1, n = inp.nextInt();

        while (power4 < n){
            System.out.print(power4 + ",");
            power4 *= 4;
        }
        System.out.println();
        while (power5 < n){
            System.out.print(power5 + ",");
            power5 *= 5;
        }

    }
}
