import  java.util.Scanner;
public class ChineseZodiacFinder {

    public static void main(String[] args) {
        Scanner userEntry = new Scanner(System.in);

        System.out.println("Doğum yılınızı giriniz: ");
        int yil = userEntry.nextInt();

        int mod = yil % 12;
        String zodyakBurcu = "";

        switch (mod) {
            case 0:
                zodyakBurcu = "Maymun";
                break;
            case 1:
                zodyakBurcu = "Horoz";
                break;
            case 2:
                zodyakBurcu = "Köpek";
                break;
            case 3:
                zodyakBurcu = "Domuz";
                break;
            case 4:
                zodyakBurcu = "Fare";
                break;
            case 5:
                zodyakBurcu = "Öküz";
                break;
            case 6:
                zodyakBurcu = "Kaplan";
                break;
            case 7:
                zodyakBurcu = "Tavşan";
                break;
            case 8:
                zodyakBurcu = "Ejderha";
                break;
            case 9:
                zodyakBurcu = "Yılan";
                break;
            case 10:
                zodyakBurcu = "At";
                break;
            case 11:
                zodyakBurcu = "Koyun";
                break;
        }

        System.out.println("Çin Zodyağı Burcunuz: " + zodyakBurcu);
    }
}
