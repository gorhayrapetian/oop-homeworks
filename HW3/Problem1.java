import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        // Asking for name
        Scanner scanner = new Scanner(System.in);
        System.out.println("\033[3mWhat is Your Name?\033[0m");
        String firstName = scanner.nextLine();

        // Asking for date of birth, so we can decide the Zodiac Sign and Chinese Animal
        System.out.println("\033[3mWhat is your date of birth? (e.g. 14 July 2007)\033[0m");
        int day = scanner.nextInt();
        String month = scanner.next();
        int year = scanner.nextInt();

        // Getting the Astrological Sign and Chinese Animals in different variables
        String astroSign = getAstroSign(day, month);
        String chineseAnimal = getChineseAnimal(year);

        // Output the result
        System.out.println(firstName + "\033[3m, your Astrological sign is \033[0m" + astroSign + "\033[3m and your Chinese Animal is \033[0m" + chineseAnimal);
    }

    // Method to calculate the Astrological Sign
    private static String getAstroSign(int day, String month) {
        if ((month.equals("December") && day >= 22) || (month.equals("January") && day <= 19)) {
            return "Capricorn";
        } else if ((month.equals("January") && day >= 20) || (month.equals("February") && day <= 18)) {
            return "Aquarius";
        } else if ((month.equals("February") && day >= 19) || (month.equals("March") && day <= 20)) {
            return "Pisces";
        } else if ((month.equals("March") && day >= 21) || (month.equals("April") && day <= 19)) {
            return "Aries";
        } else if ((month.equals("April") && day >= 20) || (month.equals("May") && day <= 20)) {
            return "Taurus";
        } else if ((month.equals("May") && day >= 21) || (month.equals("June") && day <= 20)) {
            return "Gemini";
        } else if ((month.equals("June") && day >= 21) || (month.equals("July") && day <= 22)) {
            return "Cancer";
        } else if ((month.equals("July") && day >= 23) || (month.equals("August") && day <= 22)) {
            return "Leo";
        } else if ((month.equals("August") && day >= 23) || (month.equals("September") && day <= 22)) {
            return "Virgo";
        } else if ((month.equals("September") && day >= 23) || (month.equals("October") && day <= 22)) {
            return "Libra";
        } else if ((month.equals("October") && day >= 23) || (month.equals("November") && day <= 21)) {
            return "Scorpio";
        } else {
            return "Sagittarius";
        }
    }

    // Method to calculate the Chinese Year
    private static String getChineseAnimal(int year) {
        int zodiacNumber = year % 12;
        String zodiacAnimal;
        if (zodiacNumber == 0) {
            zodiacAnimal = "Monkey";
        } else if (zodiacNumber == 1) {
            zodiacAnimal = "Rooster";
        } else if (zodiacNumber == 2) {
            zodiacAnimal = "Dog";
        } else if (zodiacNumber == 3) {
            zodiacAnimal = "Pig";
        } else if (zodiacNumber == 4) {
            zodiacAnimal = "Rat";
        } else if (zodiacNumber == 5) {
            zodiacAnimal = "Ox";
        } else if (zodiacNumber == 6) {
            zodiacAnimal = "Tiger";
        } else if (zodiacNumber == 7) {
            zodiacAnimal = "Rabbit";
        } else if (zodiacNumber == 8) {
            zodiacAnimal = "Dragon";
        } else if (zodiacNumber == 9) {
            zodiacAnimal = "Snake";
        } else if (zodiacNumber == 10) {
            zodiacAnimal = "Horse";
        } else {
            zodiacAnimal = "Sheep";
        }
        return zodiacAnimal;
    }
}
