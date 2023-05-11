import  java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Doğum ayınızı giriniz: ");
            int ay = input.nextInt();
            System.out.print("Doğum gününüzü giriniz: ");
            int gun = input.nextInt();

            if (ay < 1 || ay > 12 || gun < 1 || gun > 31) {
                System.out.println("Geçersiz ay veya gün girildi, tekrar deneyin.");
                continue;
            }

            String burc = "";
            if (ay == 1) {
                if (gun < 22) {
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
            } else if (ay == 2) {
                if (gun < 20) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            } else if (ay == 3) {
                if (gun < 21) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            } else if (ay == 4) {
                if (gun < 21) {
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
            } else if (ay == 5) {
                if (gun < 22) {
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
            } else if (ay == 6) {
                if (gun < 23) {
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
            } else if (ay == 7) {
                if (gun < 23) {
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }
            } else if (ay == 8) {
                if (gun < 23) {
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
            } else if (ay == 9) {
                if (gun < 23) {
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
            } else if (ay == 10) {
                if (gun < 23) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            } else if (ay == 11) {
                if (gun < 22) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            } else if (ay == 12) {
                if (gun < 22) {
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
            }

            System.out.println("Burcunuz: " + burc);
        }
    }

}
