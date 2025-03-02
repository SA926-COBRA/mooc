
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here

        System.out.println("Give the first number: ");
        int a = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number: ");
        int b = Integer.valueOf(scanner.nextLine());

        System.out.println(a + b + " = " + (a + b));
        scanner.close();
    }
}
