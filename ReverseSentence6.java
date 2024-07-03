/*QUESTION 6*/
/* Master Yoda, a renowned Jedi Master from the Star Wars universe, is known
for his unique way of speaking. He often reverses the order of words in his
sentences. For example, instead of saying "I am home" he might say "Home
am I" Design a function that takes a sentence as input and returns a new
sentence with the words reversed in the same order that Master Yoda would
use.*/

import java.util.Scanner;

class ReverseSentence6 {

    // Method to reverse the words in a sentence
    static String transformToYodaSpeak(String sentence) {
        String[] words = sentence.split(" ");

        StringBuilder yodaSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            yodaSentence.append(words[i]);

            if (i > 0) {
                yodaSentence.append(" ");
            }
        }

        return yodaSentence.toString();
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a sentence to convert to Yoda speak (type 'exit' to quit): ");
            String userInput = inputScanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("Yoda speak: " + transformToYodaSpeak(userInput));
        }
        inputScanner.close();
    }
}
