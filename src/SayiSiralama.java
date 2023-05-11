import java.util.Scanner;
public class SayiSiralama {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Lütfen ilk sayıyı girin: ");
            int sayi1 = scanner.nextInt();
            System.out.print("Lütfen ikinci sayıyı girin: ");
            int sayi2 = scanner.nextInt();
            System.out.print("Lütfen üçüncü sayıyı girin: ");
            int sayi3 = scanner.nextInt();

            int enKucuk = sayi1;
            int orta = sayi2;
            int enBuyuk = sayi3;

            if (sayi2 < enKucuk) {
                enKucuk = sayi2;
                orta = sayi1;
            }
            if (sayi3 < enKucuk) {
                enKucuk = sayi3;
                orta = sayi1;
                enBuyuk = sayi2;
            }
            if (sayi2 > enBuyuk) {
                enBuyuk = sayi2;
                orta = sayi3;
            }
            if (sayi1 > enBuyuk) {
                enBuyuk = sayi1;
                orta = sayi3;
                enKucuk = sayi2;
            }

            System.out.println("Girilen sayılar küçükten büyüğe sıralandığında: " + enKucuk + " " + orta + " " + enBuyuk);
        }
    }

