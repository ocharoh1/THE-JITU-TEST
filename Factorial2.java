import java.util.Scanner;

class Factorial2 {

    // Method to compute the factorial of a given number
    static int computeFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * computeFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number to find its factorial (or type 'exit' to quit): ");
            String userInput = inputScanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int number = Integer.parseInt(userInput);
                // Compute and display the factorial of the entered number
                System.out.println("Factorial of " + number + " is " + computeFactorial(number));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        inputScanner.close();
    }
}
