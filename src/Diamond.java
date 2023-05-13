import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = scanner.nextInt();

        // Üst kısım
        for (int i = 1; i <= n; i++) {
            // Boşluklar
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Yıldızlar
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Alt kısım
        for (int i = n - 1; i >= 1; i--) {
            // Boşluklar
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Yıldızlar
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
