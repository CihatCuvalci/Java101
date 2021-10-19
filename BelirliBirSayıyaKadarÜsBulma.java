import java.util.Scanner;

public class J92ninKuvvetleriniBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz: ");
        int power = 1, n = inp.nextInt();

        while (power < n){
            System.out.println(power);
            power *= 2;
        }
    }
}
