// The main Problem2 class
public class Problem2 {
    public static void main(String[] args) {
        int length = 16;
        printBinaryNumber("", length);
    }

    public static void printBinaryNumber(String number, int length) {
        if (length <= 0) {
            // There is no number length 0 or negative so need to abort the program
            System.out.println(number);
        } else {
            // Append "0" or "1" to the current number
            printBinaryNumber(number + "0", length - 1);
            printBinaryNumber(number + "1", length - 1);
        }
    }
}