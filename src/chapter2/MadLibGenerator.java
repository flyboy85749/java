package chapter2;

import java.util.Scanner;

public class MadLibGenerator {
    public static void main(String[] arg){
        // 1. ask user to enter season of the year
        System.out.println("Please enter a season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        // 2. ask user to enter a whole number
        System.out.println("Please enter a whole number");
        int number = scanner.nextInt();

        // 3. ask user to enter an adjective
        System.out.println("Please enter an adjective (i.e.: describes a noun");
        String adjective = scanner.next();
        scanner.close();

        // 4. Output "On a [adjective] [season of the year] day, I drink a minimum of [whole number] cups of coffee."
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");

    }
}
