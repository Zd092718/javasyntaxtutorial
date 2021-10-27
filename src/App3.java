import java.util.Scanner;

// User input tutorial
public class App3 {
    public static void main(String[] args) {

        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Output the prompt
        System.out.println("Enter a floating point value: ");

        // Wait for user input
        double value = input.nextDouble();

        // Tell them what they entered
        System.out.println("You entered: " + value);
    }
}
