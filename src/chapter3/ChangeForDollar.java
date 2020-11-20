package chapter3;
/*
The objective of this game is to enter enough change to equal exactly $1.00
Create a program that prompts the user to enter the quantities for: pennies,
nickels, dimes and quarters.
The program should count up the total of all the coins entered.
If the total is $1.00, they win
If it's more than $1.00, tell them how much they went over
If under, tell them how much under
 */
import java.util.Scanner;

public class ChangeForDollar {
    public static void main(String [] args){
        int goal = 1;
        // first get inputs from user
        System.out.println("Please enter how many pennies you have");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();

        System.out.println("Please enter how many nickels you have");
        int nickels = scanner.nextInt();

        System.out.println("Please enter how many dimes you have");
        int dimes = scanner.nextInt();

        System.out.println("Please enter how many quarters you have");
        int quarters = scanner.nextInt();
        scanner.close();

        float pennies_value = (float) (pennies * 0.01);
        float nickels_value = (float) (nickels * 0.05);
        float dimes_value = (float) (dimes * 0.10);
        float quarters_value = (float) (quarters * 0.25);


        float total = pennies_value + nickels_value + dimes_value + quarters_value;


        if (total == goal){

            String message = "You entered " + pennies + " pennies, " + nickels + " nickels, " + dimes + " dimes, " +
                    "and " + quarters + " quarters. The total amount entered is " + "$" + total + ".Your total is exactly " +
                    "$" + total + "! Congratulations, you win!";

            System.out.println(message);
        }
        else if (total > goal){
            float difference = total - goal;
            String message = "You entered " + pennies + " pennies, " + nickels + " nickels, " + dimes + " dimes, " +
                    "and " + quarters + " quarters. The total amount entered is " + "$" + total + ".You went over " + "$" +
                    goal + " by " + "$" + difference;

            System.out.println(message);
        }
        else if (total < goal) {
            float difference = goal - total;
            String message = "You entered " + pennies + " pennies, " + nickels + " nickels, " + dimes + " dimes, " +
                    "and " + quarters + " quarters. The total amount entered is " + "$" + total + ".You are under " + "$" +
                    goal + " by " + "$" + difference;

            System.out.println(message);
        }
        else {
            System.out.println("Thank you for playing");
        }
    }
}
