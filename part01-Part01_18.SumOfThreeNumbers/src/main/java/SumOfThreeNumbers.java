
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        System.out.println("Give the first number: ");
        int a = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number: ");
        int b = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number: ");
        int c = Integer.valueOf(scanner.nextLine());

        int sum = a + b + c;

        System.out.println("The sum of the numbers is " + sum);
    }
}
