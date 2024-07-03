/* QUESTION T FOUR*/
/* Design a function that determines whether a given string is a pangram. A
pangram is a sentence or phrase containing every letter of the alphabet at
least once. Punctuation and case are typically ignored. For example, the
string "The quick brown fox jumps over the lazy dog" is a pangram, while
"Hello, world!" is not.*/
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Pangram {

    static boolean checkPangram(String text) {
        text = text.toLowerCase();

        Set<Character> alphabetSet = new HashSet<>();

        for (char ch : text.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                alphabetSet.add(ch);
            }
        }
        return alphabetSet.size() == 26;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a string to verify if it's a pangram (type 'exit' to quit): ");
            String userInput = inputScanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }

            if (checkPangram(userInput)) {
                System.out.println("The string is a pangram.");
            } else {
                System.out.println("The string is not a pangram.");
            }
        }

        inputScanner.close();
    }
}
