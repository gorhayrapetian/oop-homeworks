package Problem2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter scores in format 'Name Score':");

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(" ");
            if (parts.length != 2) {
                System.out.println("Input must consist of a name and a score.");
                continue;
            }

            String name = parts[0];
            int score = parseScore(parts[1]);
            if (score == -1) {
                System.out.println("Please enter a valid number for the score.");
                continue;
            }

            scores.merge(name, score, Integer::sum);
        }

        System.out.println("Total scores of trivia: ");
        scores.forEach((name, totalScore) -> System.out.println(name + " " + totalScore));
    }

    private static int parseScore(String scoreText) {
        try {
            return Integer.parseInt(scoreText);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
