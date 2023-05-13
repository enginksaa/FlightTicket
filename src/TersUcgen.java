import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner userEntry = new Scanner(System.in);
        System.out.print("Üçgenin yüksekliği: ");
        int height = userEntry.nextInt();

        for (int i = 0; i < height; i++) {
            // boşluk
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // yıldız
            for (int j = 0; j < 2 * (height - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
