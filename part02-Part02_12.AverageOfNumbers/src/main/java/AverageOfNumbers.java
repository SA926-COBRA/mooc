
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double avg = 0;

        while (true) {
            System.out.println("Give a number: ");
            int num = Integer.parseInt(scanner.nextLine());

            if (num == 0) {
                break;
            } else {
                sum += num;
                count += 1;
            }
        }

        if (count >= 1) {
            avg = (double) sum / count;
            System.out.println("Average of the numbers: " + avg);
        }
        scanner.close();
    }
}
