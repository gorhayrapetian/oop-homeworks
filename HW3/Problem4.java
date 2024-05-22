import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking an input from the user
        System.out.print("Enter the number of activities: ");
        int numActivities = scanner.nextInt();
        scanner.nextLine();

        // Defining variables, so we can change them later
        String mostBurntActivity = "";
        String leastBurntActivity = "";
        String mostConsumedActivity = "";
        String leastConsumedActivity = "";

        int totalCalories = 0;
        int mostBurnt = 0;
        int leastBurnt = Integer.MIN_VALUE;
        int mostConsumed = 0;
        int leastConsumed = Integer.MAX_VALUE;

        // Calculating the most and least consumed and burnt activities
        for (int i = 0; i < numActivities; i++) {
            System.out.print("Enter activity name and calories: (e.g. breakfast 400) ");
            String activity = scanner.next();
            int calories = scanner.nextInt();

            if (calories > 0) {
                totalCalories += calories;
            }

            if (calories < 0) {
                if (calories < mostBurnt) {
                    mostBurnt = calories;
                    mostBurntActivity = activity;
                }
                if (calories > leastBurnt) {
                    leastBurnt = calories;
                    leastBurntActivity = activity;
                }
            } else {
                if (calories > mostConsumed) {
                    mostConsumed = calories;
                    mostConsumedActivity = activity;
                }
                if (calories < leastConsumed) {
                    leastConsumed = calories;
                    leastConsumedActivity = activity;
                }
            }
        }

        // Outputting the results
        System.out.println("The calorie balance of the day is " + totalCalories + ".");
        System.out.println("Most calories burnt: " + mostBurntActivity + ";");
        System.out.println("Least calories burnt: " + leastBurntActivity + ";");
        System.out.println("Most calories consumed: " + mostConsumedActivity + ";");
        System.out.println("Least calories consumed: " + leastConsumedActivity + ".");
    }
}
