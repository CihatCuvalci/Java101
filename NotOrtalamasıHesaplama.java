import java.util.Scanner;

public class NotOrtalamasıHesaplama {
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

        System.out.println("Not Ortalaması: "+notOrt);

        boolean flag = notOrt>60;
        String sonuc = flag ? "Geçti" : "Kaldı";
        System.out.println(sonuc);
    }
}
