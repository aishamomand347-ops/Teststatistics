
import java.util.Scanner;

public class TextInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TestStatistics statistik = new TestStatistics();

        while (true) {
            String text = scanner.nextLine();

            if (text.equals("stop")) {
                break;
            }

            statistik.laggTillRad(text);
        }

        System.out.println("Antal rader: " + statistik.hamtaAntalRader());
        System.out.println("Antal tecken: " + statistik.hamtaAntalTecken());
    }
}