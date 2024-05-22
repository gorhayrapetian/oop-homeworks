import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // Asking for an input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // if-else
        if(number >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

        // Ternary Operator
        String result = number >= 0 ? "Positive" : "Negative";
        System.out.println(result);
    }
}
