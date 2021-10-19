import java.util.Scanner;

public class J11AmstrongSayıBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int n1 = inp.nextInt(), n2 = n1, n3=n1;
        int basamakSayisi = 0;
        int basamak;
        int total = 0;

        while (n1 != 0){
            n1 /= 10;
            basamakSayisi++;
        }

        while (n2 != 0){
            basamak = n2 % 10;
            int sum = 1;
            for (int k = 1; k <= basamakSayisi;k++){
                sum *= basamak;
            }
            total += sum;
            n2 = n2/10;
        }
      
        if (total == n3){
            System.out.println(n3 + " Bir Amstrong Sayıdır.");
        }else{
            System.out.println(n3 + " Bir Amstrong Sayı Değildir.");
        }
    }
}
