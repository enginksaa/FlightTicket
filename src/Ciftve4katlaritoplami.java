import  java.util.Scanner ;
public class Ciftve4katlaritoplami {
    public static void main(String[] args) {
        Scanner userEntry = new Scanner(System.in);
        int number;
        int sum = 0;
        boolean tekCiftDogrulama = false;

        do {
            System.out.print("Bir sayı girin: ");
            number = userEntry.nextInt();
            if (number % 2 == 0 && number % 4 == 0) {
                sum += number;
            }
            if (number % 2 == 0 || number % 4 == 0) {
                tekCiftDogrulama = true;
            } else {
                tekCiftDogrulama = false;
            }
        } while (tekCiftDogrulama);

        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + sum);
    }
}
