
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        double avg = 0;

        while (true) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num == 0) {
                break;
            } else if (num >= 1) {
                count += 1;
                sum += num;
            }
        }

        if (count >= 1) {
            avg = (double) sum / count;
            System.out.println(avg);
        } else {
            System.out.println("Cannot calculate the average.");
        }
        scanner.close();
    }
}
