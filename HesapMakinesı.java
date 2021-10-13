import java.util.Scanner;

public class J19HesapMakinesi {
    public static void main(String[] args) {
        double n1,n2;
        int select;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayınızı Giriniz: ");
        n1 = input.nextDouble();
        System.out.print("İkinci Sayınızı Giriniz: ");
        n2 = input.nextDouble();

        System.out.println("Toplama için 1'i");
        System.out.println("Çıkarma için 2'yi");
        System.out.println("Çarpma için 3'ü");
        System.out.println("Bölme için 4'ü");
        System.out.print("Yazınız: ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("İşlem Sonucu: " + (n1 + n2));
                break;
            case 2:
                System.out.println("İşlem Sonucu: " + (n1 - n2));
                break;
            case 3:
                System.out.println("İşlem Sonucu: " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0){
                    System.out.println("Bölme İşleminde İkinci Sayı 0 Olamaz");
                } else{
                System.out.println("İşlem Sonucu: " + (n1 / n2));
                }
                break;
            default:
                System.out.println("Yanlış Bir İşlem Kodu Girdiniz");
        }

    }
}
