import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz?: ");
        int n = input.nextInt();

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ". sayıyı giriniz: ");
            int num = input.nextInt();
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("En büyük sayı: " + largest);
        System.out.println("En küçük sayı: " + smallest);
    }
}
