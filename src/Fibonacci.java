import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner userEntry = new Scanner(System.in);
        System.out.print("Fibonacci serisinin kaçıncı elemanına kadar yazdırılsın?: ");
        int n = userEntry.nextInt();

        int a = 0;
        int b = 1;
        int fcc = 0;
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            fcc = a + b;
            System.out.print(fcc + " ");
            a = b;
            b = fcc;
        }
    }
}