

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int vowels = 0, consonants = 0;

        // Convert the string to lowercase to handle case insensitivity
        input = input.toLowerCase();

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            // Check if the character is a consonant
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        // Display the results
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        

        scanner.close();
    }
}
