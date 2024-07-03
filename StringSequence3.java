/*QUESTION THREE*/
/* Design a function that takes a string or sequence of characters as input and
returns the character that appears most frequently.
//Eg 11189 => '1'
//hello => l*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class StringSequence3 {

    // Method to find the most frequent characters in the input string
    static String findMostFrequentCharacters(String input) {
        Map<Character, Integer> characterCountMap = new HashMap<>();

        // Count the occurrences of each character
        for (char c : input.toCharArray()) {
            characterCountMap.put(c, characterCountMap.getOrDefault(c, 0) + 1);
        }

        int highestCount = 0;
        StringBuilder frequentCharacters = new StringBuilder();

        // Determine the highest frequency count
        for (int count : characterCountMap.values()) {
            if (count > highestCount) {
                highestCount = count;
            }
        }

        // Collect characters with the highest frequency count
        for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
            if (entry.getValue() == highestCount) {
                if (frequentCharacters.length() > 0) {
                    frequentCharacters.append(", ");
                }
                frequentCharacters.append(entry.getKey());
            }
        }

        // Handle the case where all characters have the same frequency
        if (highestCount == 1 && characterCountMap.size() == input.length()) {
            return "No single most frequent character.";
        }

        return frequentCharacters.toString();
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a string or sequence of characters (or type 'exit' to quit): ");
            String userInput = inputScanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }

            String result = findMostFrequentCharacters(userInput);
            System.out.println(result);
        }

        inputScanner.close();
    }
}
