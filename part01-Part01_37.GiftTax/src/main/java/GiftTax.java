
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int gift = Integer.parseInt(scan.nextLine());

        if (gift >= 5000 && gift < 25000) {
            System.out.print("Tax: " + (100 + (gift - 5000) * 0.08));
        } else if (gift >= 25000 && gift < 55000) {
            System.out.println("Tax: " + (1700 + (gift - 25000) * 0.10));
        } else if (gift >= 55000 && gift < 200000) {
            System.out.println("Tax: " + (4700 + (gift - 55000) * 0.12));
        } else if (gift >= 200000 && gift < 1000000) {
            System.out.println("Tax: " + (22100 + (gift - 200000) * 0.15));
        } else if (gift >= 1000000) {
            System.out.println("Tax: " + (142100 + (gift - 1000000) * 0.17));
        } else {
            System.out.println("No tax!");
        }
        scan.close();
    }
}
