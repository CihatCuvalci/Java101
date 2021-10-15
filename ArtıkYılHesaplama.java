import java.util.Scanner;

public class J27ArtıkYılHesaplama {
    public static void main(String[] args) {
        int year;
        Scanner inp = new Scanner(System.in);
        System.out.print("Yılı Giriniz: ");
        year = inp.nextInt();
        if (year % 4 == 0){
            if ((year % 100 == 0) && (year % 400 != 0)) {
                System.out.println(year + " Artık Bir Yıl Değildir !");
            }else{
                System.out.println(year + "Artık Bir Yıldır !");
            }
        }else{
            System.out.println(year + " Artık Bir Yıl Değildir !");
        }
    }
}
