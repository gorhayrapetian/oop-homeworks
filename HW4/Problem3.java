public class Problem3 {
    public static void main(String[] args) {
        // Define the matrix
        int size = 9;
        char[][] matrix = fillMatrix(size);
        // Call the methods
        drawAsterisk(matrix);
        drawDollar(matrix);
        printMatrix(matrix);
    }

    // Method that fills the matrix with dots
    private static char[][] fillMatrix(int size) {
        char[][] matrix = new char[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = '.';
            }
        }
        return matrix;
    }

    // Method that draws asterisks
    private static void drawAsterisk(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                matrix[i][j] = '*';
            }
        }
    }

    // Method that draws dollars
    private static void drawDollar(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - i; j++) {
                matrix[i][j] = '$';
            }
        }
    }

    // Method that prints the resulting matrix
    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
