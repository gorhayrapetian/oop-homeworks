import java.util.LinkedList;
import java.util.Scanner;

public class Problem1 {
    private static LinkedList<String> editedMessage = new LinkedList<>();

    public static void main(String[] args) {
        showUserInstructions();
        processInputCommands();
        displayEditedMessage();
    }

    private static void showUserInstructions() {
        System.out.println("Write a description of your steps:");
    }

    private static void processInputCommands() {
        Scanner inputScanner = new Scanner(System.in);
        while (inputScanner.hasNext()) {
            String command = inputScanner.next();
            if (command.equals("add")) {
                addCharacterBasedOnDirection(inputScanner);
            } else if (command.equals("remove")) {
                removeCharacterBasedOnDirection(inputScanner);
            } else {
                break;
            }
        }
    }

    private static void addCharacterBasedOnDirection(Scanner inputScanner) {
        String direction = inputScanner.next();
        char inputChar = inputScanner.next().charAt(0);
        String characterToAdd = inputChar == '-' ? " " : String.valueOf(inputChar);
        
        if (direction.equalsIgnoreCase("right")) {
            editedMessage.addLast(characterToAdd);
        } else if (direction.equalsIgnoreCase("left")) {
            editedMessage.addFirst(characterToAdd);
        }
    }

    private static void removeCharacterBasedOnDirection(Scanner inputScanner) {
        String direction = inputScanner.next();
        if (!editedMessage.isEmpty()) {
            if (direction.equalsIgnoreCase("right")) {
                editedMessage.removeLast();
            } else if (direction.equalsIgnoreCase("left")) {
                editedMessage.removeFirst();
            }
        }
    }

    private static void displayEditedMessage() {
        for (String character : editedMessage) {
            System.out.print(character);
        }
    }
}
