import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first word
        System.out.print("Enter a word: ");
        String firstWord = scanner.nextLine();

        // Prompt the user to enter the second word
        System.out.print("Enter another word: ");
        String secondWord = scanner.nextLine();

        // Check if the words are the same
        if (firstWord.equals(secondWord)) {
            System.out.println("The words are the same.");
        } else {
            System.out.println("The words are different.");
        }

        // Close the scanner
        scanner.close();
    }
}
