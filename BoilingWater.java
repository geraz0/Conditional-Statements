import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        // == is equal to

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt for user input asking for a number greater than 212
        System.out.println("Enter a number greater than 212:");
        int number = Integer.valueOf(scanner.nextLine());

        if (number >= 212) {
            System.out.println("Water is boiling!");
        } else if (number < 212) {
            System.out.println("Water is not boiling!");
        }


    }
}
