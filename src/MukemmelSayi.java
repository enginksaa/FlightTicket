import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner userEntry = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = userEntry.nextInt();
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println(number + " bir mükemmel sayıdır.");
        } else {
            System.out.println(number + " bir mükemmel sayı değildir.");
        }
    }
}
