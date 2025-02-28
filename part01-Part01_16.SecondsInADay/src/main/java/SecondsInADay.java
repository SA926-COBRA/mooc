
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        Scanner reader = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int number = Integer.valueOf(reader.nextLine());

        int daysInSecond = number * 86400;

        System.out.println(daysInSecond);
        scanner.close();
    }
}
