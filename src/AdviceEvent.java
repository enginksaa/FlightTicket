import java.util.Scanner;
public class AdviceEvent {
    public static void main(String[] args) {
        Scanner userEntry = new Scanner(System.in);
        System.out.print("Lütfen sıcaklık değerini girin: ");
        int heat = userEntry.nextInt();

        if (heat < 5) {
            System.out.println("Hava çok soğuk, yani kayak için mükemmel bir gün.");
        } else if (heat >= 5 && heat <= 15) {
            System.out.println("Hava serin, söyle patlamış mısırlı bir filme ne dersin ?.");
        } else if (heat> 15 && heat <= 25) {
            System.out.println("Hava güzel, arkadaslarla piknige ne dersin?.");
        } else {
            System.out.println("Hava sıcak, herkes havuza serinleme zamanı.");
        }
    }
}
