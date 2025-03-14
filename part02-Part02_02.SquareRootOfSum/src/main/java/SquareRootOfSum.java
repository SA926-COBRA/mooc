
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        double squareRoot = Math.sqrt(num1 + num2);
        System.out.println(squareRoot);

        scanner.close();
    }
}
