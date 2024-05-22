public class Problem1 {
    public static void main(String[] args) {
        String string = "American University of Armenia";
        StringBuilder reversedUsingStringBuilder = getReversedUsingStringBuilder(new StringBuilder(string));
        String reversedManually = getReversedManually(string);
        System.out.println("Reversed using StringBuilder: " + reversedUsingStringBuilder);
        System.out.println("Reversed manually: " + reversedManually);
    }

    // This method reverses the string using StringBuilder
    private static StringBuilder getReversedUsingStringBuilder(StringBuilder stringBuilder) {
        stringBuilder.reverse();
        return stringBuilder;
    }

    // This method reverses the string manually
    private static String getReversedManually(String string) {
        String reversed = "";
        char character;
        for (int i = 0; i < string.length(); i++) {
            character = string.charAt(i);
            reversed = character + reversed;
        }
        return reversed;
    }
}
