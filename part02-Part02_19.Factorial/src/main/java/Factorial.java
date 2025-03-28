
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int factorial = 1;

        System.out.println("Give a number: ");
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial: " + factorial);
        scanner.close();
    }
}
