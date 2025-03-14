
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        System.out.println(input * input);
        scanner.close();
    }
}
