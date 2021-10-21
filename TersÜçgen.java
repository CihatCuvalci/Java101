import java.util.Scanner;

public class J19TerÜçgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz: ");
        int n = inp.nextInt();

        for (int i = 0; i < n; i++){
            for (int k = 0; k < i; k++){
                System.out.print(" ");
            }
            for (int j = ((2*n)-(2*i)-1);j > 0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
