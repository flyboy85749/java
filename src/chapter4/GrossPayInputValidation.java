package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String [] args){
        // Initialize known variables
        int rate = 15;
        int maxHours = 40;

        // Get input for unknown variables
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        // validate input. Use a "sentinel" to update info. The sentinel here is hoursWorked
        while (hoursWorked > maxHours || hoursWorked < 1) {
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        // Calculate gross pay
        double gross = rate * hoursWorked;
        System.out.println("Your gross pay is: $" + gross);
    }
}
