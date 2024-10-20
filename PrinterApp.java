import java.util.Scanner;

public class PrinterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder textToPrint = new StringBuilder(); // To store user input
        String input;

        System.out.println("Welcome to the Printer App!");
        System.out.println("Type your text below (type 'print' to print and exit):");

        // Loop to keep reading input until "print" is typed
        while (true) {
            input = scanner.nextLine(); // Read user input
            if (input.equalsIgnoreCase("print")) {
                break; // Exit loop when user types 'print'
            }
            textToPrint.append(input).append("\n"); // Append input to text to print
        }

        // Print the collected text
        System.out.println("Printing...\n");
        System.out.println(textToPrint.toString()); // Output the collected text

        // Close the scanner to free resources
        scanner.close();
    }
}
