import java.util.Scanner;

public class J25UcakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double yolcuYasi, yolculukMesafesi, kur = 0.10, ilkTutar, yasIndirimliTutar, toplamTutar;
        int yolculukTipi;

        System.out.print("Lütfen Yaşınızı Giriniz: ");
        yolcuYasi = inp.nextDouble();
        System.out.print("Yolculuk Mesafesini Giriniz: ");
        yolculukMesafesi = inp.nextDouble();
        System.out.print("Yolculuk Tipini Seçiniz (1 => Tek Yön 2 => Gidiş Dönüş): ");
        yolculukTipi = inp.nextInt();

        ilkTutar = yolculukMesafesi * kur;

        if (yolcuYasi < 0 || yolculukMesafesi < 0){
            System.out.println("Yolcu Yaşı yada Yolculuk Mesafesi Negatif Olamaz !");
        }else{
            if (yolcuYasi < 12){
                yasIndirimliTutar = ilkTutar * 0.5;
            }else if (yolcuYasi <24){
                yasIndirimliTutar = ilkTutar * 0.9;
            }else if (yolcuYasi > 65){
                yasIndirimliTutar = ilkTutar * 0.8;
            }else{
                yasIndirimliTutar = ilkTutar;
            }

            switch (yolculukTipi){
                case 1:
                    toplamTutar = yasIndirimliTutar;
                    System.out.println("Toplam Tutar: " + toplamTutar);
                    break;
                case 2:
                    toplamTutar = 2 * (yasIndirimliTutar * 0.8);
                    System.out.println("Toplam Tutar: " + toplamTutar);
                    break;
                default:
                    System.out.println("Hatalı Giriş Yaptınız !");
            }

        }

    }
}
