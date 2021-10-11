import java.util.Scanner;

public class J9KdvTutarıHesaplama {
    public static void main(String[] args) {
        double kdvsizTutar,kdvliTutar,kdv,kdvOranı = 0.18;
        Scanner inp = new Scanner(System.in);
        System.out.print("Tutarı Giriniz: ");
        kdvsizTutar = inp.nextDouble();

        kdv = kdvsizTutar*kdvOranı;
        kdvliTutar = kdv + kdvsizTutar;

        System.out.println("KDV'siz Tutar: " + kdvsizTutar);
        System.out.println("KDV'li Tutar : " + kdvliTutar);
        System.out.println("Kdv Tutarı: " + kdv);
        
    }
}
