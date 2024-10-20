import java.util.Scanner;

public class PrinterApp {
    public static void main(String[] args) {
        // Initialize the scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Printer App!");
        System.out.println("Type your text below (type 'print' to print and exit):");

        // Close the scanner at the end
        scanner.close();
    }
}
