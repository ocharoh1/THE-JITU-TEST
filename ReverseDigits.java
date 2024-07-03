/*QUESTION ONE*/
/*1. Design a function that reverses the digits of an integer. For example, 50
should become 5 and -12 should become -21.*/

import java.util.Scanner;

class ReverseDigits {

    // Function to reverse the digits of an integer
    static int reverseInteger(int number) {
        int reversedNumber = 0;
        int sign = number < 0 ? -1 : 1;
        number = Math.abs(number);

        while (number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;
        }

        return sign * reversedNumber;
    }

    // Main method
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number to reverse (or type 'exit' to quit): ");
            String userInput = inputScanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int number = Integer.parseInt(userInput);
                // Reverse the number and display the result
                System.out.println("Reversed number is " + reverseInteger(number));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        inputScanner.close();
    }
}
