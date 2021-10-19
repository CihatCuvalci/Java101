import java.util.Scanner;

public class J7ÇifTSayılarıBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int sayi = inp.nextInt();
        double avarage, sum3 = 0, sum4 = 0;

        for (int i = 1; i <= sayi; i++){
            if ((i % 3 == 0) && (i % 4 == 0)){
                sum3 += i;
                sum4 += i;
            }else if (i % 3 == 0 ){
                sum3 += i;
            }else if (i % 4 == 0){
                sum4 += i;
            }

        }
        avarage = (sum3+sum4)/2;
        System.out.println(avarage);
    }
}
