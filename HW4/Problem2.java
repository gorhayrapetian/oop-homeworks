import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[][] result = filterPositiveNegative(numbers);
        printResult(result);
    }

    // This method filters negative and positive numbers into other arrays
    private static int[][] filterPositiveNegative(int[] numbers) {
        int[][] result = new int[2][]; // 2 arrays: 0 for positives, 1 for negatives
        int numPositives = 0;
        int numNegatives = 0;

        // Counting positive and negative numbers and allocating space
        for (int num : numbers) {
            if (num >= 0) {
                numPositives++;
            } else {
                numNegatives++;
            }
        }

        result[0] = new int[numPositives];
        result[1] = new int[numNegatives];

        // Index variables for positive and negative arrays
        int positiveIndex = 0;
        int negativeIndex = 0;

        // Appending to resulting arrays
        for (int num : numbers) {
            if (num >= 0) {
                result[0][positiveIndex++] = num;
            } else {
                result[1][negativeIndex++] = num;
            }
        }

        return result;
    }

    // Printing the resulting array
    private static void printResult(int[][] result) {
        for (int i = 0; i < result.length; i++) {
            int[] array = result[i];
            System.out.print("{");
            for (int j = 0; j < array.length; j++) {
                if (j != 0) {
                    System.out.print(",");
                }
                System.out.print(array[j]);
            }
            System.out.print("}");
        }
        System.out.println();
    }
}