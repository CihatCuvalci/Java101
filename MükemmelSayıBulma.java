mport java.util.Scanner;

public class J18MükemmelSayıBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int n = inp.nextInt();
        int sum = 0;

        for (int i = 1; i < n;i++){
            if (n % i == 0){
                sum += i;
            }
        }
        if (sum == n){
            System.out.println(n + " Bir Mükemmel Sayıdır");
        } else {
            System.out.println(n + " Bir MÜkemmel Sayı Değildir");
        }
    }
}
