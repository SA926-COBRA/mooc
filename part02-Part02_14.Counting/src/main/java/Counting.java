
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        if (num > 0) {
            for (int i = 0; i <= num; i++) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
