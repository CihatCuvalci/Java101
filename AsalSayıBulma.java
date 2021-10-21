import java.util.Scanner;

public class J20AsalSayıBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz: ");
        int n = inp.nextInt();
        int k;


        for (int i = 2; i < n;i++){
            int flag = 0;
            for (k = 2; k < (i-1);k++){
                if (i % k == 0){
                    flag++;
                }
            }
            if (flag == 0){
                System.out.print(i + " ");
            }
        }
    }
}
