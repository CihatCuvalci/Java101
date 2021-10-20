import java.util.Scanner;

public class J16EBOBveEKOK {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        int n1 = inp.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        int n2 = inp.nextInt();
        int ebob = 1, ekok, n;

        if (n1 > n2){
            n = n2;
        } else {
            n = n1;
        }

        while (n > 1){
            if ((n1 % n == 0) && (n2 % n == 0)){
                ebob = n;
                break;
            }
            n--;
        }
        System.out.println("EBOB: " + ebob);
        ekok = n1 * n2 / ebob;
        System.out.println("EKOK: " + ekok);

    }
}
