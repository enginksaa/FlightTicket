import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan iki sayı alınır
        System.out.print("1. Sayıyı giriniz: ");
        int number1 = input.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int number2 = input.nextInt();

        // EBOB hesaplanır
        int ebob = 1;
        int i = 1;
        while (i <= number1 && i <= number2) {
            if (number1 % i == 0 && number2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("EBOB(" + number1 + "," + number2 + ") = " + ebob);

        // EKOK hesaplanır
        int ekok = (number1 * number2) / ebob;
        System.out.println("EKOK(" + number1 + "," + number2 + ") = " + ekok);
    }
}
