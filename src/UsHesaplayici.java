import java.util.Scanner;

public class UsHesaplayici {
    public static void main(String[] args) {
        Scanner userEntry = new Scanner(System.in);
        System.out.print("Tabanı girin: ");
        int taban = userEntry.nextInt();
        System.out.print("Üssü girin: ");
        int us = userEntry.nextInt();

        int sonuc = 1;
        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }

        System.out.println(taban + "^" + us + " = " + sonuc);

        userEntry.close();
    }
}

