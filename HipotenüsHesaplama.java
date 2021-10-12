import java.util.Scanner;

public class J10HipotenüsHesaplama {
    public static void main(String[] args) {
        double a,b, c ;
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenarın Uzunluğunu Giriniz: ");
        a = girdi.nextDouble();
        System.out.print("1. Kenarın Uzunluğunu Giriniz: ");
        b = girdi.nextDouble();
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs = " + c);

    }
}
