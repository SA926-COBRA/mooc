
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        if (num < 100) {
            for (int i = num; i <= 100; i++) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
