import java.util.Scanner;

public class J21Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int n = inp.nextInt();
        int a = 0, b = 1,result = 0;

        for (int i = 1; i <= n; i++){
            if (i == 1){
                System.out.println(a + " ");
            } else if (i == 2){
                System.out.println(b + " ");
            } else{
                result = a + b;
                a = b;
                b = result;
                System.out.println(result + " ");
            }
        }


    }
}
