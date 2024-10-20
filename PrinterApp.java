import java.util.Scanner;

public class PrinterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder textToPrint = new StringBuilder(); // To store user input
        String input;

        System.out.println("Welcome to the Printer App!");
        System.out.println("Type your text below (type 'print' to print and exit):");

        // Loop to keep reading input
        while (true) {
            input = scanner.nextLine(); // Read user input
            textToPrint.append(input).append("\n"); // Append input to text to print
        }
    }
}
