import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name a number between 0 and 100");

        int num = scanner.nextInt();

        if (num >= 91 && num <= 100) {
            System.out.println("Your grade is an A!");
        } else if (num >= 81 && num <= 90) {
            System.out.println("Your grade is a B");
        } else if (num >= 71 && num <= 80) {
            System.out.println("Your grade is a C");
        } else if (num >= 61 && num <= 70) {
            System.out.println("Your grade is a D");
        } else if (num >= 0 && num <= 60) {
            System.out.println("Your grade is an F :(");
        } else {
            System.out.println("Invalid input. Please enter a number between 0 and 100.");
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}

