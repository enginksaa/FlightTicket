import java.util.Scanner;

public class AvarageExamResults {
    public static void main(String[] args) {

        int maths;
        int phys;
        int turkish;
        int history;
        int music;

        Scanner giris = new Scanner(System.in);
        System.out.println("Please enter mathematics result :");
        maths = giris.nextInt();

        System.out.println("Please enter physics result :");
        phys = giris.nextInt();

        System.out.println("Please enter turkish result :");
        turkish = giris.nextInt();

        System.out.println("Please enter history result :");
        history = giris.nextInt();

        System.out.println("Please enter music result :");
        music = giris.nextInt();

        int sum = 0;
        int count = 0;
        if (maths > 0 && maths < 100) {
            sum += maths;
            count++;
        }
        if (phys > 0 && phys < 100) {
            sum += phys;
            count++;
        }
        if (turkish > 0 && turkish < 100) {
            sum += turkish;
            count++;
        }
        if (history > 0 && history < 100) {
            sum += history;
            count++;
        }
        if (music > 0 && music < 100) {
            sum += music;
            count++;
        }

        double finalresult = (double)sum / count;
        System.out.println("Average Result : " + finalresult);

        if (finalresult >= 60) {
            System.out.println("Passed the class");
        } else {
            System.out.println("Failed the class");
        }
    }
}
