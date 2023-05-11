import java.util.Scanner;

public class ArtikYil {

    public static void main(String[] args) {

        Scanner userEntry = new Scanner(System.in);
        int year;
        char devam;

        do {
            System.out.print("Yıl Giriniz : ");
            year = userEntry.nextInt();

            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " bir artık yıldır !");
            } else {
                System.out.println(year + " bir artık yıl değildir !");
            }

            System.out.print("Devam etmek istiyor musunuz? (E/H): ");
            devam = userEntry.next().charAt(0);

        } while (devam == 'E' || devam == 'e');

        userEntry.close();
    }
}

