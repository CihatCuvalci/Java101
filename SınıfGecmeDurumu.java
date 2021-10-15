import java.util.Scanner;

public class j21SınıfGecmeDurumu {
    public static void main(String[] args) {
        int mat,fiz,kim,turk,tar,muz;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notu: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notu: ");
        fiz = inp.nextInt();

        System.out.print("Kimya Notu: ");
        kim = inp.nextInt();

        System.out.print("Türkçe Notu: ");
        turk = inp.nextInt();

        System.out.print("Tarih Notu: ");
        tar = inp.nextInt();

        System.out.print("Müzik Notu: ");
        muz = inp.nextInt();

        double notOrt = (mat + fiz + kim + turk + tar + muz) / 6.0;

        if (notOrt < 55) {
            System.out.println("Malesef Sınıfı Geçemediniz");
        }else{
            System.out.println("Tebrikler Sınıfı Geçtiniz");
        }

        System.out.println("Not Ortalaması: " + notOrt);

    }
}
