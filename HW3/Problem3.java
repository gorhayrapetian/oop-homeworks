import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        // Taking an input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();

        double ratio = getRatio(word);

        // Outputting the result
        System.out.println(ratio);
    }

    // Method to calculate the ratio
    private static double getRatio(String word) {
        int vowels = 0;
        int consonants = 0;

        // Counting the vowels and the consonants
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);

            // Check if the character is a vowel
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowels++;
            } else if (letter != 'a' && letter != 'e' && letter != 'i' || letter != 'o' || letter != 'u') {
                consonants++;
            }
        }

        // Calculating the ratio
        double ratio = (double) vowels / consonants;

        return ratio;
    }
}
