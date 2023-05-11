
/* Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.


Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
Toplam Tutar = (135-27)* 2 = 216 TL..

*/

import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        double perKm = 0.10;
        double discountedRate12 = 0.50;
        double discountedRate65 = 0.30;
        double discountedRate12_24 = 0.10;
        double roundTripDiscountRate = 0.20;
        double price;
        double totalDiscount;
        double specialDiscount;
        double discountedPrice;

        Scanner userEntry = new Scanner(System.in);
        System.out.print("Lütfen mesafe bilgisi giriniz (KM) :");
        double range = userEntry.nextDouble();
        System.out.print("Lütfen yasinizi giriniz :");
        int age = userEntry.nextInt();
        System.out.print("Lütfen bilet tipi seciniz (Tek yön =>1 Gidis-Dönüs =>2):");
        int ticketType = userEntry.nextInt();
        if (range < 0 || age < 0) {
            System.out.println("Negatif deger girilemez.Girisinizi kontrol ediniz");
        }

        switch (ticketType) {
            case 1:
                if (age < 12) {
                    price = (range * perKm);
                    System.out.println("İndirimsiz bilet ücreti:" + price + "TL");
                    totalDiscount = (price * discountedRate12);
                    discountedPrice = price - totalDiscount;
                    System.out.println("İndirim orani: %" + discountedRate12);
                    System.out.println("İndirim tutari:" + totalDiscount + "TL");

                    System.out.println("Ödenecek tutar :" + discountedPrice + "TL");
                } else if (age > 12 && age < 24) {
                    price = (range * perKm);
                    System.out.println("İndirimsiz bilet ücreti:" + price + "TL");
                    totalDiscount = (price * discountedRate12_24);
                    discountedPrice = price - totalDiscount;
                    System.out.println("Genc Yas İndirim orani: %" + discountedRate12_24);
                    System.out.println("İndirim tutari:" + totalDiscount + "TL");

                    System.out.println("Ödenecek tutar :" + discountedPrice + "TL");
                } else if (age > 24 && age < 65) {
                    price = (range * perKm);
                    System.out.println("Ödenecek tutar :" + price + "TL");
                } else if (age > 65) {
                    price = (range * perKm);
                    System.out.println("İndirimsiz bilet ücreti:" + price + "TL");
                    totalDiscount = (price * discountedRate65);
                    discountedPrice = price - totalDiscount;
                    System.out.println("65 yas İndirim orani: %" + discountedRate65);
                    System.out.println("İndirim tutari:" + totalDiscount + "TL");
                    System.out.println("Ödenecek tutar :" + discountedPrice + "TL");
                } break;

            case 2:
                if (age < 12) {
                    price = (range * perKm);
                    System.out.println("İndirimsiz bilet ücreti:" + price + "TL");
                    totalDiscount = (price * discountedRate12);
                    specialDiscount = totalDiscount - (totalDiscount * roundTripDiscountRate);
                    discountedPrice = price - specialDiscount;
                    System.out.println("12 Yas İndirim orani: %" + discountedRate12);
                    System.out.println("Bilet tipi indirim oranı: %"+roundTripDiscountRate);
                    System.out.println("İndirim tutari:" + specialDiscount + "TL");
                    System.out.println("Ödenecek tutar :" + discountedPrice + "TL");

                } else if (age > 12 && age < 24) {
                    price = (range * perKm);
                    System.out.println("İndirimsiz bilet ücreti:" + price + "TL");
                    totalDiscount = (price * discountedRate12_24);
                    specialDiscount = totalDiscount - (totalDiscount * roundTripDiscountRate);
                    discountedPrice = price - specialDiscount;
                    System.out.println("Genc Yas İndirim orani: %" + discountedRate12_24);
                    System.out.println("Bilet tipi indirim oranı: %"+roundTripDiscountRate);
                    System.out.println("İndirim tutari:" + specialDiscount + "TL");
                    System.out.println("Ödenecek tutar :" + discountedPrice + "TL");

                } else if ((age > 24 && age < 65)) {
                    price = (range * perKm);
                    System.out.println("İndirimsiz bilet ücreti:" + price + "TL");
                    discountedPrice = price - (price * roundTripDiscountRate);
                    System.out.println("Bilet tipi indirim oranı: %"+roundTripDiscountRate);
                    System.out.println("Ödenecek Tutar :" + discountedPrice + "TL");

                } else if (age < 65) {
                    price = (range * perKm);
                    System.out.println("İndirimsiz bilet ücreti:" + price + "TL");
                    totalDiscount = (price * discountedRate65);
                    specialDiscount = totalDiscount - (totalDiscount * roundTripDiscountRate);
                    discountedPrice = price - specialDiscount;
                    System.out.println("65 Yas İndirim orani: %" + discountedRate65);
                    System.out.println("Bilet tipi indirim oranı: %"+roundTripDiscountRate);
                    System.out.println("İndirim tutari:" + specialDiscount + "TL");
                    System.out.println("Ödenecek tutar :" + discountedPrice + "TL");
                }
                break ;


        }

    }

}
