import java.util.Scanner;
public class KombinasyonHesaplayici {
    public static void main(String[] args) {
        Scanner userEntry = new Scanner(System.in);
        System.out.print("n değerini girin: ");
        int n = userEntry.nextInt();
        System.out.print("r değerini girin: ");
        int r = userEntry.nextInt();

        int nFaktoriyel = 1;
        for (int i = 2; i <= n; i++) {
            nFaktoriyel *= i;
        }

        int rFaktoriyel = 1;
        for (int i = 2; i <= r; i++) {
            rFaktoriyel *= i;
        }

        int nMinusRFaktoriyel = 1;
        for (int i = 2; i <= (n - r); i++) {
            nMinusRFaktoriyel *= i;
        }

        int kombinasyon = nFaktoriyel / (rFaktoriyel * nMinusRFaktoriyel);
        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);

        userEntry.close();
    }
}
