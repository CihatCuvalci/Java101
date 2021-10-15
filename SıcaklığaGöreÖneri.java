import java.util.Scanner;

public class J22EtkinlikÖnerme {
    public static void main(String[] args) {
        int havaSıcaklıgı;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sıcaklığı Giriniz: ");
        havaSıcaklıgı = inp.nextInt();
        if(havaSıcaklıgı < 5){
            System.out.println("Kayak Yapabilirsiniz");
        }else if(havaSıcaklıgı < 25){
            if(havaSıcaklıgı < 10){
                System.out.println("Sinemaya Gidebilirsiniz.");
            }else if(havaSıcaklıgı > 15){
                System.out.println("Pikniğe Gidebilirsiniz.");
            }else{
                System.out.println("Hem Sinemaya Hemde Pikniğe Gidebilirsiniz.");
            }

        }else {
            System.out.println("Yüzmeye Gidebilirsiniz.");
        }
    }
}
