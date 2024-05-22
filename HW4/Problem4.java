import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the sizes of sets A and B
        System.out.println("Enter the size of set A:");
        int sizeA = scanner.nextInt();
        System.out.println("Enter the size of set B:");
        int sizeB = scanner.nextInt();

        // Ask the user to input the elements of set A
        System.out.println("Enter the " + sizeA + " elements of set A in increasing order:");
        int[] setA = readSet(scanner, sizeA);

        // Ask the user to input the elements of set B
        System.out.println("Enter the " + sizeB + " elements of set B in increasing order:");
        int[] setB = readSet(scanner, sizeB);

        // Assign the result to a string variable and output
        String result = getComparison(setA, setB);
        System.out.println("Result: " + result);
    }

    // Method to read elements of a set
    private static int[] readSet(Scanner scanner, int size) {
        int[] set = new int[size];
        for (int i = 0; i < size; i++) {
            set[i] = scanner.nextInt();
        }
        return set;
    }

    // Finding out which is true
    private static String getComparison(int[] setA, int[] setB) {
        if (isEqual(setA, setB)) {
            return "The sets are equal";
        } else if (isSubset(setA, setB)) {
            return "A is a subset of B";
        } else if (isSubset(setB, setA)) {
            return "B is a subset of A";
        } else {
            return "None";
        }
    }

    // This method checks if A is a subset of B
    private static boolean isSubset(int[] setA, int[] setB) {
        int indexA = 0, indexB = 0;
        while (indexA < setA.length && indexB < setB.length) {
            if (setA[indexA] < setB[indexB]) {
                return false;
            } else if (setA[indexA] == setB[indexB]) {
                indexA++;
            }
            indexB++;
        }
        return indexA == setA.length;
    }

    // This method checks if the sets are equal
    private static boolean isEqual(int[] setA, int[] setB) {
        if (setA.length != setB.length) {
            return false;
        }
        for (int i = 0; i < setA.length; i++) {
            if (setA[i] != setB[i]) {
                return false;
            }
        }
        return true;
    }
}