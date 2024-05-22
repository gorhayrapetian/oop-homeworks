import java.util.Scanner;

// The main class Problem1
public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of sides of the polygon
        int n;
        while (true) {
            System.out.print("Enter the number of sides: ");
            n = scanner.nextInt();
            if (n >= 3 && n <= 100) {
                break;
            } else {
                System.out.println("Invalid number of sides. Please enter a number between 3 and 100.");
            }
        }

        // Array to store x coordinates of vertices
        int[] x = new int[n];
        // Array to store y coordinates of vertices
        int[] y = new int[n];

        // Read the coordinates of vertices
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the coordinates of vertex " + (i + 1) + " (x y):");
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }

        // Calculate perimeter and area of the convex polygon
        double perimeter = curveLength(x, y, n);
        double polygonArea = area(x, y, n);

        // Print results with 4 digits after the decimal point
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + polygonArea);
    }

    // Recursive method to calculate the perimeter of the convex polygon
    public static double curveLength(int[] x, int[] y, int len) {
        if (len <= 1) {
            return 0; // If there's only one or no points, curve length is 0
        } else {
            // Calculate distance between current point and the previous point using the distance method
            double distance = distance(x[len - 1], y[len - 1], x[len - 2], y[len - 2]);

            // Recursive call to calculate the length of the remaining points
            return distance + curveLength(x, y, len - 1);
        }
    }


    // Recursive method to calculate the area of the convex polygon
    public static double area(int[] x, int[] y, int len) {
        if (len <= 2) {
            return 0; // If there are less than 3 points, area is 0
        } else {
            // Calculate the area of the triangle formed by the last three points
            double triangleArea = 0.5 * Math.abs(x[len - 2] * y[len - 1] - x[len - 1] * y[len - 2]);

            // Recursively calculate the area of the remaining polygon
            return triangleArea + area(x, y, len - 1);
        }
    }

    // Method to calculate the distance between two points
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
