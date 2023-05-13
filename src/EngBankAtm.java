import java.util.Scanner;

public class EngBankAtm {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        String bankName = "ENG Bank";

        System.out.println("Hoşgeldiniz! " + bankName + " bankasına hoşgeldiniz!");

        while (right > 0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();

            if (userName.equals("engin") && password.equals("eng123")) {
                System.out.println("Merhaba, " + bankName + " bankasına hoşgeldiniz!");

                do {
                    System.out.println("1- Para yatırma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgula\n" +
                            "4- Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı: ");
                            int depositAmount = input.nextInt();
                            balance += depositAmount;
                            System.out.println("Yeni bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.print("Para miktarı: ");
                            int withdrawAmount = input.nextInt();
                            if (withdrawAmount > balance) {
                                System.out.println("Bakiyeniz yetersiz.");
                            } else {
                                balance -= withdrawAmount;
                                System.out.println("Yeni bakiyeniz: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");
                            break;
                        default:
                            System.out.println("Geçersiz seçim. Lütfen 1-4 arasında bir seçim yapın.");
                            break;
                    }
                } while (select != 4);

                break;
            } else {
                right--;
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen bankanız ile iletişime geçiniz.");
                } else {
                    System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz. Kalan hakkınız: " + right);
                }
            }
        }
    }
}
