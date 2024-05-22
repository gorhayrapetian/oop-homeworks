public class Problem4 {
    public static void main(String[] args) {
        String s = "enteryourstringhereidonthaveanideawhattowrite";

        // Check if the length is less than 30
        if (s.length() < 30) {
            System.out.println("invalid input");
        } else {
            // Remove all "ab" from the string
            s = s.replaceAll("ab", "");

            // Drop the first and the last characters of the string
            s = s.substring(1, s.length() - 1);

            // Concatenate itself 4 times
            s = s + s + s + s;

            // Convert the first half to upper case
            for (int i = 0; i < s.length() / 2; i++) {
                char index = s.charAt(i);
                char upperCase = Character.toUpperCase(index);
                s = s.substring(0, i) + upperCase + s.substring(i + 1);
            }
            // Output the result
            System.out.println(s);
        }
    }
}
