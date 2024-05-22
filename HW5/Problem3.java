import java.util.Scanner;

// The main Problem3 class
public class Problem3 {
    public static final double CIRCLE_CENTER_X = 0.5;
    public static final double CIRCLE_CENTER_Y = 0.5;
    public static final double CIRCLE_RADIUS = 0.5;

    public static void main(String[] args) {
        // Reads the number of points to generate
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sample points to generate: ");
        int n = scanner.nextInt();

        double percentage = estimateCircleArea(n);
        System.out.println("Percentage of points inside the circle: " + percentage + "%");
    }

    // Method estimates the area of the circle
    public static double estimateCircleArea(int n) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            double x = Math.random();
            double y = Math.random();

            if (isInside(x, y)) {
                count++;
            }
        }

        return (double) count / n;
    }

    // Method calculates if the point is inside the circle
    public static boolean isInside(double x, double y) {
        // Using the equation of the unit circle find out if the point is inside the circle: (x-a)^2 + (y-b)^2 <= r^2
        double dx = x - CIRCLE_CENTER_X;
        double dy = y - CIRCLE_CENTER_Y;
        return dx * dx + dy * dy <= CIRCLE_RADIUS * CIRCLE_RADIUS;
    }
}