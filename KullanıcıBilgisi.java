import java.util.Scanner;

public class J20KullanıcıGirişi {
    public static void main(String[] args) {
        String userName,password;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı Adınızı Giriniz: ");
        userName = inp.nextLine();

        System.out.println("Şifrenizi Giriniz: ");
        password = inp.nextLine();

        switch (userName){
            case "CihatCu":
                if (password.equals("Cihat.123")){
                    System.out.println("Başarılı Giriş Yaptınız");
                } else {
                    System.out.println("Girilen Şifre Hatalı");
                    System.out.println("Yeni Şifre Oluşturmak İster misiniz ? (Y/N)");
                    String user = inp.nextLine();
                    if (user.equals("Y")) {
                        System.out.println("Yeni Şifrenizi Giriniz");
                        String newPassword = inp.nextLine();
                        if (newPassword.equals("Cihat.123") || newPassword.equals(password)) {
                            System.out.println("Yeni Şifre Eski Şifre yada Hatalı Girilen Şifre Olamaz");
                        } else {
                            System.out.println("Yeni Şifre Oluşturuldu");
                        }
                    } else {
                        System.out.println("Lütfen Tekrar Deneyin");
                    }
                }
                break;
            case "ŞeymaKu":
                if (password.equals("Seyma.123")){
                    System.out.println("Başarılı Giriş Yaptınız");
                } else {
                    System.out.println("Girilen Şifre Hatalı");
                    System.out.println("Yeni Şifre Oluşturmak İster misiniz ? (Y/N)");
                    String user = inp.nextLine();
                    if (user.equals("Y")){
                        System.out.println("Yeni Şifrenizi Giriniz");
                        String newPassword = inp.nextLine();
                        if (newPassword.equals("Seyma.123") || newPassword.equals(password)){
                            System.out.println("Yeni Şifre Eski Şifre yada Hatalı Girilen Şifre Olamaz");
                        }else {
                            System.out.println("Yeni Şifre Oluşturuldu");
                        }
                    } else{
                        System.out.println("Lütfen Tekrar Deneyin");
                    }
                }
                break;
            default:
                System.out.println("Böyle Bir Kullanıcı Bulunamadı");
        }

    }
}
