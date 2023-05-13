import java.util.Scanner;
public class HarmonikSayi {

    public static void main(String[] args) {
        Scanner userEntry = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int n = userEntry.nextInt();
        double harmonik = 0;

        for (int i = 1; i <= n; i++) {
            harmonik += 1.0 / i;
        }

        System.out.println(n + " sayısının harmonik serisi: " + harmonik);
    }
}
