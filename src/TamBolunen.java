import  java.util.Scanner;
public class TamBolunen {
    public static void main(String[] args) {
        Scanner userEntry = new Scanner(System.in);
        int number, sum = 0, count = 0;
        double average;

        System.out.print("Bir sayı girin: ");
        number = userEntry.nextInt();

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("3 ve 4'e tam bölünen sayı yok.");
        } else {
            average = (double) sum / count;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + average);
        }
    }
}
