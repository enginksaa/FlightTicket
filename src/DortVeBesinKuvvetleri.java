 import java.util.Scanner;

    public class DortVeBesinKuvvetleri {
        public static void main(String[] args) {
            Scanner userEntry = new Scanner(System.in);
            System.out.print("Bir sayı girin: ");
            int number = userEntry.nextInt();

            System.out.println("4 ve 5'in kuvvetleri:");
            for (int i = 1; i <= number; i++) {
                int powerOf4 = (int) Math.pow(4, i);
                int powerOf5 = (int) Math.pow(5, i);

                System.out.println("4^" + i + " = " + powerOf4);
                System.out.println("5^" + i + " = " + powerOf5);
            }

            userEntry.close();
        }
    }


