package Problem4;

import java.util.Scanner;

/**
 * The PhoneNumberDemo class demonstrates the functionality of the PhoneNumber class
 * by allowing the user to input phone numbers and call duration to calculate the cost
 * of a call between two phone numbers.
 */
public class PhoneNumberDemo {
    /**
     * The main method where the program execution begins.
     *
     * @param args the command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the full phone number of the source
        System.out.print("Enter the full phone number of the source: ");
        String sourcePhoneNumber = scanner.next();
        String sourceNetworkCode = sourcePhoneNumber.substring(0, 3);
        String number1 = sourcePhoneNumber.substring(3);

        // Prompt the user to enter the full phone number of the destination
        System.out.print("Enter the full phone number of the destination: ");
        String destinationPhoneNumber = scanner.next();
        String destinationNetworkCode = destinationPhoneNumber.substring(0, 3);
        String number2 = destinationPhoneNumber.substring(3);

        // Create PhoneNumber objects for the source and destination phone numbers
        PhoneNumber source = new PhoneNumber(sourceNetworkCode, number1);
        PhoneNumber destination = new PhoneNumber(destinationNetworkCode, number2);

        // Prompt the user to enter the duration of the call in minutes
        System.out.print("Enter duration of call in minutes: ");
        int duration = scanner.nextInt();

        // Calculate the cost of the call for the source phone number
        double cost = source.calculateCost(duration, destination.getMobileNetworkCode());
        // Calculate the static cost of the call
        double staticCost = PhoneNumber.calculateCost(duration, source.getMobileNetworkCode(), destination.getMobileNetworkCode());

        // Display the calculated costs to the user
        System.out.println("Cost: " + cost);
        System.out.println("Static cost: " + staticCost);
    }
}
