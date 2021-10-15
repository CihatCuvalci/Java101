import java.util.Scanner;

public class J26ÇinZodyağıHesaplama {
    public static void main(String[] args) {
        int birthYear, birthMod;
        String burc = "";
        Scanner inp = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz: ");
        birthYear = inp.nextInt();
        birthMod = birthYear % 12;
        switch (birthMod){
            case 0:
                burc = "Maymun";
                break;
            case 1:
                burc = "Horoz";
                break;
            case 2:
                burc = "Köpek";
                break;
            case 3:
                burc = "Donmuz";
                break;
            case 4:
                burc = "Fare";
                break;
            case 5:
                burc = "Öküz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavşan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yılan";
                break;
            case 10:
                burc = "At";
                break;
            case 11:
                burc = "Koyun";
                break;
        }
        System.out.println("Çin Zodyağı Burcunuz: " + burc);


    }
}
